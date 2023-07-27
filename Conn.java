package ASimulatorSystem;


// For connecting java dile or form details in database  


import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{        // use mysql ,  if runtime error occurd sp exception hanfing use try catch block 
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","sristi");    
            s = c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  