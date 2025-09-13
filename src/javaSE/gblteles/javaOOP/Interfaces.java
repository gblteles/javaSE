package javaSE.gblteles.javaOOP;

interface Member {
    void callback();
}

class Store {
    Member mem[] = new Member[100];
    int count = 0;
    void register(Member m) {
        mem[count++] = m;
    }
    void inviteSale(){
        for(int i = 0; i < count; i++){
            mem[i].callback();
        }
    }
}

class Customer implements Member{
    String name;
    Customer(String name){
        this.name = name;
    }
    public void callback(){
        System.out.println("Ok,will visit " + name);
    }
}

public class Interfaces {
    public static void main(String[] args){
        Customer c1 = new Customer("Teles");
        Customer c2 = new Customer("Luisa");
        Customer c3 = new Customer("Leticia");
        Customer c4 = new Customer("Ana");
        Customer c5 = new Customer("Luana");

        Store BB = new Store();
        BB.register(c1);
        BB.register(c2);
        BB.register(c3);
        BB.register(c4);
        BB.register(c5);

        BB.inviteSale();
    }
}
