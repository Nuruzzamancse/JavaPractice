public class MiniZooDemo{
    public static void main(String[] args){
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger(4);
        animals[1] = new Lion(4);


        MiniZoo miniZoo = new MiniZoo(animals);

        miniZoo.putThemOnsleep();
    }


}
