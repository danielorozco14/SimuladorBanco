/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorbanco;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Banco implements Runnable{
    
    
	private Cliente cliente;
	private Cajero cajero;
        private long initialTime;
	
	public Banco (Cliente cliente, Cajero cajero, long initialTime){
		this.cajero = cajero;
		this.cliente = cliente;
		this.initialTime = initialTime;
	}

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Cliente 1", new int[] {2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Cliente 2", new int[] {1, 3, 5, 1, 1 });
		
		Cajero cajera1 = new Cajero("Cajera 1");
		Cajero cajera2 = new Cajero("Cajera 2");
		
		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		
		Runnable proceso1 = new Banco(cliente1, cajera1, initialTime);
		Runnable proceso2 = new Banco(cliente2, cajera2, initialTime);
		
		new Thread(proceso1).start();
		new Thread(proceso2).start();

	}

	@Override
	public void run() {
		this.cajero.tipoTransaccion(this.cliente, this.initialTime);
	}
}

