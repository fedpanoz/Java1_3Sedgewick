public class Prog1_3_3 {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int power = 1;
        int i = 0;
        while(i <= n){
            System.out.println(i + " " + power);
            power = 2 * power;
            i = i + 1;
        }
        System.out.println(Integer.MAX_VALUE +1);
    }
    
}
