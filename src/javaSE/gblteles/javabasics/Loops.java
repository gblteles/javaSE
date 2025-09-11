package javaSE.gblteles.javabasics;

public class Loops {
    public static void main(String[] args)
    {
        int[] nums = {10, 20, 30};
        for(int x : nums) {
            x = x * 2;
            System.out.print(x);
        }
    }
}
