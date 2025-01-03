package homeworks.homework4;

//2.Design a class called "Counter" to keep track of the number of instances created.
public class Counter {

    static int instanceCount;

    {
        instanceCount++;
    }

    static int getInstanceCount(){
        return instanceCount;
    }
}
