package v71;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class u0 extends v0 implements g0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater x = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(u0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    public n0 E0(long j, Runnable runnable, a71.h hVar) {
        return d0.a.E0(j, runnable, hVar);
    }

    @Override // v71.v
    public final void J0(a71.h hVar, Runnable runnable) {
        U0(runnable);
    }

    @Override // v71.g0
    public final void K(long j, l lVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            q0 q0Var = new q0(this, j2 + nanoTime, lVar);
            Y0(nanoTime, q0Var);
            lVar.w(new i(2, q0Var));
        }
    }

    @Override // v71.v0
    public final long R0() {
        Runnable runnable;
        s0 s0Var;
        a81.t tVar = b0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
        if (!S0()) {
            V0();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof a81.m)) {
                    if (obj != tVar) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                a81.m mVar = (a81.m) obj;
                Object d = mVar.d();
                if (d != a81.m.g) {
                    runnable = (Runnable) d;
                    break;
                }
                a81.m c = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            x61.k kVar = this.v;
            if (((kVar == null || kVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof a81.m) {
                        long j = a81.m.f.get((a81.m) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == tVar) {
                        return Long.MAX_VALUE;
                    }
                }
                t0 t0Var = (t0) y.get(this);
                if (t0Var != null) {
                    synchronized (t0Var) {
                        s0[] s0VarArr = t0Var.a;
                        s0Var = s0VarArr != null ? s0VarArr[0] : null;
                    }
                    if (s0Var != null) {
                        long nanoTime = s0Var.r - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void U0(Runnable runnable) {
        V0();
        if (!W0(runnable)) {
            c0.A.U0(runnable);
            return;
        }
        Thread P0 = P0();
        if (Thread.currentThread() != P0) {
            LockSupport.unpark(P0);
        }
    }

    public final void V0() {
        s0 s0Var;
        t0 t0Var = (t0) y.get(this);
        if (t0Var == null || a81.x.b.get(t0Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (t0Var) {
                try {
                    s0[] s0VarArr = t0Var.a;
                    s0 s0Var2 = s0VarArr != null ? s0VarArr[0] : null;
                    if (s0Var2 != null) {
                        s0Var = ((nanoTime - s0Var2.r) > 0L ? 1 : ((nanoTime - s0Var2.r) == 0L ? 0 : -1)) >= 0 ? W0(s0Var2) : false ? t0Var.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (s0Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (z.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof a81.m)) {
                        if (obj != b0.c) {
                            a81.m mVar = new a81.m(8, true);
                            mVar.a((Runnable) obj);
                            mVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    a81.m mVar2 = (a81.m) obj;
                    int a = mVar2.a(runnable);
                    if (a == 0) {
                        break;
                    }
                    if (a == 1) {
                        a81.m c = mVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((a81.x.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X0() {
        x61.k kVar = this.v;
        if (kVar != null ? kVar.isEmpty() : true) {
            t0 t0Var = (t0) y.get(this);
            if (t0Var != null) {
            }
            Object obj = x.get(this);
            if (obj != null) {
                if (obj instanceof a81.m) {
                    long j = a81.m.f.get((a81.m) obj);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (obj == b0.c) {
                }
            }
            return true;
        }
        return false;
    }

    public final void Y0(long j, s0 s0Var) {
        int c;
        Thread P0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
        if (z.get(this) == 1) {
            c = 1;
        } else {
            t0 t0Var = (t0) atomicReferenceFieldUpdater.get(this);
            if (t0Var == null) {
                t0 t0Var2 = new t0();
                t0Var2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, t0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                k71.k.d(obj);
                t0Var = (t0) obj;
            }
            c = s0Var.c(j, t0Var, this);
        }
        if (c != 0) {
            if (c == 1) {
                T0(j, s0Var);
                return;
            } else {
                if (c != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        t0 t0Var3 = (t0) atomicReferenceFieldUpdater.get(this);
        if (t0Var3 != null) {
            synchronized (t0Var3) {
                s0[] s0VarArr = t0Var3.a;
                r2 = s0VarArr != null ? s0VarArr[0] : null;
            }
        }
        if (r2 != s0Var || Thread.currentThread() == (P0 = P0())) {
            return;
        }
        LockSupport.unpark(P0);
    }

    @Override // v71.v0
    public void shutdown() {
        s0 b;
        t1.a.set(null);
        z.set(this, 1);
        a81.t tVar = b0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof a81.m)) {
                    if (obj != tVar) {
                        a81.m mVar = new a81.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((a81.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (R0() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            t0 t0Var = (t0) y.get(this);
            if (t0Var == null) {
                return;
            }
            synchronized (t0Var) {
                b = a81.x.b.get(t0Var) > 0 ? t0Var.b(0) : null;
            }
            if (b == null) {
                return;
            } else {
                T0(nanoTime, b);
            }
        }
    }
}
