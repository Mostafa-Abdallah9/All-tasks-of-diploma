import inter.datastructure.GenericClass;

public class MainGenericClass {

    public static void main(String[] args) {
        GenericClass<Integer>genericClass = new GenericClass<>(5);
        genericClass.add(0,0);
        genericClass.add(1,1);
        genericClass.add(2,2);
        genericClass.add(3,3);
        genericClass.add(4,4);
        genericClass.add(5,5);

        genericClass.clear(0);
        System.out.println(genericClass.length());
        System.out.println(genericClass.isEmpty());
        System.out.println(genericClass.isFull());
    }

}

