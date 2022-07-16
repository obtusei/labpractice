import java.util.Date;

class Document {
          private String[] authors;
          private Date date;

          public String[] getAuthors() {
                    return authors;
          }

          public void addAurhor(String author) {
                    authors[authors.length] = author;
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
