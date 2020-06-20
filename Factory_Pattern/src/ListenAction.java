public class ListenAction implements LearningAction{
    private String actionName = "Listen";


    @Override
    public void doAction() { System.out.println("Hello, " + actionName); }
}

