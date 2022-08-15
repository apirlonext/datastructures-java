package arrays;

import java.util.*;

public class array {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        // 1. Create Array & Print them
        System.out.println("Part 1. Create Array & Print them");
            // Declaring Array String
            String strings[] = {"a","b","c","d"};

            System.out.println("Specific string: " + strings[2]);
            System.out.println("Array: " + Arrays.toString(strings));
        
        // 2. Adding new element
        System.out.println("\nPart 2. Adding new element");
            // Declaring new letter which we want to add to array
            String letterToAdd = "e";

            // Convert array to List for add easily new item
            List<String> list = new ArrayList<>(Arrays.asList(strings));
            list.add(letterToAdd);


            // Convert List to array again & Print Value
            strings = list.toArray(strings);
            System.out.println("Element to been added: " + letterToAdd);
            System.out.println("Arrays with added value: " + Arrays.toString(strings));
        
        // 3. Remove last element
         System.out.println("\nPart 3. Remove last element");
            // Convert array to List for remove easily last item
            List<String> listToRemove = new ArrayList<>(Arrays.asList(strings));
            // Calculate index of last element & Remove them
            int index = listToRemove.size();
            index = index - 1;
            System.out.println("Element to been removed: "+listToRemove.get(index));
            listToRemove.remove(index);
            while(listToRemove.remove(null)){};
            System.out.println(listToRemove);
            
            // Coverting to an array & Print without last element
            strings = listToRemove.toArray(new String[0]);
            System.out.println(Arrays.toString(strings));
        
        // 4. Insert element in middle
        System.out.println("\nPart 4. Insert element in the middle");
            List<String> insertBetween = new ArrayList<>(Arrays.asList(strings));
            String inTheMiddle = "z";
            insertBetween.add(3, inTheMiddle);
            while(insertBetween.remove(null));

            // Coverting to an array & Print without last element
            strings = insertBetween.toArray(strings);
            System.out.println("Element to been added in the middle: " + inTheMiddle);
            System.out.println(Arrays.toString(strings));
    }
}
