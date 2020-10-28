import java.util.Scanner;

/**
 * Author: Ravel Mello
 * Created at: 26/10/2020
 */

public class Person {

    private static int age;

    public Person(int initialAge){
        if(initialAge < 0){
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    public void yearPasses(){
        this.age++;
    }

    public void amIOld(){
        if(age>=0 && age < 13){
            System.out.print("You are young. \n");
        } else if (age >=13 && age <18){
            System.out.print("You are a teenager. \n");
        } else {
            System.out.print("You are old. \n");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

         for(int i = 0; i < T; i++) {
            age = scan.nextInt();
            Person p = new Person(age);

            p.amIOld();
            for( int j = 0; j < 3; j++ ){
                p.yearPasses();
            }
             System.out.println("\n");
             p.amIOld();


         }
    }
}
