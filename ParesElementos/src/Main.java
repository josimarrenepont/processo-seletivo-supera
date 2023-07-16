import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
    int count = countArrDifferenceK(arr, k);
        System.out.println(count);
    }

    private static int countArrDifferenceK(int[] arr, int k) {
       int count = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : arr){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+ 1);
        }
        for (int num : arr){
            int target1 = num + k;
            int target2 = num - k;

            if(frequencyMap.containsKey(target1)){
                count += frequencyMap.get(target1);
            }
            if(frequencyMap.containsKey(target2) && target2 != num){
                count += frequencyMap.get(target2);
            }
        }
        return count;
    }
}