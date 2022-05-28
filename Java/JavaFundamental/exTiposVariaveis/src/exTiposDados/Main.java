package exTiposDados;

public class Main {
        public static void main(String[] args){

            byte b1 = 10;
            byte b2 = 20;

            short s1 = 20000;
            /*short s2 = 40000 // tem um valor limite que não pode ser ultrapassado*/

            /*int i1 = -10000000000 // valor negativo muito abaixo do que um inteiro pode suportar*/
            int i2 = 28500;

            long l1 = 1000000000000000000L; /*long armazena inteiros maiores que o int pode suportar*/
            long l2 = 200400500550000L;

            /*float f1 = 4,5; // float também deve ser indicado com um f no final*/
            float f2 = 10.65f;

            double d1 = 85.69;
            double d2 = 99.84d;

            char c1 = 'W';
            /*char c2 = 'cW'; // char é só um caractere ou sua sequencia de códigos, como no c3*/
            char c3 = '\u0057';

            String st1 = "fulano";
            String st2 = "cicrano";
            String st3 = "sijdo aofdiaj aofijw dsosijd";

            /*string dt1 = "21/02/2004"; // é melhor usar o tipo date pois irá permitir mais manipulações com a data*/

            boolean bo1 = true;
            boolean bo2 = false;

            System.out.println(b1);
            System.out.println(b2);
            System.out.println(s1);
            System.out.println(i2);
            System.out.println(b1);
            System.out.println(l1);
            System.out.println(l2);
            System.out.println(f2);
            System.out.println(d1);
            System.out.println(d2);
            System.out.println(c1);
            System.out.println(c3);
            System.out.println(st1);
            System.out.println(st2);
            System.out.println(st3);
            System.out.println(bo1);
            System.out.println(bo2);


        }
}
