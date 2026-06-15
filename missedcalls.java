import java.util.Stack;

public class missedcalls {

    private Stack<call> missedCalls = new Stack<>();

    public void addMissedCall(call call) {
        missedCalls.push(call);
        System.out.println("Missed Call Added.");
    }

    public void showMissedCalls() {

        if (missedCalls.isEmpty()) {
            System.out.println("No Missed Calls.");
            return;
        }

        for (int i = missedCalls.size() - 1; i >= 0; i--) {
            System.out.println(missedCalls.get(i));
        }
    }

    public void latestMissedCall() {

        if (missedCalls.isEmpty()) {
            System.out.println("No Missed Calls.");
            return;
        }

        System.out.println(missedCalls.peek());
    }
}