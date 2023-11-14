package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Person> myFam = new ArrayList<Person>();

        myFam.add(new Person("Steven", "Crutchfield", 30));
        myFam.add(new Person("Bryan", "Crutchfield", 27));
        myFam.add(new Person("Alan", "Crutchfield", 27));
        myFam.add(new Person("Deonte", "Wilkins", 29));
        myFam.add(new Person("Cedric", "Morrisey", 26));
        myFam.add(new Person("Desmond", "Boney", 24));


        Collections.sort(myFam);

        for (Person person: myFam){
            System.out.println(person);
        }

    }
}
