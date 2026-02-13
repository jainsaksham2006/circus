package circus;
import java.util.*;

import circus.animal.*;
import circus.stuff.Equipment;
import circus.stuff.Cannon;
import circus.stuff.Ladder;


public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Number of animals in circus: " + animals.length);

        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        System.out.println("number of animals in circus (ArrayList):" + animalArrayList.size());
        animalArrayList.add(new Elephant("Strong one"));
        printAllAnimals(animalArrayList);

        animalArrayList.add(new Duck("Andy"));
        Tiger sherkhan = new Tiger("Sher Khan");
        animalArrayList.add(sherkhan);

        Parrot bobby = new Parrot("Bobby");
        animalArrayList.add(bobby);

        System.out.println("position of sher khan in arraylist is : " + animalArrayList.indexOf(sherkhan));

        System.out.println("Before Sorting");
        printAllAnimals(animalArrayList);

        animalArrayList.sort(Animal.AnimalNameComparator);

        System.out.println("After sorting");
        printAllAnimals(animalArrayList);
        //makeAnimalsTalk();
        //System.out.println("Total value of animals " + calculateAssetValue(animals));
        //System.out.println("Total value of equipments " + calculateAssetValue(equipments));
    }

    private static void printAllAnimals(ArrayList<Animal> animalArrayList){
        for(Animal a : animalArrayList){
            System.out.println(a);
        }
    }



}
