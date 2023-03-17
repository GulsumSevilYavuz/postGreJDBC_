


import java.sql.*;


public class Execute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//1.Driver tanimla
        Class.forName("org.postgresql.Driver");
 //2.Data base'e baglan
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/Techpro",
                "postgres",
                "1503");//BUNU OLUSTUR CONNECTION CLASINDA KONTEYNERA KOY
    //  3.Statement
        Statement st=con.createStatement();

        System.out.println("Connection Success");

        con.close();
        st.close();

    }
}
