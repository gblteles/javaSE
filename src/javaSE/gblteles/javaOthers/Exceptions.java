package javaSE.gblteles.javaOthers;

class TesteException extends Exception{
    @Override
    public String toString() {
        return "Nao da pra dividir por 0 nao cabaco";
    }
}

public class Exceptions {
    public static void main(String[] args) {

        /*MULTIPLE
        try {
            int A[] = {10,0,8,3,5};
            int r;
            r = A[0]/A[1];
            System.out.println(r);
            System.out.println(A[10]);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }*/
     //NESTED TRY BLOCK
            try {
            int A[] = {10,0,8,3,5};
            try {
                int r = A[0]/A[1];
                System.out.println(r);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(A[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
