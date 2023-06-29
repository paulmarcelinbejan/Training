package com.paulmarcelinbejan.training.designpattern.creational.factory;

import java.util.Calendar;

// Il Factory Pattern va usato:
//  - quando non si sa a priori il tipo di oggetto con cui il nostro codice lavorerà.
//  - quando stiamo creando una libreria e vogliamo fornire all'utente un modo per estendere i comportamenti interni.
//
// Con il Factory Pattern, si può ottenere l'istanza di un oggetto rispetto ad un altro in base a una condizione.
// (Gli oggetti devono estendere tutti la stessa classe).
//
// Ad esempio java.util.Calendar è la classe astratta di tre classi concrete:
//  - GregorianCalendar
//  - JapaneseImperialCalendar
//  - BuddhistCalendar
//
// all'interno di Calendar c'è un metodo che restituisce l'istanza di un calendario in base ad alcuni parametri come TimeZone e Locale
public class FactoryDesignPattern {

	public void tryFactory() {

		Calendar.getInstance();

	}

}
