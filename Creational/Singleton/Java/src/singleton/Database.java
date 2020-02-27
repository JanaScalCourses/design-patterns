package singleton;

public enum Database {
  DATABASE;
  private String user = "default";
  private String password = "default";
  private String database = "default";
  private String url_port = "default";

  Database() {
  }

  public static Database getInstance() {
    return DATABASE;
  }

  public String getConnection() {
    return String.format("User:     %s\nPassword: %s\nDatabase: %s\nAddress:  %s\n",
        user, password, database, url_port);
  }

  public String getUser() {
    return user;
  }

  public String getPassword() {
    return password;
  }

  public String getDatabase() {
    return database;
  }

  public String getUrl_port() {
    return url_port;
  }

  public void loggin(String user, String password) {
    this.user = user;
    this.password = password;
  }

  public void connetTo(String url_port, String database) {
    this.database = database;
    this.url_port = url_port;
  }
}
