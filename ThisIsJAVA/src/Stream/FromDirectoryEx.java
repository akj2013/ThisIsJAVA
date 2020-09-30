package Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 디렉토리로부터 스트림 얻기
 * 
 * Files 의 정적 메소드인 list() 를 이용해서 디렉토리의 내용(서브 디렉토리 또는 파일 목록)을 스트림을 통해 읽고 콘솔에 출력한다.
 * 
 * @author akjak
 *
 */
public class FromDirectoryEx {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/Stream");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName())); // 서브 디렉토리 또는 파일의 이름을 리턴

	}

}
