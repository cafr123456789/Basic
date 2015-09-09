package pt.iefp.tis08;

import java.util.Scanner;

public class BasicSoma {
    
    private static int x;
    private static int y;
    
    public static int soma() {
        int soma = x + y;
        return x +y ;
    }
    public static void main(String[] args) {
        System.out.println("Aplicação Soma");
        Scanner in = new Scanner (System.in);
        
        System.out.print("x=");
        x = in.nextInt();
        System.out.print("y=");
        y = in.nextInt();
        
        System.out.println("x+y=" + soma());
    }
}