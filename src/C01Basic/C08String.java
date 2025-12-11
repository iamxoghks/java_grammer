package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class C08String {
    public static void main(String[] args) {

        // 배열과 리스트의 차이점: 리스트는 동적으로 늘어날 수 있음

        // 배열의 정렬
//        String[] stArr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(stArr); // 오름차순 정렬
//        System.out.println(Arrays.toString(stArr));
//        Arrays.sort(stArr, Comparator.reverseOrder()); // 내림차순
//        System.out.println(Arrays.toString(stArr));
//        int[] arr = {17, 15, 20, 10, 15};
//        Arrays.sort(arr); // 오름차순 정렬
        // 원시 자료형은 Comparator 사용 불가능
//        Arrays.sort(arr, Comparator.reverseOrder());

        // 선택정렬 알고리즘 구현
        // 구현 로직: 1) 2중 for문을 사용하여 index마다 최소값 찾기 2) 현재 위치와 자리 change
        int[] arr = {17, 15, 20, 10, 15};

        // 방법 1
//        for(int i = 0; i < arr.length; i++) {
//            int index = i;
//            int min = arr[i];
//            for(int j = i; j < arr.length; j++) {
//                if(arr[j] < min) {
//                    min = arr[j];
//                    index = j;
//                }
//            }
//
//            int temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));

        // 방법 2
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
