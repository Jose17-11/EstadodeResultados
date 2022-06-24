package contabilidad;
import java.util.Scanner;
public class Menu {
	protected Double acCircu, caja, bancos, clientes, docCob, deudores, mercancias;
	protected Double acFijo, terrenos, edificios, maquinaria, mobiliario, equipReparto, equipTransporte, depositosGarant, accioneBonos;
	protected Double acDife, gastInstalacion, gastOrgani, rentaPagAnti, primasSegu, intePagAnti, papeleria, propaganda;

	protected Double paCircu, prove, docPagar, acreedores;
	protected Double paFijo, docPagarlarPlazo, hipotecas, obligaciones;
	protected Double paDife, rentasCobra, interesCobrado;
	Scanner leer=new Scanner(System.in);
	
	public void CuentasA() {
		System.out.println();
		System.out.println("****************************************");
		System.out.println();
		System.out.println("*****Activo Circulante*****");
		System.out.println("Caja");
		caja=leer.nextDouble();
		System.out.println("Bancos");
		bancos=leer.nextDouble();
		System.out.println("Clientes");
		clientes=leer.nextDouble();
		System.out.println("Documentos por cobrar");
		docCob=leer.nextDouble();
		System.out.println("Deudores diversos");
		deudores=leer.nextDouble();
		System.out.println("Mercancías");
		mercancias=leer.nextDouble();
		acCircu=((caja+bancos)+(clientes+docCob))+(deudores+mercancias);
		
		System.out.println("*****Activo fijo*****");
		System.out.println("Terrenos");
		terrenos=leer.nextDouble();
		System.out.println("Edificio");
		edificios=leer.nextDouble();
		System.out.println("Maquinaria");
		maquinaria=leer.nextDouble();
		System.out.println("Mobiliario y equipo");
		mobiliario=leer.nextDouble();
		System.out.println("Equipo de reparto");
		equipReparto=leer.nextDouble();
		System.out.println("Equipo de transporte");
		equipTransporte=leer.nextDouble();
		System.out.println("Depósitos en garantía");
		depositosGarant=leer.nextDouble();
		System.out.println("Acciones, bonos y valores");
		accioneBonos=leer.nextDouble();
		acFijo=((terrenos+edificios)+(maquinaria+mobiliario))+((equipReparto+equipTransporte)+(depositosGarant+accioneBonos));
		
		System.out.println("*****Activo diferido*****");
		System.out.println("Gastos de instalación");
		gastInstalacion=leer.nextDouble();
		System.out.println("Gastos de organización");
		gastOrgani=leer.nextDouble();
		System.out.println("Rentas pagadas por anticipado");
		rentaPagAnti=leer.nextDouble();
		System.out.println("Primas de seguro pagadas por anticipado");
		primasSegu=leer.nextDouble();
		System.out.println("Intereses pagados por anticipado");
		intePagAnti=leer.nextDouble();
		System.out.println("Papelería y útiles de escritorio");
		papeleria=leer.nextDouble();
		System.out.println("Propaganda y publicidad");
		propaganda=leer.nextDouble();
		acDife=((gastInstalacion)+(gastOrgani+rentaPagAnti))+((primasSegu+intePagAnti)+(papeleria+propaganda));
		
		/*
		 * Pasivos
		 */
		System.out.println();
		System.out.println("****************************************");
		System.out.println();
		System.out.println("*****Pasivo Circulante*****");
		System.out.println("Proveedores");
		prove=leer.nextDouble();
		System.out.println("Documentos por pagar");
		docPagar=leer.nextDouble();
		System.out.println("Acreedores diversos");
		acreedores=leer.nextDouble();
		paCircu=(prove+docPagar+acreedores);
		
		System.out.println("*****Pasivo fijo*****");
		System.out.println("Documentos por pagar a largo plazo");
		docPagarlarPlazo=leer.nextDouble();
		System.out.println("Acreedores hipotecarios");
		hipotecas=leer.nextDouble();
		System.out.println("Obligaciones en circulación");
		obligaciones=leer.nextDouble();
		paFijo=(docPagarlarPlazo)+(hipotecas+obligaciones);
		
		System.out.println("*****Pasivo diferido*****");
		System.out.println("Rentas cobradas por anticipado");
		rentasCobra=leer.nextDouble();
		System.out.println("Intéreses cobrados por anticipado");
		interesCobrado=leer.nextDouble();
		paDife=(rentasCobra+interesCobrado);
		
		
		
	}
	//Mando a traer todo mediante el objeto salida
	public static void main(String args[]) {
		System.out.println("*****Contabilidad*****");
		System.out.println("Ingresa las cantidades de las cuentas que se te pide");
		Principal tot=new Principal();
		tot.Total();
		
	}
}
