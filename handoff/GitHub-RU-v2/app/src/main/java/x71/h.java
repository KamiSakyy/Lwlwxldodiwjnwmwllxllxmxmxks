package x71;

import a0.s0;
import com.google.android.gms.internal.measurement.b4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k71.z;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import sy.y;
import v71.a2;
import v71.b0;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public class hShadow implements l {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public int r;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater s = AtomicLongFieldUpdater.newUpdater(hShadow.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater t = AtomicLongFieldUpdater.newUpdater(hShadow.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater u = AtomicLongFieldUpdater.newUpdater(hShadow.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater v = AtomicLongFieldUpdater.newUpdater(hShadow.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(hShadow.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater x = AtomicReferenceFieldUpdater.newUpdater(hShadow.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(hShadow.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater z = AtomicReferenceFieldUpdater.newUpdater(hShadow.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(hShadow.class, Object.class, "closeHandler$volatile");

    public h(int i) {
        this.r = i;
        if (i < 0) {
            throw new IllegalArgumentException(s0.i("Invalid channel capacity: ", i, ", should be >=0").toString());
        }
        p pVar = jShadow.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = u.get(this);
        p pVar2 = new p(0L, null, this, 3);
        this.sendSegment$volatile = pVar2;
        this.receiveSegment$volatile = pVar2;
        if (B()) {
            pVar2 = jShadow.a;
            k71.k.e(pVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = pVar2;
        this._closeCause$volatile = j.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object E(hShadow hVar, c71.c cVar) {
        f fVar;
        int i;
        p pVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i2 = fVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.w = i2 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.u;
                b71.a aVar = b71.a.r;
                i = fVar2.w;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return ((o) obj).a;
                }
                y.j(obj);
                p pVar2 = (p) x.get(hVar);
                while (!hVar.y()) {
                    long andIncrement = t.getAndIncrement(hVar);
                    long j = jShadow.b;
                    long j2 = andIncrement / j;
                    int i3 = (int) (andIncrement % j);
                    if (pVar2.t != j2) {
                        p r = hVar.r(j2, pVar2);
                        if (r == null) {
                            continue;
                        } else {
                            pVar = r;
                        }
                    } else {
                        pVar = pVar2;
                    }
                    hShadow hVar2 = hVar;
                    Object J = hVar2.J(pVar, i3, andIncrement, null);
                    if (J == j.m) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (J != j.o) {
                        if (J != j.n) {
                            pVar.a();
                            return J;
                        }
                        fVar2.w = 1;
                        Object F = hVar2.F(pVar, i3, andIncrement, fVar2);
                        return F == aVar ? aVar : F;
                    }
                    if (andIncrement < hVar2.v()) {
                        pVar.a();
                    }
                    hVar = hVar2;
                    pVar2 = pVar;
                }
                return new m(hVar.s());
            }
        }
        fVar = new f(hVar, cVar);
        f fVar22 = fVar;
        Object obj2 = fVar22.u;
        b71.a aVar2 = b71.a.r;
        i = fVar22.w;
        if (i == 0) {
        }
    }

    public static final p f(hShadow hVar, long j, p pVar) {
        Object b;
        hShadow hVar2;
        p pVar2 = jShadow.a;
        i iVar = i.z;
        loop0: while (true) {
            b = a81.bShadow.b(pVar, j, iVar);
            if (!a81.bShadow.e(b)) {
                a81.r c = a81.bShadow.c(b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
                    a81.r rVar = (a81.r) atomicReferenceFieldUpdater.get(hVar);
                    if (rVar.t >= c.t) {
                        break loop0;
                    }
                    if (!c.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, rVar, c)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != rVar) {
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
        boolean e = a81.bShadow.e(b);
        AtomicLongFieldUpdater atomicLongFieldUpdater = t;
        if (e) {
            hVar.z();
            if (pVar.t * j.b < atomicLongFieldUpdater.get(hVar)) {
                pVar.a();
                return null;
            }
        } else {
            p pVar3 = (p) a81.bShadow.c(b);
            long j2 = pVar3.t;
            if (j2 <= j) {
                return pVar3;
            }
            long j3 = j.b * j2;
            while (true) {
                long j4 = s.get(hVar);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    hVar2 = hVar;
                    break;
                }
                hVar2 = hVar;
                if (s.compareAndSet(hVar2, j4, (((int) (j4 >> 60)) << 60) + j5)) {
                    break;
                }
                hVar = hVar2;
            }
            if (j2 * j.b < atomicLongFieldUpdater.get(hVar2)) {
                pVar3.a();
            }
        }
        return null;
    }

    public static final void g(hShadow hVar, Object obj, v71.l lVar) {
        lVar.i(y.d(hVar.u()));
    }

    public static final int h(hShadow hVar, p pVar, int i, Object obj, long j, Object obj2, boolean z2) {
        pVar.n(i, obj);
        if (z2) {
            return hVar.K(pVar, i, obj, j, obj2, z2);
        }
        Object l = pVar.l(i);
        if (l == null) {
            if (hVar.i(jShadow)) {
                if (pVar.k(i, null, j.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pVar.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (l instanceof a2) {
            pVar.n(i, null);
            if (hVar.H(l, obj)) {
                pVar.o(i, j.i);
                return 0;
            }
            a81.t tVar = j.k;
            if (pVar.w.getAndSet((i * 2) + 1, tVar) == tVar) {
                return 5;
            }
            pVar.m(i, true);
            return 5;
        }
        return hVar.K(pVar, i, obj, j, obj2, z2);
    }

    public static void w(hShadow hVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = v;
        if ((atomicLongFieldUpdater.addAndGet(hVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(hVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public boolean A() {
        return false;
    }

    public final boolean B() {
        long j = u.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(long j, p pVar) {
        p pVar2;
        p pVar3;
        while (pVar.t < j && (pVar3 = (p) pVar.c()) != null) {
            pVar = pVar3;
        }
        while (true) {
            if (!pVar.d() || (pVar2 = (p) pVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
                    a81.r rVar = (a81.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.t >= pVar.t) {
                        return;
                    }
                    if (!pVar.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (pVar.f()) {
                                pVar.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                        return;
                    }
                    return;
                }
            }
            pVar = pVar2;
        }
    }

    public final Object D(a71.c cVar, Object obj) {
        v71.l lVar = new v71.l(1, b4.T(cVar));
        lVar.t();
        lVar.i(y.d(u()));
        Object s2 = lVar.s();
        return s2 == b71.a.r ? s2 : a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(p pVar, int i, long j, c71.c cVar) {
        g gVar;
        int i2;
        p pVar2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i3 = gVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.w = i3 - Integer.MIN_VALUE;
                Object obj = gVar.u;
                b71.a aVar = b71.a.r;
                i2 = gVar.w;
                if (i2 != 0) {
                    y.j(obj);
                    gVar.w = 1;
                    v71.l s2 = b0.s(b4.T(gVar));
                    try {
                        u uVar = new u(s2);
                        Object J = J(pVar, i, j, uVar);
                        if (J == j.m) {
                            uVar.a(pVar, i);
                        } else if (J == j.o) {
                            if (j < v()) {
                                pVar.a();
                            }
                            p pVar3 = (p) x.get(this);
                            while (true) {
                                if (y()) {
                                    s2.i(new o(new m(s())));
                                    break;
                                }
                                long andIncrement = t.getAndIncrement(this);
                                long j2 = jShadow.b;
                                long j3 = andIncrement / j2;
                                int i4 = (int) (andIncrement % j2);
                                if (pVar3.t != j3) {
                                    p r = r(j3, pVar3);
                                    if (r != null) {
                                        pVar2 = r;
                                    }
                                } else {
                                    pVar2 = pVar3;
                                }
                                Object J2 = J(pVar2, i4, andIncrement, uVar);
                                p pVar4 = pVar2;
                                if (J2 == j.m) {
                                    uVar.a(pVar4, i4);
                                    break;
                                }
                                if (J2 == j.o) {
                                    if (andIncrement < v()) {
                                        pVar4.a();
                                    }
                                    pVar3 = pVar4;
                                } else {
                                    if (J2 == j.n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    pVar4.a();
                                    s2.h(new o(J2), null);
                                }
                            }
                        } else {
                            pVar.a();
                            s2.h(new o(J), null);
                        }
                        obj = s2.s();
                        b71.a aVar2 = b71.a.r;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        s2.D();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return ((o) obj).a;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.u;
        b71.a aVar3 = b71.a.r;
        i2 = gVar.w;
        if (i2 != 0) {
        }
        return ((o) obj2).a;
    }

    public final void G(a2 a2Var, boolean z2) {
        if (a2Var instanceof v71.k) {
            ((a71.c) a2Var).i(y.d(z2 ? t() : u()));
            return;
        }
        if (a2Var instanceof u) {
            ((u) a2Var).r.i(new o(new m(s())));
            return;
        }
        if (!(a2Var instanceof c)) {
            if (a2Var instanceof d81.f) {
                ((d81.e) ((d81.f) a2Var)).g(this, j.l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + a2Var).toString());
            }
        }
        c cVar = (c) a2Var;
        v71.l lVar = cVar.s;
        k71.k.d(lVar);
        cVar.s = null;
        cVar.r = j.l;
        Throwable s2 = cVar.t.s();
        if (s2 == null) {
            lVar.i(Boolean.FALSE);
        } else {
            lVar.i(y.d(s2));
        }
    }

    public final boolean H(Object obj, Object obj2) {
        if (obj instanceof d81.f) {
            return ((d81.e) ((d81.f) obj)).g(this, obj2) == 0;
        }
        if (obj instanceof u) {
            return j.a(((u) obj).r, new o(obj2), null);
        }
        if (!(obj instanceof c)) {
            if (obj instanceof v71.k) {
                return j.a((v71.k) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        c cVar = (c) obj;
        v71.l lVar = cVar.s;
        k71.k.d(lVar);
        cVar.s = null;
        cVar.r = obj2;
        Boolean bool = Boolean.TRUE;
        cVar.t.getClass();
        return j.a(lVar, bool, null);
    }

    public final boolean I(Object obj, p pVar, int i) {
        d81.i iVar;
        boolean z2 = obj instanceof v71.k;
        a0 a0Var = a0.a;
        if (z2) {
            return j.a((v71.k) obj, a0Var, null);
        }
        if (!(obj instanceof d81.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int g = ((d81.e) obj).g(this, a0Var);
        if (g == 0) {
            iVar = d81.i.r;
        } else if (g == 1) {
            iVar = d81.i.s;
        } else if (g == 2) {
            iVar = d81.i.t;
        } else {
            if (g != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + g).toString());
            }
            iVar = d81.i.u;
        }
        if (iVar == d81.i.s) {
            pVar.n(i, null);
        }
        return iVar == d81.i.r;
    }

    public final Object J(p pVar, int i, long j, Object obj) {
        Object l = pVar.l(i);
        AtomicReferenceArray atomicReferenceArray = pVar.w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = s;
        if (l == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return j.n;
                }
                if (pVar.k(i, l, obj)) {
                    q();
                    return j.m;
                }
            }
        } else if (l == j.d && pVar.k(i, l, j.i)) {
            q();
            Object obj2 = atomicReferenceArray.get(i * 2);
            pVar.n(i, null);
            return obj2;
        }
        while (true) {
            Object l2 = pVar.l(i);
            if (l2 == null || l2 == j.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (pVar.k(i, l2, j.h)) {
                        q();
                        return j.o;
                    }
                } else {
                    if (obj == null) {
                        return j.n;
                    }
                    if (pVar.k(i, l2, obj)) {
                        q();
                        return j.m;
                    }
                }
            } else {
                if (l2 != j.d) {
                    a81.t tVar = j.j;
                    if (l2 != tVar && l2 != j.h) {
                        if (l2 == j.l) {
                            q();
                            return j.o;
                        }
                        if (l2 != j.g && pVar.k(i, l2, j.f)) {
                            boolean z2 = l2 instanceof x;
                            if (z2) {
                                l2 = ((x) l2).a;
                            }
                            if (I(l2, pVar, i)) {
                                pVar.o(i, j.i);
                                q();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                pVar.n(i, null);
                                return obj3;
                            }
                            pVar.o(i, tVar);
                            pVar.i();
                            if (z2) {
                                q();
                            }
                            return j.o;
                        }
                    }
                    return j.o;
                }
                if (pVar.k(i, l2, j.i)) {
                    q();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    pVar.n(i, null);
                    return obj4;
                }
            }
        }
    }

    public final int K(p pVar, int i, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object l = pVar.l(i);
            if (l == null) {
                if (!i(jShadow) || z2) {
                    if (z2) {
                        if (pVar.k(i, null, j.j)) {
                            pVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (pVar.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (pVar.k(i, null, j.d)) {
                    break;
                }
            } else {
                if (l != j.e) {
                    a81.t tVar = j.k;
                    if (l == tVar) {
                        pVar.n(i, null);
                        return 5;
                    }
                    if (l == j.h) {
                        pVar.n(i, null);
                        return 5;
                    }
                    if (l == j.l) {
                        pVar.n(i, null);
                        z();
                        return 4;
                    }
                    pVar.n(i, null);
                    if (l instanceof x) {
                        l = ((x) l).a;
                    }
                    if (H(l, obj)) {
                        pVar.o(i, j.i);
                        return 0;
                    }
                    if (pVar.w.getAndSet((i * 2) + 1, tVar) != tVar) {
                        pVar.m(i, true);
                    }
                    return 5;
                }
                if (pVar.k(i, l, j.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void L(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        hShadow hVar = this;
        if (hVar.B()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = u;
            if (atomicLongFieldUpdater.get(hVar) > j) {
                break;
            } else {
                hVar = this;
            }
        }
        int i = j.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = v;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(hVar);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(hVar)) && j2 == atomicLongFieldUpdater.get(hVar)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        hVar = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(hVar);
                    long j5 = atomicLongFieldUpdater2.get(hVar);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z2 = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(hVar)) {
                        break;
                    }
                    if (z2) {
                        hVar = this;
                    } else {
                        hVar = this;
                        atomicLongFieldUpdater2.compareAndSet(hVar, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        hVar = this;
                    }
                }
            }
        }
    }

    @Override // x71.v
    public final Object a(c71.jShadow jVar) {
        return E(this, jVar);
    }

    @Override // x71.v
    public final b1.m b() {
        z.c(3, d.z);
        z.c(3, e.z);
        return new b1.m(this, (b) null);
    }

    @Override // x71.v
    public final Object c() {
        p pVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = t;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = s.get(this);
        if (x(true, j2)) {
            return new m(s());
        }
        long j3 = j2 & 1152921504606846975L;
        n nVar = o.b;
        if (j >= j3) {
            return nVar;
        }
        Object obj = j.k;
        p pVar2 = (p) x.get(this);
        while (!y()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = jShadow.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (pVar2.t != j5) {
                p r = r(j5, pVar2);
                if (r == null) {
                    continue;
                } else {
                    pVar = r;
                }
            } else {
                pVar = pVar2;
            }
            Object J = J(pVar, i, andIncrement, obj);
            p pVar3 = pVar;
            if (J == j.m) {
                a2 a2Var = obj instanceof a2 ? (a2) obj : null;
                if (a2Var != null) {
                    a2Var.a(pVar3, i);
                }
                L(andIncrement);
                pVar3.i();
                return nVar;
            }
            if (J != j.o) {
                if (J == j.n) {
                    throw new IllegalStateException("unexpected");
                }
                pVar3.a();
                return J;
            }
            if (andIncrement < v()) {
                pVar3.a();
            }
            pVar2 = pVar3;
        }
        return new m(s());
    }

    @Override // x71.w
    public final void d(j71.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = A;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            a81.t tVar = j.q;
            if (obj != tVar) {
                if (obj == j.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            a81.t tVar2 = j.r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                    break;
                }
            }
            cVar.k(s());
            return;
        }
    }

    @Override // x71.w
    public final boolean e(Throwable th) {
        return n(th, false);
    }

    public final boolean i(long j) {
        return j < u.get(this) || j < t.get(this) + ((long) this.r);
    }

    @Override // x71.v
    public final c iterator() {
        return new c(this);
    }

    @Override // x71.w
    public Object j(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = s;
        boolean z2 = false;
        long j = 1152921504606846975L;
        boolean z3 = x(false, atomicLongFieldUpdater.get(this)) ? false : !i(r1 & 1152921504606846975L);
        n nVar = o.b;
        if (z3) {
            return nVar;
        }
        Object obj2 = j.j;
        p pVar = (p) w.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean x2 = x(z2, andIncrement);
            int i = jShadow.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (pVar.t != j4) {
                p f = f(this, j4, pVar);
                if (f != null) {
                    pVar = f;
                } else {
                    if (x2) {
                        return new m(u());
                    }
                    z2 = false;
                    j = 1152921504606846975L;
                }
            }
            int h = h(this, pVar, i2, obj, j2, obj2, x2);
            a0 a0Var = a0.a;
            if (h == 0) {
                pVar.a();
                return a0Var;
            }
            if (h == 1) {
                return a0Var;
            }
            if (h == 2) {
                if (x2) {
                    pVar.i();
                    return new m(u());
                }
                a2 a2Var = obj2 instanceof a2 ? (a2) obj2 : null;
                if (a2Var != null) {
                    a2Var.a(pVar, i2 + i);
                }
                pVar.i();
                return nVar;
            }
            if (h == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (h == 4) {
                if (j2 < t.get(this)) {
                    pVar.a();
                }
                return new m(u());
            }
            if (h == 5) {
                pVar.a();
            }
            z2 = false;
            j = 1152921504606846975L;
        }
    }

    @Override // x71.v
    public final Object k(a71.c cVar) {
        p pVar;
        Throwable th;
        p pVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
        p pVar3 = (p) atomicReferenceFieldUpdater.get(this);
        while (!y()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = t;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = jShadow.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (pVar3.t != j2) {
                p r = r(j2, pVar3);
                if (r == null) {
                    continue;
                } else {
                    pVar = r;
                }
            } else {
                pVar = pVar3;
            }
            Object J = J(pVar, i, andIncrement, null);
            a81.t tVar = j.m;
            if (J == tVar) {
                throw new IllegalStateException("unexpected");
            }
            a81.t tVar2 = j.o;
            if (J == tVar2) {
                if (andIncrement < v()) {
                    pVar.a();
                }
                pVar3 = pVar;
            } else {
                if (J != j.n) {
                    pVar.a();
                    return J;
                }
                v71.l s2 = b0.s(b4.T(cVar));
                hShadow hVar = this;
                try {
                    Object J2 = hVar.J(pVar, i, andIncrement, s2);
                    if (J2 == tVar) {
                        s2.a(pVar, i);
                    } else {
                        if (J2 == tVar2) {
                            if (andIncrement < v()) {
                                pVar.a();
                            }
                            p pVar4 = (p) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (y()) {
                                    s2.i(y.d(t()));
                                    break;
                                }
                                v71.l lVar = s2;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j3 = jShadow.b;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (pVar4.t != j4) {
                                        try {
                                            p r2 = r(j4, pVar4);
                                            if (r2 == null) {
                                                s2 = lVar;
                                            } else {
                                                pVar2 = r2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            s2 = lVar;
                                            s2.D();
                                            throw th;
                                        }
                                    } else {
                                        pVar2 = pVar4;
                                    }
                                    J2 = hVar.J(pVar2, i2, andIncrement2, lVar);
                                    p pVar5 = pVar2;
                                    s2 = lVar;
                                    if (J2 == j.m) {
                                        s2.a(pVar5, i2);
                                        break;
                                    }
                                    if (J2 == j.o) {
                                        if (andIncrement2 < v()) {
                                            pVar5.a();
                                        }
                                        hVar = this;
                                        pVar4 = pVar5;
                                    } else {
                                        if (J2 == j.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        pVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    s2 = lVar;
                                    th = th;
                                    s2.D();
                                    throw th;
                                }
                            }
                        } else {
                            pVar.a();
                        }
                        s2.h(J2, null);
                    }
                    Object s3 = s2.s();
                    b71.a aVar = b71.a.r;
                    return s3;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable t2 = t();
        int i3 = a81.s.a;
        throw t2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00c6, code lost:
    
        g(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173 A[RETURN] */
    @Override // x71.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(a71.c cVar, Object obj) {
        Object s2;
        b71.a aVar;
        Object obj2;
        hShadow hVar;
        p pVar;
        int i;
        int i2;
        boolean z2;
        hShadow hVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        p pVar2 = (p) atomicReferenceFieldUpdater.get(hVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = s;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(hVar2);
            long j = andIncrement & 1152921504606846975L;
            boolean x2 = hVar2.x(false, andIncrement);
            int i3 = jShadow.b;
            long j2 = i3;
            long j3 = j / j2;
            int i4 = (int) (j % j2);
            long j4 = pVar2.t;
            a0 a0Var = a0.a;
            if (j4 != j3) {
                p f = f(hVar2, j3, pVar2);
                if (f != null) {
                    pVar2 = f;
                } else if (x2) {
                    Object D = D(cVar, obj);
                    if (D == b71.a.r) {
                        return D;
                    }
                }
            }
            int h = h(hVar2, pVar2, i4, obj, j, null, x2);
            if (h == 0) {
                pVar2.a();
                return a0Var;
            }
            if (h == 1) {
                break;
            }
            if (h != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = t;
                if (h == 3) {
                    v71.l s3 = b0.s(b4.T(cVar));
                    Object obj3 = obj;
                    try {
                        int h2 = h(hVar2, pVar2, i4, obj3, j, s3, false);
                        try {
                            if (h2 != 0) {
                                if (h2 == 1) {
                                    s3.i(a0Var);
                                } else if (h2 != 2) {
                                    if (h2 != 4) {
                                        String str = "unexpected";
                                        if (h2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        pVar2.a();
                                        p pVar3 = (p) atomicReferenceFieldUpdater.get(hVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(hVar2);
                                            long j5 = andIncrement2 & 1152921504606846975L;
                                            boolean x3 = hVar2.x(false, andIncrement2);
                                            int i5 = jShadow.b;
                                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                            long j6 = i5;
                                            String str2 = str;
                                            long j7 = j5 / j6;
                                            int i6 = (int) (j5 % j6);
                                            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater2;
                                            if (pVar3.t != j7) {
                                                p f2 = f(hVar2, j7, pVar3);
                                                if (f2 != null) {
                                                    i = i5;
                                                    i2 = i6;
                                                    z2 = x3;
                                                    pVar = f2;
                                                } else {
                                                    if (x3) {
                                                        break;
                                                    }
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                }
                                            } else {
                                                pVar = pVar3;
                                                i = i5;
                                                i2 = i6;
                                                z2 = x3;
                                            }
                                            int h3 = h(hVar2, pVar, i2, obj3, j5, s3, z2);
                                            Object obj4 = obj3;
                                            hVar = hVar2;
                                            p pVar4 = pVar;
                                            int i7 = i2;
                                            obj2 = obj4;
                                            if (h3 == 0) {
                                                pVar4.a();
                                                break;
                                            }
                                            if (h3 == 1) {
                                                break;
                                            }
                                            if (h3 != 2) {
                                                if (h3 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (h3 != 4) {
                                                    if (h3 == 5) {
                                                        pVar4.a();
                                                    }
                                                    pVar3 = pVar4;
                                                    hVar2 = hVar;
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                    obj3 = obj2;
                                                } else if (j5 < atomicLongFieldUpdater4.get(hVar)) {
                                                    pVar4.a();
                                                }
                                            } else if (z2) {
                                                pVar4.i();
                                            } else {
                                                s3.a(pVar4, i7 + i);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        hVar = hVar2;
                                        if (j < atomicLongFieldUpdater2.get(hVar)) {
                                            pVar2.a();
                                        }
                                    }
                                    g(hVar, obj2, s3);
                                } else {
                                    s3.a(pVar2, i4 + i3);
                                }
                                s2 = s3.s();
                                aVar = b71.a.r;
                                if (s2 != aVar) {
                                    s2 = a0Var;
                                }
                                if (s2 != aVar) {
                                    return s2;
                                }
                            } else {
                                pVar2.a();
                            }
                            s3.i(a0Var);
                            s2 = s3.s();
                            aVar = b71.a.r;
                            if (s2 != aVar) {
                            }
                            if (s2 != aVar) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            s3.D();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (h == 4) {
                    if (j < atomicLongFieldUpdater2.get(hVar2)) {
                        pVar2.a();
                    }
                    Object D2 = D(cVar, obj);
                    if (D2 == b71.a.r) {
                        return D2;
                    }
                } else if (h == 5) {
                    pVar2.a();
                }
            } else if (x2) {
                pVar2.i();
                Object D3 = D(cVar, obj);
                if (D3 == b71.a.r) {
                    return D3;
                }
            }
        }
    }

    @Override // x71.v
    public final void m(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        n(cancellationException, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(Throwable th, boolean z2) {
        hShadow hVar;
        a81.t tVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z3;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = s;
        if (z2) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) == 0) {
                    p pVar = jShadow.a;
                    hVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(hVar, j5, (j5 & 1152921504606846975L) + (1 << 60)));
            tVar = j.s;
            while (true) {
                atomicReferenceFieldUpdater = z;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, th)) {
                    z3 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                    z3 = false;
                    break;
                }
            }
            if (z2) {
                do {
                    j = atomicLongFieldUpdater.get(this);
                    int i = (int) (j >> 60);
                    if (i == 0) {
                        j2 = j & 1152921504606846975L;
                        j3 = 2;
                    } else {
                        if (i != 1) {
                            break;
                        }
                        j2 = j & 1152921504606846975L;
                        j3 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(hVar, j, (j3 << 60) + j2));
            } else {
                do {
                    j4 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(hVar, j4, (3 << 60) + (j4 & 1152921504606846975L)));
            }
            z();
            if (z3) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    a81.t tVar2 = obj == null ? j.q : j.r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, tVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    z.c(1, obj);
                    ((j71.c) obj).k(s());
                    return z3;
                }
            }
            return z3;
        }
        hVar = this;
        tVar = j.s;
        while (true) {
            atomicReferenceFieldUpdater = z;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, th)) {
            }
        }
        if (z2) {
        }
        z();
        if (z3) {
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (x71.p) ((a81.c) a81.c.s.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p o(long j) {
        Object obj;
        long j2;
        Object obj2 = y.get(this);
        p pVar = (p) w.get(this);
        if (pVar.t > ((p) obj2).t) {
            obj2 = pVar;
        }
        p pVar2 = (p) x.get(this);
        if (pVar2.t > ((p) obj2).t) {
            obj2 = pVar2;
        }
        a81.c cVar = (a81.c) obj2;
        loop0: while (true) {
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a81.c.r;
            Object obj3 = atomicReferenceFieldUpdater.get(cVar);
            a81.t tVar = a81.bShadow.a;
            obj = null;
            if (obj3 == tVar) {
                break;
            }
            a81.c cVar2 = (a81.c) obj3;
            if (cVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, tVar)) {
                    if (atomicReferenceFieldUpdater.get(cVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            cVar = cVar2;
        }
        p pVar3 = (p) cVar;
        if (A()) {
            p pVar4 = pVar3;
            loop2: do {
                int i = j.b - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (pVar4.t * jShadow.b) + i;
                    if (j2 < t.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object l = pVar4.l(i);
                        if (l != null && l != j.e) {
                            if (l == j.d) {
                                break loop2;
                            }
                        } else {
                            if (pVar4.k(i, l, j.l)) {
                                pVar4.i();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (pVar4 != null);
            j2 = -1;
            if (j2 != -1) {
                p(j2);
            }
        }
        loop5: for (p pVar5 = pVar3; pVar5 != null; pVar5 = (p) ((a81.c) a81.c.s.get(pVar5))) {
            for (int i2 = j.b - 1; -1 < i2; i2--) {
                if ((pVar5.t * jShadow.b) + i2 < j) {
                    break loop5;
                }
                while (true) {
                    Object l2 = pVar5.l(i2);
                    if (l2 != null && l2 != j.e) {
                        if (!(l2 instanceof x)) {
                            if (!(l2 instanceof a2)) {
                                break;
                            }
                            if (pVar5.k(i2, l2, j.l)) {
                                obj = a81.bShadow.f(obj, l2);
                                pVar5.m(i2, true);
                                break;
                            }
                        } else {
                            if (pVar5.k(i2, l2, j.l)) {
                                obj = a81.bShadow.f(obj, ((x) l2).a);
                                pVar5.m(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (pVar5.k(i2, l2, j.l)) {
                            pVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                G((a2) obj, true);
                return pVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                G((a2) arrayList.get(size), true);
            }
        }
        return pVar3;
    }

    public final void p(long j) {
        p pVar = (p) x.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = t;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.r + j2, u.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = jShadow.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (pVar.t != j4) {
                    p r = r(j4, pVar);
                    if (r != null) {
                        pVar = r;
                    }
                }
                p pVar2 = pVar;
                if (J(pVar2, i, j2, null) != j.o) {
                    pVar2.a();
                } else if (j2 < v()) {
                    pVar2.a();
                }
                pVar = pVar2;
            }
        }
    }

    public final void q() {
        Object b;
        if (B()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = u.getAndIncrement(this);
            long j = andIncrement / jShadow.b;
            if (v() <= andIncrement) {
                if (pVar.t < j && pVar.c() != null) {
                    C(j, pVar);
                }
                w(this);
                return;
            }
            if (pVar.t != j) {
                i iVar = i.z;
                while (true) {
                    b = a81.bShadow.b(pVar, j, iVar);
                    if (!a81.bShadow.e(b)) {
                        a81.r c = a81.bShadow.c(b);
                        while (true) {
                            a81.r rVar = (a81.r) atomicReferenceFieldUpdater.get(this);
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
                    } else {
                        break;
                    }
                }
                p pVar2 = null;
                if (a81.bShadow.e(b)) {
                    z();
                    C(j, pVar);
                    w(this);
                } else {
                    p pVar3 = (p) a81.bShadow.c(b);
                    long j2 = pVar3.t;
                    if (j2 > j) {
                        long j3 = j2 * jShadow.b;
                        if (u.compareAndSet(this, 1 + andIncrement, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = v;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            w(this);
                        }
                    } else {
                        pVar2 = pVar3;
                    }
                }
                if (pVar2 == null) {
                    continue;
                } else {
                    pVar = pVar2;
                }
            }
            int i = (int) (andIncrement % jShadow.b);
            Object l = pVar.l(i);
            boolean z2 = l instanceof a2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = t;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !pVar.k(i, l, j.g)) {
                while (true) {
                    Object l2 = pVar.l(i);
                    if (!(l2 instanceof a2)) {
                        if (l2 != j.j) {
                            if (l2 != null) {
                                if (l2 == j.d || l2 == j.h || l2 == j.i || l2 == j.k || l2 == j.l) {
                                    break loop0;
                                }
                                if (l2 != j.f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + l2).toString());
                                }
                            } else if (pVar.k(i, l2, j.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (pVar.k(i, l2, new x((a2) l2))) {
                            break loop0;
                        }
                    } else if (pVar.k(i, l2, j.g)) {
                        if (I(l2, pVar, i)) {
                            pVar.o(i, j.d);
                            break;
                        } else {
                            pVar.o(i, j.j);
                            pVar.i();
                        }
                    }
                }
            } else if (I(l, pVar, i)) {
                pVar.o(i, j.d);
                break;
            } else {
                pVar.o(i, j.j);
                pVar.i();
                w(this);
            }
        }
        w(this);
    }

    public final p r(long j, p pVar) {
        Object b;
        long j2;
        p pVar2 = jShadow.a;
        i iVar = i.z;
        loop0: while (true) {
            b = a81.bShadow.b(pVar, j, iVar);
            if (!a81.bShadow.e(b)) {
                a81.r c = a81.bShadow.c(b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
                    a81.r rVar = (a81.r) atomicReferenceFieldUpdater.get(this);
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
        if (a81.bShadow.e(b)) {
            z();
            if (pVar.t * j.b < v()) {
                pVar.a();
                return null;
            }
        } else {
            p pVar3 = (p) a81.bShadow.c(b);
            long j3 = pVar3.t;
            if (!B() && j <= u.get(this) / jShadow.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = y;
                    a81.r rVar2 = (a81.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.t >= j3 || !pVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, pVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (pVar3.f()) {
                                pVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j3 <= j) {
                return pVar3;
            }
            long j4 = j3 * jShadow.b;
            do {
                j2 = t.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!t.compareAndSet(this, j2, j4));
            if (j3 * j.b < v()) {
                pVar3.a();
            }
        }
        return null;
    }

    public final Throwable s() {
        return (Throwable) z.get(this);
    }

    public final Throwable t() {
        Throwable s2 = s();
        return s2 == null ? new ClosedReceiveChannelException("Channel was closed") : s2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b7, code lost:
    
        r16 = r7;
        r3 = (x71.p) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c0, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z2;
        String str;
        StringBuilder sb = new StringBuilder();
        int i = (int) (s.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.r + ',');
        sb.append("data=[");
        int i2 = 0;
        boolean z3 = true;
        List r = x61.l.r(new p[]{x.get(this), w.get(this), y.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : r) {
            if (((p) obj) != jShadow.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((p) next).t;
            do {
                Object next2 = it.next();
                long j2 = ((p) next2).t;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        p pVar = (p) next;
        long j3 = t.get(this);
        long v2 = v();
        loop2: while (true) {
            int i3 = jShadow.b;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j4 = (pVar.t * jShadow.b) + i4;
                if (j4 >= v2 && j4 >= j3) {
                    break loop2;
                }
                Object l = pVar.l(i4);
                boolean z4 = z3;
                Object obj2 = pVar.w.get(i4 * 2);
                if (l instanceof v71.k) {
                    str = (j4 >= j3 || j4 < v2) ? (j4 >= v2 || j4 < j3) ? "cont" : "send" : "receive";
                } else if (l instanceof d81.f) {
                    str = (j4 >= j3 || j4 < v2) ? (j4 >= v2 || j4 < j3) ? "select" : "onSend" : "onReceive";
                } else if (l instanceof u) {
                    str = "receiveCatching";
                } else if (l instanceof x) {
                    str = "EB(" + l + ')';
                } else if (k71.k.b(l, j.f) || k71.k.b(l, j.g)) {
                    str = "resuming_sender";
                } else {
                    if (l != null && !l.equals(j.e) && !l.equals(j.i) && !l.equals(j.h) && !l.equals(j.k) && !l.equals(j.j) && !l.equals(j.l)) {
                        str = l.toString();
                    }
                    i4++;
                    z3 = z4;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i4++;
                z3 = z4;
            }
            z3 = z2;
            i2 = 0;
        }
        if (t71.p.U(sb) == ',') {
            k71.k.f(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable s2 = s();
        return s2 == null ? new ClosedSendChannelException("Channel was closed") : s2;
    }

    public final long v() {
        return s.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (x71.p) ((a81.c) a81.c.s.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(boolean z2, long j) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = t;
            if (i == 2) {
                o(1152921504606846975L & j);
                if (z2) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
                        p pVar = (p) atomicReferenceFieldUpdater.get(this);
                        long j2 = atomicLongFieldUpdater.get(this);
                        if (v() <= j2) {
                            break;
                        }
                        long j3 = jShadow.b;
                        long j4 = j2 / j3;
                        if (pVar.t != j4 && (pVar = r(j4, pVar)) == null) {
                            if (((p) atomicReferenceFieldUpdater.get(this)).t < j4) {
                                break;
                            }
                        } else {
                            pVar.a();
                            int i2 = (int) (j2 % j3);
                            while (true) {
                                Object l = pVar.l(i2);
                                if (l == null || l == j.e) {
                                    if (pVar.k(i2, l, j.h)) {
                                        q();
                                        break;
                                    }
                                } else {
                                    if (l == j.d) {
                                        break;
                                    }
                                    if (l != j.j) {
                                        if (l != j.l) {
                                            if (l != j.i) {
                                                if (l != j.h) {
                                                    if (l == j.g) {
                                                        break;
                                                    }
                                                    if (l != j.f && j2 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            t.compareAndSet(this, j2, j2 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(no.a.k("unexpected close status: ", i).toString());
                }
                p o = o(1152921504606846975L & j);
                Object obj = null;
                loop0: do {
                    int i3 = j.b - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j5 = (o.t * jShadow.b) + i3;
                        while (true) {
                            Object l2 = o.l(i3);
                            if (l2 == j.i) {
                                break loop0;
                            }
                            if (l2 == j.d) {
                                if (j5 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (o.k(i3, l2, j.l)) {
                                    o.n(i3, null);
                                    o.i();
                                    break;
                                }
                            } else if (l2 != j.e && l2 != null) {
                                if (!(l2 instanceof a2) && !(l2 instanceof x)) {
                                    a81.t tVar = j.g;
                                    if (l2 == tVar || l2 == j.f) {
                                        break loop0;
                                    }
                                    if (l2 != tVar) {
                                        break;
                                    }
                                } else {
                                    if (j5 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    a2 a2Var = l2 instanceof x ? ((x) l2).a : (a2) l2;
                                    if (o.k(i3, l2, j.l)) {
                                        obj = a81.bShadow.f(obj, a2Var);
                                        o.n(i3, null);
                                        o.i();
                                        break;
                                    }
                                }
                            } else if (o.k(i3, l2, j.l)) {
                                o.i();
                                break;
                            }
                        }
                        i3--;
                    }
                } while (o != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            G((a2) arrayList.get(size), false);
                        }
                    } else {
                        G((a2) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean y() {
        return x(true, s.get(this));
    }

    public final boolean z() {
        return x(false, s.get(this));
    }
}
