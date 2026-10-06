package vb0;

import java.util.concurrent.CancellationException;
import u10.ku;
import u10.tl;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x6 implements z01.d1, y90 {
    public com.github.service.wrapper.j r;
    public v71.v s;
    public v71.d1 t;

    public x6(com.github.service.wrapper.j jVar, v71.v vVar) {
        k71.k.g(jVar, "client");
        k71.k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = vVar;
    }

    @Override // z01.d1
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
        return y71.n1.y(new rm0.f3(new y71.y(new v6(this, null, 1), com.github.service.wrapper.a.o(this.r, new tl(str, u0Var, bVar), null, false, null, null, 58)), 8), this.s);
    }

    @Override // z01.d1
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
        return y71.n1.y(new t00.f8(9, new rm0.f3(new y71.y(new v6(this, null, 0), com.github.service.wrapper.a.o(this.r, new ku(i, u0Var, bVar, str, str2), null, false, null, null, 58)), 7)), this.s);
    }

    @Override // z01.d1
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
