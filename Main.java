/* My partner for this Lab was Christopher Fenter*/

import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;



class Main {
  
  static ArrayList<Person> people;
  static FileWriter writeFile;
  static FileReader readFile;


  
  
  public static void main(String[] args) {
    
    people = new ArrayList<Person>();

    people.add(new Person("Jonathan", 22, "green"));
    people.add(new Person("A", 87, "pink"));
    people.add(new Person("B", 13, "yellow"));
    people.add(new Person("C", 55, "black"));
    people.add(new Person("D", 4, "green"));

    try{
      writeFile = new FileWriter("data.txt");
      BufferedWriter output = new BufferedWriter(writeFile);

      for(int i = 0; i <people.size(); i++) {
        output.write(people.get(i).getName());
        output.newLine();
        output.write(Integer.toString(people.get(i).getAge()));
        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();

        output.flush();
      }
      output.close();
    }
    catch (IOException exception){
      System.out.println("An error occured: " + exception);
    }
    try{ 
      readFile = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(readFile);
      String name = "";
      String color = "";
      int age = 0;
      while (reader.ready()) {
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
        color = reader.readLine();

        System.out.printf("%-10s %-10s %-10s %n", name, age, color);
      }
      reader.close();
    }

    catch(IOException except) {
      System.out.println("An error occured: " + except);
    }

      }

    }

