public class Main {
    public static void main(String[] args) {
    for(int i =1; i<=10;i++) {
            System.out.println(i);}
        for(int i =10; i>=1;i--) {
            System.out.println(i);}

        for(int i =0; i<=16;i++) { if(i%2==0)
            System.out.println(i+2);}
        for (int i =-10; i <=10;i++) {
        System.out.println(i);}
        for (int i =1904; i <=2096;i+=4) {
            System.out.println(i +" год является високосным");}
        for (int i =7; i <=98;i+=7) {
            System.out.println(i);}
        for (int i =1; i <=512;i=i+i) {
            System.out.println(i);}
        int amount=29000;
        int annualAmount=0;
        for (int i =1; i <13;i++) { annualAmount=annualAmount+amount;

            System.out.println("Месяц"+i+"сумма накоплений равна"+annualAmount +"рублей");}
        int amount1=29000;
        int annualAmount2=0;
        for (int i =1; i <13;i++) { amount1=amount1+amount/120;
        annualAmount2=annualAmount2+amount1;



            System.out.println("Месяц"+i+"сумма накоплений равна"+annualAmount2 +"рублей");}}}


