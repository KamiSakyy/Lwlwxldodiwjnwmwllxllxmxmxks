package v71;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;

/* loaded from: /home/user/work/p/classes5.dex */
public class l extends j0 implements k, c71.d, a2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater x = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public a71.c u;
    public a71.h v;

    public l(int i, a71.c cVar) {
        super(i);
        this.u = cVar;
        this.v = cVar.q();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.r;
    }

    public static void B(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object G(o1 o1Var, Object obj, int i, j71.f fVar) {
        if (obj instanceof t) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (fVar != null || (o1Var instanceof j)) {
            return new s(obj, o1Var instanceof j ? (j) o1Var : null, fVar, (Throwable) null, 16);
        }
        return obj;
    }

    public final boolean A() {
        if (this.t != 2) {
            return false;
        }
        a71.c cVar = this.u;
        k71.k.e(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return a81.f.y.get((a81.f) cVar) != null;
    }

    public String C() {
        return "CancellableContinuation";
    }

    public final void D() {
        a71.c cVar = this.u;
        Throwable th = null;
        a81.f fVar = cVar instanceof a81.f ? (a81.f) cVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a81.f.y;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                a81.t tVar = a81.b.c;
                if (obj == tVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            n();
            x(th);
        }
    }

    public final void E(Object obj, int i, j71.f fVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof o1) {
                Object G = G((o1) obj2, obj, i, fVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, G)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!A()) {
                    n();
                }
                o(i);
                return;
            }
            if (obj2 instanceof m) {
                m mVar = (m) obj2;
                if (m.c.compareAndSet(mVar, 0, 1)) {
                    if (fVar != null) {
                        l(fVar, mVar.a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void F(v vVar) {
        a71.c cVar = this.u;
        a81.f fVar = cVar instanceof a81.f ? (a81.f) cVar : null;
        E(w61.a0.a, (fVar != null ? fVar.u : null) == vVar ? 4 : this.t, null);
    }

    public final a81.t H(Object obj, j71.f fVar) {
        a81.t tVar = b0.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof o1)) {
                return null;
            }
            Object G = G((o1) obj2, obj, this.t, fVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, G)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!A()) {
                n();
            }
            return tVar;
        }
    }

    @Override // v71.a2
    public final void a(a81.r rVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = w;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        w(rVar);
    }

    @Override // v71.j0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof o1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof t) {
                return;
            }
            if (!(obj instanceof s)) {
                cancellationException2 = cancellationException;
                s sVar = new s(obj, (j) null, (j71.f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            s sVar2 = (s) obj;
            if (sVar2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            s a = s.a(sVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            j jVar = sVar2.b;
            if (jVar != null) {
                k(jVar, cancellationException);
            }
            j71.f fVar = sVar2.c;
            if (fVar != null) {
                l(fVar, cancellationException, sVar2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // v71.j0
    public final a71.c c() {
        return this.u;
    }

    @Override // v71.j0
    public final Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d != null) {
            return d;
        }
        return null;
    }

    @Override // v71.j0
    public final Object e(Object obj) {
        return obj instanceof s ? ((s) obj).a : obj;
    }

    public final c71.d g() {
        c71.d dVar = this.u;
        if (dVar instanceof c71.d) {
            return dVar;
        }
        return null;
    }

    @Override // v71.k
    public final void h(Object obj, j71.f fVar) {
        E(obj, this.t, fVar);
    }

    public final void i(Object obj) {
        Throwable a = w61.n.a(obj);
        if (a != null) {
            obj = new t(a, false);
        }
        E(obj, this.t, null);
    }

    @Override // v71.j0
    public final Object j() {
        return x.get(this);
    }

    public final void k(j jVar, Throwable th) {
        try {
            jVar.b(th);
        } catch (Throwable th2) {
            b0.t(this.v, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(j71.f fVar, Throwable th, Object obj) {
        a71.h hVar = this.v;
        try {
            fVar.f(th, obj, hVar);
        } catch (Throwable th2) {
            b0.t(hVar, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(a81.r rVar, Throwable th) {
        a71.h hVar = this.v;
        int i = w.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.h(i, hVar);
        } catch (Throwable th2) {
            b0.t(hVar, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
        n0 n0Var = (n0) atomicReferenceFieldUpdater.get(this);
        if (n0Var == null) {
            return;
        }
        n0Var.a();
        atomicReferenceFieldUpdater.set(this, n1.r);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = w;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                a71.c cVar = this.u;
                if (!z && (cVar instanceof a81.f)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.t;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        a81.f fVar = (a81.f) cVar;
                        v vVar = fVar.u;
                        a71.h q = fVar.v.q();
                        if (a81.b.j(vVar, q)) {
                            a81.b.i(vVar, q, this);
                            return;
                        }
                        v0 a = t1.a();
                        if (a.t >= 4294967296L) {
                            a.O0(this);
                            return;
                        }
                        a.Q0(true);
                        try {
                            b0.C(this, cVar, true);
                            do {
                            } while (a.S0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                b0.C(this, cVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    @Override // v71.k
    public final a81.t p(Object obj, j71.f fVar) {
        return H(obj, fVar);
    }

    public final a71.h q() {
        return this.v;
    }

    public Throwable r(j1 j1Var) {
        return j1Var.N();
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        d1 d1Var;
        boolean A = A();
        do {
            atomicIntegerFieldUpdater = w;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (A) {
                    D();
                }
                Object obj = x.get(this);
                if (obj instanceof t) {
                    throw ((t) obj).a;
                }
                int i3 = this.t;
                if ((i3 != 1 && i3 != 2) || (d1Var = (d1) this.v.w0(w.s)) == null || d1Var.f()) {
                    return e(obj);
                }
                CancellationException N = d1Var.N();
                b(N);
                throw N;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((n0) y.get(this)) == null) {
            u();
        }
        if (A) {
            D();
        }
        return b71.a.r;
    }

    public final void t() {
        n0 u = u();
        if (u == null || (x.get(this) instanceof o1)) {
            return;
        }
        u.a();
        y.set(this, n1.r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C());
        sb.append('(');
        sb.append(b0.H(this.u));
        sb.append("){");
        Object obj = x.get(this);
        sb.append(obj instanceof o1 ? "Active" : obj instanceof m ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(b0.q(this));
        return sb.toString();
    }

    public final n0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d1 d1Var = (d1) this.v.w0(w.s);
        if (d1Var == null) {
            return null;
        }
        n0 u = b0.u(d1Var, true, new n(this, 0));
        do {
            atomicReferenceFieldUpdater = y;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, u)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return u;
    }

    public final void v(j71.c cVar) {
        w(new i(1, cVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ae, code lost:
    
        B(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(o1 o1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof j) || (obj instanceof a81.r)) {
                break;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (!t.b.compareAndSet(tVar, 0, 1)) {
                    B(o1Var, obj);
                    throw null;
                }
                if (obj instanceof m) {
                    Throwable th = tVar.a;
                    if (o1Var instanceof j) {
                        k((j) o1Var, th);
                        return;
                    } else {
                        k71.k.e(o1Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m((a81.r) o1Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof s)) {
                if (o1Var instanceof a81.r) {
                    return;
                }
                k71.k.e(o1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                s sVar = new s(obj, (j) o1Var, (j71.f) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            s sVar2 = (s) obj;
            if (sVar2.b != null) {
                B(o1Var, obj);
                throw null;
            }
            if (o1Var instanceof a81.r) {
                return;
            }
            k71.k.e(o1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            j jVar = (j) o1Var;
            Throwable th2 = sVar2.e;
            if (th2 != null) {
                k(jVar, th2);
                return;
            }
            s a = s.a(sVar2, jVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    @Override // v71.k
    public final boolean x(Throwable th) {
        Throwable th2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof o1)) {
                return false;
            }
            boolean z = (obj instanceof j) || (obj instanceof a81.r);
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            m mVar = new m(th2, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            o1 o1Var = (o1) obj;
            if (o1Var instanceof j) {
                k((j) obj, th);
            } else if (o1Var instanceof a81.r) {
                m((a81.r) obj, th);
            }
            if (!A()) {
                n();
            }
            o(this.t);
            return true;
        }
    }

    @Override // v71.k
    public final void y(Object obj) {
        o(this.t);
    }

    public final boolean z() {
        return x.get(this) instanceof o1;
    }
}
