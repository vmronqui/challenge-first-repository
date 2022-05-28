package exOperadores;


public class Main{
    public static void main(String[]args){
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
    }
    private static void prePos() {
        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("x:" + x);
    }

    private static void aritmetico() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;
    }

    private static void atribuicao(){
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d:"+d);

        i += 5; //1=1+5
        i -= 3; //j=j-3
        d /= 2.7d; //d=d/2.7d
        l *= 3; //1=1*3
        k %= 2; //k=k%2
        System.out.println("i:"+i);
        System.out.println("j:"+j);
        System.out.println("d:"+d);
        System.out.println("l:"+l);
        System.out.println("k:"+k);

        i=k=1;

        System.out.println("k:"+k);
        System.out.println("i:" + i);

    }

    private static void precedencia(){
        int i =10;
        int j = 20;
        int k = 30;

        int a =  i++ + --j * k; // 10+ 1930->18+578->580
        System.out.println("i++ + --j *k: "+ a);

        System.out.println("i:" +1);

        int b= k / --i %3+1; // 30/10%3+1->1
        System.out.println("k/--i%3+1: "+b);
        System.out.println("i: "+1);
        int c=2;

        c *= i+=5; //c=2*1;i=1+5->c=2+1;i=10+5;->c=2*15;>c=2+15;c=38
        System.out.println("c*=1+=5: " +c);
        int i10 =3;
        int x = 10 - 5 * 2 + --i;
        System.out.println(+x);
    }
}