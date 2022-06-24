package contabilidad;
public class Principal extends Menu{
	public void Total() {
		super.CuentasA();
		//Totales
		Double activo=(acCircu+acFijo)+(acDife);
		Double pasivo=(paCircu+paFijo)+(paDife);
		
		Double CC=(activo-pasivo);

		//Activos
		System.out.println();
		System.out.println("****************************************");
		System.out.println();
		System.out.println("Activo circulante: "+acCircu);
		System.out.println();
		System.out.println("Activo fijo: "+acFijo);
		System.out.println();
		System.out.println("Activo diferido: "+acDife);
		System.out.println();
		//Pasivos
		System.out.println("Pasivo circulante: "+paCircu);
		System.out.println();
		System.out.println("Pasivo fijo: "+paFijo);
		System.out.println();
		System.out.println("Pasivo diferido: "+paDife);
		System.out.println();
		//Pasivos
		//Totales
		System.out.println();
		System.out.println("****************************************");
		System.out.println();
		System.out.println("***** Resultado total *****");
		System.out.println("Total de activos: "+activo);
		System.out.println();
		System.out.println("Total de pasivos: "+pasivo);
		System.out.println();
		//Capital contable
		System.out.println("Tu capital contable es: "+CC);
	}
}
