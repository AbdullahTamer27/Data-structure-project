import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Huffmantrial {
	private final String text;
	private Node root;
	private Map<Character , Integer> charFrequencies;
	private final Map<Character, String> huffmanCodes;
	
	public Huffmantrial(String text) {
		this.text = text;
		fillCharFrequenciesMap();
		huffmanCodes = new HashMap<>();
	}
	
	private void fillCharFrequenciesMap()
	{
		charFrequencies = new HashMap<>();
		for(char character : text.toCharArray()) {
			Integer integer = charFrequencies.get(character);
			charFrequencies.put(character, integer != null ? integer +1 : 1);
		}
		
	}
	public String encode(){
		Queue<Node> queue = new PriorityQueue<>();
		charFrequencies.forEach((character, frequency) -> queue.add(new Leaf(character, frequency)));
		while(queue.size() > 1) {
			queue.add(new Node(queue.poll(), queue.poll() ));
		}
		generateHuffmanCodes(root = queue.poll(), "");
		return getEncodedText();
	}
	
	private void generateHuffmanCodes(Node node, String code) {
		if(node instanceof Leaf) {
			huffmanCodes.put(( (Leaf) node).getcharacter(), code);
			return;
			
		}
		generateHuffmanCodes(node.getleft(), code.concat("0"));
		generateHuffmanCodes(node.getright(), code.concat("1"));
		
	}
	
	private String getEncodedText() {
		StringBuilder sb = new StringBuilder();
		for(char charachter : text.toCharArray()) {
			sb.append(huffmanCodes.get(charachter));		
		}
		return sb.toString();
	}
	
	public String decode(String encodedtext) {
		StringBuilder sb = new StringBuilder();
		Node current = root;
		for(char charachter : encodedtext.toCharArray()) {
			current = charachter =='0' ? current.getleft():current.getright();
			
			if(current instanceof Leaf) {
				sb.append(((Leaf) current).getcharacter());
				current = root;
			}
			
		}
		return sb.toString();
	}
	
	public void printCodes() {
		huffmanCodes.forEach((character, code) -> System.out.println(character + ": "+code));
	}
}
