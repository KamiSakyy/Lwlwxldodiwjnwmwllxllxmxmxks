package v71;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c1 extends f1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(c1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final f0.c v;

    public c1(f0.c cVar) {
        this.v = cVar;
    }

    @Override // v71.f1
    public final boolean k() {
        return true;
    }

    @Override // v71.f1
    public final void l(Throwable th) {
        if (w.compareAndSet(this, 0, 1)) {
            this.v.k(th);
        }
    }
}
