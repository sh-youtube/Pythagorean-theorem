package ir.shahriaarrr;

import  java.util.Scanner;

public class Main {
    // c^2 = a^2 + b^2

    public static void main(String[] args) {
        //variable
	    double a, b, c;
	    char x;
	    Scanner in = new Scanner(System.in);

	    while (true){
            System.out.print("Which side are you looking for [a, b, c]: ");
            x = in.next().charAt(0);
            if (Character.toLowerCase(x) == 'a'){

                System.out.print("give me side (c): ");
                c = in.nextDouble();

                System.out.print("give me side (b): ");
                b = in.nextDouble();

                calculate_sides(c, b, x);
            }else if (Character.toLowerCase(x) == 'b'){
                System.out.print("give me side (c): ");
                c = in.nextDouble();

                System.out.print("give me side (a): ");
                a = in.nextDouble();

                calculate_sides(c, a, x);
            } else if(Character.toLowerCase(x) == 'c'){
                System.out.print("give me side (a): ");
                a = in.nextDouble();

                System.out.print("give me side (b): ");
                b = in.nextDouble();

                calculate_sides(a, b, x);
            }

            System.out.println();

            System.out.print("Do you want to exit?[if you want to exit enter (y)] ");
            x = in.next().charAt(0);

            if (Character.toLowerCase(x) == 'y'){
                break;
            }else{
                continue;
            }


        }

    }

    public static void calculate_sides(double x, double y, char z){
        double result;
        if (Character.toLowerCase(z) == 'a'){
            result =  Math.sqrt(Math.pow(x, 2) - Math.pow(y, 2));
            System.out.printf("%f", result);
        } else if (Character.toLowerCase(z) == 'b'){
            result =  Math.sqrt(Math.pow(x, 2) - Math.pow(y, 2));
            System.out.printf("%f", result);
        } else {
            result =  Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            System.out.printf("%f", result);
        }
    }
}
