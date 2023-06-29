package com.paulmarcelinbejan.training.designpattern.behavioral.iterator.example;

public interface ChannelCollection {

	void addChannel(Channel c);

	void removeChannel(Channel c);

	ChannelIterator iterator(ChannelTypeEnum type);

}
