package javaSE.gblteles.javaOthers;

class CoffeMachine {
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static CoffeMachine my = null;

    private CoffeMachine(){
        coffeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }

    public void fillWater(float qty){
        waterQty = qty;
    }
    public void fillSugar(float qty){
        sugarQty = qty;
    }
    public float getCoffe(){
        return 0.23f;
    }

    static CoffeMachine getInstance(){
        if (my==null)
            my = new CoffeMachine();
        return my;
    }
}

public class Singleton {
    public static void main(String[] args) {
        CoffeMachine machine1 = CoffeMachine.getInstance();
    }
}
