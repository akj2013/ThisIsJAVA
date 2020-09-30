package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 파일 내용을 소스로 하는 스트림
 * 
 * Files의 정적 메소드인 lines()와 BufferedReader의 lines() 메소드를 이용하여 문자 파일의 내용을
 * 스트림을 통해 행 단위로 읽고 콘솔에 출력한다.
 * 
 * @author akjak
 *
 */
public class FromFileContentEx {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/Stream/StreamText.txt"); // 파일의 경로 정보를 가진 Path 객체 생성
		Stream<String> stream;

		// Files.lines() 메소드 이용
		stream = Files.lines(path, Charset.defaultCharset()); // 운영체제의 기본 문자셋
		stream.forEach(System.out :: println); // 메소드 참조

		System.out.println();

		// BufferedReader의 lines() 메소드 이용
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out :: println); // 메소드 참조

	}

}
