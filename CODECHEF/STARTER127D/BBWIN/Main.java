import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            // Read input for each test case
            int a= sc.nextInt(); // Input variable
            int b=sc.nextInt();
            int diff=a-b;
            if(diff<10)
            {

                int k=10-diff;
                int f=(int)Math.ceil(Math.min(k/3.0,k/2.0));
                System.out.println(f);
            }
            else{
                System.out.println((0));
            }
        }
    }

    
   
   
}

