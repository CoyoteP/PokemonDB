
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PDB {

	public static void main(String[] args) throws IOException {
		try {
			Scanner sc = new Scanner(System.in);
			String[][] data = new String[650][10];
			BufferedReader fileIn = new BufferedReader(new FileReader("status.csv"));

			FileReader fr = new FileReader("./status.csv");
            BufferedReader br = new BufferedReader(fr);
            int x = 0;
			String line;
            StringTokenizer token;
            while ((line = br.readLine()) != null) {
            	token = new StringTokenizer(line, "\n");
            	while (token.hasMoreTokens() && x <=649){
                	data[x][0] = token.nextToken();
                	x++;
                }
            }
            for(int i = 0;i <= 649;i++){
            	String[] str = data[i][0].split(",");
            	for(int j = 0;j <=8;j++){
            		data[i][j + 1] = str[j];
            	}
            }

            System.out.print("何番目のポケモンのデータを表示？:(1 ~ 649)");
            int z = sc.nextInt();
            for(int i = 1;i <=9;i++){
            	System.out.print(data[0][i] + "\t" + data[z][i] + "\n");
            }




		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}



	}

}
