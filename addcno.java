import java.util.Scanner;

public class addcno{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();
        
       
        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();
        
        
        double realSum = real1 + real2;
        double imaginarySum = imaginary1 + imaginary2;
        
        
        System.out.print("Sum of the complex numbers: ");
        if (imaginarySum < 0)
            System.out.println(realSum + " - " + Math.abs(imaginarySum) + "i");
        else
            System.out.println(realSum + " + " + imaginarySum + "i");
        
        scanner.close();
    }
}

