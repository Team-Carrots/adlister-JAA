package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.codeup.adlister.util.Password;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/adPage")
public class AdShowPageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/ad-show-page.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String IdStr = request.getParameter("adId");
        System.out.println(IdStr);
        long adId = Long.parseLong(IdStr);

        request.setAttribute("oneAd", DaoFactory.getAdsDao().oneAd(adId));
        request.setAttribute("userId", DaoFactory.getUsersDao().findUserByAdId(IdStr));
        request.getRequestDispatcher("/WEB-INF/ads/ad-show-page.jsp").forward(request, response);
    }
}