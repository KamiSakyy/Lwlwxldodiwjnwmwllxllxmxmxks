package t00;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jo.hq;
import jo.j00;
import jo.mi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o7 implements z01.d1, mi0 {
    public com.github.service.wrapper.j r;
    public v71.v s;
    public v71.d1 t;

    public o7(com.github.service.wrapper.j jVar, v71.v vVar) {
        k71.k.g(jVar, "client");
        k71.k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = vVar;
    }

    public final y71.i a(String str, String str2, String str3) {
        k71.k.g(str, "login");
        v71.d1 d1Var = this.t;
        if (d1Var != null) {
            d1Var.m((CancellationException) null);
        }
        this.t = null;
        aa1.b bVar = aa.t0.d;
        aa1.b u0Var = str2 == null ? bVar : new aa.u0(str2);
        if (str3 != null) {
            bVar = new aa.u0(str3);
        }
        return y71.n1.y(new rm0.f3(new y71.y(new m7Shadow(this, null, 1), com.github.service.wrapper.a.o(this.r, new hq(str, u0Var, bVar), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58)), 5), this.s);
    }

    public final y71.i b(int i, String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        v71.d1 d1Var = this.t;
        if (d1Var != null) {
            d1Var.m((CancellationException) null);
        }
        this.t = null;
        aa1.b bVar = aa.t0.d;
        aa1.b u0Var = str3 == null ? bVar : new aa.u0(str3);
        if (str4 != null) {
            bVar = new aa.u0(str4);
        }
        return y71.n1.y(new cn.q(new rm0.f3(new y71.y(new m7Shadow(this, null, 0), com.github.service.wrapper.a.o(this.r, new j00(i, u0Var, bVar, str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58)), 4), 29), this.s);
    }

    public final void c() {
        v71.d1 d1Var = this.t;
        if (d1Var != null) {
            d1Var.m((CancellationException) null);
        }
        this.t = null;
    }

    public final Object h() {
        return this;
    }
}
