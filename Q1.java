import java.util.Date;

class Document {
          private String[] authurs;
          private Date date;

          public String[] getAuthors() {
                    return authurs;
          }

          public void addAuthor(String author) {
                    authurs[authurs.length] = author;
          }

          public Date getDate() {
                    return date;
          }
}

class Book extends Document {

          private String title;

          public String getTitle() {
                    return title;
          }
}

class Email extends Document {
          private String subject;
          private String[] to;

          public String getSubject() {
                    return subject;
          }

          public String[] getTo() {
                    return to;
          }
}

public class Q1 {
          public static void main(String[] args) {

          }
}
