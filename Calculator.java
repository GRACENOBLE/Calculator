import java.util.Scanner;

class Calculator{
    static Scanner scanner = new Scanner(System.in);static double a,b;

    static void Addition(){
        System.out.print("\n\tCALCULATING SUM\n");
        System.out.print("\nEnter a first number:\n\t=>");
        a = scanner.nextDouble();
        System.out.print("Enter a second number:\n\t=>");
        b = scanner.nextDouble();
        System.out.println("\n\tThe sum is " + (a + b) + "\n\n");
        GoToMenuOrExit();
    }

    static void Subtraction(){
        System.out.print("\n\tCALCULATING DIFFERENCE\n");
        System.out.print("\nEnter a number\n\t=>");
        a = scanner.nextDouble();
        System.out.print("How much would you like to subtract from that number?\n\t=>");
        b = scanner.nextDouble();
        System.out.print("\n\tThe difference is " + (a - b) + "\n\n");
        GoToMenuOrExit();
    }

    static void Division(){
        System.out.print("\n\tDIVISION\n");
        System.out.print("\nEnter a Numerator\n\t=>");
        a = scanner.nextDouble();
        System.out.print("Enter a denominator\n\t=>");
        b = scanner.nextDouble();
        System.out.print("\n\tThe result is " + (a / b) + "\n\n");
        GoToMenuOrExit();
    }

    static void Multiplication(){
        System.out.print("\n\tCALCULATING PRODUCT\n");
        System.out.print("\nEnter a first number\n\t=>");
        a = scanner.nextDouble();
        System.out.print("Enter a second number\n\t=>");
        b = scanner.nextDouble();
        System.out.print("\n\tThe product is " + (a * b) + "\n\n");
        GoToMenuOrExit();
    }

    static void Modulus(){
        System.out.print("\n\tCALCULATING MODULUS\n");
        System.out.print("\nEnter a Numerator\n\t=>");
        a = scanner.nextDouble();
        System.out.print("Enter a denominator\n\t=>");
        b = scanner.nextDouble();
        System.out.print("\n\tThe remainder is " + (a % b) + "\n\n");
        GoToMenuOrExit();
    }

    static void AreaRectangle(){
        System.out.print("\n\tCALCULATING AREA OF A RECTANGLE\n");
        System.out.print("\nEnter the Length\n\t=>");
        a = scanner.nextDouble();
        System.out.print("Enter the width\n\t=>");
        b = scanner.nextDouble();
        System.out.print("\n\tThe Area is " + (a * b) + " Square Units\n\n");
        GoToMenuOrExit();
    }

    static void AreaCircle(){
        final double π = 3.14;
        double r;
        System.out.print("\n\tCALCULATING AREA OF A CIRCLE\nEnter the radius:\n\t=>");
        r = scanner.nextDouble();
        System.out.print("\n\tArea of circle: "+π * r * r + " Square Units\n\n");
        GoToMenuOrExit();
    }

    static void GoToMenuOrExit(){
        System.out.print("Do another operation?\n1.\tYes\n2.\tNo\n\t=>");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.print("Sorry you seem to have made a wrong input\nLets try that again:\n\n");
                GoToMenuOrExit();
                break;
        }

    }
    
    public static void main(String args []){
        
        do {
            System.out.print("What operation would you like to carry out?\n1.\tAddition\n2.\tSubtraction\n3.\tDivision\n4.\tMultiplication\n5.\tModulus\n6.\tArea of a rectangle\n7.\tArea of a circle\n8.\tExit\n\n\t=>");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Addition();
                    break;
                case 2:
                    Subtraction();                
                    break;
                case 3:
                    Division();
                    break;
                case 4:
                    Multiplication();
                    break;
                case 5:
                    Modulus();
                    break;
                case 6:
                    AreaRectangle();
                    break;
                case 7:
                    AreaCircle();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Sorry you seem to have made a wrong input\nLets try that again:\n\n");
                    break;
            }     
        } while (true);
    }
    
}