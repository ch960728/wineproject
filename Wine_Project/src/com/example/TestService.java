package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestService
 */
@WebServlet("/TestService")
public class TestService extends HttpServlet {
   protected void service(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // TODO Auto-generated method stub

      request.setCharacterEncoding("UTF-8");
      String q1 = request.getParameter("q1");
      String q2 = request.getParameter("q2");
      String q3 = request.getParameter("q3"); // 네 번째 고려사항
      String q4 = request.getParameter("q4"); // 첫 번째 고려사항
      String q5 = request.getParameter("q5");
      String q6 = request.getParameter("q6"); // 두 번째 고려사항
      String q7 = request.getParameter("q7");
      String q8 = request.getParameter("q8"); // 세 번째 고려사항
      String q9 = request.getParameter("q9");

      System.out.println(q4+q6+q8+q3);
      String ten = "";

      switch (q4) {
      case "1": // 1-x-x-x
         switch (q6) {
         case "1": // 1-1-x-x
            switch (q8) {
            case "1": // 1-1-1-x
               switch (q3) {
               case "1":
                  ten = "g";// 1-1-1-1 g
                  break;
               case "2":
                  ten = "n";// 1-1-1-2 n
                  break;
               case "3":
                  ten = "e";// 1-1-1-3 e
                  break;
               case "4":
                  ten = "d";// 1-1-1-4 d
                  break;
               case "5":
                  ten = "a";// 1-1-1-5 a
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "2": // 1-1-2-x
               switch (q3) {
               case "1":
                  ten = "n";// 1-1-2-1 n
                  break;
               case "2":
                  ten = "h";// 1-1-2-2 h
                  break;
               case "3":
                  ten = "e";// 1-1-2-3 e
                  break;
               case "4":
                  ten = "d";// 1-1-2-4 d
                  break;
               case "5":
                  ten = "i";// 1-1-2-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "3": // 1-1-3-x
               switch (q3) {
               case "1":
                  ten = "g";// 1-1-3-1 g
                  break;
               case "2":
                  ten = "n";// 1-1-3-2 n
                  break;
               case "3":
                  ten = "e";// 1-1-3-3 e
                  break;
               case "4":
                  ten = "d";// 1-1-3-4 d
                  break;
               case "5":
                  ten = "a";// 1-1-3-5 a
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "4": // 1-1-4-x
               switch (q3) {
               case "1":
                  ten = "g";// 1-1-4-1 g
                  break;
               case "2":
                  ten = "n";// 1-1-4-2 n
                  break;
               case "3":
                  ten = "e";// 1-1-4-3 e
                  break;
               case "4":
                  ten = "d";// 1-1-4-4 d
                  break;
               case "5":
                  ten = "i";// 1-1-4-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "2": // 1-2-x-x
            switch (q8) {
            case "1": // 1-2-1-x
               switch (q3) {
               case "1":
                  ten = "g";// 1-2-1-1 g
                  break;
               case "2":
                  ten = "n";// 1-2-1-2 n
                  break;
               case "3":
                  ten = "e";// 1-2-1-3 e
                  break;
               case "4":
                  ten = "d";// 1-2-1-4 d
                  break;
               case "5":
                  ten = "a";// 1-2-1-5 a
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 1-2-2-x
               switch (q3) {
               case "1":
                  ten = "n";// 1-2-2-1 n
                  break;
               case "2":
                  ten = "h";// 1-2-2-2 h
                  break;
               case "3":
                  ten = "e";// 1-2-2-3 e
                  break;
               case "4":
                  ten = "d";// 1-2-2-4 d
                  break;
               case "5":
                  ten = "i";// 1-2-2-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 1-2-3-x
               switch (q3) {
               case "1":
                  ten = "g";// 1-2-3-2 g
                  break;
               case "2":
                  ten = "n";// 1-2-3-2 n
                  break;
               case "3":
                  ten = "e";// 1-2-3-3 e
                  break;
               case "4":
                  ten = "d";// 1-2-3-4 d
                  break;
               case "5":
                  ten = "a";// 1-2-3-5 a
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 1-2-4-x
               switch (q3) {
               case "1":
                  ten = "g";// 1-2-4-1 g
                  break;
               case "2":
                  ten = "n";// 1-2-4-2 n
                  break;
               case "3":
                  ten = "e";// 1-2-4-3 e
                  break;
               case "4":
                  ten = "d";// 1-2-4-4 d
                  break;
               case "5":
                  ten = "i";// 1-2-4-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "3": // 1-3-x-x
            switch (q8) {
            case "1": // 1-3-1-x
               switch (q3) {
               case "1":
                  ten = "e";// 1-3-1-2 e
                  break;
               case "2":
                  ten = "c";// 1-3-1-2 c
                  break;
               case "3":
                  ten = "i";// 1-3-1-3 i
                  break;
               case "4":
                  ten = "d";// 1-3-1-4 d
                  break;
               case "5":
                  ten = "l";// 1-3-1-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 1-3-2-x
               switch (q3) {
               case "1":
                  ten = "f";// 1-3-2-2 f
                  break;
               case "2":
                  ten = "c";// 1-3-2-2 c
                  break;
               case "3":
                  ten = "d";// 1-3-2-3 d
                  break;
               case "4":
                  ten = "p";// 1-3-2-4 p
                  break;
               case "5":
                  ten = "l";// 1-3-2-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 1-3-3-x
               switch (q3) {
               case "1":
                  ten = "e";// 1-3-3-1 e
                  break;
               case "2":
                  ten = "c";// 1-3-3-2 c
                  break;
               case "3":
                  ten = "i";// 1-3-3-3 i
                  break;
               case "4":
                  ten = "d";// 1-3-3-4 d
                  break;
               case "5":
                  ten = "l";// 1-3-3-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 1-3-4-x
               switch (q3) {
               case "1":
                  ten = "f";// 1-3-4-1 f
                  break;
               case "2":
                  ten = "c";// 1-3-4-2 c
                  break;
               case "3":
                  ten = "d";// 1-3-4-3 d
                  break;
               case "4":
                  ten = "p";// 1-3-4-4 p
                  break;
               case "5":
                  ten = "l";// 1-3-4-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "4": // 1-4-x-x
            switch (q8) {
            case "1": // 1-4-1-x
               switch (q3) {
               case "1":
                  ten = "b";// 1-4-1-1 b
                  break;
               case "2":
                  ten = "h";// 1-4-1-2 h
                  break;
               case "3":
                  ten = "i";// 1-4-1-3 i
                  break;
               case "4":
                  ten = "a";// 1-4-1-4 a
                  break;
               case "5":
                  ten = "c";// 1-4-1-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 1-4-2-x
               switch (q3) {
               case "1":
                  ten = "k";// 1-4-2-1 k
                  break;
               case "2":
                  ten = "h";// 1-4-2-2 h
                  break;
               case "3":
                  ten = "i";// 1-4-2-3 i
                  break;
               case "4":
                  ten = "a";// 1-4-2-4 a
                  break;
               case "5":
                  ten = "c";// 1-4-2-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 1-4-3-x
               switch (q3) {
               case "1":
                  ten = "b";// 1-4-3-1 b
                  break;
               case "2":
                  ten = "h";// 1-4-3-2 h
                  break;
               case "3":
                  ten = "i";// 1-4-3-3 i
                  break;
               case "4":
                  ten = "p";// 1-4-3-4 p
                  break;
               case "5":
                  ten = "c";// 1-4-3-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 1-4-4-x
               switch (q3) {
               case "1":
                  ten = "b";// 1-4-4-1 b
                  break;
               case "2":
                  ten = "h";// 1-4-4-2 h
                  break;
               case "3":
                  ten = "i";// 1-4-4-3 i
                  break;
               case "4":
                  ten = "a";// 1-4-4-4 a
                  break;
               case "5":
                  ten = "c";// 1-4-4-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "5": // 1-5-x-x
            switch (q8) {
            case "1": // 1-5-1-x
               switch (q3) {
               case "1":
                  ten = "b";// 1-5-1-1 b
                  break;
               case "2":
                  ten = "h";// 1-5-1-2 h
                  break;
               case "3":
                  ten = "i";// 1-5-1-3 i
                  break;
               case "4":
                  ten = "a";// 1-5-1-4 a
                  break;
               case "5":
                  ten = "c";// 1-5-1-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 1-5-2-x
               switch (q3) {
               case "1":
                  ten = "k";// 1-5-2-1 k
                  break;
               case "2":
                  ten = "h";// 1-5-2-2 h
                  break;
               case "3":
                  ten = "i";// 1-5-2-3 i
                  break;
               case "4":
                  ten = "a";// 1-5-2-4 a
                   break;
               case "5":
                  ten = "c";// 1-5-2-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 1-5-3-x
               switch (q3) {
               case "1":
                  ten = "b";// 1-5-3-1 b
                  break;
               case "2":
                  ten = "h";// 1-5-3-2 h
                  break;
               case "3":
                  ten = "i";// 1-5-3-3 i
                  break;
               case "4":
                  ten = "a";// 1-5-3-4 a
                  break;
               case "5":
                  ten = "c";// 1-5-3-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 1-5-4-x
               switch (q3) {
               case "1":
                  ten = "b";// 1-5-4-1 b
                  break;
               case "2":
                  ten = "h";// 1-5-4-2 h
                  break;
               case "3":
                  ten = "i";// 1-5-4-3 i
                  break;
               case "4":
                  ten = "a";// 1-5-4-4 a
                  break;
               case "5":
                  ten = "c";// 1-5-4-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "6": // 1-6-x-x
            switch (q8) {
            case "1": // 1-6-1-x
               switch (q3) {
               case "1":
                  ten = "d";// 1-6-1-1 d
                  break;
               case "2":
                  ten = "i";// 1-6-1-2 i
                  break;
               case "3":
                  ten = "a";// 1-6-1-3 a
                  break;
               case "4":
                  ten = "d";// 1-6-1-4 d
                  break;
               case "5":
                  ten = "i";// 1-6-1-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 1-6-2-x
               switch (q3) {
               case "1":
                  ten = "l";// 1-6-2-1 l
                  break;
               case "2":
                  ten = "f";// 1-6-2-2 f
                  break;
               case "3":
                  ten = "d";// 1-6-2-3 d
                  break;
               case "4":
                  ten = "p";// 1-6-2-4 p
                  break;
               case "5":
                  ten = "d";// 1-6-2-5 d
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 1-6-3-x
               switch (q3) {
               case "1":
                  ten = "d";// 1-6-3-1 d
                  break;
               case "2":
                  ten = "i";// 1-6-3-2 i
                  break;
               case "3":
                  ten = "a";// 1-6-3-3 a
                  break;
               case "4":
                  ten = "d";// 1-6-3-4 d
                  break;
               case "5":
                  ten = "i";// 1-6-3-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 1-6-4-x
               switch (q3) {
               case "1":
                  ten = "l";// 1-6-4-1 l
                  break;
               case "2":
                  ten = "f";// 1-6-4-2 f
                  break;
               case "3":
                  ten = "d";// 1-6-4-3 d
                  break;
               case "4":
                  ten = "p";// 1-6-4-4 p
                  break;
               case "5":
                  ten = "d";// 1-6-4-5 d
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         default:
            System.out.println("그 외의 숫자");
         }// 2번쨰 끝

         break;
      case "2": // 2-x-x-x
         switch (q6) {
         case "1": // 2-1-x-x
            switch (q8) {
            case "1": // 2-1-1-x
               switch (q3) {
               case "1":
                  ten = "e";// 2-1-1-1 e
                  break;
               case "2":
                  ten = "b";// 2-1-1-2 b
                  break;
               case "3":
                  ten = "e";// 2-1-1-3 e
                  break;
               case "4":
                  ten = "d";// 2-1-1-4 d
                  break;
               case "5":
                  ten = "c";// 2-1-1-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "2": // 2-1-2-x
               switch (q3) {
               case "1":
                  ten = "h";// 2-1-2-1 h
                  break;
               case "2":
                  ten = "f";// 2-1-2-2 f
                  break;
               case "3":
                  ten = "e";// 2-1-2-3 e
                  break;
               case "4":
                  ten = "d";// 2-1-2-4 d
                  break;
               case "5":
                  ten = "i";// 2-1-2-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "3": // 2-1-3-x
               switch (q3) {
               case "1":
                  ten = "e";// 2-1-3-1 e
                  break;
               case "2":
                  ten = "b";// 2-1-3-2 b
                  break;
               case "3":
                  ten = "e";// 2-1-3-3 e
                  break;
               case "4":
                  ten = "d";// 2-1-3-4 d
                  break;
               case "5":
                  ten = "c";// 2-1-3-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "4": // 2-1-4-x
               switch (q3) {
               case "1":
                  ten = "e";// 2-1-4-1 e
                  break;
               case "2":
                  ten = "b";// 2-1-4-2 b
                  break;
               case "3":
                  ten = "e";// 2-1-4-3 e
                  break;
               case "4":
                  ten = "d";// 2-1-4-4 d
                  break;
               case "5":
                  ten = "i";// 2-1-4-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "2": // 2-2-x-x
            switch (q8) {
            case "1": // 2-2-1-x
               switch (q3) {
               case "1":
                  ten = "e";// 2-2-1-1 e
                  break;
               case "2":
                  ten = "b";// 2-2-1-2 b
                  break;
               case "3":
                  ten = "e";// 2-2-1-3 e
                  break;
               case "4":
                  ten = "d";// 2-2-1-4 d
                  break;
               case "5":
                  ten = "c";// 2-2-1-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 2-2-2-x
               switch (q3) {
               case "1":
                  ten = "h";// 2-2-2-1 h
                  break;
               case "2":
                  ten = "f";// 2-2-2-2 f
                  break;
               case "3":
                  ten = "e";// 2-2-2-3 e
                  break;
               case "4":
                  ten = "d";// 2-2-2-4 d
                  break;
               case "5":
                  ten = "i";// 2-2-2-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 2-2-3-x
               switch (q3) {
               case "1":
                  ten = "e";// 2-2-3-1 e
                  break;
               case "2":
                  ten = "b";// 2-2-3-2 b
                  break;
               case "3":
                  ten = "e";// 2-2-3-3 e
                  break;
               case "4":
                  ten = "d";// 2-2-3-4 d
                  break;
               case "5":
                  ten = "c";// 2-2-3-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 2-2-4-x
               switch (q3) {
               case "1":
                  ten = "e";// 2-2-4-1 e
                  break;
               case "2":
                  ten = "b";// 2-2-4-2 b
                  break;
               case "3":
                  ten = "e";// 2-2-4-3 e
                  break;
               case "4":
                  ten = "d";// 2-2-4-4 d
                  break;
               case "5":
                  ten = "i";// 2-2-4-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "3": // 2-3-x-x
            switch (q8) {
            case "1": // 2-3-1-x
               switch (q3) {
               case "1":
                  ten = "e";// 2-3-1-1 e
                  break;
               case "2":
                  ten = "c";// 2-3-1-2 c
                  break;
               case "3":
                  ten = "i";// 2-3-1-3 i
                  break;
               case "4":
                  ten = "d";// 2-3-1-4 d
                  break;
               case "5":
                  ten = "l";// 2-3-1-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 2-3-2-x
               switch (q3) {
               case "1":
                  ten = "f";// 2-3-2-1 f
                  break;
               case "2":
                  ten = "c";// 2-3-2-2 c
                  break;
               case "3":
                  ten = "d";// 2-3-2-3 d
                  break;
               case "4":
                  ten = "p";// 2-3-2-4 p
                  break;
               case "5":
                  ten = "l";// 2-3-2-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 2-3-3-x
               switch (q3) {
               case "1":
                  ten = "e";// 2-3-3-1 e
                  break;
               case "2":
                  ten = "c";// 2-3-3-2 c
                  break;
               case "3":
                  ten = "i";// 2-3-3-3 i
                  break;
               case "4":
                  ten = "d";// 2-3-3-4 d
                  break;
               case "5":
                  ten = "l";// 2-3-3-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 2-3-4-x
               switch (q3) {
               case "1":
                  ten = "f";// 2-3-4-1 f
                  break;
               case "2":
                  ten = "c";// 2-3-4-2 c
                  break;
               case "3":
                  ten = "d";// 2-3-4-3 d
                  break;
               case "4":
                  ten = "p";// 2-3-4-4 p
                  break;
               case "5":
                  ten = "l";// 2-3-4-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "4": // 2-4-x-x
            switch (q8) {
            case "1": // 2-4-1-x
               switch (q3) {
               case "1":
                  ten = "j";// 2-4-1-1 j
                  break;
               case "2":
                  ten = "h";// 2-4-1-2 h
                  break;
               case "3":
                  ten = "h";// 2-4-1-3 h
                  break;
               case "4":
                  ten = "d";// 2-4-1-4 d
                  break;
               case "5": 
                  ten = "c";// 2-4-1-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 2-4-2-x
               switch (q3) {
               case "1":
                  ten = "m";// 2-4-2-1 m
                  break;
               case "2":
                  ten = "f";// 2-4-2-2 f
                  break;
               case "3":
                  ten = "m";// 2-4-2-3 m
                  break;
               case "4":
                  ten = "a";// 2-4-2-4 a
                  break;
               case "5":
                  ten = "c";// 2-4-2-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 2-4-3-x
               switch (q3) {
               case "1":
                  ten = "j";// 2-4-3-1 j
                  break;
               case "2":
                  ten = "h";// 2-4-3-2 h
                  break;
               case "3":
                  ten = "h";// 2-4-3-3 h
                  break;
               case "4":
                  ten = "d";// 2-4-3-4 d
                  break;
               case "5":
                  ten = "c";// 2-4-3-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 2-4-4-x
               switch (q3) {
               case "1":
                  ten = "j";// 2-4-4-1 j
                  break;
               case "2":
                  ten = "h";// 2-4-4-2 h
                  break;
               case "3":
                  ten = "m";// 2-4-4-3 m
                  break;
               case "4":
                  ten = "a";// 2-4-4-4 a
                  break;
               case "5":
                  ten = "c";// 2-4-4-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "5": // 2-5-x-x
            switch (q8) {
            case "1": // 2-5-1-x
               switch (q3) {
               case "1":
                  ten = "j";// 2-5-1-1 j
                  break;
               case "2":
                  ten = "h";// 2-5-1-2 h
                  break;
               case "3":
                  ten = "h";// 2-5-1-3 h
                  break;
               case "4":
                  ten = "d";// 2-5-1-4 d
                  break;
               case "5":
                  ten = "c";// 2-5-1-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 2-5-2-x
               switch (q3) {
               case "1":
                  ten = "m";// 2-5-2-1 m
                  break;
               case "2":
                  ten = "f";// 2-5-2-2 f
                  break;
               case "3":
                  ten = "m";// 2-5-2-3 m
                  break;
               case "4": 
                  ten = "a";// 2-5-2-4 a
                  break;
               case "5":
                  ten = "c";// 2-5-2-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 2-5-3-x
               switch (q3) {
               case "1":
                  ten = "j";// 2-5-3-1 j
                  break;
               case "2":
                  ten = "h";// 2-5-3-2 h
                  break;
               case "3":
                  ten = "h";// 2-5-3-3 h
                  break;
               case "4":
                  ten = "d";// 2-5-3-4 d
                  break;
               case "5":
                  ten = "c";// 2-5-3-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 2-5-4-x
               switch (q3) {
               case "1":
                  ten = "j";// 2-5-4-1 j
                  break;
               case "2":
                  ten = "h";// 2-5-4-2 h
                  break;
               case "3":
                  ten = "m";// 2-5-4-3 m
                  break;
               case "4":
                  ten = "a";// 2-5-4-4 a
                  break;
               case "5":
                  ten = "c";// 2-5-4-5 c
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "6": // 2-6-x-x
            switch (q8) {
            case "1": // 2-6-1-x
               switch (q3) {
               case "1":
                  ten = "d";// 2-6-1-1 d
                  break;
               case "2":
                  ten = "i";// 2-6-1-2 i
                  break;
               case "3":
                  ten = "a";// 2-6-1-3 a
                  break;
               case "4":
                  ten = "d";// 2-6-1-4 d
                  break;
               case "5":
                  ten = "i";// 2-6-1-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 2-6-2-x
               switch (q3) {
               case "1":
                  ten = "l";// 2-6-2-1 l
                  break;
               case "2":
                  ten = "f";// 2-6-2-2 f
                  break;
               case "3":
                  ten = "d";// 2-6-2-3 d
                  break;
               case "4":
                  ten = "p";// 2-6-2-4 p
                  break;
               case "5":
                  ten = "d";// 2-6-2-5 d
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 2-6-3-x
               switch (q3) {
               case "1":
                  ten = "d";// 2-6-3-1 d
                  break;
               case "2":
                  ten = "i";// 2-6-3-2 i
                  break;
               case "3":
                  ten = "a";// 2-6-3-3 a
                  break;
               case "4":
                  ten = "d";// 2-6-3-4 d
                  break;
               case "5": 
                  ten = "i";// 2-6-3-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 2-6-4-x
               switch (q3) {
               case "1":
                  ten = "l";// 2-6-4-1 l
                  break;
               case "2":
                  ten = "f";// 2-6-4-2 f
                  break;
               case "3":
                  ten = "d";// 2-6-4-3 d
                  break; 
               case "4":
                  ten = "p";// 2-6-4-4 p
                  break;
               case "5":
                  ten = "d";// 2-6-4-5 d
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         default:
            System.out.println("그 외의 숫자");
         }// 2번쨰 끝
         break;
      case "3":
         switch (q6) {
         case "1": // 3-1-x-x
            switch (q8) {
            case "1": // 3-1-1-x
               switch (q3) {
               case "1":
                  ten = "o";// 3-1-1-1 o
                  break;
               case "2":
                  ten = "e";// 3-1-1-2 e
                  break;
               case "3":
                  ten = "e";// 3-1-1-3 e
                  break;
               case "4":
                  ten = "d";// 3-1-1-4 d
                  break;
               case "5":
                  ten = "a";// 3-1-1-5 a
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "2": // 3-1-2-x
               switch (q3) {
               case "1":
                  ten = "m";// 3-1-2-1 m
                  break;
               case "2": 
                  ten = "f";// 3-1-2-2 f
                  break;
               case "3":
                  ten = "d";// 3-1-2-3 d
                  break;
               case "4":
                  ten = "d";// 3-1-2-4 d
                  break;
               case "5":
                  ten = "i";// 3-1-2-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "3": // 3-1-3-x
               switch (q3) {
               case "1":
                  ten = "o";// 3-1-3-1 o
                  break;
               case "2":
                  ten = "e";// 3-1-3-2 e
                  break;
               case "3":
                  ten = "e";// 3-1-3-3 e
                  break;
               case "4":
                  ten = "d";// 3-1-3-4 d
                  break;
               case "5":
                  ten = "a";// 3-1-3-5 a
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "4": // 3-1-4-x
               switch (q3) {
               case "1":
                  ten = "o";// 3-1-4-1 o
                  break;
               case "2": 
                  ten = "e";// 3-1-4-2 e
                  break;
               case "3":
                  ten = "e";// 3-1-4-3 e 
                  break;
               case "4":
                  ten = "d";// 3-1-4-4 d
                  break;
               case "5":
                  ten = "i";// 3-1-4-5 a
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "2": // 3-2-x-x
            switch (q8) {
            case "1": // 3-2-1-x
               switch (q3) {
               case "1":
                  ten = "o";// 3-2-1-1 o
                  break;
               case "2":
                  ten = "e";// 3-2-1-2 e
                  break;
               case "3":
                  ten = "e";// 3-2-1-3 e
                  break;
               case "4":
                  ten = "d";// 3-2-1-4 d
                  break;
               case "5":
                  ten = "a";// 3-2-1-5 a
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 3-2-2-x
               switch (q3) {
               case "1":
                  ten = "m";// 3-2-2-1 m
                  break;
               case "2":
                  ten = "f";// 3-2-2-2 f
                  break;
               case "3":
                  ten = "d";// 3-2-2-3 d
                  break;
               case "4":
                  ten = "d";// 3-2-2-4 d
                  break;
               case "5":
                  ten = "i";// 3-2-2-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 3-2-3-x
               switch (q3) {
               case "1":
                  ten = "o";// 3-2-3-1 o
                  break;
               case "2":
                  ten = "e";// 3-2-3-2 e
                  break;
               case "3":
                  ten = "e";// 3-2-3-3 e
                  break;
               case "4":
                  ten = "d";// 3-2-3-4 d
                  break;
               case "5":
                  ten = "a";// 3-2-3-5 a
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 3-2-4-x
               switch (q3) {
               case "1":
                  ten = "o";// 3-2-4-1 o
                  break;
               case "2":
                  ten = "e";// 3-2-4-2 e
                  break;
               case "3":
                  ten = "e";// 3-2-4-3 e
                  break;
               case "4":
                  ten = "d";// 3-2-4-4 d
                  break;
               case "5":
                  ten = "i";// 3-2-4-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "3": // 3-3-x-x
            switch (q8) {
            case "1": // 3-3-1-x
               switch (q3) {
               case "1":
                  ten = "e";// 3-3-1-1 e
                  break;
               case "2":
                  ten = "c";// 3-3-1-2 c
                  break;
               case "3":
                  ten = "i";// 3-3-1-3 i
                  break;
               case "4":
                  ten = "d";// 3-3-1-4 d
                  break;
               case "5":
                  ten = "l";// 3-3-1-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 3-3-2-x
               switch (q3) {
               case "1":
                  ten = "f";// 3-3-2-1 f
                  break;
               case "2":
                  ten = "c";// 3-3-2-2 c
                  break;
               case "3":
                  ten = "d";// 3-3-2-3 d
                  break;
               case "4":
                  ten = "p";// 3-3-2-4 p
                  break;
               case "5":
                  ten = "l";// 3-3-2-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 3-3-3-x
               switch (q3) {
               case "1":
                  ten = "e";// 3-3-3-1 e
                  break;
               case "2":
                  ten = "c";// 3-3-3-2 c
                  break;
               case "3":
                  ten = "i";// 3-3-3-3 i
                  break;
               case "4":
                  ten = "d";// 3-3-3-4 d
                  break;
               case "5":
                  ten = "l";// 3-3-3-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 3-3-4-x
               switch (q3) {
               case "1":
                  ten = "f";// 3-3-4-1 f
                  break;
               case "2":
                  ten = "c";// 3-3-4-2 c
                  break;
               case "3":
                  ten = "d";// 3-3-4-3 d
                  break;
               case "4":
                  ten = "p";// 3-3-4-4 p
                  break;
               case "5":
                  ten = "l";// 3-3-4-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "4": // 3-4-x-x
            switch (q8) {
            case "1": // 3-4-1-x
               switch (q3) {
               case "1":
                  ten = "b";// 3-4-1-1 b
                  break;
               case "2":
                  ten = "h";// 3-4-1-2 h
                  break;
               case "3":
                  ten = "l";// 3-4-1-3 l
                  break;
               case "4":
                  ten = "a";// 3-4-1-4 a
                  break;
               case "5":
                  ten = "l";// 3-4-1-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 3-4-2-x
               switch (q3) {
               case "1":
                  ten = "b";// 3-4-2-1 b
                  break;
               case "2":
                  ten = "j";// 3-4-2-2 j
                  break;
               case "3":
                  ten = "i";// 3-4-2-3 i
                  break;
               case "4":
                  ten = "a";// 3-4-2-4 a
                  break;
               case "5":
                  ten = "l";// 3-4-2-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 3-4-3-x
               switch (q3) {
               case "1":
                  ten = "b";// 3-4-3-1 b
                  break;
               case "2":
                  ten = "h";// 3-4-3-2 h
                  break;
               case "3":
                  ten = "l";// 3-4-3-3 l
                  break;
               case "4":
                  ten = "p";// 3-4-3-4 p
                  break;
               case "5":
                  ten = "l";// 3-4-3-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 3-4-4-x
               switch (q3) {
               case "1":
                  ten = "b";// 3-4-4-1 b
                  break;
               case "2":
                  ten = "h";// 3-4-4-2 h
                  break;
               case "3":
                  ten = "i";// 3-4-4-3 i
                  break;
               case "4":
                  ten = "a";// 3-4-4-4 a
                  break;
               case "5":
                  ten = "l";// 3-4-4-5 l 
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "5": // 3-5-x-x
            switch (q8) {
            case "1": // 3-5-1-x
               switch (q3) {
               case "1":
                  ten = "b";// 3-5-1-1 b
                  break;
               case "2":
                  ten = "h";// 1-5-1-2 h
                   break; 
               case "3":
                  ten = "l";// 3-5-1-3 l
                  break;
               case "4":
                  ten = "a";// 3-5-1-4 a
                  break;
               case "5":
                  ten = "l";// 3-5-1-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 3-5-2-x
               switch (q3) {
               case "1":
                  ten = "b";// 3-5-2-1 b
                  break;
               case "2":
                  ten = "j";// 3-5-2-2 j
                  break;
               case "3":
                  ten = "i";// 3-5-2-3 i
                  break;
               case "4":
                  ten = "a";// 3-5-2-4 a
                  break;
               case "5":
                  ten = "l";// 3-5-2-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 3-5-3-x
               switch (q3) {
               case "1":
                  ten = "b";// 3-5-3-1 b
                  break;
               case "2":
                  ten = "h";// 3-5-3-2 h
                  break;
               case "3":
                  ten = "l";// 3-5-3-3 l
                  break;
               case "4":
                  ten = "a";// 3-5-3-4 a
                  break;
               case "5":
                  ten = "l";// 3-5-3-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 3-5-4-x
               switch (q3) {
               case "1":
                  ten = "b";// 3-5-4-1 b
                  break;
               case "2":
                  ten = "h";// 3-5-4-2 h
                  break;
               case "3":
                  ten = "i";// 3-5-4-3 i
                  break;
               case "4":
                  ten = "a";// 3-5-4-4 a
                  break;
               case "5":
                  ten = "l";// 3-5-4-5 l
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "6": // 3-6-x-x
            switch (q8) {
            case "1": // 3-6-1-x
               switch (q3) {
               case "1":
                  ten = "d";// 3-6-1-1 d
                  break;
               case "2":
                  ten = "i";// 3-6-1-2 i
                  break;
               case "3":
                  ten = "a";// 3-6-1-3 a
                  break;
               case "4":
                  ten = "d";// 3-6-1-4 d
                  break;
               case "5":
                  ten = "i";// 3-6-1-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 3-6-2-x
               switch (q3) {
               case "1":
                  ten = "l";// 3-6-2-1 l
                  break;
               case "2":
                  ten = "f";// 3-6-2-2 f
                  break;
               case "3":
                  ten = "d";// 3-6-2-3 d
                  break;
               case "4":
                  ten = "p";// 3-6-2-4 p
                  break;
               case "5":
                  ten = "d";// 3-6-2-5 d
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 3-6-3-x
               switch (q3) {
               case "1":
                  ten = "d";// 3-6-3-1  d
                  break;
               case "2":
                  ten = "i";// 3-6-3-2 i
                  break;
               case "3":
                  ten = "a";// 3-6-3-3 a
                  break;
               case "4":
                  ten = "d";// 3-6-3-4 d
                  break;
               case "5":
                  ten = "i";// 3-6-3-5 i
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 3-6-4-x
               switch (q3) {
               case "1":
                  ten = "l";// 3-6-4-1 l
                  break;
               case "2":
                  ten = "f";// 3-6-4-2 f
                  break;
               case "3":
                  ten = "d";// 3-6-4-3 d
                  break;
               case "4":
                  ten = "p";// 3-6-4-4 p 
                  break;
               case "5":
                  ten = "d";// 3-6-4-5 d
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         default:
            System.out.println("그 외의 숫자");
         }// 2번쨰 끝
         break;
      case "4":// 4-x-x-x
         switch (q6) {
         case "1": // 4-1-x-x
            switch (q8) {
            case "1": // 4-1-1-x
               switch (q3) {
               case "1":
                  ten = "n";// 4-1-1-1
                  break;
               case "2":
                  ten = "o";// 4-1-1-2
                  break;
               case "3":
                  ten = "l";// 4-1-1-3
                  break;
               case "4":
                  ten = "d";// 4-1-1-4
                  break;
               case "5":
                  ten = "c";// 4-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "2": // 4-1-2-x
               switch (q3) {
               case "1":
                  ten = "l";// 4-1-2-1
                  break;
               case "2":
                  ten = "m";// 4-1-2-2
                  break;
               case "3":
                  ten = "i";// 4-1-2-3
                  break;
               case "4":
                  ten = "k";// 4-1-2-4
                  break;
               case "5":
                  ten = "e";// 4-1-2-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "3": // 4-1-3-x
               switch (q3) {
               case "1":
                  ten = "c";// 4-1-3-1
                  break;
               case "2":
                  ten = "g";// 4-1-3-2
                  break;
               case "3":
                  ten = "a";// 4-1-3-3
                  break;
               case "4":
                  ten = "k";// 4-1-3-4
                  break;
               case "5":
                  ten = "c";// 4-1-3-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "4": // 4-1-4-x
               switch (q3) {
               case "1":
                  ten = "n";// 4-1-4-1
                  break;
               case "2":
                  ten = "o";// 4-1-4-2
                  break;
               case "3":
                  ten = "l";// 4-1-4-3
                  break;
               case "4":
                  ten = "d";// 4-1-4-4
                  break;
               case "5":
                  ten = "c";// 4-1-4-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "2": // 4-2-x-x
            switch (q8) {
            case "1": // 4-2-1-x
               switch (q3) {
               case "1":
                  ten = "n";// 4-2-1-1
                  break;
               case "2":
                  ten = "o";// 4-2-1-2
                  break;
               case "3":
                  ten = "l";// 4-2-1-3
                  break;
               case "4":
                  ten = "d";// 4-2-1-4
                  break;
               case "5":
                  ten = "c";// 4-2-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 4-2-2-x
               switch (q3) {
               case "1":
                  ten = "l";// 4-2-2-1
                  break;
               case "2":
                  ten = "m";// 4-2-2-2
                  break;
               case "3":
                  ten = "i";// 4-2-2-3
                  break;
               case "4":
                  ten = "k";// 4-2-2-4
                  break;
               case "5":
                  ten = "e";// 4-2-2-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 4-2-3-x
               switch (q3) {
               case "1":
                  ten = "c";// 4-2-3-1
                  break;
               case "2":
                  ten = "g";// 4-2-3-2
                  break;
               case "3":
                  ten = "a";// 4-2-3-3
                  break;
               case "4":
                  ten = "k";// 4-2-3-4
                  break;
               case "5":
                  ten = "c";// 4-2-3-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 4-2-4-x
               switch (q3) {
               case "1":
                  ten = "n";// 4-2-4-1
                  break;
               case "2":
                  ten = "o";// 4-2-4-2
                  break;
               case "3":
                  ten = "l";// 4-2-4-3
                  break;
               case "4":
                  ten = "d";// 4-2-4-4
                  break;
               case "5":
                  ten = "c";// 4-2-4-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "3": // 4-3-x-x
            switch (q8) {
            case "1": // 4-3-1-x
               switch (q3) {
               case "1":
                  ten = "e";// 4-3-1-1
                  break;
               case "2":
                  ten = "c";// 4-3-1-2
                  break;
               case "3":
                  ten = "i";// 4-3-1-3
                  break;
               case "4":
                  ten = "d";// 4-3-1-4
                  break;
               case "5":
                  ten = "l";// 4-3-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 4-3-2-x
               switch (q3) {
               case "1":
                  ten = "f";// 4-3-2-1
                  break;
               case "2":
                  ten = "c";// 4-3-2-2
                  break;
               case "3":
                  ten = "d";// 4-3-2-3
                  break;
               case "4":
                  ten = "p";// 4-3-2-4
                  break;
               case "5":
                  ten = "l";// 4-3-2-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 4-3-3-x
               switch (q3) {
               case "1":
                  ten = "e";// 4-3-3-1
                  break;
               case "2":
                  ten = "c";// 4-3-3-2
                  break;
               case "3":
                  ten = "i";// 4-3-3-3
                  break;
               case "4":
                  ten = "d";// 4-3-3-4
                  break;
               case "5":
                  ten = "l";// 4-3-3-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 4-3-4-x
               switch (q3) {
               case "1":
                  ten = "f";// 4-3-4-1
                  break;
               case "2":
                  ten = "c";// 4-3-4-2
                  break;
               case "3":
                  ten = "d";// 4-3-4-3
                  break;
               case "4":
                  ten = "p";// 4-3-4-4
                  break;
               case "5":
                  ten = "l";// 4-3-4-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "4": // 4-4-x-x
            switch (q8) {
            case "1": // 4-4-1-x
               switch (q3) {
               case "1":
                  ten = "o";// 4-4-1-1
                  break;
               case "2":
                  ten = "n";// 4-4-1-2
                  break;
               case "3":
                  ten = "m";// 4-4-1-3
                  break;
               case "4":
                  ten = "p";// 4-4-1-4
                  break;
               case "5":
                  ten = "c";// 4-4-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 4-4-2-x
               switch (q3) {
               case "1":
                  ten = "b";// 4-4-2-1
                  break;
               case "2":
                  ten = "h";// 4-4-2-2
                  break;
               case "3":
                  ten = "l";// 4-4-2-3
                  break;
               case "4":
                  ten = "d";// 4-4-2-4
                  break;
               case "5":
                  ten = "l";// 4-4-2-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 4-4-3-x
               switch (q3) {
               case "1":
                  ten = "o";// 4-4-3-1
                  break;
               case "2":
                  ten = "n";// 4-4-3-2
                  break;
               case "3":
                  ten = "m";// 4-4-3-3
                  break;
               case "4":
                  ten = "d";// 4-4-3-4
                  break;
               case "5":
                  ten = "c";// 4-4-3-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 4-4-4-x
               switch (q3) {
               case "1":
                  ten = "o";// 4-4-4-1
                  break;
               case "2":
                  ten = "n";// 4-4-4-2
                  break;
               case "3":
                  ten = "m";// 4-4-4-3
                  break;
               case "4":
                  ten = "d";// 4-4-4-4
                  break;
               case "5":
                  ten = "l";// 4-4-4-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         
         case "5": // 4-5-1-x
            switch (q8) {
            case "1": // 4-5-1-x
               switch (q3) {
               case "1":
                  ten = "o";// 4-5-1-1
                  break;
               case "2":
                  ten = "n";// 4-5-1-2
                  break;
               case "3":
                  ten = "m";// 4-5-1-3
                  break;
               case "4":
                  ten = "d";// 4-5-1-4
                  break;
               case "5":
                  ten = "c";// 4-5-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 4-5-2-x
               switch (q3) {
               case "1":
                  ten = "b";// 4-5-2-1
                  break;
               case "2":
                  ten = "h";// 4-5-2-2
                  break;
               case "3":
                  ten = "l";// 4-5-2-3
                  break;
               case "4":
                  ten = "d";// 4-5-2-4
                  break;
               case "5":
                  ten = "l";// 4-5-2-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 4-5-3-x
               switch (q3) {
               case "1":
                  ten = "o";// 4-5-3-1
                  break;
               case "2":
                  ten = "n";// 4-5-3-2
                  break;
               case "3":
                  ten = "m";// 4-5-3-3
                  break;
               case "4":
                  ten = "d";// 4-5-3-4
                  break;
               case "5":
                  ten = "c";// 4-5-3-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 4-5-4-x
               switch (q3) {
               case "1":
                  ten = "o";// 4-5-4-1
                  break;
               case "2":
                  ten = "n";// 4-5-4-2
                  break;
               case "3":
                  ten = "m";// 4-5-4-3
                  break;
               case "4":
                  ten = "d";// 4-5-4-4
                  break;
               case "5":
                  ten = "l";// 4-5-4-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "6": // 4-6-x-x
            switch (q8) {
            case "1": // 4-6-1-x
               switch (q3) {
               case "1":
                  ten = "d";// 4-6-1-1
                  break;
               case "2":
                  ten = "i";// 4-6-1-2
                  break;
               case "3":
                  ten = "a";// 4-6-1-3
                  break;
               case "4":
                  ten = "d";// 4-6-1-4
                  break;
               case "5":
                  ten = "i";// 4-6-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 4-6-2-x
               switch (q3) {
               case "1":
                  ten = "l";// 4-6-2-1
                  break;
               case "2":
                  ten = "f";// 4-6-2-2
                  break;
               case "3":
                  ten = "d";// 4-6-2-3
                  break;
               case "4":
                  ten = "p";// 4-6-2-4
                  break;
               case "5":
                  ten = "d";// 4-6-2-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 4-6-3-x
               switch (q3) {
               case "1":
                  ten = "i";// 4-6-3-1
                  break;
               case "2":
                  ten = "l";// 4-6-3-2
                  break;
               case "3":
                  ten = "a";// 4-6-3-3
                  break;
               case "4":
                  ten = "p";// 4-6-3-4
                  break;
               case "5":
                  ten = "i";// 4-6-3-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 4-6-4-x
               switch (q3) {
               case "1":
                  ten = "l";// 4-6-4-1
                  break;
               case "2":
                  ten = "f";// 4-6-4-2
                  break;
               case "3":
                  ten = "d";// 4-6-4-3
                  break;
               case "4":
                  ten = "a";// 4-6-4-4
                  break;
               case "5":
                  ten = "c";// 4-6-4-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         default:
            System.out.println("그 외의 숫자");
         }// 2번쨰 끝
         break;
      case "5":
         switch (q6) {
         case "1": // 5-1-x-x
            switch (q8) {
            case "1": // 5-1-1-x
               switch (q3) {
               case "1":
                  ten = "c";// 5-1-1-1
                  break;
               case "2":
                  ten = "g";// 5-1-1-2
                  break;
               case "3":
                  ten = "a";// 5-1-1-3
                  break;
               case "4":
                  ten = "k";// 5-1-1-4
                  break;
               case "5":
                  ten = "c";// 5-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "2": // 5-1-2-x
               switch (q3) {
               case "1":
                  ten = "n";// 5-1-2-1
                  break;
               case "2":
                  ten = "f";// 5-1-2-2
                  break;
               case "3":
                  ten = "l";// 5-1-2-3
                  break;
               case "4":
                  ten = "d";// 5-1-2-4
                  break;
               case "5":
                  ten = "m";// 5-1-2-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "3": // 5-1-3-x
               switch (q3) {
               case "1":
                  ten = "c";// 5-1-3-1
                  break;
               case "2":
                  ten = "g";// 5-1-3-2
                  break;
               case "3":
                  ten = "a";// 5-1-3-3
                  break;
               case "4":
                  ten = "k";// 5-1-3-4
                  break;
               case "5":
                  ten = "c";// 5-1-3-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            case "4": // 5-1-4-x
               switch (q3) {
               case "1":
                  ten = "c";// 5-1-4-1
                  break;
               case "2":
                  ten = "g";// 5-1-4-2
                  break;
               case "3":
                  ten = "a";// 5-1-4-3
                  break;
               case "4":
                  ten = "d";// 5-1-4-4
                  break;
               case "5":
                  ten = "m";// 5-1-4-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "2": // 5-2-x-x
            switch (q8) {
            case "1": // 5-2-1-x
               switch (q3) {
               case "1":
                  ten = "c";// 5-2-1-1
                  break;
               case "2":
                  ten = "g";// 5-2-1-2
                  break;
               case "3":
                  ten = "a";// 5-2-1-3
                  break;
               case "4":
                  ten = "k";// 5-2-1-4
                  break;
               case "5":
                  ten = "c";// 5-2-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 1-2-2-x
               switch (q3) {
               case "1":
                  ten = "n";
                  break;
               case "2":
                  ten = "f";// 1-1-1-2
                  break;
               case "3":
                  ten = "l";// 1-1-1-3
                  break;
               case "4":
                  ten = "d";// 1-1-1-4
                  break;
               case "5":
                  ten = "m";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 1-2-3-x
               switch (q3) {
               case "1":
                  ten = "c";
                  break;
               case "2":
                  ten = "g";// 1-1-1-2
                  break;
               case "3":
                  ten = "a";// 1-1-1-3
                  break;
               case "4":
                  ten = "k";// 1-1-1-4
                  break;
               case "5":
                  ten = "c";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 1-2-4-x
               switch (q3) {
               case "1":
                  ten = "c";
                  break;
               case "2":
                  ten = "g";// 1-1-1-2
                  break;
               case "3":
                  ten = "a";// 1-1-1-3
                  break;
               case "4":
                  ten = "d";// 1-1-1-4
                  break;
               case "5":
                  ten = "m";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "3": // 5-3-x-x
            switch (q8) {
            case "1": // 1-3-1-x
               switch (q3) {
               case "1":
                  ten = "e";
                  break;
               case "2":
                  ten = "c";// 1-1-1-2
                  break;
               case "3":
                  ten = "i";// 1-1-1-3
                  break;
               case "4":
                  ten = "d";// 1-1-1-4
                  break;
               case "5":
                  ten = "l";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 1-3-2-x
               switch (q3) {
               case "1":
                  ten = "f";
                  break;
               case "2":
                  ten = "c";// 1-1-1-2
                  break;
               case "3":
                  ten = "d";// 1-1-1-3
                  break;
               case "4":
                  ten = "p";// 1-1-1-4
                  break;
               case "5":
                  ten = "l";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 1-3-3-x
               switch (q3) {
               case "1":
                  ten = "e";
                  break;
               case "2":
                  ten = "c";// 1-1-1-2
                  break;
               case "3":
                  ten = "i";// 1-1-1-3
                  break;
               case "4":
                  ten = "d";// 1-1-1-4
                  break;
               case "5":
                  ten = "l";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 1-3-4-x
               switch (q3) {
               case "1":
                  ten = "f";
                  break;
               case "2":
                  ten = "c";// 1-1-1-2
                  break;
               case "3":
                  ten = "d";// 1-1-1-3
                  break;
               case "4":
                  ten = "p";// 1-1-1-4
                  break;
               case "5":
                  ten = "l";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "4": // 1-4-x-x
            switch (q8) {
            case "1": // 1-4-1-x
               switch (q3) {
               case "1":
                  ten = "b";
                  break;
               case "2":
                  ten = "h";// 1-1-1-2
                  break;
               case "3":
                  ten = "i";// 1-1-1-3
                  break;
               case "4":
                  ten = "p";// 1-1-1-4
                  break;
               case "5":
                  ten = "c";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 1-4-2-x
               switch (q3) {
               case "1":
                  ten = "m";
                  break;
               case "2":
                  ten = "f";// 1-1-1-2
                  break;
               case "3":
                  ten = "i";// 1-1-1-3
                  break;
               case "4":
                  ten = "d";// 1-1-1-4
                  break;
               case "5":
                  ten = "l";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 1-4-3-x
               switch (q3) {
               case "1":
                  ten = "b";
                  break;
               case "2":
                  ten = "h";// 1-1-1-2
                  break;
               case "3":
                  ten = "i";// 1-1-1-3
                  break;
               case "4":
                  ten = "p";// 1-1-1-4
                  break;
               case "5":
                  ten = "c";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 1-4-4-x
               switch (q3) {
               case "1":
                  ten = "b";
                  break;
               case "2":
                  ten = "h";// 1-1-1-2
                  break;
               case "3":
                  ten = "i";// 1-1-1-3
                  break;
               case "4":
                  ten = "d";// 1-1-1-4
                  break;
               case "5":
                  ten = "l";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "5": // 1-5-x-x
            switch (q8) {
            case "1": // 1-5-1-x
               switch (q3) {
               case "1":
                  ten = "b";
                  break;
               case "2":
                  ten = "h";// 1-1-1-2
                  break;
               case "3":
                  ten = "i";// 1-1-1-3
                  break;
               case "4":
                  ten = "d";// 1-1-1-4
                  break;
               case "5":
                  ten = "c";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 1-5-2-x
               switch (q3) {
               case "1":
                  ten = "m";
                  break;
               case "2":
                  ten = "f";// 1-1-1-2
                  break;
               case "3":
                  ten = "i";// 1-1-1-3
                  break;
               case "4":
                  ten = "d";// 1-1-1-4
                  break;
               case "5":
                  ten = "l";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 1-5-3-x
               switch (q3) {
               case "1":
                  ten = "b";
                  break;
               case "2":
                  ten = "h";// 1-1-1-2
                  break;
               case "3":
                  ten = "i";// 1-1-1-3
                  break;
               case "4":
                  ten = "d";// 1-1-1-4
                  break;
               case "5":
                  ten = "c";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 1-5-4-x
               switch (q3) {
               case "1":
                  ten = "b";
                  break;
               case "2":
                  ten = "h";// 1-1-1-2
                  break;
               case "3":
                  ten = "i";// 1-1-1-3
                  break;
               case "4":
                  ten = "d";// 1-1-1-4
                  break;
               case "5":
                  ten = "l";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         case "6": // 1-6-x-x
            switch (q8) {
            case "1": // 1-6-1-x
               switch (q3) {
               case "1":
                  ten = "d";
                  break;
               case "2":
                  ten = "i";// 1-1-1-2
                  break;
               case "3":
                  ten = "a";// 1-1-1-3
                  break;
               case "4":
                  ten = "d";// 1-1-1-4
                  break;
               case "5":
                  ten = "i";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "2": // 1-6-2-x
               switch (q3) {
               case "1":
                  ten = "l";
                  break;
               case "2":
                  ten = "f";// 1-1-1-2
                  break;
               case "3":
                  ten = "d";// 1-1-1-3
                  break;
               case "4":
                  ten = "p";// 1-1-1-4
                  break;
               case "5":
                  ten = "d";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "3": // 1-6-3-x
               switch (q3) {
               case "1":
                  ten = "d";
                  break;
               case "2":
                  ten = "i";// 1-1-1-2
                  break;
               case "3":
                  ten = "a";// 1-1-1-3
                  break;
               case "4":
                  ten = "d";// 1-1-1-4
                  break;
               case "5":
                  ten = "i";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q8끝
               break;
            case "4": // 1-6-4-x
               switch (q3) {
               case "1":
                  ten = "l";
                  break;
               case "2":
                  ten = "f";// 1-1-1-2
                  break;
               case "3":
                  ten = "d";// 1-1-1-3
                  break;
               case "4":
                  ten = "p";// 1-1-1-4
                  break;
               case "5":
                  ten = "d";// 1-1-1-5
                  break;
               default:
                  System.out.println("그 외의 숫자");
               }// q3 끝
               break;
            default:
               System.out.println("그 외의 숫자");
            }// q8 끝
            break;
         default:
            System.out.println("그 외의 숫자");
         }// 2번쨰 끝
         break;
      case "6":
         switch (q6) {
         case "1": // 6-1-x-x
            switch (q8) {
            case "1": // 6-1-1-x
               switch (q3) {
               case "1":
                  ten = "c";// 6-1-1-1
                  break;
               case "2":
                  ten = "g";// 6-1-1-2
                  break;
               case "3":
                  ten = "a";// 6-1-1-3
                  break;
               case "4":
                  ten = "k";// 6-1-1-4
                  break;
               case "5":
                  ten = "c";// 6-1-1-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q3 걹
               break;
            case "2": // 6-1-2-x
               switch (q3) {
               case "1":
                  ten = "n";// 6-1-2-1
                  break;
               case "2":
                  ten = "f";// 6-1-2-2
                  break;
               case "3":
                  ten = "l";// 6-1-2-3
                  break;
               case "4":
                  ten = "d";// 6-1-2-4
                  break;
               case "5":
                  ten = "m";// 6-1-2-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q3 걹
               break;
            case "3": // 6-1-3-x
               switch (q3) {
               case "1":
                  ten = "c";// 6-1-3-1
                  break;
               case "2":
                  ten = "g";// 6-1-3-2
                  break;
               case "3":
                  ten = "a";// 6-1-3-3
                  break;
               case "4":
                  ten = "k";// 6-1-3-4
                  break;
               case "5":
                  ten = "c";// 6-1-3-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q3 걹
               break;
            case "4": // 6-1-4-x
               switch (q3) {
               case "1":
                  ten = "c";// 6-1-4-1
                  break;
               case "2":
                  ten = "g";// 6-1-4-2
                  break;
               case "3":
                  ten = "a";// 6-1-4-3
                  break;
               case "4":
                  ten = "d";// 6-1-4-4
                  break;
               case "5":
                  ten = "m";// 6-1-4-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q3 걹
               break;
            default:
               System.out.println("洹   쇅 쓽  닽 옄");
            }// q8 걹
            break;
         case "2": // 6-2-x-x
            switch (q8) {
            case "1": // 6-2-1-x
               switch (q3) {
               case "1":
                  ten = "c";// 6-2-1-1
                  break;
               case "2":
                  ten = "g";// 6-2-1-2
                  break;
               case "3":
                  ten = "a";// 6-2-1-3
                  break;
               case "4":
                  ten = "k";// 6-2-1-4
                  break;
               case "5":
                  ten = "c";// 6-2-1-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "2": // 6-2-2-x
               switch (q3) {
               case "1":
                  ten = "n";// 6-2-2-1
                  break;
               case "2":
                  ten = "f";// 6-2-2-2
                  break;
               case "3":
                  ten = "l";// 6-2-2-3
                  break;
               case "4":
                  ten = "d";// 6-2-2-4
                  break;
               case "5":
                  ten = "m";// 6-2-2-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "3": // 6-2-3-x
               switch (q3) {
               case "1":
                  ten = "c";// 6-2-3-1
                  break;
               case "2":
                  ten = "g";// 6-2-3-2
                  break;
               case "3":
                  ten = "a";// 6-2-3-3
                  break;
               case "4":
                  ten = "k";// 6-2-3-4
                  break;
               case "5":
                  ten = "c";// 6-2-3-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "4": // 6-2-4-x
               switch (q3) {
               case "1":
                  ten = "c";// 6-2-4-1
                  break;
               case "2":
                  ten = "g";// 6-2-4-2
                  break;
               case "3":
                  ten = "a";// 6-2-4-3
                  break;
               case "4":
                  ten = "d";// 6-2-4-4
                  break;
               case "5":
                  ten = "m";// 6-2-4-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q3 걹
               break;
            default:
               System.out.println("洹   쇅 쓽  닽 옄");
            }// q8 걹
            break;
         case "3": // 6-3-x-x
            switch (q8) {
            case "1": // 6-3-1-x
               switch (q3) {
               case "1":
                  ten = "e";// 6-3-1-1
                  break;
               case "2":
                  ten = "c";// 6-3-1-2
                  break;
               case "3":
                  ten = "i";// 6-3-1-3
                  break;
               case "4":
                  ten = "d";// 6-3-1-4
                  break;
               case "5":
                  ten = "l";// 6-3-1-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "2": // 6-3-2-x
               switch (q3) {
               case "1":
                  ten = "f";// 6-3-2-1
                  break;
               case "2":
                  ten = "c";// 6-3-2-2
                  break;
               case "3":
                  ten = "d";// 6-3-2-3
                  break;
               case "4":
                  ten = "p";// 6-3-2-4
                  break;
               case "5":
                  ten = "l";// 6-3-2-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "3": // 6-3-3-x
               switch (q3) {
               case "1":
                  ten = "e";// 6-3-3-1
                  break;
               case "2":
                  ten = "c";// 6-3-3-2
                  break;
               case "3":
                  ten = "i";// 6-3-3-3
                  break;
               case "4":
                  ten = "d";// 6-3-3-4
                  break;
               case "5":
                  ten = "l";// 6-3-3-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "4": // 6-3-4-x
               switch (q3) {
               case "1":
                  ten = "f";// 6-3-4-1
                  break;
               case "2":
                  ten = "c";// 6-3-4-2
                  break;
               case "3":
                  ten = "d";// 6-3-4-3
                  break;
               case "4":
                  ten = "p";// 6-3-4-4
                  break;
               case "5":
                  ten = "l";// 6-3-4-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q3 걹
               break;
            default:
               System.out.println("洹   쇅 쓽  닽 옄");
            }// q8 걹
            break;
         case "4": // 6-4-x-x
            switch (q8) {
            case "1": // 6-4-1-x
               switch (q3) {
               case "1":
                  ten = "b";// 6-4-1-1
                  break;
               case "2":
                  ten = "h";// 6-4-1-2
                  break;
               case "3":
                  ten = "i";// 6-4-1-3
                  break;
               case "4":
                  ten = "d";// 6-4-1-4
                  break;
               case "5":
                  ten = "c";// 6-4-1-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "2": // 6-4-2-x
               switch (q3) {
               case "1":
                  ten = "m";// 6-4-2-1
                  break;
               case "2":
                  ten = "f";// 6-4-2-2
                  break;
               case "3":
                  ten = "i";// 6-4-2-3
                  break;
               case "4":
                  ten = "d";// 6-4-2-4
                  break;
               case "5":
                  ten = "l";// 6-4-2-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "3": // 6-4-3-x
               switch (q3) {
               case "1":
                  ten = "b";// 6-4-3-1
                  break;
               case "2":
                  ten = "h";// 6-4-3-2
                  break;
               case "3":
                  ten = "i";// 6-4-3-3
                  break;
               case "4":
                  ten = "d";// 6-4-3-4
                  break;
               case "5":
                  ten = "c";// 6-4-3-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "4": // 6-4-4-x
               switch (q3) {
               case "1":
                  ten = "b";// 6-4-4-1
                  break;
               case "2":
                  ten = "h";// 6-4-4-2
                  break;
               case "3":
                  ten = "i";// 6-4-4-3
                  break;
               case "4":
                  ten = "d";// 6-4-4-4
                  break;
               case "5":
                  ten = "c";// 6-4-4-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q3 걹
               break;
            default:
               System.out.println("洹   쇅 쓽  닽 옄");
            }// q8 걹
            break;
         case "5": // 6-5-x-x
            switch (q8) {
            case "1": // 6-5-1-x
               switch (q3) {
               case "1":
                  ten = "b";// 6-5-1-1
                  break;
               case "2":
                  ten = "h";// 6-5-1-2
                  break;
               case "3":
                  ten = "i";// 6-5-1-3
                  break;
               case "4":
                  ten = "d";// 6-5-1-4
                  break;
               case "5":
                  ten = "c";// 6-5-1-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "2": // 6-5-2-x
               switch (q3) {
               case "1":
                  ten = "m";// 6-5-2-1
                  break;
               case "2":
                  ten = "f";// 6-5-2-2
                  break;
               case "3":
                  ten = "i";// 6-5-2-3
                  break;
               case "4":
                  ten = "d";// 6-5-2-4
                  break;
               case "5":
                  ten = "l";// 6-5-2-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "3": // 6-5-3-x
               switch (q3) {
               case "1":
                  ten = "b";// 6-5-3-1
                  break;
               case "2":
                  ten = "h";// 6-5-3-2
                  break;
               case "3":
                  ten = "i";// 6-5-3-3
                  break;
               case "4":
                  ten = "d";// 6-5-3-4
                  break;
               case "5":
                  ten = "c";// 6-5-3-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "4": // 6-5-4-x
               switch (q3) {
               case "1":
                  ten = "b";// 6-5-4-1
                  break;
               case "2":
                  ten = "h";// 6-5-4-2
                  break;
               case "3":
                  ten = "i";// 6-5-4-3
                  break;
               case "4":
                  ten = "d";// 6-5-4-4
                  break;
               case "5":
                  ten = "c";// 6-5-4-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q3 걹
               break;
            default:
               System.out.println("洹   쇅 쓽  닽 옄");
            }// q8 걹
            break;
         case "6": // 6-6-x-x
            switch (q8) {
            case "1": // 6-6-1-x
               switch (q3) {
               case "1":
                  ten = "d";// 6-6-1-1
                  break;
               case "2":
                  ten = "i";// 6-6-1-2
                  break;
               case "3":
                  ten = "a";// 6-6-1-3
                  break;
               case "4":
                  ten = "d";// 6-6-1-4
                  break;
               case "5":
                  ten = "i";// 6-6-1-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "2": // 6-6-2-x
               switch (q3) {
               case "1":
                  ten = "l";// 6-6-2-1
                  break;
               case "2":
                  ten = "f";// 6-6-2-2
                  break;
               case "3":
                  ten = "d";// 6-6-2-3
                  break;
               case "4":
                  ten = "p";// 6-6-2-4
                  break;
               case "5":
                  ten = "d";// 6-6-2-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "3": // 6-6-3-x
               switch (q3) {
               case "1":
                  ten = "d";// 6-6-3-1
                  break;
               case "2":
                  ten = "i";// 6-6-3-2
                  break;
               case "3":
                  ten = "a";// 6-6-3-3
                  break;
               case "4":
                  ten = "d";// 6-6-3-4
                  break;
               case "5":
                  ten = "i";// 6-6-3-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q8 걹
               break;
            case "4": // 6-6-4-x
               switch (q3) {
               case "1":
                  ten = "l";// 6-6-4-1
                  break;
               case "2":
                  ten = "f";// 6-6-4-2
                  break;
               case "3":
                  ten = "d";// 6-6-4-3
                  break;
               case "4":
                  ten = "p";// 6-6-4-4
                  break;
               case "5":
                  ten = "d";// 6-6-4-5
                  break;
               default:
                  System.out.println("洹   쇅 쓽  닽 옄");
               }// q3 걹
            }// q8끝

         }
        
      }
      System.out.println(ten);
      HttpSession session = request.getSession();
      session.setAttribute("ten", ten);
      response.sendRedirect("test_after.jsp?ten="+ten);
   }

}