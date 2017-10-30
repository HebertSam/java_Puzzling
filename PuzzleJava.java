import java.util.*;


public class PuzzleJava{
    static int[] thisArray = {3,5,1,2,7,9,8,13,25,32};
    static String[] nameArr = {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
    static String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    static ArrayList<String> names = new ArrayList<String>();
    static ArrayList<String> alpha = new ArrayList<String>();

    public static ArrayList<Integer> greaterThan10(int[] arr){
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > 10){
                newArr.add(arr[i]);
            }
        }
        System.out.println(sum);
        return newArr;
    }
    public static ArrayList<String> shuffleArr(ArrayList<String> arr){
        Collections.shuffle(arr);
        return arr;
    }
    public static String displayFirstLastShuffle(ArrayList<String> arr){
        shuffleArr(arr);
        String[] vowel = {"a","e","i","o","u"};
        for (int i = 0; i < vowel.length; i++){
            if(arr.get(0) == vowel[i]){
                System.out.println("the first letter is a vowel!");
            }
        }
        return arr.get(0);
    }
    public static ArrayList<Integer> randArray(int num){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < num; i++){
            list.add(new Random().nextInt((100 - 55) +1) + 55);
        }
        return list;
    }
    public static ArrayList<Integer> sortRandArray(int num){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = randArray(num);
        Collections.sort(list);
        return list;
    }
    public static String randString(int num){
        String newStr = "";
        for (int i = 0; i < num; i++){
            newStr += alphabet[new Random().nextInt(alphabet.length)];
        }
        return newStr;
    }
    public static ArrayList<String> randStringArray(int num1, int num2){
        ArrayList<String> newList = new ArrayList<String>();
        for (int i = 0; i < num1; i++){
            newList.add(randString(num2));
        }
        return newList;
    }

    public static void main(String[] args){
        // ArrayList<Integer> array = new ArrayList<Integer>();
        // array = greaterThan10(thisArray);
        // System.out.println(array);
        // for (int i = 0; i < nameArr.length; i++){
        //     names.add(nameArr[i]);
        // }
        // System.out.println(shuffleArr(names));
        // for (int i = 0; i < alphabet.length; i++){
        //     alpha.add(alphabet[i]);
        // }
        // System.out.println(displayFirstLastShuffle(alpha));
        // System.out.println(randArray(10));
        // System.out.println(sortRandArray(10));
        // System.out.println(randString(5));
        System.out.println(randStringArray(10, 5));
    }
}