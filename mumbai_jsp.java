/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2025-02-21 23:58:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import web.tourism.*;
import java.util.*;

public final class mumbai_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("web.tourism");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Mumbai Page</title>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css\" integrity=\"sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"mumbai.jsp\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"suicide.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section class=\"all\">\r\n");
      out.write("    <h1>NeXtStop</h1>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"homepage.jsp\">Home</a></li>\r\n");
      out.write("            <li><a href=\"#\">Services</a></li>\r\n");
      out.write("            <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("            <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("            <li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("<br><br><br>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"middle\">\r\n");
      out.write("        <div class=\"text-content\">\r\n");
      out.write("            <h1>WECOME TO MUMBAI</h1>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        <img src=\"g4.jpeg\" class=\"img1\" alt=\"image\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"line\">\r\n");
      out.write("      <b>HOTELS</b><br/><br/>\r\n");
      out.write("      </div>\r\n");
      out.write("      ");
   
tour t=new tour();
List<tourobj> tlist=new ArrayList<>();
tlist=t.getdetails();
int i=0,n=tlist.size();
out.print("<ul class='cards'>");
for(i=0;i<n;i++){
	if(tlist.get(i).getCity().equals("Mum") && tlist.get(i).getCategory().equals("hotel")){
	out.print("<li class='card'>");
	out.print("<div>");
	out.print("<h3 class='card-title'>"+tlist.get(i).getPlace()+"</h3>");
	out.print("<div class='card-content'>");
	out.println("<center><img height='300' width='250' alt='https://images.luxuryescapes.com/q_auto:best,c_scale,w_600,dpr_2.0/pp220zleph9k2e2dxyyf.webp' src='"+tlist.get(i).getJpg()+"'/></center>");
	out.print("</div></div>");
	out.print("<div class='card-link-wrapper'>");
	out.print("<a href='"+ tlist.get(i).getMap()+"' class='card-link'>Directions </a> ");
	out.print(" </div></li>");
	out.print("<pre>   </pre>");
	}
}
out.println("</ul>");
out.println("<br/><br/>");
out.println("<div class='line'><b>RESTAURENT</b><br/><br/></div>");
out.print("<ul class='cards'>");
for(i=0;i<n;i++){
	if(tlist.get(i).getCity().equals("Mum") && tlist.get(i).getCategory().equals("food")){
	out.print("<li class='card'>");
	out.print("<div>");
	out.print("<h3 class='card-title'>"+tlist.get(i).getPlace()+"</h3>");
	out.print("<div class='card-content'>");
	out.println("<center><img height='300' width='250' alt='https://images.luxuryescapes.com/q_auto:best,c_scale,w_600,dpr_2.0/pp220zleph9k2e2dxyyf.webp' src='"+tlist.get(i).getJpg()+"'/></center>");
	out.print("</div></div>");
	out.print("<div class='card-link-wrapper'>");
	out.print("<a href='"+ tlist.get(i).getMap()+"' class='card-link'>Directions </a> ");
	out.print(" </div></li>");
	out.print("<pre>   </pre>");
	}
}
out.println("</ul>");
out.println("</ul>");
out.println("<br/><br/>");
out.println("<div class='line'><b>CAR RENTALS</b><br/><br/></div>");
out.print("<ul class='cards'>");
for(i=0;i<n;i++){
	if(tlist.get(i).getCity().equals("Mum") && tlist.get(i).getCategory().equals("car")){
	out.print("<li class='card'>");
	out.print("<div>");
	out.print("<h3 class='card-title'>"+tlist.get(i).getPlace()+"</h3>");
	out.print("<div class='card-content'>");
	out.println("<center><img height='300' width='250' alt='https://images.luxuryescapes.com/q_auto:best,c_scale,w_600,dpr_2.0/pp220zleph9k2e2dxyyf.webp' src='"+tlist.get(i).getJpg()+"'/></center>");
	out.print("</div></div>");
	out.print("<div class='card-link-wrapper'>");
	out.print("<a href='"+ tlist.get(i).getMap()+"' class='card-link'>Directions </a> ");
	out.print(" </div></li>");
	out.print("<pre>   </pre>");
	}
}
out.println("</ul>");
out.println("</ul>");
out.println("<br/><br/>");
out.println("<div class='line'><b>MUST VISIT PLACES</b><br/><br/></div>");
out.print("<ul class='cards'>");
for(i=0;i<n;i++){
	if(tlist.get(i).getCity().equals("Mum") && tlist.get(i).getCategory().equals("place")){
	out.print("<li class='card'>");
	out.print("<div>");
	out.print("<h3 class='card-title'>"+tlist.get(i).getPlace()+"</h3>");
	out.print("<div class='card-content'>");
	out.println("<center><img height='300' width='250' alt='https://images.luxuryescapes.com/q_auto:best,c_scale,w_600,dpr_2.0/pp220zleph9k2e2dxyyf.webp' src='"+tlist.get(i).getJpg()+"'/></center>");
	out.print("</div></div>");
	out.print("<div class='card-link-wrapper'>");
	out.print("<a href='"+ tlist.get(i).getMap()+"' class='card-link'>Directions </a> ");
	out.print(" </div></li>");
	out.print("<pre>   </pre>");
	}
}
out.println("</ul>");


out.println("</ul>");
out.println("</ul>");
out.println("<br/><br/>");
out.println("<div class='line'><b>HOSPITALS</b><br/><br/></div>");
out.print("<ul class='cards'>");
for(i=0;i<n;i++){
	if(tlist.get(i).getCity().equals("Mum") && tlist.get(i).getCategory().equals("medicine")){
	out.print("<li class='card'>");
	out.print("<div>");
	out.print("<h3 class='card-title'>"+tlist.get(i).getPlace()+"</h3>");
	out.print("<div class='card-content'>");
	out.println("<center><img height='300' width='250' alt='https://images.luxuryescapes.com/q_auto:best,c_scale,w_600,dpr_2.0/pp220zleph9k2e2dxyyf.webp' src='"+tlist.get(i).getJpg()+"'/></center>");
	out.print("</div></div>");
	out.print("<div class='card-link-wrapper'>");
	out.print("<a href='"+ tlist.get(i).getMap()+"' class='card-link'>Directions </a> ");
	out.print(" </div></li>");
	out.print("<pre>   </pre>");
	}
}
out.println("</ul>");

out.println("</ul>");
out.println("</ul>");
out.println("<br/><br/>");
out.println("<div class='line'><b>BUS STOP</b><br/><br/></div>");
out.print("<ul class='cards'>");
for(i=0;i<n;i++){
	if(tlist.get(i).getCity().equals("Mum") && tlist.get(i).getCategory().equals("bus")){
	out.print("<li class='card'>");
	out.print("<div>");
	out.print("<h3 class='card-title'>"+tlist.get(i).getPlace()+"</h3>");
	out.print("<div class='card-content'>");
	out.println("<center><img height='300' width='250' alt='https://images.luxuryescapes.com/q_auto:best,c_scale,w_600,dpr_2.0/pp220zleph9k2e2dxyyf.webp' src='"+tlist.get(i).getJpg()+"'/></center>");
	out.print("</div></div>");
	out.print("<div class='card-link-wrapper'>");
	out.print("<a href='"+ tlist.get(i).getMap()+"' class='card-link'>Directions </a> ");
	out.print(" </div></li>");
	out.print("<pre>   </pre>");
	}
}
out.println("</ul>");

out.println("</ul>");
out.println("</ul>");
out.println("<br/><br/>");
out.println("<div class='line'><b>RAILWAY STATION</b><br/><br/></div>");
out.print("<ul class='cards'>");
for(i=0;i<n;i++){
	if(tlist.get(i).getCity().equals("Mum") && tlist.get(i).getCategory().equals("rail")){
	out.print("<li class='card'>");
	out.print("<div>");
	out.print("<h3 class='card-title'>"+tlist.get(i).getPlace()+"</h3>");
	out.print("<div class='card-content'>");
	out.println("<center><img height='300' width='250' alt='https://images.luxuryescapes.com/q_auto:best,c_scale,w_600,dpr_2.0/pp220zleph9k2e2dxyyf.webp' src='"+tlist.get(i).getJpg()+"'/></center>");
	out.print("</div></div>");
	out.print("<div class='card-link-wrapper'>");
	out.print("<a href='"+ tlist.get(i).getMap()+"' class='card-link'>Directions </a> ");
	out.print(" </div></li>");
	out.print("<pre>   </pre>");
	}
}
out.println("</ul>");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <center> <div id=\"l\">\r\n");
      out.write("       <button class=\"lm\"> <a href=\"https://www.nimh.nih.gov/health/topics/suicide-prevention\">learn more</a></button>\r\n");
      out.write("    </div>\r\n");
      out.write("</center>\r\n");
      out.write("   <center class=\"f\"> <h1>For Additional information search here :</h1>  </center>\r\n");
      out.write("    <div class=\"heading1\">\r\n");
      out.write("         \r\n");
      out.write("        <form action=\"https://www.google.com/search\">\r\n");
      out.write("           \r\n");
      out.write("<div class=\"ui-input-container\">\r\n");
      out.write("  <input\r\n");
      out.write("    required=\"\"\r\n");
      out.write("    placeholder=\"Search Here...\"\r\n");
      out.write("    class=\"ui-input\"\r\n");
      out.write("    type=\"text\"\r\n");
      out.write("    name=\"q\"\r\n");
      out.write("  />\r\n");
      out.write("  <div class=\"ui-input-underline\"></div>\r\n");
      out.write("  <div class=\"ui-input-highlight\"></div>\r\n");
      out.write("  <div class=\"ui-input-icon\">\r\n");
      out.write("    <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\">\r\n");
      out.write("      <path\r\n");
      out.write("        stroke-linejoin=\"round\"\r\n");
      out.write("        stroke-linecap=\"round\"\r\n");
      out.write("        stroke-width=\"2\"\r\n");
      out.write("        stroke=\"currentColor\"\r\n");
      out.write("        d=\"M21 21L16.65 16.65M19 11C19 15.4183 15.4183 19 11 19C6.58172 19 3 15.4183 3 11C3 6.58172 6.58172 3 11 3C15.4183 3 19 6.58172 19 11Z\"\r\n");
      out.write("      ></path>\r\n");
      out.write("    </svg>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"one\">\r\n");
      out.write("            <button class=\"bn\">search</button>\r\n");
      out.write("            <br><br>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<center><button class=\"but\"><a href=\"homepage.html\" id=\"h\">Back</a></button></center>\r\n");
      out.write("</div>  </div>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("  <div class=\"containerr\">\r\n");
      out.write("      <p>&copy; 2024 Suicide Awareness. All Rights Reserved.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
