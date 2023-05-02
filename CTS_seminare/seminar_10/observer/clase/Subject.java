package observer.clase;

public interface Subject {
void adaugaObserver(Observer observer);
void stergeObserver(Observer observer);
void notificaAbonati(String mesaj);
}
