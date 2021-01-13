import org.apache.commons.lang3.SerializationUtils;

/**
 * Daniel Schirmer
 *
 * 01.12.2020
 * Project : Tag_06
 * ©2020
 *
 */

public class Application {

	public static void main(String[] args) {
		Auto automobil = new Auto();
		BMW bmw = new BMW(5.0f);
		BMW bmw2 = new BMW(bmw);
		
		byte[] data = SerializationUtils.serialize(bmw);
		byte[] data2 = SerializationUtils.serialize(bmw2);
		
		System.out.println(data.length + data2.length);
	}

}
