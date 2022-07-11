import java.io.*;

class Student implements Serializable {

          private String name;
          private int CRN;
          private String email;

          Student(String name, int CRN, String email) {
                    this.name = name;
                    this.CRN = CRN;
                    this.email = email;
          }

          @Override
          public String toString() {
                    return "Name:" + name + "\nCRN: " + CRN + "\nEmail: " + email;
          }
}

public class Q4 {

          public static void main(String[] args) {

                    Student p1 = new Student("Ross", 312, "ross@friends.com");
                    Student p2 = new Student("Rachel", 351, "rachel@friends.com");

                    try {
                              FileOutputStream f = new FileOutputStream(new File("studentsList.txt"));
                              ObjectOutputStream o = new ObjectOutputStream(f);

                              // Write objects to file
                              o.writeObject(p1);
                              o.writeObject(p2);

                              o.close();
                              f.close();

                              FileInputStream fi = new FileInputStream(new File("studentsList.txt"));
                              ObjectInputStream oi = new ObjectInputStream(fi);

                              // Read objects
                              Student pr1 = (Student) oi.readObject();
                              Student pr2 = (Student) oi.readObject();

                              System.out.println(pr1.toString());
                              System.out.println(pr2.toString());

                              oi.close();
                              fi.close();

                    } catch (FileNotFoundException e) {
                              System.out.println("File not found");
                    } catch (IOException e) {
                              System.out.println("Error initializing stream");
                    } catch (ClassNotFoundException e) {
                              e.printStackTrace();
                    }

          }

}
