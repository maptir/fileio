package ku.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileUtil {
	static void copy(InputStream in, OutputStream out) {
		try {
			int word;
			while ((word = in.read()) != -1) {
				out.write(word);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	static void copy(InputStream in, OutputStream out, int blocksize) {
		try {
			byte[] buffer = new byte[blocksize];
			int count;
			while ((count = in.read(buffer)) != -1) {
				out.write(buffer, 0, count);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	static void bcopy(InputStream in, OutputStream out) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(in));
			PrintWriter print = new PrintWriter(out);
			String line;
			while ((line = buffer.readLine()) != null) {
				print.write(line + "\n");
			}
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	static void charCopy(InputStream in, OutputStream out, int charSize) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(in));
			BufferedWriter print = new BufferedWriter(new OutputStreamWriter(out));
			char[] charArr = new char[charSize];
			int length;
			while ((length = buffer.read(charArr)) != -1) {
				print.write(charArr, 0, length);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}
}
