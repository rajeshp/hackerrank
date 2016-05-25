package main;

/**
 * Created by prajesh on 18/12/15.
 */
public class MyArrayList {

    Object[] arr ;

    int index;

    public MyArrayList(){

        //create a default array of 100

        arr = new Object[100];


    }

    public void add(Object o){

       if(index<arr.length)
            arr[index++] = o;
        else
       {
           arr = new Object[110];


       }

    }

    public void delete(int i){
        arr[i]=null;
    }

    public Object get(int i){
        if(arr!=null && i < arr.length)
            return arr[i];

        return null;
    }


}
