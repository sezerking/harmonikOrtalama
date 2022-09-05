public class Main {
    public static void main(String[] args) {
        int[] seri=new int[4];
        double sum=0.0;
        int sayi=1;

        for (int i = 0; i < seri.length; i++) {
            seri[i]=sayi;
            sum+=(1.0/seri[i]);
            System.out.println(sum);
            sayi++;
        }

        double ort=0;

        ort= seri.length/sum;
        System.out.println(ort);


    }
}
