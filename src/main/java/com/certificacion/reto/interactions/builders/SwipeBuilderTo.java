package com.certificacion.reto.interactions.builders;

import com.certificacion.reto.interactions.DeviceScreen;
import com.certificacion.reto.interactions.SwipeByCoordinates;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;

public class SwipeBuilderTo {
	
	private int inicialX;
	private int inicialY;
	private Actor actor;
	
	public SwipeBuilderTo(int inicialX, int inicialY, Actor actor) {
		this.inicialX = inicialX;
		this.inicialY = inicialY;
		this.actor = actor;
	}
	
	public SwipeByCoordinates to (int endX, int endY) {
		return Tasks.instrumented(SwipeByCoordinates.class, inicialX,inicialY,endX,endY);
	}
	
	public SwipeByCoordinates toLeft () {
		return Tasks.instrumented(SwipeByCoordinates.class
				, inicialX
				, inicialY
				, 1
				, DeviceScreen.as(actor).getMiddleHeight());
	}
	
	public SwipeByCoordinates toRight () {
		return Tasks.instrumented(SwipeByCoordinates.class
				, inicialX
				, inicialY
				, DeviceScreen.as(actor).getWidth() - 1
				, DeviceScreen.as(actor).getMiddleHeight());
	}
	
	public SwipeByCoordinates toBottom () {
		return Tasks.instrumented(SwipeByCoordinates.class
				, inicialX
				, inicialY
				, DeviceScreen.as(actor).getMiddleWidth()
				, DeviceScreen.as(actor).getHeight() - 1);
	}
	
	public SwipeByCoordinates toTop () {
		return Tasks.instrumented(SwipeByCoordinates.class
				, inicialX
				, inicialY
				, DeviceScreen.as(actor).getMiddleWidth()
				, 1);
	}
}