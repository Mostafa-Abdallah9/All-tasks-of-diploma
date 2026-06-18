//import io.Employee;
//import io.Employee;




public class MainInheritance {

    public static void main(String[] args) {
//       final Tester tester = new Tester("Mostafa",32,"aziz@gmail.com","vois",550000);
//         final   Developer developer = new Developer("abdelasies",24,"mostafa@gmail.com","Aman",25000,"java");
//         final Dector dector=new Dector("elsayed",28,"elsayed@gmail.com","elkhiar",200000);
//         final Singer singer=new Singer("Anr Diab",64,"Male");
//         final Dancer dancer=new Dancer("fify abdo",73,73);
//         dancer.dance();
//         dancer.eat("Almond Crossent");
//         dancer.sleep();
//         System.out.println(".............................");
//
//         tester.eat("pizza");
//         tester.study("Cuc");
//         tester.findBug();
//         tester.sleep();
//        System.out.println(".............................");
//
//        developer.eat("shorpa");
//        developer.study("spring framework");
//        developer.fixDefect("MTD_123456");
//        developer.increaseSalary(0.5f);
//        developer.sleep();
//        System.out.println(".............................");
//
//        dector.eat("Burrits");
//        dector.examinePatient();
//        dector.sleep();
//        System.out.println("dector.getName() = " + dector.getName());
//        System.out.println(".............................");
//
//        singer.eat("shyrma");
//        singer.sing("gabar");
//        singer.sleep();
//        System.out.println(".............................");
// one in inheritance
//        final Animal animal = new Animal("Cat");
//        final Cat cat = new Cat("cat","white");
//        System.out.println(animal.getNameAnimal());
//        System.out.println(cat.getCatColor());
//        animal.makeSound("cat");
//        cat.makeSound("cat");

        // second in inheritance
        final Animal animal = new Animal("Cat");
        final Cat cat = new Cat("Cat","White");
        final Dog dog = new Dog("Dog","Red");
        System.out.println(animal);
        System.out.println(cat);
        System.out.println(dog);
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
        if (dog instanceof Animal) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

// 3 in inheritance
//        VehicleAgregation vehicleAgregation1  = new VehicleAgregation("Mostafa","Vehicle",2025,"Gas");
//        VehicleAgregation vehicleAgregation2  = new VehicleAgregation("Mohamed","car",2026,"Gasoline");
//        VehicleAgregation vehicleAgregation3  = new VehicleAgregation("Abdallah","F-150",2020,"Gas");
//        VehicleAgregation vehicleAgregation4  = new VehicleAgregation("Desokey","Yamaha R1",2015,"Gasoline");
//        Vehicle vehicle = new Vehicle(20f,vehicleAgregation1);
//        Car car = new Car(20,vehicleAgregation2,20);
//        Truck truck = new Truck(30,vehicleAgregation3,40f);
//        MotorCycle motorCycle = new MotorCycle(50f,vehicleAgregation4,16.5f);
//
//       System.out.println(car.calculateFuelEfficiency());
//        System.out.println(car.calculateDistanceTraveled());
//        System.out.println(car.calculateMaximumSpeed());
//        System.out.println("*************************");
//
//        System.out.println(truck.calculateFuelEfficiency());
//        System.out.println(truck.calculateDistanceTraveled());
//        System.out.println(truck.calculateMaximumSpeed());
//        System.out.println("*************************");
//
//        System.out.println(motorCycle.calculateFuelEfficiency());
//        System.out.println(motorCycle.calculateDistanceTraveled());
//        System.out.println(motorCycle.calculateMaximumSpeed());

        // 1 in Encapsulation
//        Student student = new Student("Mostafa",24,"Egypt");
//        System.out.println(student);
//        System.out.println("***********************");
        // 2 in Encapsulation
//        BankAccount bankAccount = new BankAccount("Mostafa desokey","Egypt",30000f);
//       System.out.println(bankAccount.deposit(500f));
//        System.out.println(bankAccount.withdraw(1000f));
//        System.out.println(bankAccount.withdraw(25000f));

        // 3 in encapsulation
//        Circle circle = new Circle(5.0f);
//        System.out.println(circle.calculateArea());
//        System.out.println(circle.calculatePerimeter());
//        System.out.println(circle);
//        System.out.println("************************");

        // 4 in encapsulation
//        Student2 student2 = new Student2("Mostafa",60f);
//        Student2 student3 = new Student2("Mostafa",600f);
//        if (student2.equals(student3)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//        student2.showStudentDegree();
//        System.out.println(student2);
//        System.out.println("******************************************");
    }
}
