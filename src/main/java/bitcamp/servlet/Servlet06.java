/* 주제: 한글 출력이 깨지는 문제 해결하기 
 * 
 */

package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet06")
public class Servlet06 extends GenericServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8"); 
    PrintWriter out = response.getWriter(); 
    out.println("Hello, world"); 
    out.println("안녕하세요.");
    out.println("你好"); 
    out.println("こんにちは");
  }
}
