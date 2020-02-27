import singleton.Database;

public class Main {

  public static void main(String[] args) {
    Database database = Database.getInstance();
    database.loggin("Jana", "JanaPass");
    database.connetTo("localhost:9000", "someDB");
    System.out.println(database.getConnection());
    System.out.println("------------------------------");
    Database db = Database.DATABASE;
    System.out.println(db.getConnection());
  }
}
