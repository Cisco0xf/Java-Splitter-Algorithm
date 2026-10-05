package Lec8String;

import java.util.ArrayList;
import java.util.List;

class Splitter {
    public static List<String> split(String target, String pattern) {

        List<String> data = new ArrayList<>();

        final boolean invalidInputs = !target.contains(pattern) || pattern.isEmpty();

        if (invalidInputs) {

            data.add(target);

            return data;
        }

        StringBuilder holder = new StringBuilder();

        final String eTarget = "%s%s".formatted(target, pattern);

        for (int i = 0; i < eTarget.length(); i++) {
            final String item = String.valueOf(eTarget.charAt(i));
            
            final boolean hasMatch = eTarget.startsWith(pattern, i);

            if (hasMatch) {
                data.add(holder.toString());


                holder.setLength(0);
            } else {
                holder.append(item);
            }

        }

        return data;
    }
}
