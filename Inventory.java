package main;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Inventory{
  private IntegerProperty ISBN;
  private StringProperty Title;
  private StringProperty Author;
  private IntegerProperty Quantity;
  
  public Inventory(){
      this.ISBN = new SimpleIntegerProperty();
        this.Title = new SimpleStringProperty();
        this.Author = new SimpleStringProperty();
        this.Quantity = new SimpleIntegerProperty();
  }

    public IntegerProperty getISBN() {
        return ISBN;
    }

    public void setISBN(IntegerProperty ISBN) {
        this.ISBN = ISBN;
    }

    public StringProperty getTitle() {
        return Title;
    }

    public void setTitle(StringProperty Title) {
        this.Title = Title;
    }

    public StringProperty getAuthor() {
        return Author;
    }

    public void setAuthor(StringProperty Author) {
        this.Author = Author;
    }

    public IntegerProperty getQuantity() {
        return Quantity;
    }

    public void setQuantity(IntegerProperty Quantity) {
        this.Quantity = Quantity;
    }
  
}
