/*
import java.io.File;

import javax.xml.parsers.DocumentBuilder;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		try {
			File file = new File("/home/abdullah/eclipse-workspace/MyDataProject/src/sample.xml");
			if(file.exists()) {
				
				DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
				
				DocumentBuilder builder = fact.newDocumentBuilder();
							
				Document doc = builder.parse(file);
				
				doc.getDocumentElement().normalize();
				
				
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		*/
		Huffmantrial huffman = new Huffmantrial("aaaaaaaabbbbbbbccccdd");
		
		String encoded = huffman.encode();
		
		System.out.println(encoded);
		
		huffman.printCodes();
		
		String original = huffman.decode(encoded);
		System.out.println(original);
		
	    
	    
	    

	}

}
