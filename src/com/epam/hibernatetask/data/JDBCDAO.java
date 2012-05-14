package com.epam.hibernatetask.data;

import com.epam.hibernatetask.model.hibernate.EmployeelistEntity;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 5/3/12
 * Time: 8:33 AM
 */
public class JDBCDAO implements DAOIf {

     private SessionFactory sessionFactory;
    private static final String GET_EMPLOYEES = "getEmployees";

    public JDBCDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List getList() throws SQLException {
         return getList(null,null);
    }
    public List<EmployeelistEntity> getList(Integer max,Integer min) throws SQLException {

        return null;
    }
}
