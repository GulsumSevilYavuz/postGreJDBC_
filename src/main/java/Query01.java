import java.sql.*;


public class Query01 {



        public static void main(String[] args) throws ClassNotFoundException,  SQLException {
//1.Driver tanimla
            Class.forName("org.postgresql.Driver");
            //2.Data base'e baglan
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/jdbc",
                    "postgres",
                    "1503");
            //  3.Statement
            Statement st=con.createStatement();
            ResultSet veri = st.executeQuery("select * from ogrenciler");
            System.out.println(veri);
            //5) Dataları Al
         while( veri.next()){
                System.out.println(
                        veri.getInt(1)
                                + veri.getString(2)
                                + veri.getString(3)
                                + veri.getString(4));
            }

            //Bağlantıları Kapatma
            con.close();
            st.close();
            veri.close();
        }
    }

