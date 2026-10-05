package e81;

import a81.t;
import com.google.android.gms.internal.measurement.b4;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v71.b0;
import v71.l;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c extends h implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : d.a;
    }

    public final boolean d() {
        return Math.max(h.x.get(this), 0) == 0;
    }

    public final boolean e() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.x;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.r;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    y.set(this, null);
                    return true;
                }
            }
        }
    }

    @Override // e81.a
    public final void f(Object obj) {
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = d.a;
            if (obj2 != tVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    c();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r2 = r0.s;
        e81.c.y.set(r2, null);
        r3 = r0.r;
        r3.E(r1, r3.t, new com.github.rudroid.utilities.ui.emojipicker.d(18, new com.github.rudroid.support.u(r2, r0)));
     */
    @Override // e81.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(a71.c cVar) {
        boolean e = e();
        a0 a0Var = a0.a;
        if (!e) {
            l s = b0.s(b4.T(cVar));
            try {
                b bVar = new b(this, s);
                while (true) {
                    int andDecrement = h.x.getAndDecrement(this);
                    if (andDecrement <= this.r) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (b(bVar)) {
                            break;
                        }
                    }
                }
                Object s2 = s.s();
                b71.a aVar = b71.a.r;
                if (s2 != aVar) {
                    s2 = a0Var;
                }
                if (s2 == aVar) {
                    return s2;
                }
            } catch (Throwable th) {
                s.D();
                throw th;
            }
        }
        return a0Var;
    }

    public final String toString() {
        return "Mutex@" + b0.q(this) + "[isLocked=" + d() + ",owner=" + y.get(this) + ']';
    }
}
