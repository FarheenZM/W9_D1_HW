package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Randomiser {

    private ArrayList<String> studentNames;

    public Randomiser() {

        studentNames = new ArrayList<>();

        studentNames.add("Farheen");
        studentNames.add("Harjit");
        studentNames.add("Debi");
        studentNames.add("Adri");
        studentNames.add("Clyera");
        studentNames.add("Tara");
        studentNames.add("Angelina");
    }

    public ArrayList<String> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(ArrayList<String> studentNames) {
        this.studentNames = studentNames;
    }


    public String giveARandomName(){
        Collections.shuffle(studentNames);
        String name = studentNames.get(0);
        return name;
    }

    public ArrayList<String> giveAListOfRandomNames(int num){
        ArrayList<String> names = new ArrayList<>();
        Collections.shuffle(studentNames);

        for(int index =0; index < num; index++) {

            String name = studentNames.get(index);
            names.add(name);
        }
        return names;
    }

//    public ArrayList<String> giveThreeRandomNames(){
//        ArrayList<String> three = new ArrayList<>();
//
//        Collections.shuffle(studentNames);
//        String name1 = studentNames.get(0);
//        three.add(name1);
//        String name2 = studentNames.get(1);
//        three.add(name2);
//        String name3 = studentNames.get(2);
//        three.add(name3);
//
//        return three;
//    }
//
//    public ArrayList<String> giveFourRandomNames(){
//        ArrayList<String> four = new ArrayList<>();
//
//        Collections.shuffle(studentNames);
//        String name1 = studentNames.get(0);
//        four.add(name1);
//        String name2 = studentNames.get(1);
//        four.add(name2);
//        String name3 = studentNames.get(3);
//        four.add(name3);
//
//        return four;
//    }
}
