import java.util.LinkedList;
import java.util.Queue;

public class recentcalls {

    private Queue<call> recentCalls = new LinkedList<>();

    public void addCall(call call) {
        recentCalls.add(call);
    }

    public void showRecentCalls() {

        if (recentCalls.isEmpty()) {
            System.out.println("No Recent Calls.");
            return;
        }

        for (call call : recentCalls) {
            System.out.println(call);
        }
    }
}