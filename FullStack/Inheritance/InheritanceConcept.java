package org.studyeasy;
import org.studyeasy.Animal.*;
import org.studyeasy.Fish.*;
import org.studyeasy.Reptile.*;
import  org.studyeasy.Birds.*;
public class InheritanceConcept {
        public static void main(String[] args) {

		Animal animal = new Animal();
		System.out.println(animal.showInfo());
		Reptile reptile = new Reptile();
		System.out.println(reptile.showInfo());

		Crocodile croc = new Crocodile();
		System.out.println(croc.showInfo());


		Eel eel = new Eel();
		System.out.println(eel.showInfo());

        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());
        }

}
