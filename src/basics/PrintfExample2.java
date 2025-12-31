package src.basics;

public class PrintfExample2 {
    public static void main(String[] args) {

        //printf() is a method used to format output

        //%[flags][width][.precision][specifier-character]

        // + = output a plus
        // , = comma grouping separator like 1,000 10,000 so on
        // ( = negative numbers are enclosed in ()
        // space = dislay a minus if negative, and space if positive 

        double price1 = 9.99;
        double price2 = 76.08;
        double price3 = 100000;
        double price4 = -54.01;
        double price5 = 100.15;
        double price6 = -76.08;

    
        System.out.printf("%.2f\n",price1);
        System.out.printf("%+.2f\n",price2);
        System.out.printf("%,.2f\n",price3);
        System.out.printf("%(.2f\n",price4);
        System.out.printf("% .2f\n",price5);
        System.out.printf("% .2f\n",price6);


        System.out.printf("[% .2f]\n", price5);
        System.out.printf("[% .2f]\n", price6);


        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);


    System.out.printf("|%4d|\n", id1);
    System.out.printf("|%-4d|\n", id1);

    }
}
