/*
 * Class Author: Sadiba Nusrat Nur
 */

package util;

public interface ISubject {	
	void registerObserver(IObserver o);
	void removeObserver(IObserver o);
	void notifyObservers();
}
