package com.epam.hibernatetask.logic;

import com.epam.hibernatetask.data.DAOIf;
import com.epam.hibernatetask.data.HibernateUtil;
import com.epam.hibernatetask.data.JPADAO;
import com.epam.hibernatetask.model.hibernate.EmployeelistEntity;
import com.epam.hibernatetask.util.ConfigurationManager;

import javax.persistence.EntityManager;
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
    private static final String EMPLOYEE_LIST_JSP = "EMPLOYEE_LIST_JSP";
    private static final String ERROR_JSP = "ERROR_JSP";
    private static final String LIST = "list";
    private DAOIf dao;
    private List<EmployeelistEntity> list;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    @Override
    public void init() throws ServletException {
        super.init();
      /* SessionFactory sessionFactory =  HibernateUtil.getSessionFactory();
        dao = new SelectDAO(sessionFactory); */
        EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
        dao = new JPADAO(entityManager);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       processRequest(request,response);
    }
    private void  processRequest(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        String page;
        try {
            list = dao.getList();
            request.setAttribute(LIST, list);
            page = ConfigurationManager.getProperty(EMPLOYEE_LIST_JSP);
        } catch (SQLException e) {
           page = ConfigurationManager.getProperty(ERROR_JSP);
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }
}
