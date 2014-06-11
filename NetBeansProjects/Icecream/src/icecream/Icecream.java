
package icecream;

import java.sql.*;


public class Icecream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    
    }
    
    public static Connection connecterDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            String url="jdbc:mysql://172.18.120.12:3306/root";
            String user="ice";
            String password="root";
            Connection conn =DriverManager.getConnection(url,user,password);
            System.out.println("Connexion bien établie");
            return conn;
        }
        catch(Exception e){
        e.printStackTrace();
        return null;
        }
    }
}
