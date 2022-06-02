package com.certificacion.reto.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class Tap {
	
	public static Performable on(Target target) {
		return Tasks.instrumented(TapByTarget.class, target);
	}
	
	public static TapByCoordinates on(int x, int y) {
		return Tasks.instrumented(TapByCoordinates.class, x, y);
	}
}