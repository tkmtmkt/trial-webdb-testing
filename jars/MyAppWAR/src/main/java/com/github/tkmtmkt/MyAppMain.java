package com.github.tkmtmkt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyAppMain extends HttpServlet {
    @EJB(name = "ejb/MyLibMainRemote")
    MyLibMainRemote myLibMain;

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out;
        res.setContentType("text/html; charset=UTF-8");
        out = res.getWriter();
        out.println("Hello World!");
    }

    public void execute() {
        log.info(">>>>> execute() start");
        myLibMain.execute();
    }
}
