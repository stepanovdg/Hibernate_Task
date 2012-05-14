package com.epam.hibernatetask.data;


import com.epam.hibernatetask.model.jpa.EmployeelistEntityJPA;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 5/3/12
 * Time: 9:04 AM
 */
public class JPADAO implements DAOIf {

    private  EntityManager entityManager;
    private static final String GET_EMPLOYEES = "getEmployeesJPA";

    public JPADAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List getList() throws SQLException {
        return getList(null, null);
    }

    public List<EmployeelistEntityJPA> getList(Integer max, Integer min) throws SQLException {
         if (min == null) min = 0;
        if (max == null) max = 100;
        entityManager.getTransaction().begin();
        Query query =  entityManager.createNamedQuery(GET_EMPLOYEES);
        query.setParameter("MAX_ROW", max);
        query.setParameter("MIN_ROW", min);
        long lon = System.currentTimeMillis();
        List<EmployeelistEntityJPA> list = (List<EmployeelistEntityJPA>) query.getResultList();
         System.out.println("time" + (System.currentTimeMillis() - lon));
        entityManager.getTransaction().commit();
        return list;
    }
}
