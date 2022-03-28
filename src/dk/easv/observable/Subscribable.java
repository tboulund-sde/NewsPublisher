package dk.easv.observable;

import java.util.HashSet;

public abstract class Subscribable {
    private HashSet<ISubscriber> subscribers = new HashSet<>();

    public void subscribe(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    protected void notifySubscribers(Object update) {
        for(ISubscriber subscriber : subscribers) {
            subscriber.update(this, update);
        }
    }
}
