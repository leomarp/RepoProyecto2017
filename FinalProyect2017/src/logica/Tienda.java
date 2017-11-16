package logica;

import java.util.ArrayList;

public class Tienda {

	private ArrayList<Cliente>misClientes;
	private ArrayList<Factura>misFacturas;
	private ArrayList<Componente>misComponentes;
	private ArrayList<Combo> misCombos;
	private static Tienda tienda;
	
	
	private Tienda() {
		super();
		this.misClientes = new ArrayList<Cliente>();
		this.misFacturas = new ArrayList<Factura>();
		this.misComponentes = new ArrayList<Componente>();
		this.misCombos=new ArrayList<Combo>();
	
	}


	public ArrayList<Cliente> getMisClientes() {
		return misClientes;
	}


	public void setMisClientes(ArrayList<Cliente> misClientes) {
		this.misClientes = misClientes;
	}


	public ArrayList<Factura> getMisFacturas() {
		return misFacturas;
	}


	public void setMisFacturas(ArrayList<Factura> misFacturas) {
		this.misFacturas = misFacturas;
	}


	public ArrayList<Componente> getMisComponentes() {
		return misComponentes;
	}


	public void setMisComponentes(ArrayList<Componente> misComponentes) {
		this.misComponentes = misComponentes;
	}


	public ArrayList<Combo> getMisCombos() {
		return misCombos;
	}


	public void setMisCombos(ArrayList<Combo> misCombos) {
		this.misCombos = misCombos;
	}
	
	
	//singleton
		public static Tienda getInstance(){
			if(tienda==null){
				tienda = new Tienda();
			}
			return tienda;
		}
	
}
