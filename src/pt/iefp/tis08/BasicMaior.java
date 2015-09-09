package pt.iefp.tis08;

import java.util.Scanner;

public class BasicMaior {
    
    public static enum CODIGO {IGUAL, MAIOR, MENOR,ERRO};
    public static CODIGO maior(int x, int y) {
        if (x==y) return CODIGO.IGUAL;
        if (x > y) return CODIGO.MAIOR;
        if (x < y) return CODIGO.MENOR;
        return CODIGO.ERRO;
    } 
    public static void main(String[] args) {
        System.out.println("O maior numero é");
        Scanner in = new Scanner (System.in);
        
        System.out.print("a=");
        int x = in.nextInt();
        System.out.print("b=");
        int y = in.nextInt();
        
        CODIGO m = maior (x, y);
        switch (m){
                case IGUAL:
                    System.out.println("a é igual a b");
                    break;
                case MAIOR:
                    System.out.println("a > b");
                    break;
                case MENOR:
                    System.out.println("a é menor que b");
                    break;
                default:System.out.println("Erro na comparação"); 
                           
        }//SWITCH             
    }//MAIN
}//CLASS
