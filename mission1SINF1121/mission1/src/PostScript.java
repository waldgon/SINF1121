import java.util.Stack;


public class PostScript implements PostScriptInterface {

	
	
	private String filePathIn;
	private Stack<Double> stack;

	public PostScript(String filePathIn){
		this.filePathIn = filePathIn;
		this.stack = new Stack<Double>();
	}
	@Override
	public void applyToken(String token) throws TokenException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void applyToken(int tokenNum) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void startInterpreter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeData(String filePathOut) {
		// TODO Auto-generated method stub
		
	}
	

}
