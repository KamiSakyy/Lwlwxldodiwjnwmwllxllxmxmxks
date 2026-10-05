package a81;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import v71.b0;
import v71.d1;
import v71.t1;
import v71.v0;
import v71.y1;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class b {
    public static final t a = new t(0, "CLOSED", false);
    public static final t b = new t(0, "UNDEFINED", false);
    public static final t c = new t(0, "REUSABLE_CLAIMED", false);
    public static final t d = new t(0, "NO_THREAD_ELEMENTS", false);
    public static final a00.a e = new a00.a(4, (byte) 0);
    public static final a00.a f = new a00.a(5, (byte) 0);
    public static final a00.a g = new a00.a(6, (byte) 0);

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(no.a.k("Expected positive parallelism level, but got ", i).toString());
        }
    }

    public static final Object b(r rVar, long j, j71.e eVar) {
        while (true) {
            if (rVar.t >= j && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.r;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            t tVar = a;
            if (obj == tVar) {
                return tVar;
            }
            r rVar2 = (r) ((c) obj);
            if (rVar2 == null) {
                rVar2 = (r) eVar.s(Long.valueOf(rVar.t + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.d()) {
                    rVar.e();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(a71.h hVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = e.a.iterator();
        while (it.hasNext()) {
            try {
                ((v71.x) it.next()).i0(hVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    sy.u.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            sy.u.a(th, new DiagnosticCoroutineContextException(hVar));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(a71.h hVar, Object obj) {
        if (obj == d) {
            return;
        }
        if (!(obj instanceof y)) {
            Object x0 = hVar.x0(f, (Object) null);
            k71.k.e(x0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((v) x0).a(obj);
            return;
        }
        y yVar = (y) obj;
        v[] vVarArr = yVar.c;
        int length = vVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            v vVar = vVarArr[length];
            k71.k.d(vVar);
            vVar.a(yVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final void h(a71.c cVar, Object obj) {
        if (!(cVar instanceof f)) {
            cVar.i(obj);
            return;
        }
        f fVar = (f) cVar;
        v71.v vVar = fVar.u;
        c71.c cVar2 = fVar.v;
        Throwable a2 = w61.n.a(obj);
        Object tVar = a2 == null ? obj : new v71.t(a2, false);
        if (j(vVar, cVar2.q())) {
            fVar.w = tVar;
            fVar.t = 1;
            i(vVar, cVar2.q(), fVar);
            return;
        }
        v0 a3 = t1.a();
        if (a3.t >= 4294967296L) {
            fVar.w = tVar;
            fVar.t = 1;
            a3.O0(fVar);
            return;
        }
        a3.Q0(true);
        try {
            d1 d1Var = (d1) cVar2.q().w0(v71.w.s);
            if (d1Var == null || d1Var.f()) {
                Object obj2 = fVar.x;
                a71.h q = cVar2.q();
                Object n = n(q, obj2);
                y1 K = n != d ? b0.K(cVar2, q, n) : null;
                try {
                    cVar2.i(obj);
                } finally {
                    if (K == null || K.s0()) {
                        g(q, n);
                    }
                }
            } else {
                fVar.i(sy.y.d(d1Var.N()));
            }
            while (a3.S0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void i(v71.v vVar, a71.h hVar, Runnable runnable) {
        try {
            vVar.J0(hVar, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, vVar, hVar);
        }
    }

    public static final boolean j(v71.v vVar, a71.h hVar) {
        try {
            return vVar.L0(hVar);
        } catch (Throwable th) {
            throw new DispatchException(th, vVar, hVar);
        }
    }

    public static final long k(String str, long j, long j2, long j3) {
        String str2;
        int i = u.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long H = t71.w.H(str2);
        if (H == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = H.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static int l(int i, String str, int i2) {
        return (int) k(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object m(a71.h hVar) {
        Object x0 = hVar.x0(e, 0);
        k71.k.d(x0);
        return x0;
    }

    public static final Object n(a71.h hVar, Object obj) {
        if (obj == null) {
            obj = m(hVar);
        }
        if (obj == 0) {
            return d;
        }
        if (!(obj instanceof Integer)) {
            return ((v) obj).b(hVar);
        }
        return hVar.x0(g, new y(((Number) obj).intValue(), hVar));
    }
}
