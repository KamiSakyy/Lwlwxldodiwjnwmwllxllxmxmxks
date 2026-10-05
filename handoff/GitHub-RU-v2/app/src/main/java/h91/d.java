package h91;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /home/user/work/p/classes5.dex */
public class d extends m0 {
    public static final b21.v h;
    public static d i;
    public static final ReentrantLock j;
    public static final Condition k;
    public static final long l;
    public static final long m;
    public int e;
    public int f = -1;
    public long g;

    static {
        b21.v vVar = new b21.v(3, (byte) 0);
        vVar.t = new d[8];
        h = vVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        k71.k.f(newCondition, "newCondition(...)");
        k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        l = millis;
        m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = j;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = 1;
                c21.j.a(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            this.e = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            h.u(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException k(IOException iOException) {
        throw null;
    }

    public void l() {
    }
}
