public class RestAction implements LearningAction{
    private String actionName = "Rest";

    @Override
    public void doAction() {
        System.out.println("Hello, " + actionName);
    }
}
