package homeworks.homework7;

import java.util.List;

public class GenericStorage<T> {

    public List personList;


    public void addItem(T t){
        personList.add(t);
    }

    public void removeItem(T t){
        personList.remove(t);
    }

    public void searchItem(T t){

    }

    public void displayAllItems(){

    }

}
