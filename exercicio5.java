public class exercicio5{
	public static void main(String[] args) {
		String s1 = "Estou feliz pelo processo seletivo";
		System.out.println(reversorString(s1));
	}
	
	public static String reversorString(String s){
	    if(s == null){
	        return s;
	    }
	    
	    String stringRevertida = "";
	    
	    for(int i = s.length() - 1;i >= 0; i--){
	        stringRevertida = stringRevertida + s.charAt(i);
	    }
	    return stringRevertida;
	}
}