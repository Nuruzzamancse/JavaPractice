public class Area {



    public static void main(String[] args){

        Cylinder cylinder = new Cylinder(2.0,"Green",3.0);

        Cylinder cylinder1 = new Cylinder(3);

        System.out.println(cylinder.geArea());
        System.out.println(cylinder1.geArea());

        System.out.println(cylinder1.getVolume());
    }
}
