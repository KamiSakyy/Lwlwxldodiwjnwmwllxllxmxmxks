package a81;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v71.o1;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class r extends c implements o1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater u = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public long t;

    public r(long j, r rVar, int i) {
        super(rVar);
        this.t = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // a81.c
    public final boolean d() {
        return u.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return u.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, a71.h hVar);

    public final void i() {
        if (u.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = u;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
