/**
 * This is a class
 * Created 2022-04-04
 *
 * @author Magnus Silverdal
 */
public class DatabaseConnectorTest {
    public static void main(String[] args) {
        DatabaseConnector dbconn = new DatabaseConnector();
        String databaseContent = dbconn.getDatabaseContent();
        //System.out.println(databaseContent);
        System.out.println(dbconn.getTableInfo());
    }
}