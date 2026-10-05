package v71;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u1 extends f1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater x = AtomicIntegerFieldUpdater.newUpdater(u1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread v = Thread.currentThread();
    public n0 w;

    public static void n(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // v71.f1
    public final boolean k() {
        return true;
    }

    @Override // v71.f1
    public final void l(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = x;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                n(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.v.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void m() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = x;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                n0 n0Var = this.w;
                if (n0Var != null) {
                    n0Var.a();
                    return;
                }
                return;
            }
        }
    }
}
