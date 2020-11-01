package serieFibbonacciConsola;

public class SerieFibbonacci {public static void main(String[] args) {
    int intIterador=0;
    int intValor1=0;
    int intValor2=1;
    int intValor3=0;
    do
    {
        if(intIterador<9)
        {
        System.out.print(intValor1+",");
        intValor3=intValor1+intValor2;
        intValor1=intValor2;
        intValor2=intValor3;
        }
        else
        {
            System.out.print(intValor1);
        }
        intIterador++;
       }   
    while(intIterador<10);
    }

}
