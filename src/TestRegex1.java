/*
 *����������ʽ����ץȡ��ҳ�е����� 
 */
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestRegex1 {
	
	public static void main(String[] args) throws IOException {
		String s = null;

		Pattern p = Pattern.compile(
		"[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+");

		File fw = new File("C:\\Users\\Administrator\\Desktop\\��ȡ�������б�.txt");
		BufferedWriter fos = new BufferedWriter(new FileWriter(fw));
		
		File f = new File("C:\\Users\\Administrator\\Desktop\\Ҫ������������.html");
		BufferedReader b = new BufferedReader(new FileReader(f));


		try {

			String line = "";

			while((line = b.readLine()) != null) {
				Matcher m = p.matcher(line);

				while(m.find()) {
					s = m.group();
					//System.out.println(s);
					fos.write(s);
					fos.newLine();
					fos.flush();
				} 
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			fos.close();
			b.close();
			//System.exit(0);
		}
	}
}
	/*
	private static void write(String group) {


		try {
			BufferedWriter fos = new BufferedWriter(new FileWriter(
					"D:\\Myeclipse\\Workspace\\��ȡ�������б�.txt"));
			fos.write(group);
			fos.newLine();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/




