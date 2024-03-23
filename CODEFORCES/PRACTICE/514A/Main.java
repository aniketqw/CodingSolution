import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 23 March 2024 1hrs 
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
        FastReader scanner = new FastReader();

        int t = 1; // Number of test cases
        int c=0;
        while (t-- > 0) {
            // Read input for each test case
            String  s = scanner.nextLine(); // Input variable
            String k="";
            // More input variables if needed
            for(int i=0;i<s.length();i++)
            {
                 c=Character.getNumericValue(s.charAt(i));
                 if(i!=0 )
                 {
                if(c>=5)
                k+=String.valueOf(9-c);
                else
                k+=s.charAt(i);
                 }
                 else
                 {
                    if(c==9)
                    k+=String.valueOf(c);
                    else
                    if(c>=5)
                    k+=String.valueOf(9-c);
                    else
                    k+=String.valueOf(c);
                 }
            }               
            // Solve the problem
            

            // Output the result
            System.out.println(k);
        }
    }


} 