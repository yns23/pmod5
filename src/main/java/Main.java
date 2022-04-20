import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobby", 23);
        Dog dog2 = new Dog("Fluffy", 26);
        Dog dog3 = new Dog("Koko", 15);
        Dog dog4 = new Dog("Koko", 15);

        List<String> list = new ArrayList<String>();
        Collections.addAll(list, dog1.getName(),dog2.getName(),dog3.getName());
        List<String> list2 = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable List: " + list2);
        list.add(dog3.getName());
        System.out.print("Unmodifiable List after adding element to the list:");


        FractionImplementation fractionImplementation = new FractionImplementation(25,65);
        fractionImplementation.setDenominator(45);
        UnmodifiableFraction unmodifiableFraction = new UnmodifiableFraction(fractionImplementation);
//        unmodifiableFraction.setDenominator(45);
        fractionImplementation.setNumerator(99);
        System.out.println(unmodifiableFraction.getNumerator());

    }


}
