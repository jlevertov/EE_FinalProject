/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-04-18 12:59:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Login</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css\">\r\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("    <script src=\"http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        .ui-page {\r\n");
      out.write("            background:#595959;\r\n");
      out.write("        }\r\n");
      out.write("        .myButtonStyle\r\n");
      out.write("        {\r\n");
      out.write("            border-radius: 25px;\r\n");
      out.write("            padding :20px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        .textNegative\r\n");
      out.write("        {\r\n");
      out.write("            color:white;\r\n");
      out.write("            text-shadow:0 2px 0 #000000;\r\n");
      out.write("        }\r\n");
      out.write("        .textNormal\r\n");
      out.write("        {\r\n");
      out.write("            color:black;\r\n");
      out.write("            text-shadow:0 2px 0 #ffffff;\r\n");
      out.write("        }\r\n");
      out.write("        [data-role=footer]{bottom:0; position:absolute !important; top: auto !important; width:100%;}\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        function clearWhatToDoTextArea()\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById(\"itemText\").value = \"\";\r\n");
      out.write("            document.getElementById(\"itemTitle\").value = \"\";\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function clearAllAddAreas()\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById(\"itemText\").value = \"\";\r\n");
      out.write("            document.getElementById(\"itemTitle\").value = \"\";\r\n");
      out.write("            document.getElementById(\"ItemFinalDate\").value = \"\";\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        toDoListItem = function (title, whatToDo, creationDate, deadLine) {\r\n");
      out.write("            this.Title = title;\r\n");
      out.write("            this.WhatToDo = whatToDo;\r\n");
      out.write("            this.DeadLine = deadLine;\r\n");
      out.write("            this.CreationDate = creationDate;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        var toDoListItemList = [new toDoListItem(\"Buy Milk\",\"buy 3% milk from the supermarket\",\"18/04/2016\",\"20/04/2016\"),new toDoListItem(\"Pick up Sister\",\"Pick up my sister from school, Ashdod Ha-Yarden st. 38\",\"18/04/2016\",\"22/04/2016\")];\r\n");
      out.write("\r\n");
      out.write("        function ShowItems()\r\n");
      out.write("        {\r\n");
      out.write("            var place = document.getElementById(\"listPlace\");\r\n");
      out.write("            place.innerHTML = \"\";\r\n");
      out.write("            for(var i=0; i < toDoListItemList.length; i++)\r\n");
      out.write("            {\r\n");
      out.write("\r\n");
      out.write("                var newhtml = \"\";\r\n");
      out.write("                newhtml += \"<div id='itemDiv_\"+i+\"' style='width:100%;background-color:#ffffff;border-radius:20px'>\";\r\n");
      out.write("                newhtml += \"<div style='width:100%;background-color:#1a1a1a;border-top-right-radius:20px;'>\";\r\n");
      out.write("                newhtml += \"<p class='textNegative' id='itemDate_\"+i+\"' style='margin-left:10px;padding-top:10px;'>\" + toDoListItemList[i].DeadLine + \"</p>\";\r\n");
      out.write("                newhtml += \"<h3 id='itemTitle_\"+i+\"' class='textNegative' style='margin-left:10px;'>\" + toDoListItemList[i].Title + \"</h3>\";\r\n");
      out.write("                newhtml += \"</div>\";\r\n");
      out.write("                newhtml += \"<div style='width:100%;border-bottom-left-radius:20px;'>\";\r\n");
      out.write("                newhtml += \"<p class='textNormal' id='itemText_\"+i+\"' style='margin-left:10px'>\" + toDoListItemList[i].WhatToDo + \"</p>\";\r\n");
      out.write("                newhtml += \"</div>\";\r\n");
      out.write("                newhtml += \"<div style='width:100%;border-bottom-left-radius:20px;background-color:white'>\";\r\n");
      out.write("                newhtml += \"<p class='textNormal' style='margin-left:10px'><b>Created on: \" + toDoListItemList[i].CreationDate + \"</b></p></div>\";\r\n");
      out.write("                newhtml += \"<a href='#editMemo' style='border-radius:20px;margin-left:10px;margin-right:10px;background-color:#404040' class='ui-btn' onclick='OpenEditItem(\"+i+\")' data-transition='slide'>Edit</a>\";\r\n");
      out.write("                newhtml += \"<a style='border-radius:20px;margin-left:10px;margin-right:10px;background-color:#800000' class='ui-btn' onclick='DeleteItem(\"+i+\")'>Delete</a>\";\r\n");
      out.write("                newhtml += \"<br></div>\"\r\n");
      out.write("                place.innerHTML += newhtml;\r\n");
      out.write("            }\r\n");
      out.write("            place.innerHTML += \"<br><br>\";\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function DeleteItem(index)\r\n");
      out.write("        {\r\n");
      out.write("            if (index > -1) {\r\n");
      out.write("                toDoListItemList.splice(index, 1);\r\n");
      out.write("            }\r\n");
      out.write("            ShowItems();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function OpenEditItem(index)\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById(\"itemTitleEdit\").value = document.getElementById(\"itemTitle_\"+index).innerHTML;\r\n");
      out.write("            document.getElementById(\"itemTextEdit\").value = document.getElementById(\"itemText_\"+index).innerHTML;\r\n");
      out.write("\r\n");
      out.write("            var Unformattedline = document.getElementById(\"itemDate_\"+index).innerHTML;\r\n");
      out.write("            var deadlineDD = Unformattedline.slice(0,2);\r\n");
      out.write("            var deadlineMM = Unformattedline.slice(3,5);\r\n");
      out.write("            var deadlineYYYY = Unformattedline.slice(6,10);\r\n");
      out.write("\r\n");
      out.write("            document.getElementById(\"ItemFinalDateEdit\").value = deadlineYYYY + \"-\" + deadlineMM + \"-\" + deadlineDD;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function AddItemToList()\r\n");
      out.write("        {\r\n");
      out.write("\r\n");
      out.write("            var newItem = new toDoListItem();\r\n");
      out.write("            newItem.Title = document.getElementById(\"itemTitle\").value;\r\n");
      out.write("            newItem.WhatToDo = document.getElementById(\"itemText\").value;\r\n");
      out.write("\r\n");
      out.write("            var Unfixeddeadline = document.getElementById(\"ItemFinalDate\").value;\r\n");
      out.write("            var deadlineDD = Unfixeddeadline.slice(8,10);\r\n");
      out.write("            var deadlineMM = Unfixeddeadline.slice(5,7);\r\n");
      out.write("            var deadlineYYYY = Unfixeddeadline.slice(0,4);\r\n");
      out.write("\r\n");
      out.write("            newItem.DeadLine = deadlineDD + \"/\" + deadlineMM + \"/\" + deadlineYYYY;\r\n");
      out.write("\r\n");
      out.write("            var today = new Date();\r\n");
      out.write("            var dd = today.getDate();\r\n");
      out.write("            var mm = today.getMonth()+1; //January is 0!\r\n");
      out.write("            var yyyy = today.getFullYear();\r\n");
      out.write("\r\n");
      out.write("            if(dd<10) {\r\n");
      out.write("                dd='0'+dd\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            if(mm<10) {\r\n");
      out.write("                mm='0'+mm\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            today = mm+'/'+dd+'/'+yyyy;\r\n");
      out.write("            newItem.CreationDate = today;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            toDoListItemList.push(newItem);\r\n");
      out.write("            ShowItems();\r\n");
      out.write("            clearAllAddAreas();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div data-role=\"page\" data-theme=\"b\" id=\"LoginPage\">\r\n");
      out.write("    <div data-role=\"header\">\r\n");
      out.write("        <h1>To Do List App:</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div data-role=\"main\" class=\"ui-content\">\r\n");
      out.write("        <form name=\"logInForm\">\r\n");
      out.write("            <input type=\"text\" data-clear-btn=\"true\" placeholder=\"Username\" >\r\n");
      out.write("            <input type=\"password\" data-clear-btn=\"true\" placeholder=\"Password\" >\r\n");
      out.write("            <a href=\"#MainPage\" class=\"ui-btn\" data-transition=\"slide\">Log In</a>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div data-role=\"footer\">\r\n");
      out.write("        <h1>All Rights Reserved to J&R Inc.</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div data-role=\"page\" data-theme=\"b\" id=\"MainPage\">\r\n");
      out.write("    <div data-role=\"header\">\r\n");
      out.write("        <h1>Welcome User</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div data-role=\"main\" class=\"ui-content\">\r\n");
      out.write("        <div data-role=\"controlgroup\" data-type=\"horizontal\" >\r\n");
      out.write("            <a href=\"#addMemo\" class=\"ui-btn ui-icon-check ui-btn-icon-left ui-shadow ui-corner-all\" style=\"background-color:#808080;color:white;text-shadow:0 2px 0 #000000\" data-transition=\"slide\">Add</a>\r\n");
      out.write("            <a href=\"#LoginPage\" class=\"ui-btn ui-icon-delete ui-btn-icon-left\" style=\"background-color:#4d0000;color:white;text-shadow:0 2px 0 #000000\" data-transition=\"slide\" data-direction=\"reverse\">Log Out</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"search\" id=\"searchBar\" name=\"searchBar\" id=\"search-basic\" value=\"\" placeholder=\"Search Memo's\" />\r\n");
      out.write("\r\n");
      out.write("        <div id=\"listPlace\" style=\"width:100%;margin:auto;border-radius: 20px;\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("    <div data-role=\"footer\">\r\n");
      out.write("        <h1>All Rights Reserved to J&R Inc.</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div data-role=\"page\" data-theme=\"b\" id=\"addMemo\">\r\n");
      out.write("    <div data-role=\"header\">\r\n");
      out.write("        <h1><b>Add</b></h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div data-role=\"main\" class=\"ui-content\">\r\n");
      out.write("\r\n");
      out.write("        <div data-role=\"controlgroup\" data-type=\"horizontal\" >\r\n");
      out.write("            <a href=\"#MainPage\" class=\"ui-btn ui-icon-back ui-btn-icon-left\" style=\"background-color:#808080;color:white;text-shadow:0 2px 0 #000000\" data-transition=\"slide\" data-direction=\"reverse\">Return</a>\r\n");
      out.write("            <a href=\"#LoginPage\" class=\"ui-btn ui-icon-delete ui-btn-icon-left\" style=\"background-color:#4d0000;color:white;text-shadow:0 2px 0 #000000\" data-transition=\"slide\" data-direction=\"reverse\">Log Out</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <form>\r\n");
      out.write("            <input name=\"itemTitle\" id=\"itemTitle\" type=\"text\" data-clear-btn=\"true\" placeholder=\"Title\" >\r\n");
      out.write("            <textarea data-clear-btn=\"true\" placeholder=\"What to do...\" name=\"itemText\" id=\"itemText\"></textarea>\r\n");
      out.write("            <input type=\"button\" style=\"background-color:white\" value=\"Clear\" onclick=\"clearWhatToDoTextArea()\" >\r\n");
      out.write("            <label for=\"itemFinalDate\">Select Deadline Date:</label>\r\n");
      out.write("            <input type=\"date\" name=\"itemFinalDate\" id=\"ItemFinalDate\">\r\n");
      out.write("            <a href=\"#MainPage\" class=\"ui-btn ui-icon-check ui-btn-icon-left ui-shadow ui-corner-all\" style=\"background-color:#001a00\" data-transition=\"slide\" data-direction=\"reverse\" onclick=\"AddItemToList()\">Add</a>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div data-role=\"footer\">\r\n");
      out.write("        <h1>All Rights Reserved to J&R Inc.</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div data-role=\"page\" data-theme=\"b\" id=\"editMemo\">\r\n");
      out.write("    <div data-role=\"header\">\r\n");
      out.write("        <h1><b>Edit</b></h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div data-role=\"main\" class=\"ui-content\">\r\n");
      out.write("\r\n");
      out.write("        <div data-role=\"controlgroup\" data-type=\"horizontal\" >\r\n");
      out.write("            <a href=\"#MainPage\" class=\"ui-btn ui-icon-back ui-btn-icon-left\" style=\"background-color:#808080;color:white;text-shadow:0 2px 0 #000000\" data-transition=\"slide\" data-direction=\"reverse\">Return</a>\r\n");
      out.write("            <a href=\"#LoginPage\" class=\"ui-btn ui-icon-delete ui-btn-icon-left\" style=\"background-color:#4d0000;color:white;text-shadow:0 2px 0 #000000\" data-transition=\"slide\" data-direction=\"reverse\">Log Out</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <form>\r\n");
      out.write("            <input name=\"itemTitleEdit\" id=\"itemTitleEdit\" type=\"text\" data-clear-btn=\"true\" placeholder=\"Title\" >\r\n");
      out.write("            <textarea data-clear-btn=\"true\" placeholder=\"What to do...\" name=\"itemTextEdit\" id=\"itemTextEdit\"></textarea>\r\n");
      out.write("            <input type=\"button\" style=\"background-color:white\" value=\"Clear\" onclick=\"clearWhatToDoTextArea()\" >\r\n");
      out.write("            <label for=\"ItemFinalDateEdit\">Select Deadline Date:</label>\r\n");
      out.write("            <input type=\"date\" name=\"itemFinalDate\" id=\"ItemFinalDateEdit\">\r\n");
      out.write("            <a href=\"#MainPage\" class=\"ui-btn ui-icon-check ui-btn-icon-left ui-shadow ui-corner-all\" style=\"background-color:#001a00\" data-transition=\"slide\" data-direction=\"reverse\" onclick=\"\">Edit</a>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div data-role=\"footer\">\r\n");
      out.write("        <h1>All Rights Reserved to J&R Inc.</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    ShowItems();\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
