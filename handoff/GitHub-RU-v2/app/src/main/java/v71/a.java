package v71;

import com.google.android.gms.internal.measurement.b4;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class a extends j1 implements a71.c, z {
    public a71.h t;

    public a(a71.h hVar, boolean z) {
        super(z);
        S((d1) hVar.w0(w.s));
        this.t = hVar.A(this);
    }

    @Override // v71.z
    public final a71.h K() {
        return this.t;
    }

    @Override // v71.j1
    public final void R(CompletionHandlerException completionHandlerException) {
        b0.t(this.t, completionHandlerException);
    }

    @Override // v71.j1
    public final void d0(Object obj) {
        if (!(obj instanceof t)) {
            p0(obj);
        } else {
            t tVar = (t) obj;
            n0(tVar.a, t.b.get(tVar) == 1);
        }
    }

    public final void i(Object obj) {
        Throwable a = w61.n.a(obj);
        if (a != null) {
            obj = new t(a, false);
        }
        Object Y = Y(obj);
        if (Y == b0.e) {
            return;
        }
        o(Y);
    }

    public void n0(Throwable th, boolean z) {
    }

    public void p0(Object obj) {
    }

    public final a71.h q() {
        return this.t;
    }

    public final void q0(a0Shadow a0Var, a aVar, j71.e eVar) {

        Object th = null;
        Object s;
        int ordinal = a0Var.ordinal();
        w61.a0Shadow a0Var2 = w61.a0.a;
        if (ordinal == 0) {
            try {
                a81.bShadow.h(b4.T(b4.G(aVar, this, eVar)), a0Var2);
                return;
            } finally {
                th = th;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).r;
                }
                i(sy.y.d(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                k71.k.g(eVar, "<this>");
                b4.T(b4.G(aVar, this, eVar)).i(a0Var2);
                return;
            }
            if (ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                a71.h hVar = this.t;
                Object n = a81.bShadow.n(hVar, null);
                try {
                    if (eVar instanceof c71.a) {
                        k71.z.c(2, eVar);
                        s = eVar.s(aVar, this);
                    } else {
                        s = b4.u0(eVar, aVar, this);
                    }
                    a81.bShadow.g(hVar, n);
                    if (s != b71.a.r) {
                        i(s);
                    }
                } catch (Throwable th) {
                    a81.bShadow.g(hVar, n);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // v71.j1
    public final String z() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public a(Object... a) {
    }
    public static final Object u = null;
}
