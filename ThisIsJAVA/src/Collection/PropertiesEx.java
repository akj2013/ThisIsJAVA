package Collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

/**
 * 프로퍼티 파일로부터 읽기
 * 
 * Properties는 Hashtable의 하위 클래스이기 때문에 Hashtable의 모든 특징을 그대로 가지고 있다.
 * 차이점은 Hashtable은 키와 값을 다양한 타입으로 지정이 가능한데 비해 Properties는 키와 값을
 * String 타입으로 제한한 컬렉션이다.
 * 
 * 프로퍼티 파일은 키와 값이 = 기호로 연결되어 있는 텍스트 파일로 ISO 8859-1 문자셋으로 저장된다.
 * 이 문자셋은 직접 표현할 수 없는 한글은 유니코드로 변환되어 저장된다.
 *
 * 프로퍼티 파일은 일반적으로 클래스 파일과 함께 저장된다. 클래스 파일을 기준으로 상대 경로르 이용해서
 * 프로퍼티 파일의 경로를 얻으려면 Class의 getResource() 메소드를 이용하면 된다.
 * getResource()는 주어진 파일의 상대 경로를 URL 객체로 리턴하는데, URL의 getPath()는 파일의
 * 절대 경로를 리턴한다.
 * 
 * @author akjak
 *
 */
public class PropertiesEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8"); // 경로에 한글이 있으면 한글을 복원한다.
		properties.load(new FileReader(path));

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);

	}

}
