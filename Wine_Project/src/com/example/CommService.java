package com.example;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CommunityDAO;
import com.dao.ProjectDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/CommService")
public class CommService extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String path = request.getSession().getServletContext().getRealPath("upload");
			
			ServletContext context = getServletContext();
			String uploadFilepath = context.getRealPath(path);
			
		    int size = 1024 * 1024 * 10; // ���尡���� ���� ũ��
		    String file = ""; // ���ε� �� ������ �̸�(�̸��� ����ɼ� �ִ�)
		    String originalFile = ""; // �̸��� ����Ǳ� �� ���� ���� �̸�
		    String id = "";
			String title = "";
			String content = "";
			
		    // ������ ���� ���ε��ϴ� ����
		    try{
		        MultipartRequest multi = new MultipartRequest(request, path, size, "utf-8", new DefaultFileRenamePolicy());
		        Enumeration files = multi.getFileNames();
		        String str = (String)files.nextElement(); // ���� �̸��� �޾ƿ� string���� ����
		        file = multi.getFilesystemName(str); // ���ε� �� ���� �̸� ������
		        originalFile = multi.getOriginalFileName(file); // ������ �����̸� ������
		        id = multi.getParameter("id");
		        content = multi.getParameter("content");
		        title = multi.getParameter("title");
		        
		        System.out.println("���ϸ�"+file);
		        System.out.println("���̵�"+id);
		        System.out.println("����"+title);
		        System.out.println("����"+content);
		        
		    	CommunityDAO dao = new CommunityDAO();
				int cnt = dao.CWrite(title, id, content, file);
		        if (cnt > 0) {
					
					response.sendRedirect("Commshow.jsp");
				}
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	}
}
