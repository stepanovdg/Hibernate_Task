package com.epam.hibernatetask.data;

import com.epam.hibernatetask.model.EmployeelistEntity;
import org.hibernate.*;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 4/26/12
 * Time: 8:04 AM
 */
public class SelectDAO implements DAO{

    private SessionFactory sessionFactory;
//    private static final String GET_EMPLOYEES = "from USER7.EMPLOYEELIST ";
    private static final String GET_EMPLOYEES = "getEmployees";

    public SelectDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<EmployeelistEntity> getList() throws SQLException {
      return getList(null,null);
    }
    public List<EmployeelistEntity> getList(Integer max,Integer min) throws SQLException {
        if (min == null) min=0;
        if (max == null) max=100;
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.getNamedQuery(GET_EMPLOYEES);
        query.setInteger("MAX_ROW",max);
        query.setInteger("MIN_ROW",min);
        long lon = System.currentTimeMillis();
        List<EmployeelistEntity> list = (List<EmployeelistEntity>) query.list();
        /*Criteria criteria = session.createCriteria(EmployeelistEntity.class);
        criteria.setCacheMode(CacheMode.GET);
        criteria.setReadOnly(true);
        criteria.setCacheable(true);
        long lon = System.currentTimeMillis();
        List<EmployeelistEntity> list = (List<EmployeelistEntity>) criteria.list();*/
        System.out.println("time"+ (System.currentTimeMillis()-lon));
        transaction.commit();
        return list;
    }
}
