package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C08String {
    public static void main(String[] args) throws IOException {

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
//        int[] arr = {17, 15, 20, 10, 15};

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
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i; j < arr.length; j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));

        // 방법 3
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        // 선택정렬의 복잡도는 O(n^2)
        // java 기본 내장 정렬함수의 복잡도: O(n*log(n))

        // 조합문제: 모두 각기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 두 숫자의 조합
        // ex) (10, 20), (10,30), (10,40), (10, 40), (20,30) ....

//        int[] arr = {10, 20, 30, 40, 50};
//
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i+1; j < arr.length; j++){
//                System.out.println(arr[i]+ ", " + arr[j]);
//            }
//        }
//
        // 배열의 중복 제거
//        // ex) 10, 20, 30, 40만 남도록
//        int[] arr = {10, 30, 20, 30, 10, 40};
//
//        // set 자료구조
//        // 1) set은 index가 없음
//        // 2) 중복이 없음
//        Set<Integer> mySet = new HashSet<>();
//        for(int a : arr) {
//            mySet.add(a);
//        }
//        int[] answer = new int[mySet.size()];
//        int index = 0;
//        for(int a : mySet) {
//            answer[index] = a;
//            index++;
//        }
//
//        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));


//        int[] arr = {1, 3, 6, 8, 8, 9, 11, 15};
//        int target = 11;
//        int index = -1;
        // target 이 몇 번째 index에 있는지 출력
        // O(log(n))의 복잡도로 찾기
//        System.out.println(Arrays.binarySearch(arr, target));
//        System.out.println(Arrays.binarySearch(arr, target) + 1);
//
//        // O(n)의 복잡도로 찾기
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == target){
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);
//

        // 이분탐색 (이진검색): binary search, 복잡도 log(n)
        // 사전에 데이터가 오름차순 되어 있는 경우에만 이분탐색
//        System.out.println(Arrays.binarySearch(arr, target));
//        // 찾고자 하는 값이 있으면 해당 index를 return
//        // 찾고자 하는 값이 없으면 - 값을 return
//        System.out.println(Arrays.binarySearch(arr, 13));
        // int[] arr = {1, 3, 6, 8, 8, 9, 11, 15};
        // 8을 찾고자 하면 어떤게 먼저 나올까?
        // 4번째가 나올 수 있고, 5번째가 나올 수 있다. log(n) 복잡도이므로
        // 절반씩 잘라서 찾고 또 절반 잘라서 찾으니까 순서 보장을 못 함

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        int[] n = new int[Integer.parseInt(br.readLine())];
//
//        st = new StringTokenizer(br.readLine());
//        for(int i = 0; i < n.length; i++) {
//            n[i] = Integer.parseInt(st.nextToken());
//        }
//
//        Arrays.sort(n);
//
//        int m = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        for(int i = 0; i < m; i++) {
//            int b = Integer.parseInt(st.nextToken());
//            sb.append(Arrays.binarySearch(n, b) >= 0 ? 1 : 0).append("\n");
//        }
//
//        System.out.println(sb);

        // 배열의 값 비교

//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 20, 30};
//        System.out.println(arr2==arr1); // memory 값 비교
//        System.out.println(Arrays.equals(arr1,arr2)); // 배열의 값 비교

        // 배열 복사
//        int[] arr = {1, 4, 6, 7, 8, 1, 2, 4, 6};
//        int[] arr1 = Arrays.copyOf(arr, arr.length);
//        int[] arr2 = Arrays.copyOf(arr, 4);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        int[] arr3 = Arrays.copyOfRange(arr, 3, 6);
//        System.out.println(Arrays.toString(arr3));

        // 빈 문자열로 채우기
//        String[] arr = new String[5];
//        Arrays.fill(arr, " ");
//        System.out.println(Arrays.toString(arr));

        // 이차원 배열의 선언과 값 할당
        // 방법 1) 선언 후 할당 방식
//        int[][] arr1 = new int[3][2];
//        arr1[0][0] = 1;
//        arr1[0][1] = 2;
//        arr1[1][0] = 3;
//        arr1[1][1] = 4;
//        arr1[2][0] = 5;
//        arr1[2][1] = 6;
//
//        // 방법 2) 리터럴 방식
//        int[][] arr2 = {{1,2}, {1,2}, {1,2}};
//
////         3*4, 1~12까지 각 자리에 할당
//        int[][] arr = new int[3][4];
//        int a = 1;
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                arr[i][j] = a;
//                a++;
//            }
//        }
//
//        System.out.println(Arrays.deepToString(arr));
////
//        // 이차원 배열의 출력
//        System.out.println(arr); // 2차원 배열의 heep 주소
//        System.out.println(Arrays.toString(arr)); // 각 1차원 배열의 heep 주소
//        System.out.println(Arrays.deepToString(arr)); // 각 1차원 배열의 값을
//
//        // 프로그래머스 - 행렬의 덧셈
//        class Solution {
//            public int[][] solution(int[][] arr1, int[][] arr2) {
//                int[][] answer = new int[arr1.length][arr1[0].length];
//                for(int i = 0; i < arr1.length; i++) {
//                    for(int j = 0; j < arr1[i].length; j++) {
//                        answer[i][j] = arr1[i][j] + arr2[i][j];
//                    }
//                }
//                return answer;
//            }
//        }

//        // 프로그래머스 - K번째 수
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
        int[] answer = new int[commands.length];
        for(int i = 0; i < answer.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = (temp[commands[i][2]-1]);
        }
        System.out.println(Arrays.toString(answer));
//
//        // 가변배열: 2차원 배열에서 각 1차원의 배열의 길이가 서로 다른 배열의 구조
//        int[][] arr1 = {{1,2}, {1,2,3,}, {1,2,3,4,}};
//        // 배열 전체 길이는 반드시 사전할당 되어야 하지만, 1차원 배열의 길이는 추후 할당 가능
//        int[][] arr2 = new int[3][];
//        arr2[0] = new int[2];
//        arr2[1] = new int[3];
//        arr2[2] = new int[4];


    }
}
