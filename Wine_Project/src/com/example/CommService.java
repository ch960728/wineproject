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
			
		    int size = 1024 * 1024 * 10; // 저장가능한 파일 크기
		    String file = ""; // 업로드 한 파일의 이름(이름이 변경될수 있다)
		    String originalFile = ""; // 이름이 변경되기 전 실제 파일 이름
		    String id = "";
			String title = "";
			String content = "";
			
		    // 실제로 파일 업로드하는 과정
		    try{
		        MultipartRequest multi = new MultipartRequest(request, path, size, "utf-8", new DefaultFileRenamePolicy());
		        Enumeration files = multi.getFileNames();
		        String str = (String)files.nextElement(); // 파일 이름을 받아와 string으로 저장
		        file = multi.getFilesystemName(str); // 업로드 된 파일 이름 가져옴
		        originalFile = multi.getOriginalFileName(file); // 원래의 파일이름 가져옴
		        id = multi.getParameter("id");
		        content = multi.getParameter("content");
		        title = multi.getParameter("title");
		        
		        System.out.println("파일명"+file);
		        System.out.println("아이디"+id);
		        System.out.println("제목"+title);
		        System.out.println("내용"+content);
		        
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
