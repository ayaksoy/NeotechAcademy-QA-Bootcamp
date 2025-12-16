package lesson08;

public class Task1 {

    public static void main(String[] args) {

        //How can I print number from 50 to 1???

        //I can choose: (1) the starting point, (2) the step change, (3) end point

        int x = 50;

        while (x > 0) {
            System.out.print(x + " ");
            x--;
        }
        System.out.println();


        //Can we now write a loop to ONLY print EVEN numbers from 50 to 1

        //1st way:
        x = 50;

        while (x > 0) {
            System.out.print(x + " ");

            x -= 2; // x = x - 2, same as x--; x--;
        }
        System.out.println();

        //2nd way:
        x = 50;

        while (x > 0) {

            if (x % 2 == 0)//number is even
            {
                System.out.print(x + " ");
            }


            x--;
        }


    }

}