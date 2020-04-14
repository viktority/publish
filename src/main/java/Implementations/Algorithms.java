package Implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Algorithms {

    // A method to trim a string of integers into n substrings omitting '0' in the process
    private static String[] trim(String string, int n) {
        List<Character> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '0') {
                continue;
            }
            list1.add(string.charAt(i));
        }
        String ss = list1.stream().map(String::valueOf).collect(Collectors.joining());

        for (int i = 0; i < ss.length(); i = i + n) {
            int end = i + n < list1.size() ? i + n : list1.size();
            list2.add(ss.substring(i, end));
        }

        String[] returnString = new String[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            returnString[i] = list2.get(i);
        }
        return returnString;
    }


//A Method to add 1 to an array of integers and carries over the last digit to the previous index if >9
    static int[] addOne(int[] digits) {
        int index = digits.length - 1;
        int[] d = add(digits, index);

        return d;
    }

    static int[] add(int[] a, int index) {
        int[] list = a;

        if (index < 0) {
            int[] temp = list;
            list = new int[temp.length + 1];
            list[0] = 1;
            for (int i = 1; i < temp.length; i++) {
                list[i] = temp[i - 1];

            }
            return list;
        } else {

            int inc = list[index] + 1;

            if (inc <= 9) {
                list[index] = inc;
            } else {
                list[index] = 0;
                return add(list, index - 1);

            }

            return list;
        }
    }

    //A Method the returns the item from 2 arrays
    private static List<String> uniqueNames(String[] array1, String[] array2) {

        List<String> returnArray = new ArrayList<String>();
        for (int i = 0; i < array1.length; i++) {
            if (returnArray.contains(array1[i]))
                continue;
            returnArray.add(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            if (returnArray.contains(array2[i]))
                continue;
            returnArray.add(array2[i]);
        }

        String[] returnVal = new String[returnArray.size()];
        for (int i = 0; i < returnVal.length; i++) {
            returnVal[i] = returnArray.get(i);
        }
        return returnArray;
    }
}
