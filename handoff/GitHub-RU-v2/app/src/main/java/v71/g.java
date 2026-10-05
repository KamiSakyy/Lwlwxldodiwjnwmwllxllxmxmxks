package v71;

import java.util.concurrent.locks.LockSupport;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g extends a {
    public final Thread u;
    public final v0 v;

    public g(a71.h hVar, Thread thread, v0 v0Var) {
        super(hVar, true);
        this.u = thread;
        this.v = v0Var;
    }

    @Override // v71.j1
    public final void n(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.u;
        if (k71.k.b(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
