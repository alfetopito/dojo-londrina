
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 //O ano for divis�vel por 4, 
	//mas n�o divis�vel por 100, exceto se ele for tamb�m divis�vel por 400.
	public static boolean eh_bissexto(int ano){
		boolean divisivel_por_4 = ano % 4 == 0;
		boolean nao_centenario = ano % 100 !=0;
		boolean divisivel_por_quatrocentos = ano % 400 == 0;
		return divisivel_por_4 && (nao_centenario || divisivel_por_quatrocentos);
	}
	
	
	
	
}
