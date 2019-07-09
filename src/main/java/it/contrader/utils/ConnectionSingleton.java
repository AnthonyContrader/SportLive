package it.contrader.utils;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;


public class ConnectionSingleton {


  private static Connection connection = null;


  private ConnectionSingleton() {
  }


  public static Connection getInstance() {
      if (connection == null) {
          try {
        	  final String resourceName = "application.properties";
			  ClassLoader loader = Thread.currentThread().getContextClassLoader();
			  Properties props = new Properties();
			  	try (InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
			  		props.load(resourceStream);
				}
              String driver="com.mysql.jdbc.Driver";
              String username=props.getProperty("spring.datasource.username");
              String password =props.getProperty("spring.datasource.password");
              Class c = Class.forName(driver);
              String myUrl = props.getProperty("spring.datasource.url");
              DriverManagerDataSource dataSource = new DriverManagerDataSource(myUrl, username, password);
              dataSource.setDriverClassName(driver);
              connection = dataSource.getConnection();
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
      return connection;
  }

}
