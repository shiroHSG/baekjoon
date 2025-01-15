//https://www.acmicpc.net/problem/1406 진행중

package test;

import java.util.Scanner;

class ListNode {
    char value;
    ListNode next;
    ListNode prev;
    ListNode(char value) {
        this.value = value;
        next = null;
        prev = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int n = input.nextInt();

        ListNode strHead = new ListNode(str.charAt(0));
        ListNode current = strHead;
        ListNode prev;
        ListNode cursor;

        // 입력받은 문자열을 char로 리스트노드로 연결시킴
        for(int i=1; i<str.length(); i++) {
            prev = current;
            current.next = new ListNode(str.charAt(i));
            current = current.next;
            current.prev = prev;
        }

        cursor = current;   //가장 마지막 노드를 가리킴
        
        // n번 command 입력
        for(int i=0; i<n; i++) {
            char command = input.next().charAt(0);
            if(command == 'L') {
                if(cursor.prev!=null)
                    cursor = cursor.prev;
                System.out.println(cursor.value);
            }
            else if(command =='D') {
                if(cursor.next!=null)
                    cursor = cursor.next;
                System.out.println(cursor.value);
            }  
            //커서 왼쪽 문자 = 커서의 value
            else if(command =='B') {
                if(cursor.prev!=null) {
                    cursor.prev.next = cursor.next;
                    cursor = cursor.prev;
                }  
            }
            //미완성
            else if(command == 'P') {
                char c = input.next().charAt(0);
                cursor.next = new ListNode(c);
            }
        }



        //출력
        current = strHead;
        while(current!=null) {
            System.out.print(current.value);
            current = current.next;
        }

        input.close();
    }
}
