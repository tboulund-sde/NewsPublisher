package dk.easv.observable;

public interface ISubscriber {
    void update(Subscribable sender, Object newspaper);
}
