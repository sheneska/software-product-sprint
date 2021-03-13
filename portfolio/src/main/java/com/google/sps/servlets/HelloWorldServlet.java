package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import java.util.ArrayList;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/myportfolio")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    //response.setContentType("text/html;");
    //response.getWriter().println("<h1>I learnt Javascript, HTML and front end/back end web development. </h1>");   
    ArrayList<String> desserts = new ArrayList<String>();
    desserts.add("Cheesecake");
    desserts.add("Cupcake");
    desserts.add("Icecream");

    Gson gson = new Gson();
    String json = gson.toJson(desserts);

    //ArrayList<String> desserts = new ArrayList<String>();

    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
}
