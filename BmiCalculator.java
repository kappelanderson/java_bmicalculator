import java.util.Scanner;
public class ImcCalculator
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);

float height;
float weight;
float bmi;
System.out.print("Type your Height in cm:");
height = input.nextFloat();
System.out.print("Type your Weight in kg:");
weight = input.nextFloat();
bmi = weight/(height*height);
System.out.print("Your BMI is " + bmi + " --- ");
if(bmi > 40)
System.out.print("Obese class 3");
if(bmi < 40)
if(bmi > 35)
    System.out.print("Obese class 2")
;
;
if(bmi < 35)
if(bmi > 30)
    System.out.print("Obese class 1")
;
;
if(bmi < 30)
if(bmi > 25)
    System.out.print("OverWeight")
;
;
if(bmi < 25)
if(bmi > 18.5)
    System.out.print("Normal Weight")
;
;
if(bmi < 18.5)
    System.out.print("THINNESS")
;





}
}; // fim da classe Welcome1