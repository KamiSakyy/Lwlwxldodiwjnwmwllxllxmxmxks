package v71;

import com.google.android.gms.internal.measurement.b4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: /home/user/work/p/classes5.dex */
public class j1 implements d1, p1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public j1(boolean z) {
        this._state$volatile = z ? b0.j : b0.i;
    }

    public static p a0(a81.j jVar) {
        while (jVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a81.j.s;
            a81.j d = jVar.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (a81.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = d;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof p) {
                    return (p) jVar;
                }
                if (jVar instanceof l1) {
                    return null;
                }
            }
        }
    }

    public static String k0(Object obj) {
        if (!(obj instanceof i1)) {
            return obj instanceof a1 ? ((a1) obj).f() ? "Active" : "New" : obj instanceof t ? "Cancelled" : "Completed";
        }
        i1 i1Var = (i1) obj;
        return i1Var.c() ? "Cancelling" : i1.s.get(i1Var) == 1 ? "Completing" : "Active";
    }

    public final a71.h A(a71.h hVar) {
        return k21.f.y(this, hVar);
    }

    public boolean B(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return u(th) && J();
    }

    public final void C(a1 a1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.a();
            atomicReferenceFieldUpdater.set(this, n1.r);
        }
        CompletionHandlerException completionHandlerException = null;
        t tVar = obj instanceof t ? (t) obj : null;
        Throwable th = tVar != null ? tVar.a : null;
        if (a1Var instanceof f1) {
            try {
                ((f1) a1Var).l(th);
                return;
            } catch (Throwable th2) {
                R(new CompletionHandlerException("Exception in completion handler " + a1Var + " for " + this, th2));
                return;
            }
        }
        l1 g = a1Var.g();
        if (g != null) {
            g.c(new a81.h(1), 1);
            Object obj2 = a81.j.r.get(g);
            k71.k.e(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (a81.j jVar = (a81.j) obj2; !jVar.equals(g); jVar = jVar.h()) {
                if (jVar instanceof f1) {
                    try {
                        ((f1) jVar).l(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            sy.u.a(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                R(completionHandlerException);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable D(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        j1 j1Var = (j1) ((p1) obj);
        Object obj2 = r.get(j1Var);
        if (obj2 instanceof i1) {
            cancellationException = ((i1) obj2).b();
        } else if (obj2 instanceof t) {
            cancellationException = ((t) obj2).a;
        } else {
            if (obj2 instanceof a1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new JobCancellationException("Parent job is ".concat(k0(obj2)), cancellationException, j1Var) : cancellationException2;
    }

    @Override // v71.d1
    public final n0 E(boolean z, boolean z2, f0.c cVar) {
        return T(z2, z ? new c1(cVar) : new o0(1, cVar));
    }

    @Override // v71.d1
    public final s71.h F() {
        return new kotlin.io.k(new a1.c(this, (a71.c) null, 4));
    }

    public final Object G(i1 i1Var, Object obj) {
        Throwable I;
        t tVar = obj instanceof t ? (t) obj : null;
        Throwable th = tVar != null ? tVar.a : null;
        synchronized (i1Var) {
            i1Var.c();
            ArrayList d = i1Var.d(th);
            I = I(i1Var, d);
            if (I != null && d.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(d.size()));
                int size = d.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = d.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != I && th2 != I && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        sy.u.a(I, th2);
                    }
                }
            }
        }
        if (I != null && I != th) {
            obj = new t(I, false);
        }
        if (I != null && (w(I) || Q(I))) {
            k71.k.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            t.b.compareAndSet((t) obj, 0, 1);
        }
        d0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
        Object b1Var = obj instanceof a1 ? new b1((a1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, i1Var, b1Var) && atomicReferenceFieldUpdater.get(this) == i1Var) {
        }
        C(i1Var, obj);
        return obj;
    }

    public final Object H() {
        Object obj = r.get(this);
        if (obj instanceof a1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof t) {
            throw ((t) obj).a;
        }
        return b0.J(obj);
    }

    public final Throwable I(i1 i1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (i1Var.c()) {
                return new JobCancellationException(z(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean J() {
        return true;
    }

    public boolean L() {
        return this instanceof r;
    }

    @Override // v71.d1
    public final CancellationException N() {
        CancellationException cancellationException;
        Object obj = r.get(this);
        if (!(obj instanceof i1)) {
            if (obj instanceof a1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof t)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((t) obj).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new JobCancellationException(z(), th, this) : cancellationException;
        }
        Throwable b = ((i1) obj).b();
        if (b == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = b instanceof CancellationException ? (CancellationException) b : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = z();
        }
        return new JobCancellationException(concat, b, this);
    }

    @Override // v71.d1
    public final Object O(c71.c cVar) {
        Object obj;
        w61.a0 a0Var;
        do {
            obj = r.get(this);
            boolean z = obj instanceof a1;
            a0Var = w61.a0.a;
            if (!z) {
                b0.m(cVar.q());
                return a0Var;
            }
        } while (j0(obj) < 0);
        l lVar = new l(1, b4.T(cVar));
        lVar.t();
        lVar.w(new i(2, b0.u(this, true, new n(lVar, 1))));
        Object s2 = lVar.s();
        b71.a aVar = b71.a.r;
        if (s2 != aVar) {
            s2 = a0Var;
        }
        return s2 == aVar ? s2 : a0Var;
    }

    public final l1 P(a1 a1Var) {
        l1 g = a1Var.g();
        if (g != null) {
            return g;
        }
        if (a1Var instanceof p0) {
            return new l1();
        }
        if (a1Var instanceof f1) {
            h0((f1) a1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + a1Var).toString());
    }

    public boolean Q(Throwable th) {
        return false;
    }

    public void R(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void S(d1 d1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        n1 n1Var = n1.r;
        if (d1Var == null) {
            atomicReferenceFieldUpdater.set(this, n1Var);
            return;
        }
        d1Var.start();
        o e0 = d1Var.e0(this);
        atomicReferenceFieldUpdater.set(this, e0);
        if (U()) {
            e0.a();
            atomicReferenceFieldUpdater.set(this, n1Var);
        }
    }

    public final n0 T(boolean z, f1 f1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n1 n1Var;
        boolean z2;
        boolean c;
        f1Var.u = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof p0;
            n1Var = n1.r;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof a1)) {
                    z2 = false;
                    break;
                }
                a1 a1Var = (a1) obj;
                l1 g = a1Var.g();
                if (g == null) {
                    h0((f1) obj);
                } else {
                    if (f1Var.k()) {
                        i1 i1Var = a1Var instanceof i1 ? (i1) a1Var : null;
                        Throwable b = i1Var != null ? i1Var.b() : null;
                        if (b == null) {
                            c = g.c(f1Var, 5);
                        } else if (z) {
                            f1Var.l(b);
                            return n1Var;
                        }
                    } else {
                        c = g.c(f1Var, 1);
                    }
                    if (c) {
                        break;
                    }
                }
            } else {
                p0 p0Var = (p0) obj;
                if (p0Var.r) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                g0(p0Var);
            }
        }
        if (z2) {
            return f1Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = obj2 instanceof t ? (t) obj2 : null;
            f1Var.l(tVar != null ? tVar.a : null);
        }
        return n1Var;
    }

    public final boolean U() {
        return !(r.get(this) instanceof a1);
    }

    public boolean V() {
        return this instanceof g;
    }

    public final boolean X(Object obj) {
        Object l0;
        do {
            l0 = l0(r.get(this), obj);
            if (l0 == b0.d) {
                return false;
            }
            if (l0 == b0.e) {
                return true;
            }
        } while (l0 == b0.f);
        n(l0);
        return true;
    }

    public final Object Y(Object obj) {
        Object l0;
        do {
            l0 = l0(r.get(this), obj);
            if (l0 == b0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                t tVar = obj instanceof t ? (t) obj : null;
                throw new IllegalStateException(str, tVar != null ? tVar.a : null);
            }
        } while (l0 == b0.f);
        return l0;
    }

    public String Z() {
        return getClass().getSimpleName();
    }

    public final a71.h b0(a71.g gVar) {
        return k21.f.x(this, gVar);
    }

    public final void c0(l1 l1Var, Throwable th) {
        l1Var.c(new a81.h(4), 4);
        Object obj = a81.j.r.get(l1Var);
        k71.k.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (a81.j jVar = (a81.j) obj; !jVar.equals(l1Var); jVar = jVar.h()) {
            if ((jVar instanceof f1) && ((f1) jVar).k()) {
                try {
                    ((f1) jVar).l(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        sy.u.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jVar + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            R(completionHandlerException);
        }
        w(th);
    }

    public void d0(Object obj) {
    }

    @Override // v71.d1
    public final o e0(j1 j1Var) {
        p pVar = new p(j1Var);
        pVar.u = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                if (p0Var.r) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                g0(p0Var);
            } else {
                boolean z = obj instanceof a1;
                n1 n1Var = n1.r;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    t tVar = obj2 instanceof t ? (t) obj2 : null;
                    pVar.l(tVar != null ? tVar.a : null);
                    return n1Var;
                }
                l1 g = ((a1) obj).g();
                if (g == null) {
                    h0((f1) obj);
                } else if (!g.c(pVar, 7)) {
                    boolean c = g.c(pVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof i1) {
                        r4 = ((i1) obj3).b();
                    } else {
                        t tVar2 = obj3 instanceof t ? (t) obj3 : null;
                        if (tVar2 != null) {
                            r4 = tVar2.a;
                        }
                    }
                    pVar.l(r4);
                    if (c) {
                        break loop0;
                    }
                    return n1Var;
                }
            }
        }
        return pVar;
    }

    @Override // v71.d1
    public boolean f() {
        Object obj = r.get(this);
        return (obj instanceof a1) && ((a1) obj).f();
    }

    public void f0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [v71.z0] */
    public final void g0(p0 p0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        l1 l1Var = new l1();
        if (!p0Var.r) {
            l1Var = new z0(l1Var);
        }
        do {
            atomicReferenceFieldUpdater = r;
            if (atomicReferenceFieldUpdater.compareAndSet(this, p0Var, l1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == p0Var);
    }

    public final a71.g getKey() {
        return w.s;
    }

    public final void h0(f1 f1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        l1 l1Var = new l1();
        f1Var.getClass();
        a81.j.s.set(l1Var, f1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a81.j.r;
        atomicReferenceFieldUpdater2.set(l1Var, f1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(f1Var) == f1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(f1Var, f1Var, l1Var)) {
                    if (atomicReferenceFieldUpdater2.get(f1Var) != f1Var) {
                        break;
                    }
                }
                l1Var.e(f1Var);
                break loop0;
            }
            break;
        }
        a81.j h = f1Var.h();
        do {
            atomicReferenceFieldUpdater = r;
            if (atomicReferenceFieldUpdater.compareAndSet(this, f1Var, h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == f1Var);
    }

    @Override // v71.d1
    public final boolean isCancelled() {
        Object obj = r.get(this);
        if (obj instanceof t) {
            return true;
        }
        return (obj instanceof i1) && ((i1) obj).c();
    }

    public final int j0(Object obj) {
        boolean z = obj instanceof p0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
        if (z) {
            if (((p0) obj).r) {
                return 0;
            }
            p0 p0Var = b0.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            f0();
            return 1;
        }
        if (!(obj instanceof z0)) {
            return 0;
        }
        l1 l1Var = ((z0) obj).r;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, l1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        f0();
        return 1;
    }

    public final Object l0(Object obj, Object obj2) {
        if (!(obj instanceof a1)) {
            return b0.d;
        }
        if (((obj instanceof p0) || (obj instanceof f1)) && !(obj instanceof p) && !(obj2 instanceof t)) {
            a1 a1Var = (a1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
            Object b1Var = obj2 instanceof a1 ? new b1((a1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, a1Var, b1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != a1Var) {
                    return b0.f;
                }
            }
            d0(obj2);
            C(a1Var, obj2);
            return obj2;
        }
        a1 a1Var2 = (a1) obj;
        l1 P = P(a1Var2);
        if (P == null) {
            return b0.f;
        }
        i1 i1Var = a1Var2 instanceof i1 ? (i1) a1Var2 : null;
        if (i1Var == null) {
            i1Var = new i1(P, null);
        }
        synchronized (i1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i1.s;
            if (atomicIntegerFieldUpdater.get(i1Var) == 1) {
                return b0.d;
            }
            atomicIntegerFieldUpdater.set(i1Var, 1);
            if (i1Var != a1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, a1Var2, i1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != a1Var2) {
                        return b0.f;
                    }
                }
            }
            boolean c = i1Var.c();
            t tVar = obj2 instanceof t ? (t) obj2 : null;
            if (tVar != null) {
                i1Var.a(tVar.a);
            }
            Throwable b = c ? null : i1Var.b();
            if (b != null) {
                c0(P, b);
            }
            p a0 = a0(P);
            if (a0 != null && m0(i1Var, a0, obj2)) {
                return b0.e;
            }
            P.c(new a81.h(2), 2);
            p a02 = a0(P);
            return (a02 == null || !m0(i1Var, a02, obj2)) ? G(i1Var, obj2) : b0.e;
        }
    }

    @Override // v71.d1
    public void m(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(z(), null, this);
        }
        v(cancellationException);
    }

    public final boolean m0(i1 i1Var, p pVar, Object obj) {
        while (b0.u(pVar.v, false, new h1(this, i1Var, pVar, obj)) == n1.r) {
            pVar = a0(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    public void n(Object obj) {
    }

    public void o(Object obj) {
        n(obj);
    }

    @Override // v71.d1
    public final n0 o0(j71.c cVar) {
        return T(true, new o0(1, cVar));
    }

    public Object r() {
        return H();
    }

    public final Object s(a71.c cVar) {
        Object obj;
        do {
            obj = r.get(this);
            if (!(obj instanceof a1)) {
                if (obj instanceof t) {
                    throw ((t) obj).a;
                }
                return b0.J(obj);
            }
        } while (j0(obj) < 0);
        g1 g1Var = new g1(b4.T(cVar), this);
        g1Var.t();
        int i = 2;
        g1Var.w(new i(i, b0.u(this, true, new o0(i, g1Var))));
        Object s2 = g1Var.s();
        b71.a aVar = b71.a.r;
        return s2;
    }

    @Override // v71.d1
    public final boolean start() {
        int j0;
        do {
            j0 = j0(r.get(this));
            if (j0 == 0) {
                return false;
            }
        } while (j0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Z() + '{' + k0(r.get(this)) + '}');
        sb.append('@');
        sb.append(b0.q(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == v71.b0.e) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(Object obj) {
        a81.t tVar;
        Object obj2 = b0.d;
        if (L()) {
            do {
                Object obj3 = r.get(this);
                if (obj3 instanceof a1) {
                    if (obj3 instanceof i1) {
                        if (i1.s.get((i1) obj3) == 1) {
                        }
                    }
                    obj2 = l0(obj3, new t(D(obj), false));
                }
                obj2 = b0.d;
                break;
            } while (obj2 == b0.f);
        }
        if (obj2 == b0.d) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof i1)) {
                    if (!(obj4 instanceof a1)) {
                        tVar = b0.g;
                        break;
                    }
                    if (th == null) {
                        th = D(obj);
                    }
                    a1 a1Var = (a1) obj4;
                    if (a1Var.f()) {
                        l1 P = P(a1Var);
                        if (P != null) {
                            i1 i1Var = new i1(P, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, a1Var, i1Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != a1Var) {
                                    break;
                                }
                            }
                            c0(P, th);
                            tVar = b0.d;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object l0 = l0(obj4, new t(th, false));
                        if (l0 == b0.d) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (l0 != b0.f) {
                            obj2 = l0;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        if (i1.u.get((i1) obj4) == b0.h) {
                            tVar = b0.g;
                        } else {
                            boolean c = ((i1) obj4).c();
                            if (th == null) {
                                th = D(obj);
                            }
                            ((i1) obj4).a(th);
                            Throwable b = c ? null : ((i1) obj4).b();
                            if (b != null) {
                                c0(((i1) obj4).r, b);
                            }
                            tVar = b0.d;
                        }
                    }
                }
            }
            obj2 = tVar;
        }
        if (obj2 != b0.d && obj2 != b0.e) {
            if (obj2 == b0.g) {
                return false;
            }
            n(obj2);
            return true;
        }
        return true;
    }

    public void v(CancellationException cancellationException) {
        u(cancellationException);
    }

    public final boolean w(Throwable th) {
        if (V()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        o oVar = (o) s.get(this);
        return (oVar == null || oVar == n1.r) ? z : oVar.b(th) || z;
    }

    public final a71.f w0(a71.g gVar) {
        return k21.f.q(this, gVar);
    }

    public final Object x0(j71.e eVar, Object obj) {
        return eVar.s(obj, this);
    }

    public String z() {
        return "Job was cancelled";
    }
}
