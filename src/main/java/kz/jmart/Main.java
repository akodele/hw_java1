package kz.jmart;

public class Main {
    public static void main(String[] args) {
        int var0=50;
        double var1=6.01;
        var1=var0/var1;
        System.out.println(var1);

        boolean b=false;
        if(var0>var1 && (var0-var1)!=10){
            b=true;
        }
        System.out.println("Условие выполнено:"+b);
    }
}
