package com.paulmarcelinbejan.training.designpattern.behavioral.state;

import com.paulmarcelinbejan.training.designpattern.behavioral.state.example.State;
import com.paulmarcelinbejan.training.designpattern.behavioral.state.example.TVContext;
import com.paulmarcelinbejan.training.designpattern.behavioral.state.example.TVStartState;
import com.paulmarcelinbejan.training.designpattern.behavioral.state.example.TVStopState;

// State Design Pattern
//
// Lo State pattern va usato:
//  - quando si ha un oggetto che si comporta in modo diverso a seconda del suo stato corrente, il numero di stati è enorme e il codice specifico dello stato cambia frequentemente.
//  - quando si ha una classe con condizionali che alterano il comportamento della classe in base ai valori correnti dei campi della classe stessa.
//
// Lo State consente a un oggetto di modificare il proprio comportamento quando il suo stato interno cambia.
public class StateDesignPattern {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();

		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();
	}

}
