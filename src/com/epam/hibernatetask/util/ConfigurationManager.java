package com.epam.hibernatetask.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 5/7/12
 * Time: 4:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConfigurationManager {
    private static final String BUNDLE_NAME = "com.epam.hibernatetask.util." + "config";
    private static ResourceBundle resourceBundle;
    private static ConfigurationManager instance;

    //класс извлекает информацию из файла config.properties
    static {
        resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME, new Locale("", ""));
        ConfigurationManager instance = new ConfigurationManager();
    }

    public ConfigurationManager() {
    }

    public static String getProperty(String key) {
        return (String) resourceBundle.getObject(key);
    }
}
