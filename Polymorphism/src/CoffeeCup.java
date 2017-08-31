public class CoffeeCup {

    private Liquid innerLiquid;

    void addLiquid(Liquid liquid){

        innerLiquid = liquid;
        innerLiquid.swirl(false);
        System.out.println(liquid.getClass().getTypeName());


    }
}