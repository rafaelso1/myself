package src.Entity;

public class Me {

    private String myName;
    private String from;
    private String objective;

    //Constructor
    public Me(String input_myName, String input_from, String input_objective){
        myName = input_myName;
        from = input_from;
        objective = input_objective;
    }

    public void ShowMe(){
        String str = String.format("Hi! My name is %s, I'm %s and my dream is %s",myName, from, objective);
        System.out.println(str);
    }
}
