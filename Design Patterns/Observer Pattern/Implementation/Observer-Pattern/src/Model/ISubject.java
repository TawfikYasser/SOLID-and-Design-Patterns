package Model;

public interface ISubject {
    public void subscribe(IObserver iObserver);
    public void unsubscribe(IObserver iObserver);

}
