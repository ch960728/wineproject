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
			System.out.println(path);
			ServletContext context = getServletContext();
			String uploadFilepath = context.getRealPath(path);
			
		    int size = 1024 * 1024 * 10; // 이미지 최대 사이즈 조정
		    String file = ""; //파일 이름
		    String originalFile = ""; // 원본파일이름
		    String id = "";
			String title = "";
			String content = "";
			
		    //이미지 저장하기
		    try{
		        MultipartRequest multi = new MultipartRequest(request, path, size, "UTF-8", new DefaultFileRenamePolicy());
		        Enumeration files = multi.getFileNames();
		        String str = (String)files.nextElement(); // 파일이름을 문자열 형식으로 받음
		        file = multi.getFilesystemName(str); 
		        originalFile = multi.getOriginalFileName(file); // 파일 원본 이름 받기
		        id = multi.getParameter("id");
		        content = multi.getParameter("content");
		        title = multi.getParameter("title");
		        
		        System.out.println("파일이름"+file);
		        System.out.println("사용자id"+id);
		        System.out.println("글제목"+title);
		        System.out.println("글내용"+content);
		        
		    	CommunityDAO dao = new CommunityDAO();
				int cnt = dao.CWrite(title, id, content, file);
		        if (cnt > 0) {
					
					response.sendRedirect("board.jsp?");
				}
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	}
}
