package v71;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class b0 {
    public static final a81.t a = new a81.t(0, "RESUME_TOKEN", false);
    public static final a81.t b = new a81.t(0, "REMOVED_TASK", false);
    public static final a81.t c = new a81.t(0, "CLOSED_EMPTY", false);
    public static final a81.t d = new a81.t(0, "COMPLETING_ALREADY", false);
    public static final a81.t e = new a81.t(0, "COMPLETING_WAITING_CHILDREN", false);
    public static final a81.t f = new a81.t(0, "COMPLETING_RETRY", false);
    public static final a81.t g = new a81.t(0, "TOO_LATE_TO_CANCEL", false);
    public static final a81.t h = new a81.t(0, "SEALED", false);
    public static final p0 i = new p0(false);
    public static final p0 j = new p0(true);

    public static final a71.h A(z zVar, a71.h hVar) {
        c81.e n = n(zVar.K(), hVar, true);
        c81.e eVar = l0.a;
        return (n == eVar || n.w0(a71.d.r) != null) ? n : n.A(eVar);
    }

    public static final Object B(Object obj) {
        return obj instanceof t ? sy.y.d(((t) obj).a) : obj;
    }

    public static final void C(l lVar, a71.c cVar, boolean z) {
        Object obj = l.x.get(lVar);
        Throwable d2 = lVar.d(obj);
        Object d3 = d2 != null ? sy.y.d(d2) : lVar.e(obj);
        if (!z) {
            cVar.i(d3);
            return;
        }
        k71.k.e(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        a81.f fVar = (a81.f) cVar;
        c71.c cVar2 = fVar.v;
        Object obj2 = fVar.x;
        a71.h q = cVar2.q();
        Object n = a81.b.n(q, obj2);
        y1 K = n != a81.b.d ? K(cVar2, q, n) : null;
        try {
            cVar2.i(d3);
            if (K == null || K.s0()) {
                a81.b.g(q, n);
            }
        } catch (Throwable th) {
            if (K == null || K.s0()) {
                a81.b.g(q, n);
            }
            throw th;
        }
    }

    public static final Object D(a71.h hVar, j71.e eVar) {
        v0 v0Var;
        a71.h n;
        long R0;
        Thread currentThread = Thread.currentThread();
        a71.d dVar = a71.d.r;
        a71.e w0 = hVar.w0(dVar);
        a71.i iVar = a71.i.r;
        if (w0 == null) {
            v0Var = t1.a();
            n = n(iVar, hVar.A(v0Var), true);
            a71.h hVar2 = l0.a;
            if (n != hVar2 && n.w0(dVar) == null) {
                n = n.A(hVar2);
            }
        } else {
            if (w0 instanceof v0) {
            }
            v0Var = (v0) t1.a.get();
            n = n(iVar, hVar, true);
            a71.h hVar3 = l0.a;
            if (n != hVar3 && n.w0(dVar) == null) {
                n = n.A(hVar3);
            }
        }
        g gVar = new g(n, currentThread, v0Var);
        gVar.q0(a0.r, gVar, eVar);
        v0 v0Var2 = gVar.v;
        if (v0Var2 != null) {
            int i2 = v0.w;
            v0Var2.Q0(false);
        }
        while (true) {
            if (v0Var2 != null) {
                try {
                    R0 = v0Var2.R0();
                } catch (Throwable th) {
                    if (v0Var2 != null) {
                        int i3 = v0.w;
                        v0Var2.N0(false);
                    }
                    throw th;
                }
            } else {
                R0 = Long.MAX_VALUE;
            }
            if (gVar.U()) {
                break;
            }
            LockSupport.parkNanos(gVar, R0);
            if (Thread.interrupted()) {
                gVar.u(new InterruptedException());
            }
        }
        if (v0Var2 != null) {
            int i4 = v0.w;
            v0Var2.N0(false);
        }
        Object J = J(j1.r.get(gVar));
        t tVar = J instanceof t ? (t) J : null;
        if (tVar == null) {
            return J;
        }
        throw tVar.a;
    }

    public static Object F(j71.a aVar, c71.c cVar) {
        return L(a71.i.r, new androidx.lifecycle.n(aVar, (a71.c) null, 18), cVar);
    }

    public static final Object G(v1 v1Var, j71.e eVar) {
        u(v1Var, true, new o0(0, p(v1Var.u.q()).E0(v1Var.v, v1Var, v1Var.t)));
        return i4.o0(v1Var, false, v1Var, eVar);
    }

    public static final String H(a71.c cVar) {
        String d2;
        if (cVar instanceof a81.f) {
            return ((a81.f) cVar).toString();
        }
        try {
            d2 = cVar + '@' + q(cVar);
        } catch (Throwable th) {
            d2 = sy.y.d(th);
        }
        if (w61.n.a(d2) != null) {
            d2 = cVar.getClass().getName() + '@' + q(cVar);
        }
        return d2;
    }

    public static final long I(long j2) {
        int i2 = kotlin.time.a.u;
        boolean z = j2 > 0;
        if (z) {
            return kotlin.time.a.d(kotlin.time.a.g(j2, kotlin.time.e.o(999999L, kotlin.time.c.s)));
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }

    public static final Object J(Object obj) {
        a1 a1Var;
        b1 b1Var = obj instanceof b1 ? (b1) obj : null;
        return (b1Var == null || (a1Var = b1Var.a) == null) ? obj : a1Var;
    }

    public static final y1 K(a71.c cVar, a71.h hVar, Object obj) {
        y1 y1Var = null;
        if ((cVar instanceof c71.d) && hVar.w0(z1.r) != null) {
            c71.d dVar = (c71.d) cVar;
            while (true) {
                if ((dVar instanceof i0) || (dVar = dVar.g()) == null) {
                    break;
                }
                if (dVar instanceof y1) {
                    y1Var = (y1) dVar;
                    break;
                }
            }
            if (y1Var != null) {
                y1Var.u0(hVar, obj);
            }
        }
        return y1Var;
    }

    public static final Object L(a71.h hVar, j71.e eVar, a71.c cVar) {
        Object J;
        a71.h q = cVar.q();
        a71.h A = !((Boolean) hVar.x0(new sw0.b(23), Boolean.FALSE)).booleanValue() ? q.A(hVar) : n(q, hVar, false);
        m(A);
        if (A == q) {
            a81.q qVar = new a81.q(cVar, A);
            J = i4.o0(qVar, true, qVar, eVar);
        } else {
            a71.d dVar = a71.d.r;
            if (k71.k.b(A.w0(dVar), q.w0(dVar))) {
                y1 y1Var = new y1(cVar, A);
                a71.h hVar2 = y1Var.t;
                Object n = a81.b.n(hVar2, null);
                try {
                    Object o0 = i4.o0(y1Var, true, y1Var, eVar);
                    a81.b.g(hVar2, n);
                    J = o0;
                } catch (Throwable th) {
                    a81.b.g(hVar2, n);
                    throw th;
                }
            } else {
                i0 i0Var = new i0(cVar, A);
                try {
                    a81.b.h(b4.T(b4.G(i0Var, i0Var, eVar)), w61.a0.a);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i0.v;
                    while (true) {
                        int i2 = atomicIntegerFieldUpdater.get(i0Var);
                        if (i2 != 0) {
                            if (i2 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            J = J(j1.r.get(i0Var));
                            if (J instanceof t) {
                                throw ((t) J).a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(i0Var, 0, 1)) {
                            J = b71.a.r;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof DispatchException) {
                        th = ((DispatchException) th).r;
                    }
                    i0Var.i(sy.y.d(th));
                    throw th;
                }
            }
        }
        b71.a aVar = b71.a.r;
        return J;
    }

    public static final Object M(long j2, j71.e eVar, c71.c cVar) {
        if (j2 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object G = G(new v1(j2, cVar), eVar);
        b71.a aVar = b71.a.r;
        return G;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(long j2, j71.e eVar, c71.c cVar) {
        w1 w1Var;
        int i2;
        k71.w wVar;
        if (cVar instanceof w1) {
            w1Var = (w1) cVar;
            int i3 = w1Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w1Var.w = i3 - Integer.MIN_VALUE;
                Object obj = w1Var.v;
                b71.a aVar = b71.a.r;
                i2 = w1Var.w;
                if (i2 != 0) {
                    sy.y.j(obj);
                    if (j2 <= 0) {
                        return null;
                    }
                    k71.w wVar2 = new k71.w();
                    try {
                        w1Var.u = wVar2;
                        w1Var.w = 1;
                        v1 v1Var = new v1(j2, w1Var);
                        wVar2.r = v1Var;
                        Object G = G(v1Var, eVar);
                        return G == aVar ? aVar : G;
                    } catch (TimeoutCancellationException e2) {
                        e = e2;
                        wVar = wVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar = w1Var.u;
                    try {
                        sy.y.j(obj);
                        return obj;
                    } catch (TimeoutCancellationException e3) {
                        e = e3;
                    }
                }
                if (e.r != wVar.r) {
                    return null;
                }
                throw e;
            }
        }
        w1Var = new w1(cVar);
        Object obj2 = w1Var.v;
        b71.a aVar2 = b71.a.r;
        i2 = w1Var.w;
        if (i2 != 0) {
        }
        if (e.r != wVar.r) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(c71.c cVar) {
        b71.a aVar;
        a71.h q = cVar.q();
        m(q);
        a71.c T = b4.T(cVar);
        a81.f fVar = T instanceof a81.f ? (a81.f) T : null;
        b71.a aVar2 = w61.a0.a;
        if (fVar != null) {
            v vVar = fVar.u;
            if (a81.b.j(vVar, q)) {
                fVar.w = aVar2;
                fVar.t = 1;
                vVar.K0(q, fVar);
            } else {
                b2 b2Var = new b2(b2.t);
                a71.h A = q.A(b2Var);
                fVar.w = aVar2;
                fVar.t = 1;
                vVar.K0(A, fVar);
                if (b2Var.s) {
                    v0 a2 = t1.a();
                    x61.k kVar = a2.v;
                    if (!(kVar != null ? kVar.isEmpty() : true)) {
                        if (a2.t >= 4294967296L) {
                            fVar.w = aVar2;
                            fVar.t = 1;
                            a2.O0(fVar);
                            aVar = b71.a.r;
                            return aVar == b71.a.r ? aVar : aVar2;
                        }
                        a2.Q0(true);
                        try {
                            fVar.run();
                            do {
                            } while (a2.S0());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                }
            }
            aVar = b71.a.r;
            if (aVar == b71.a.r) {
            }
        }
        aVar = aVar2;
        if (aVar == b71.a.r) {
        }
    }

    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static r b() {
        r rVar = new r(true);
        rVar.S(null);
        return rVar;
    }

    public static final a81.d c(a71.h hVar) {
        if (hVar.w0(w.s) == null) {
            hVar = hVar.A(d());
        }
        return new a81.d(hVar);
    }

    public static e1 d() {
        return new e1(null);
    }

    public static s1 e() {
        return new s1(null);
    }

    public static f0 f(z zVar, w71.d dVar, j71.e eVar, int i2) {
        if ((i2 & 1) != 0) {
            dVar = a71.i.r;
        }
        a0 a0Var = a0.r;
        a71.h A = A(zVar, dVar);
        a0 a0Var2 = a0.r;
        f0 f0Var = new f0(A, true);
        f0Var.q0(a0Var, f0Var, eVar);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(c71.c cVar) {
        h0 h0Var;
        int i2;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i3 = h0Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h0Var.v = i3 - Integer.MIN_VALUE;
                Object obj = h0Var.u;
                b71.a aVar = b71.a.r;
                i2 = h0Var.v;
                if (i2 != 0) {
                    sy.y.j(obj);
                    h0Var.v = 1;
                    l lVar = new l(1, b4.T(h0Var));
                    lVar.t();
                    if (lVar.s() == aVar) {
                        return;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        h0Var = new h0(cVar);
        Object obj2 = h0Var.u;
        b71.a aVar2 = b71.a.r;
        i2 = h0Var.v;
        if (i2 != 0) {
        }
        throw new KotlinNothingValueException();
    }

    public static final void h(a71.h hVar, CancellationException cancellationException) {
        d1 d1Var = (d1) hVar.w0(w.s);
        if (d1Var != null) {
            d1Var.m(cancellationException);
        }
    }

    public static final void i(z zVar, CancellationException cancellationException) {
        d1 d1Var = (d1) zVar.K().w0(w.s);
        if (d1Var != null) {
            d1Var.m(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + zVar).toString());
        }
    }

    public static void j(a71.h hVar) {
        d1 d1Var = (d1) hVar.w0(w.s);
        if (d1Var != null) {
            Iterator it = d1Var.F().iterator();
            while (it.hasNext()) {
                ((d1) it.next()).m(null);
            }
        }
    }

    public static final Object k(j71.e eVar, a71.c cVar) {
        a81.q qVar = new a81.q(cVar, cVar.q());
        Object o0 = i4.o0(qVar, true, qVar, eVar);
        b71.a aVar = b71.a.r;
        return o0;
    }

    public static final Object l(long j2, a71.c cVar) {
        if (j2 > 0) {
            l lVar = new l(1, b4.T(cVar));
            lVar.t();
            if (j2 < Long.MAX_VALUE) {
                p(lVar.v).K(j2, lVar);
            }
            Object s = lVar.s();
            if (s == b71.a.r) {
                return s;
            }
        }
        return w61.a0.a;
    }

    public static final void m(a71.h hVar) {
        d1 d1Var = (d1) hVar.w0(w.s);
        if (d1Var != null && !d1Var.f()) {
            throw d1Var.N();
        }
    }

    public static final a71.h n(a71.h hVar, a71.h hVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) hVar.x0(new sw0.b(23), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.x0(new sw0.b(23), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.A(hVar2);
        }
        sw0.b bVar = new sw0.b(24);
        a71.i iVar = a71.i.r;
        a71.h hVar3 = (a71.h) hVar.x0(bVar, iVar);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.x0(new sw0.b(25), iVar);
        }
        return hVar3.A((a71.h) obj);
    }

    public static final v o(Executor executor) {
        return new x0(executor);
    }

    public static final g0 p(a71.h hVar) {
        g0 w0 = hVar.w0(a71.d.r);
        g0 g0Var = w0 instanceof g0 ? w0 : null;
        return g0Var == null ? d0.a : g0Var;
    }

    public static final String q(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final d1 r(a71.h hVar) {
        d1 d1Var = (d1) hVar.w0(w.s);
        if (d1Var != null) {
            return d1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final l s(a71.c cVar) {
        l lVar;
        l lVar2;
        if (!(cVar instanceof a81.f)) {
            return new l(1, cVar);
        }
        a81.f fVar = (a81.f) cVar;
        a81.t tVar = a81.b.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a81.f.y;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            lVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, tVar);
                lVar2 = null;
                break;
            }
            if (obj instanceof l) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, tVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                lVar2 = (l) obj;
                break loop0;
            }
            if (obj != tVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (lVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l.x;
            Object obj2 = atomicReferenceFieldUpdater2.get(lVar2);
            if (!(obj2 instanceof s) || ((s) obj2).d == null) {
                l.w.set(lVar2, 536870911);
                atomicReferenceFieldUpdater2.set(lVar2, b.r);
                lVar = lVar2;
            } else {
                lVar2.n();
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return new l(2, cVar);
    }

    public static final void t(a71.h hVar, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).r;
        }
        try {
            x xVar = (x) hVar.w0(w.r);
            if (xVar != null) {
                xVar.i0(hVar, th);
            } else {
                a81.b.d(hVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                sy.u.a(runtimeException, th);
                th = runtimeException;
            }
            a81.b.d(hVar, th);
        }
    }

    public static final n0 u(d1 d1Var, boolean z, f1 f1Var) {
        return d1Var instanceof j1 ? ((j1) d1Var).T(z, f1Var) : d1Var.E(f1Var.k(), z, new f0.c(1, f1Var, f1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 4));
    }

    public static final boolean v(a71.h hVar) {
        d1 d1Var = (d1) hVar.w0(w.s);
        if (d1Var != null) {
            return d1Var.f();
        }
        return true;
    }

    public static final boolean w(z zVar) {
        d1 d1Var = (d1) zVar.K().w0(w.s);
        if (d1Var != null) {
            return d1Var.f();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x(ArrayList arrayList, c71.c cVar) {
        f fVar;
        int i2;
        Iterator it;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i3 = fVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.w = i3 - Integer.MIN_VALUE;
                Object obj = fVar.v;
                b71.a aVar = b71.a.r;
                i2 = fVar.w;
                if (i2 != 0) {
                    sy.y.j(obj);
                    it = arrayList.iterator();
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = fVar.u;
                    sy.y.j(obj);
                }
                while (it.hasNext()) {
                    d1 d1Var = (d1) it.next();
                    fVar.u = it;
                    fVar.w = 1;
                    if (d1Var.O(fVar) == aVar) {
                        return aVar;
                    }
                }
                return w61.a0.a;
            }
        }
        fVar = new f(cVar);
        Object obj2 = fVar.v;
        b71.a aVar2 = b71.a.r;
        i2 = fVar.w;
        if (i2 != 0) {
        }
        while (it.hasNext()) {
        }
        return w61.a0.a;
    }

    public static final q1 y(z zVar, a71.h hVar, a0 a0Var, j71.e eVar) {
        a71.h A = A(zVar, hVar);
        a0Var.getClass();
        q1 k1Var = a0Var == a0.s ? new k1(A, eVar) : new q1(A, true);
        k1Var.q0(a0Var, k1Var, eVar);
        return k1Var;
    }

    public static /* synthetic */ q1 z(z zVar, a71.h hVar, a0 a0Var, j71.e eVar, int i2) {
        if ((i2 & 1) != 0) {
            hVar = a71.i.r;
        }
        if ((i2 & 2) != 0) {
            a0Var = a0.r;
        }
        return y(zVar, hVar, a0Var, eVar);
    }

    public static Object E(Object... a) {
        return null;
    }
}
