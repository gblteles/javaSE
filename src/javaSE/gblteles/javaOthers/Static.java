package javaSE.gblteles.javaOthers;

class Testando{
    static
    {
        System.out.println("Bloco 1");
    }

    Testando() {
        System.out.println("Construtor");
    }

    static
    {
        System.out.println("Bloco 2");
    }
}

public class Static {
    public static void main(String[] args) {
       Testando test1 = new Testando();
    }
}
