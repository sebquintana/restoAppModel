package com.model.pedido;

import java.util.HashMap;
import java.util.Map;

import com.model.carta.ItemCarta;

public class Pedido {

	private Map<ItemCarta, Integer> pedido = new HashMap<ItemCarta, Integer>();

	public void agregarItem(ItemCarta item, int cantidad) {
		pedido.put(item, cantidad);
	}

	public void borrarItem(ItemCarta item) {
		pedido.remove(item);
	}

	public Map<ItemCarta, Integer> getPedido(){
		return this.pedido;
	}
}
