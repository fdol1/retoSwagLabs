package com.certificacion.reto.interactions;

import com.certificacion.reto.interactions.builders.SwipeBuilderFrom;
import net.serenitybdd.screenplay.Actor;

public class Swipe {
	
	public static SwipeBuilderFrom as (Actor actor) {
		return new SwipeBuilderFrom(actor);
	}
}