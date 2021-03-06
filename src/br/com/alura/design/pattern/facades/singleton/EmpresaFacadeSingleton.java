package br.com.alura.design.pattern.facades.singleton;

public class EmpresaFacadeSingleton {
	private static EmpresaFacade instancia;
	
	public EmpresaFacade getInstancia(){
		if(instancia == null){
			instancia = new EmpresaFacade();
		}
		return instancia;
	}
}
