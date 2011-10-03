import java.util.HashMap;
import java.util.Stack;


public class PostScript implements PostScriptInterface {

	
	
	private String filePathIn;
	private Stack<Double> stack;
	private HashMap<String,Double> map;

	public PostScript(String filePathIn){
		this.filePathIn = filePathIn;
		this.stack = new Stack<Double>();
		map = new HashMap<String,Double>();
	}
	@Override
	public void applyToken(String token) throws TokenException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void applyToken(int tokenNum) {
		// TODO Auto-generated method stub
		
	}

	//Test edition

	@Override
	public void startInterpreter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeData(String filePathOut) {
		// TODO Auto-generated method stub
		
	}
	

}
