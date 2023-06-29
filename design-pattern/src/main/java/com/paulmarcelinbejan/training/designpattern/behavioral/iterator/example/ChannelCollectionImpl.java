package com.paulmarcelinbejan.training.designpattern.behavioral.iterator.example;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

	private List<Channel> channelsList;

	public ChannelCollectionImpl() {
		channelsList = new ArrayList<>();
	}

	@Override
	public void addChannel(Channel c) {
		channelsList.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		channelsList.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type, channelsList);
	}

	private static class ChannelIteratorImpl implements ChannelIterator {

		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;

		public ChannelIteratorImpl(ChannelTypeEnum ty, List<Channel> channelsList) {
			type = ty;
			channels = channelsList;
		}

		@Override
		public boolean hasNext() {
			while (position < channels.size()) {
				Channel c = channels.get(position);
				if (c.getTYPE().equals(type) || ChannelTypeEnum.ALL.equals(type)) {
					return true;
				}
				position++;
			}
			return false;
		}

		@Override
		public Channel next() {
			Channel c = channels.get(position);
			position++;
			return c;
		}

	}

}
