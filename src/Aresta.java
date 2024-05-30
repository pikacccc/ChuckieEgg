public class Aresta{
	
	public int[] cond;
	public int action;
	
	public Aresta(int act, int c, int c_esq, int c_dir, int up, int pos){
		int[] tmp = {c,c_esq,c_dir,up,pos};
		
		action = act;
		
		cond = tmp;
	}
}
