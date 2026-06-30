import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionOracle {

    private Connection conn = null;
    private String url, user, pass;

    public ConexionOracle() {
        conectar();
    }

    private void conectar() {
        try {
            Class.forName("oracle.jdbc.OracleDriver"); // Driver BD
            url = "jdbc:oracle:thin:@localhost:1521:XE";
            user = "LocutorBD";
            pass = "923989388";
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Conectado!");
        } catch (Exception e) {
            System.out.println("Error, no se pudo conectar: " + e);
        }
    }

    public void desconectar() {

        try {
            conn.close();
            System.out.println("desconectar");
        } catch (Exception e) {
            System.out.println("Error, no se pudo desconectar: " + e);
        }
    }
    public static void main(String[] args) {
        ConexionOracle con = new ConexionOracle();
        con.desconectar();
    }
}
