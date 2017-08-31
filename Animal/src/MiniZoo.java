public class MiniZoo{
    private Animal[] animals;

    public MiniZoo(Animal[] animals){
        this.animals = animals;
    }

    public void putThemOnsleep(){
        for (Animal animal : animals){
            animal.sleep();
        }
    }
}
