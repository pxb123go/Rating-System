import java.util.Scanner;

class proggram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type your movie rateing out of 5");
        int r1=sc.nextInt();
        System.out.println("Type your movie rateing out of 5");
        int r2=sc.nextInt();
        System.out.println("Type your movie rateing out of 5");
        int r3=sc.nextInt();
        System.out.println("Type your movie rateing out of 5");
        int r4=sc.nextInt();
        System.out.println("Type your movie rateing out of 5");
        int r5=sc.nextInt();
        int avg=(r1+r2+r3+r4+r5)/5;
        System.out.println("Avarage rating is" +avg);
    }
}