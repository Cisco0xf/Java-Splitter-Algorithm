
public class Main {
    static void main(String[] args) {

        final String newTarget = "Sarah@#Youssef@#Salam@#Khalil@#Ebrahim";

        final List<String> split = Splitter.split(newTarget, "@#");

        Log.logColor("Value of split ➽ %s".formatted(split));
    }


}

