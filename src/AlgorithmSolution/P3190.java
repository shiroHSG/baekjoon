package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P3190 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());    //보드 크기
        int K = Integer.parseInt(br.readLine());    //사과 개수

        //사과 위치
        int[][] board = new int[N+1][N+1];
        for(int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            board[r][c] = 1;
        }

        Deque<int[]> turns = new ArrayDeque<>();
        int L = Integer.parseInt(br.readLine());    //방향 전환
        for(int i=0; i<L; i++) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            char C = st.nextToken().charAt(0);
            int c = C=='D' ? 1 : -1;    //right : 1, left : -1
            turns.addLast(new int[]{X,c});
        }

        Deque<int[]> snake = new ArrayDeque<>(); //뱀의 머리와 꼬리 확인
        boolean[][] body = new boolean[N+1][N+1];   //뱀의 몸이 차지하는 부분 확인

        snake.addLast(new int[]{1, 1});
        body[1][1] = true;

        // 오른쪽, 아래, 왼쪽, 위
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        // 0 : 오른쪽, 1 : 아래, 2 : 왼쪽, 3 : 위
        int dir = 0;
        int time = 0;
        while(true) {
            time++;

            // 머리 가져오기
            int[] head = snake.peekLast();
            int mr = head[0] + dr[dir];
            int mc = head[1] + dc[dir];

            // 머리가 벽이나 몸에 닿앗는지 체크
            if(mr < 1 || mr > N || mc < 1 || mc > N) break;
            if(body[mr][mc]) break;

            // 머리 늘리기
            snake.addLast(new int[]{mr, mc});
            body[mr][mc] = true;

            // 사과찾기
            if(board[mr][mc] == 1) board[mr][mc] = 0;
            else {
                // 사과가 없는 경우 꼬리제거
                int[] tail = snake.removeFirst();
                body[tail[0]][tail[1]] = false;
            }

            if(!turns.isEmpty() && turns.peekFirst()[0] == time) {
                int c = turns.removeFirst()[1];
                dir = (dir + c + 4) % 4;
            }
        }

        System.out.println(time);
    }
}
