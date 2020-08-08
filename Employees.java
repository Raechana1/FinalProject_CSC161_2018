package main;

public class Employees{
  private String FirstName;
  private String LastName;
  private int AuthorityLvl;
  private String Username;
  private String Password;
  
  public Employees(){
  }
  
  public Employees(String first, String last, int authlvl, String user, String passwd){
    this.FirstName = first;
    this.LastName = last;
    this.AuthorityLvl = authlvl;
    this.Username = user;
    this.Password = passwd;
    
  }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAuthorityLvl() {
        return AuthorityLvl;
    }

    public void setAuthorityLvl(int AuthorityLvl) {
        this.AuthorityLvl = AuthorityLvl;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
  
}