package com.codeup.adlister.controllers;


import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.AdImage;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ads/images")
public class CreateAdImageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
            return;
        }
        long adId = Long.parseLong(request.getParameter("adId"));
        request.setAttribute("adId", adId);
        request.getRequestDispatcher("/WEB-INF/ads/adImage.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // verify that the user is logged in
        User user = (User) request.getSession().getAttribute("user");
        long adId = Long.parseLong(request.getParameter("adId"));
        AdImage adImg = new AdImage(
                user.getId(),
                request.getParameter("path")
        );
        DaoFactory.getAdImagesDao().insert(adImg);
        response.sendRedirect("/ads");
    }
}
