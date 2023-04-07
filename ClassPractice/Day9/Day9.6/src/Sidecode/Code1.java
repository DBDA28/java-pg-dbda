package Sidecode;

public class Code1 {

    public static void main(String[] args) {

        String numbers ="0246897531";


        drawZero();
        drawOne();
        drawTwo();
        drawThree();
        drawFour();
        drawFive();
        drawSix();
        drawSeven();
        drawEight();
        drawNine();

        drawNumber("0246897531");

    }

    public static void drawZero(){
        System.out.println("0000000");
        System.out.println("0     0");
        System.out.println("0     0");
        System.out.println("0     0");
        System.out.println("0000000");
    }
    public static void drawOne(){
        System.out.println("   1");
        System.out.println("1  1");
        System.out.println("   1");
        System.out.println("   1");
        System.out.println("1111111");
    }
    public static void drawTwo(){
        System.out.println("2222222");
        System.out.println("      2");
        System.out.println("2222222");
        System.out.println("2");
        System.out.println("2222222");

    }
    public static void drawThree(){
        System.out.println("3333333");
        System.out.println("      3");
        System.out.println("3333333");
        System.out.println("      3");
        System.out.println("3333333");
    }
    public static void drawFour(){
        System.out.println("4     4");
        System.out.println("4     4");
        System.out.println("4444444");
        System.out.println("      4");
        System.out.println("      4");
    }
    public static void drawFive(){
        System.out.println("5555555");
        System.out.println("5");
        System.out.println("5555555");
        System.out.println("      5");
        System.out.println("5555555");
    }
    public static void drawSix(){
        System.out.println("6666666");
        System.out.println("6");
        System.out.println("6666666");
        System.out.println("6     6");
        System.out.println("6666666");
    }
    public static void drawSeven(){
        System.out.println("7777777");
        System.out.println("     7");
        System.out.println("    7");
        System.out.println("   7");
        System.out.println("  7");
    }
    public static void drawEight(){
        System.out.println("8888888");
        System.out.println("8     8");
        System.out.println("8888888");
        System.out.println("8     8");
        System.out.println("8888888");
    }
    public static void drawNine(){
        System.out.println("9999999");
        System.out.println("9     9");
        System.out.println("9999999");
        System.out.println("      9");
        System.out.println("9999999");
    }


   
public static void drawNumber(String numbers){
        int index = 0;
        while(index<numbers.length()) {
            if(numbers.charAt(index)=='0')
                drawZero();
            else if(numbers.charAt(index)=='1')
                drawOne();
            else if(numbers.charAt(index)=='2')
                drawTwo();
            else if(numbers.charAt(index)=='3')
                drawThree();
            else if(numbers.charAt(index)=='4')
                drawFour();
            else if(numbers.charAt(index)=='5')
                drawFive();
            else if(numbers.charAt(index)=='6')
                drawSix();
            else if(numbers.charAt(index)=='7')
                drawSeven();
            else if(numbers.charAt(index)=='8')
                drawEight();
            else if (numbers.charAt(index)=='9')
                drawNine();

            index++;
}
 
}
}