package br.ifpr.edu.atividade2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("") //home
public class HelloWordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rest, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Hello World!");
    }
}
