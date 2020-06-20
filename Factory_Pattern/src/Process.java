public class Process {
    private String actionName;
    private LearningActionFactory factory;

    public Process(String actionName, LearningActionFactory factory) {
        this.actionName = actionName;
        this.factory = factory;
    }

    public void execute() {
        LearningAction learningAction = factory.getLearningAction(actionName);
        if (learningAction != null) {
            learningAction.doAction();
        } else {
            System.out.println("Action - " + actionName + " not found.");
        }
    }
}
