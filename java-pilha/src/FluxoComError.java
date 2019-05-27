public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaException e) {
//			String msg = e.getMessage();
//			System.out.println("ArithmeticException " + msg);
			e.printStackTrace();
		} // catch(NullPointerException e) {
//			e.printStackTrace();
//		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaException {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaException {
		System.out.println("Ini do metodo2");
		
		throw new MinhaException("deu ruim!");
		
//		System.out.println("Fim do metodo2");
	}
}