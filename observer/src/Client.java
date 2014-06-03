import com.designpattern.observer.IObserver;
import com.designpattern.observer.ObserverA;
import com.designpattern.observer.ObserverB;
import com.designpattern.observer.ObserverC;
import com.designpattern.subject.LogSubject;


public class Client {

	public static void main(String[] args) {
		LogSubject subject = new LogSubject();
		IObserver ob1 = new ObserverA();
		IObserver ob2 = new ObserverB();
		IObserver ob3 = new ObserverC();
		subject.attach(ob1);
		subject.attach(ob2);
		subject.attach(ob3);
		subject.setState("state1");
		subject.setState("state2");
		subject.detach(ob1);
		subject.setState("state3");
	}

}
