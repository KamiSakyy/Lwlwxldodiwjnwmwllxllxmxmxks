package e81;

import a81.r;
import a81.t;
import com.google.android.gms.internal.measurement.b4;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v71.a2;
import v71.b0;
import v71.l;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public class h {
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater u = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater w = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater x = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    public final int r;
    public final com.github.rudroid.utilities.ui.emojipicker.d s;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i, int i2) {
        this.r = i;
        if (i <= 0) {
            throw new IllegalArgumentException(no.a.k("Semaphore should have at least 1 permit, but had ", i).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(no.a.k("The number of acquired permits should be in 0..", i).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i - i2;
        this.s = new com.github.rudroid.utilities.ui.emojipicker.d(8, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        r5.h(r3, r4.s);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c71.c cVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = x;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.r;
        } while (andDecrement > i);
        a0 a0Var = a0.a;
        if (andDecrement <= 0) {
            l s = b0.s(b4.T(cVar));
            try {
                if (!b(s)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                break;
                            }
                            if (b(s)) {
                                break;
                            }
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

    public final boolean b(a2 a2Var) {
        Object b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = w.getAndIncrement(this);
        f fVar = f.z;
        long j = andIncrement / j.f;
        loop0: while (true) {
            b = a81.b.b(kVar, j, fVar);
            if (!a81.b.e(b)) {
                r c = a81.b.c(b);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.t >= c.t) {
                        break loop0;
                    }
                    if (!c.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (c.f()) {
                                c.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) a81.b.c(b);
        AtomicReferenceArray atomicReferenceArray = kVar2.v;
        int i = (int) (andIncrement % j.f);
        while (!atomicReferenceArray.compareAndSet(i, null, a2Var)) {
            if (atomicReferenceArray.get(i) != null) {
                t tVar = j.b;
                t tVar2 = j.c;
                while (!atomicReferenceArray.compareAndSet(i, tVar, tVar2)) {
                    if (atomicReferenceArray.get(i) != tVar) {
                        return false;
                    }
                }
                ((v71.k) a2Var).h(a0.a, this.s);
                return true;
            }
        }
        a2Var.a(kVar2, i);
        return true;
    }

    public final void c() {
        int i;
        Object b;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = x;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.r;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = u.getAndIncrement(this);
            long j = andIncrement2 / j.f;
            g gVar = g.z;
            while (true) {
                b = a81.b.b(kVar, j, gVar);
                if (a81.b.e(b)) {
                    break;
                }
                r c = a81.b.c(b);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.t >= c.t) {
                        break;
                    }
                    if (!c.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (c.f()) {
                                c.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            }
            k kVar2 = (k) a81.b.c(b);
            AtomicReferenceArray atomicReferenceArray = kVar2.v;
            kVar2.a();
            z = false;
            if (kVar2.t <= j) {
                int i3 = (int) (andIncrement2 % j.f);
                Object andSet = atomicReferenceArray.getAndSet(i3, j.b);
                if (andSet == null) {
                    int i4 = j.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == j.c) {
                            z = true;
                            break;
                        }
                    }
                    t tVar = j.b;
                    t tVar2 = j.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, tVar, tVar2)) {
                            if (atomicReferenceArray.get(i3) != tVar) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != j.e) {
                    boolean z2 = andSet instanceof v71.k;
                    a0 a0Var = a0.a;
                    if (!z2) {
                        if (!(andSet instanceof d81.f)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        if (((d81.e) ((d81.f) andSet)).g(this, a0Var) != 0) {
                        }
                        z = true;
                        break;
                        break;
                    }
                    v71.k kVar3 = (v71.k) andSet;
                    t p = kVar3.p(a0Var, this.s);
                    if (p != null) {
                        kVar3.y(p);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
