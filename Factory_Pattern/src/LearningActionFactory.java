public class LearningActionFactory {
    public LearningAction getLearningAction(String actionName) {
        switch (actionName) {
            case "read":
                return new ReadAction();
            case "solve":
                return new SolveAction();
            case "watch":
                return new WatchAction();
            case "rest":
                return new RestAction();
            case "listen":
                return new ListenAction();
            default:
                return null;
        }
    }
}
