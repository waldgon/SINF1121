
public interface PostScriptInterface {
	
	// Applique un des token minScript (add,sub,mul...)
	public void applyToken(String token) throws TokenException;
	
	// pousse sur la pile un token numerique
	public void applyToken(int tokenNum);
	
	public void startInterpreter();
	
	// Ecrit ce que contient la pile dans un fichier
	public void writeData(String FilePathOut);
	
}
