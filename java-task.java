import java.util.*;

public class practice {
    List<Object> res = new ArrayList<>();

    public void flatten(List<Object> li) {
        for (Object o : li) {
            if (o instanceof List) {

                flatten((List<Object>) o);
                // System.out.println("recursive call");
            } else {
                // System.out.println(o);
                res.add(o);
            }
        }
        return;
    }

    public void show() {
        for (Object o : res) {
            System.out.println(o);
        }
    }

    public static void main(String args[]) {

        ArrayList<Object> li = new ArrayList<Object>();
        li.add(1);
        li.add('a');
        li.add(3.4);
        li.add(Arrays.asList(2, 6, 13));
        li.add("Nitin");
        li.add(Arrays.asList(7, Arrays.asList(7, 1, 3)));

        practice pr = new practice();
        pr.flatten(li);
        pr.show();
    }

}