package rm0;

import java.util.concurrent.CancellationException;
import kc0.xm;
import kc0.yb0;
import kc0.yv;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e9 implements z01.d1, yb0 {
    public final com.github.service.wrapper.j r;
    public final v71.v s;
    public v71.d1Shadow t;

    public e9(com.github.service.wrapper.j jVar, v71.v vVar) {
        k71.k.g(jVar, "client");
        k71.k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = vVar;
    }

    @Override // z01.d1
    public final y71.i a(String str, String str2, String str3) {
        k71.k.g(str, "login");
        v71.d1Shadow d1Var = this.t;
        if (d1Var != null) {
            d1Var.m((CancellationException) null);
        }
        this.t = null;
        aa1.bShadow bVar = aa.t0.d;
        aa1.bShadow u0Var = str2 == null ? bVar : new aa.u0(str2);
        if (str3 != null) {
            bVar = new aa.u0(str3);
        }
        return y71.n1.y(new f3(new y71.y(new c9(this, null, 1), com.github.service.wrapper.a.o(this.r, new xm(str, u0Var, bVar), null, false, null, null, 58)), 2), this.s);
    }

    @Override // z01.d1
    public final y71.i b(int i, String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        v71.d1Shadow d1Var = this.t;
        if (d1Var != null) {
            d1Var.m((CancellationException) null);
        }
        this.t = null;
        aa1.bShadow bVar = aa.t0.d;
        aa1.bShadow u0Var = str3 == null ? bVar : new aa.u0(str3);
        if (str4 != null) {
            bVar = new aa.u0(str4);
        }
        return y71.n1.y(new cn.q(new f3(new y71.y(new c9(this, null, 0), com.github.service.wrapper.a.o(this.r, new yv(i, u0Var, bVar, str, str2), null, false, null, null, 58)), 1), 23), this.s);
    }

    @Override // z01.d1
    public final void c() {
        v71.d1Shadow d1Var = this.t;
        if (d1Var != null) {
            d1Var.m((CancellationException) null);
        }
        this.t = null;
    }

    public final Object h() {
        return this;
    }
}
