package com.epam.hibernatetask.logic;

import com.epam.hibernatetask.data.DAO;
import com.epam.hibernatetask.data.HibernateUtil;
import com.epam.hibernatetask.data.SelectDAO;
import com.epam.hibernatetask.model.EmployeelistEntity;
import org.hibernate.SessionFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 4/25/12
 * Time: 8:35 AM
 */

public class QueryServlet extends HttpServlet {
    private DAO dao;
    private List<EmployeelistEntity> list;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    @Override
    public void init() throws ServletException {
        super.init();
       SessionFactory sessionFactory =  HibernateUtil.getSessionFactory();
        dao = new SelectDAO(sessionFactory);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       processRequest(request,response);
    }
    private void  processRequest(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        String page;
        try {
            list = dao.getList();
            request.setAttribute("list", list);
//            page = ConfigurationManager.getProperty(PARSER_JSP);
            page = "/view/EmployeeList.jsp";
        } catch (SQLException e) {
          // page = ConfigurationManager.getProperty(ERROR_JSP);
            page = "/view/error.jsp";
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }
}
