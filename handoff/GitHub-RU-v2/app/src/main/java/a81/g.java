package a81;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v71.d0;
import v71.g0;
import v71.n0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g extends v71.v implements g0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final /* synthetic */ g0 t;
    public v71.v u;
    public int v;
    public k w;
    public Object x;

    /* JADX WARN: Multi-variable type inference failed */
    public g(v71.v vVar, int i) {
        g0 g0Var = vVar instanceof g0 ? (g0) vVar : null;
        this.t = g0Var == null ? d0.a : g0Var;
        this.u = vVar;
        this.v = i;
        this.w = new k();
        this.x = new Object();
    }

    @Override // v71.g0
    public final n0 E0(long j, Runnable runnable, a71.h hVar) {
        return this.t.E0(j, runnable, hVar);
    }

    @Override // v71.v
    public final void J0(a71.h hVar, Runnable runnable) {
        Runnable N0;
        this.w.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = y;
        if (atomicIntegerFieldUpdater.get(this) >= this.v || !O0() || (N0 = N0()) == null) {
            return;
        }
        try {
            b.i(this.u, this, new com.google.common.util.concurrent.b(this, N0, false, 1));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // v71.g0
    public final void K(long j, v71.l lVar) {
        this.t.K(j, lVar);
    }

    @Override // v71.v
    public final void K0(a71.h hVar, Runnable runnable) {
        Runnable N0;
        this.w.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = y;
        if (atomicIntegerFieldUpdater.get(this) >= this.v || !O0() || (N0 = N0()) == null) {
            return;
        }
        try {
            this.u.K0(this, new com.google.common.util.concurrent.b(this, N0, false, 1));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // v71.v
    public final v71.v M0(int i) {
        b.a(i);
        return i >= this.v ? this : super.M0(i);
    }

    public final Runnable N0() {
        while (true) {
            Runnable runnable = (Runnable) this.w.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.x) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = y;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.w.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean O0() {
        synchronized (this.x) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = y;
            if (atomicIntegerFieldUpdater.get(this) >= this.v) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // v71.v
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.u);
        sb.append(".limitedParallelism(");
        return x.i.j(sb, this.v, ')');
    }
}
