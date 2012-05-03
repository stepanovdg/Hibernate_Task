package com.epam.hibernatetask.data;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 4/26/12
 * Time: 8:06 AM
 */
public interface DAO  {
    List getList() throws SQLException;
}
