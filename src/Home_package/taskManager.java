/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * @author Guest
 */
public class taskManager {
    public static Properties prop = new Properties();
    public void saveTask(String title,String details)
    {try{
    prop.setProperty(title, details);
    prop.store(new FileOutputStream("Deadline.tut"), null);
    }
    catch(Exception e)
    {}
    }
    @SuppressWarnings("UnnecessaryReturnStatement")
     public void getTask(String title)
    {String value="";
        try{
    prop.load(new FileInputStream("Deadline.tut"));
    value = prop.getProperty(title);
    }
    catch(Exception e)
    {}
}}
