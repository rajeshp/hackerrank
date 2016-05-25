package main;

/**
 * Created by prajesh on 18/12/15.
 */
public class MyArrayListTest {


    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add("obj1");
        myArrayList.add("obj2");
        myArrayList.add("obj3");
        myArrayList.add("obj4");
        myArrayList.add("obj5");

        System.out.println(myArrayList.get(110));

    }

}
