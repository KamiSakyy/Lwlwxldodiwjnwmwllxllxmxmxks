package v71;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class j0 extends c81.i {
    public int t;

    public j0(int i) {
        super(false, 0L);
        this.t = i;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract a71.c c();

    public Throwable d(Object obj) {
        t tVar = obj instanceof t ? (t) obj : null;
        if (tVar != null) {
            return tVar.a;
        }
        return null;
    }

    public Object e(Object obj) {
        return obj;
    }

    public final void f(Throwable th) {
        b0.t(c().q(), new i71.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r4 = (v71.d1) r5.w0(v71.w.s);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            a71.c c = c();
            k71.k.e(c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            a81.f fVar = (a81.f) c;
            c71.c cVar = fVar.v;
            Object obj = fVar.x;
            a71.h q = cVar.q();
            Object n = a81.b.n(q, obj);
            d1 d1Var = null;
            y1 K = n != a81.b.d ? b0.K(cVar, q, n) : null;
            try {
                a71.h q2 = cVar.q();
                Object j = j();
                Throwable d = d(j);
                if (d == null) {
                    int i = this.t;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (d1Var != null && !d1Var.f()) {
                    CancellationException N = d1Var.N();
                    b(N);
                    cVar.i(sy.y.d(N));
                } else if (d != null) {
                    cVar.i(sy.y.d(d));
                } else {
                    cVar.i(e(j));
                }
                if (K == null || K.s0()) {
                    a81.b.g(q, n);
                }
            } catch (Throwable th) {
                if (K == null || K.s0()) {
                    a81.b.g(q, n);
                }
                throw th;
            }
        } catch (DispatchException e) {
            b0.t(c().q(), e.r);
        } catch (Throwable th2) {
            f(th2);
        }
    }
}
