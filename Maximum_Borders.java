import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Maximum_Borders {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            char[][] grid = new char[R][C];
            for (int r = 0; r < R; r++) {
                grid[r] = br.readLine().toCharArray();
            }

            int maxBorder = 0;

            // Horizontal check
            for (int r = 0; r < R; r++) {
                int run = 0;
                for (int c = 0; c < C; c++) {
                    if (grid[r][c] == '#') {
                        run++;
                        maxBorder = Math.max(maxBorder, run);
                    } else run = 0;
                }
            }

            // Vertical check
            int[] colStreak = new int[C];
            for (int r = 0; r < R; r++) {
                for (int c = 0; c < C; c++) {
                    if (grid[r][c] == '#') {
                        colStreak[c]++;
                        maxBorder = Math.max(maxBorder, colStreak[c]);
                    } else colStreak[c] = 0;
                }
            }

            System.out.println(maxBorder);

        }
    }
}
