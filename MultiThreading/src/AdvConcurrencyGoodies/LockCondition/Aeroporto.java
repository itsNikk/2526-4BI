package AdvConcurrencyGoodies.LockCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Aeroporto {
    //CTRL+D= duplica riga
    private int gateNazionaliTotali;
    private int gateIntenazionaliTotali;

    // synchronized = Lock + Condition
    private final ReentrantLock lock;
    private final Condition attendiNazionali;
    //MAIUSC+F6=RENAME
    private int gateNazionaliLiberi;

    public Aeroporto(int gateIntenazionaliTotali, int gateNazionaliTotali) {
        this.gateIntenazionaliTotali = gateIntenazionaliTotali;

        this.gateNazionaliTotali = gateNazionaliTotali;
        this.lock = new ReentrantLock();
        this.attendiNazionali = lock.newCondition();
    }

    //CTRL + - (meno): chiudi scope (si legge scop)
    public void acquisisciGateNazionle(Volo v) throws InterruptedException {
        lock.lock();

        //CTRL+ALT+T
        try {
            while (gateNazionaliLiberi == 0) attendiNazionali.await();
            gateNazionaliLiberi--;
            System.out.println("[GATN]:" + v.getName() + ": occupato gate. liberi: " + gateNazionaliLiberi);
        } finally {
            lock.unlock();
        }

    }

    public void rilasciaGateNazionle(Volo v) throws InterruptedException {
        lock.lock();
        try {
            gateNazionaliLiberi++;
            //notify() = signal()
            attendiNazionali.signal();
            System.out.println("[GATN]:" + v.getName() + ": liberato gate. liberi: " + gateNazionaliLiberi);
            //TODO (si legge tu-dù): fare sout per mostrer nome del Volo e posti liberi attuali
            //TODO: finally
        } finally {
            lock.unlock();
        }
    }


}
