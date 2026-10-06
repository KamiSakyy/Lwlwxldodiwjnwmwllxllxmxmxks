package c81;

import a0.s0;
import a81.p;
import a81.t;
import com.github.rudroid.copilot.h1;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import v71.b0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public int r;
    public int s;
    public long t;
    public String u;
    public f v;
    public f w;
    public p x;
    public static final /* synthetic */ AtomicLongFieldUpdater y = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater z = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final t B = new t(0, "NOT_IN_STACK", false);

    public c(int i, int i2, long j, String str) {
        this.r = i;
        this.s = i2;
        this.t = j;
        this.u = str;
        if (i < 1) {
            throw new IllegalArgumentException(s0.i("Core pool size ", i, " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(no.a.j(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(s0.i("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.v = new f();
        this.w = new f();
        this.x = new p((i + 1) * 2);
        this.controlState$volatile = i << 42;
    }

    public static /* synthetic */ void r(c cVar, Runnable runnable, int i) {
        cVar.m(runnable, false, (i & 4) == 0);
    }

    public final boolean A(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.r;
        if (i < i2) {
            int f = f();
            if (f == 1 && i2 > 1) {
                f();
            }
            if (f > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean E() {
        t tVar;
        int i;
        while (true) {
            long j = y.get(this);
            a aVar = (a) this.x.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = aVar.c();
                while (true) {
                    tVar = B;
                    if (c == tVar) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    a aVar2 = (a) c;
                    i = aVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c = aVar2.c();
                }
                if (i >= 0) {
                    if (y.compareAndSet(this, j, i | j2)) {
                        aVar.g(tVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.z.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        i iVar;
        if (A.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !k71.k.b(aVar.y, this)) {
                aVar = null;
            }
            synchronized (this.x) {
                i = (int) (z.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.x.b(i2);
                    k71.k.d(b);
                    a aVar2 = (a) b;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.r;
                        f fVar = this.w;
                        mVar.getClass();
                        i iVar2 = (i) m.b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i b2 = mVar.b();
                            if (b2 == null) {
                                break;
                            } else {
                                fVar.a(b2);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.w.b();
            this.v.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.v.d();
                if (iVar == null && (iVar = (i) this.w.d()) == null) {
                    break;
                }
                try {
                    iVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.v);
            }
            y.set(this, 0L);
            z.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        r(this, runnable, 6);
    }

    public final int f() {
        synchronized (this.x) {
            try {
                if (A.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = z;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.r) {
                    return 0;
                }
                if (i >= this.s) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.x.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i3);
                this.x.c(i3, aVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                aVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(Runnable runnable, boolean z2, boolean z3) {
        i jVar;
        b bVar;
        k.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.r = nanoTime;
            jVar.s = z2;
        } else {
            jVar = new j(runnable, nanoTime, z2);
        }
        boolean z4 = jVar.s;
        AtomicLongFieldUpdater atomicLongFieldUpdater = z;
        long addAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !k71.k.b(aVar.y, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.t) != b.v && (jVar.s || bVar != b.s)) {
            aVar.x = true;
            m mVar = aVar.r;
            if (z3) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.s ? this.w.a(jVar) : this.v.a(jVar))) {
                throw new RejectedExecutionException(h1.p(new StringBuilder(), this.u, " was terminated"));
            }
        }
        if (z4) {
            if (E() || A(addAndGet)) {
                return;
            }
            E();
            return;
        }
        if (E() || A(atomicLongFieldUpdater.get(this))) {
            return;
        }
        E();
    }

    public final void t(a aVar, int i, int i2) {
        while (true) {
            long j = y.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = aVar.c();
                    while (true) {
                        if (c == B) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        a aVar2 = (a) c;
                        int b = aVar2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = aVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (y.compareAndSet(this, j, i3 | j2)) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.x;
        int a = pVar.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            a aVar = (a) pVar.b(i6);
            if (aVar != null) {
                m mVar = aVar.r;
                mVar.getClass();
                int i7 = m.b.get(mVar) != null ? (m.c.get(mVar) - m.d.get(mVar)) + 1 : m.c.get(mVar) - m.d.get(mVar);
                int ordinal = aVar.t.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5++;
                }
            }
        }
        long j = z.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.u);
        sb4.append('@');
        sb4.append(b0.q(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.r;
        sb4.append(i8);
        sb4.append(", max = ");
        s0.z(sb4, this.s, "}, Worker States {CPU = ", i, ", blocking = ");
        s0.z(sb4, i2, ", parked = ", i3, ", dormant = ");
        s0.z(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.v.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.w.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
