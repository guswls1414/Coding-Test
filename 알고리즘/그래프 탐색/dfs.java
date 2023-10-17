import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static ArrayList<Integer>[] adj;
    static boolean[] visit;

    static void input(){
        adj = new ArrayList[10];
    }
    // x 를 갈 수 있다는 걸 알고 방문한 상태
    static void dfs(int x) {
        // x를 방문했다.
        visit[x] = true;

        // x 에서 갈 수 있는 곳들을 방문한다.
        for(int y : adj[x]) {
            if(visit[y])    // y 를 이미 방문 했다는 사실을 안다면, 굳이 갈 필요 없다.
                continue;

            // y 에서 갈 수 있는 곳들도 확인 해보자
            dfs(y);
        }
    }

    static void pro(){


    }
    public static void main(String[] args) {
        input();
        pro();
    }









    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}