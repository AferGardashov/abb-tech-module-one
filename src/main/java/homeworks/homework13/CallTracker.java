package homeworks.homework13;

//TASK 1
public class CallTracker {
    private static CallTracker callTracker;

    private int count;

    private CallTracker(){
    }

    public static CallTracker getInstance(){
        if(callTracker==null) callTracker = new CallTracker();
        return callTracker;
    }

    public void increment(){
        System.out.println(++count);
    }

    public int getCount(){
        return this.count;
    }

}
