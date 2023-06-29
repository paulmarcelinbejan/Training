package com.paulmarcelinbejan.training.designpattern.behavioral.mediator;

import com.paulmarcelinbejan.training.designpattern.behavioral.mediator.example.ChatMediator;
import com.paulmarcelinbejan.training.designpattern.behavioral.mediator.example.ChatMediatorImpl;
import com.paulmarcelinbejan.training.designpattern.behavioral.mediator.example.User;
import com.paulmarcelinbejan.training.designpattern.behavioral.mediator.example.UserImpl;

// Mediator Design Pattern
//
// Il Mediator pattern va usato:
//  - quando non potete riutilizzare un componente in un altro programma perché dipende troppo da altri componenti.
//  - quando è difficile cambiare alcune classi, perché sono strettamente accoppiate a un gruppo di altre classi.
//
// Il Mediator consente di ridurre le dipendenze caotiche tra gli oggetti.
// Il pattern limita le comunicazioni dirette tra gli oggetti e li costringe a collaborare solo attraverso un oggetto mediatore.
public class MediatorDesignPattern {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Mike");
		User user2 = new UserImpl(mediator, "Gisele");
		User user3 = new UserImpl(mediator, "Brian");
		User user4 = new UserImpl(mediator, "Melissa");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Hi All");
	}

}
