package com.paulmarcelinbejan.training.designpattern.behavioral.iterator;

import com.paulmarcelinbejan.training.designpattern.behavioral.iterator.example.Channel;
import com.paulmarcelinbejan.training.designpattern.behavioral.iterator.example.ChannelCollection;
import com.paulmarcelinbejan.training.designpattern.behavioral.iterator.example.ChannelCollectionImpl;
import com.paulmarcelinbejan.training.designpattern.behavioral.iterator.example.ChannelIterator;
import com.paulmarcelinbejan.training.designpattern.behavioral.iterator.example.ChannelTypeEnum;

// Iterator Design Pattern
//
// L'Iterator pattern va usato:
//  - quando la collection ha una struttura di dati complessa, e si vuole nascondere la sua complessità ai client (per comodità o per motivi di sicurezza).
//  - quando c'è la necessità di attraversare diverse strutture di dati o quando i tipi di queste strutture sono sconosciuti a priori.
//
// L'Iterator consente di attraversare gli elementi di un insieme senza esporre la sua rappresentazione sottostante (list, stack, tree, etc.).
public class IteratorDesignPattern {

	public static void main(String[] args) {
		ChannelCollection channels = populateChannels();
		ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);

		while (baseIterator.hasNext()) {
			Channel c = baseIterator.next();
			System.out.println(c.toString());
		}

		System.out.println("******");

		// Channel Type Iterator
		ChannelIterator englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
		while (englishIterator.hasNext()) {
			Channel c = englishIterator.next();
			System.out.println(c.toString());
		}
	}

	private static ChannelCollection populateChannels() {
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
		return channels;
	}

}
