package c81;

import a81.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k71.w;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    public final m r;
    public final w s;
    public b t;
    public long u;
    public long v;
    public int w;
    private volatile /* synthetic */ int workerCtl$volatile;
    public boolean x;
    public final /* synthetic */ c y;

    public a(c cVar, int i) {
        this.y = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.r = new m();
        this.s = new w();
        this.t = b.u;
        this.nextParkedWorker = c.B;
        int nanoTime = (int) System.nanoTime();
        this.w = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final i a(boolean z2) {
        i e;
        i e2;
        long j;
        b bVar = this.t;
        b bVar2 = b.r;
        c cVar = this.y;
        i iVar = null;
        m mVar = this.r;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.z;
            do {
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.s) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i = m.d.get(mVar);
                    int i2 = m.c.get(mVar);
                    while (true) {
                        if (i == i2 || m.e.get(mVar) == 0) {
                            break;
                        }
                        i2--;
                        i c = mVar.c(i2, true);
                        if (c != null) {
                            iVar = c;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.w.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.z.compareAndSet(cVar, j, j - 4398046511104L));
            this.t = b.r;
        }
        if (z2) {
            boolean z3 = d(cVar.r * 2) == 0;
            if (z3 && (e2 = e()) != null) {
                return e2;
            }
            mVar.getClass();
            i iVar4 = (i) m.b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z3 && (e = e()) != null) {
                return e;
            }
        } else {
            i e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.w;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.w = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final i e() {
        int d = d(2);
        c cVar = this.y;
        if (d == 0) {
            i iVar = (i) cVar.v.d();
            return iVar != null ? iVar : (i) cVar.w.d();
        }
        i iVar2 = (i) cVar.w.d();
        return iVar2 != null ? iVar2 : (i) cVar.v.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.y.u);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.t;
        boolean z2 = bVar2 == b.r;
        if (z2) {
            c.z.addAndGet(this.y, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.t = bVar;
        }
        return z2;
    }

    public final i i(int i) {
        long j;
        i iVar;
        long j2;
        long j3;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.z;
        c cVar = this.y;
        int i2 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i2 < 2) {
            return null;
        }
        int d = d(i2);
        int i3 = 0;
        long j4 = Long.MAX_VALUE;
        while (i3 < i2) {
            d++;
            if (d > i2) {
                d = 1;
            }
            a aVar = (a) cVar.x.b(d);
            if (aVar != null && aVar != this) {
                m mVar = aVar.r;
                if (i == 3) {
                    iVar = mVar.b();
                    j = 0;
                } else {
                    mVar.getClass();
                    int i4 = m.d.get(mVar);
                    int i5 = m.c.get(mVar);
                    boolean z2 = i == 1;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z2 || m.e.get(mVar) != 0) {
                            int i6 = i4 + 1;
                            iVar = mVar.c(i4, z2);
                            if (iVar != null) {
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                w wVar = this.s;
                if (iVar != null) {
                    wVar.r = iVar;
                    iVar2 = iVar3;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((iVar4.s ? 1 : 2) & i) == 0) {
                            break;
                        }
                        k.f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.r;
                        long j5 = k.b;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                wVar.r = iVar4;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j3 = -2;
                    iVar2 = iVar3;
                }
                if (j3 == j2) {
                    i iVar5 = (i) wVar.r;
                    wVar.r = iVar2;
                    return iVar5;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i3++;
            iVar3 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.v = j4;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z2 = false;
            while (c.A.get(this.y) != 1) {
                b bVar = this.t;
                b bVar2 = b.v;
                if (bVar == bVar2) {
                    break loop0;
                }
                i a = a(this.x);
                if (a != null) {
                    this.v = 0L;
                    c cVar = this.y;
                    this.u = 0L;
                    if (this.t == b.t) {
                        this.t = b.s;
                    }
                    if (a.s) {
                        if (h(b.s) && !cVar.E() && !cVar.A(c.z.get(cVar))) {
                            cVar.E();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        c.z.addAndGet(cVar, -2097152L);
                        if (this.t != bVar2) {
                            this.t = b.u;
                        }
                    } else {
                        try {
                            a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.x = false;
                    if (this.v == 0) {
                        Object obj = this.nextParkedWorker;
                        t tVar = c.B;
                        if (obj != tVar) {
                            z.set(this, -1);
                            while (this.nextParkedWorker != c.B) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    c cVar2 = this.y;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.A;
                                    if (atomicIntegerFieldUpdater2.get(cVar2) == 1) {
                                        break;
                                    }
                                    b bVar3 = this.t;
                                    b bVar4 = b.v;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.t);
                                    Thread.interrupted();
                                    if (this.u == 0) {
                                        j = 2097151;
                                        this.u = System.nanoTime() + this.y.t;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.y.t);
                                    if (System.nanoTime() - this.u >= 0) {
                                        this.u = 0L;
                                        c cVar3 = this.y;
                                        synchronized (cVar3.x) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(cVar3) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.z;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar3) & j)) > cVar3.r) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            f(0);
                                                            cVar3.t(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j);
                                                            if (andDecrement != i) {
                                                                Object b = cVar3.x.b(andDecrement);
                                                                k71.k.d(b);
                                                                a aVar = (a) b;
                                                                cVar3.x.c(i, aVar);
                                                                aVar.f(i);
                                                                cVar3.t(aVar, andDecrement, i);
                                                            }
                                                            cVar3.x.c(andDecrement, null);
                                                            this.t = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.y;
                            if (this.nextParkedWorker == tVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.y;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(cVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.x.b((int) (j2 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.y.compareAndSet(cVar5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else if (z2) {
                        h(b.t);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.v);
                        this.v = 0L;
                    } else {
                        z2 = true;
                    }
                }
            }
            break loop0;
        }
        h(b.v);
    }
}
