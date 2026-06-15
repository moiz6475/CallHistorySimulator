import java.util.ArrayList;

public class recursivedisplay {

    public void display(ArrayList<call> calls, int index) {

        if (index == calls.size()) {
            return;
        }

        System.out.println(calls.get(index));

        display(calls, index + 1);
    }
}