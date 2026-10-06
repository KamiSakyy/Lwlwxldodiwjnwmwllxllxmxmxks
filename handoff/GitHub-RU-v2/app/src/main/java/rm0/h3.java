package rm0;

import java.util.concurrent.CancellationException;
import kc0.ng;
import kc0.sf;
import kc0.yb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h3 implements z01.z, yb0 {
    public static final d3 Companion = new d3();
    public final com.github.service.wrapper.j r;
    public final v71.v s;
    public v71.d1Shadow t;

    public h3(com.github.service.wrapper.j jVar, v71.v vVar) {
        k71.k.g(jVar, "client");
        k71.k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = vVar;
    }

    @Override // z01.z
    public final y71.i a(String str, String str2) {
        return y71.n1.y(new y(new y00.l(com.github.service.wrapper.a.o(this.r, new sf(str, str2 == null ? aa.t0.d : new aa.u0(str2)), null, true, null, null, 58), 10), 18), this.s);
    }

    @Override // z01.z
    public final y71.i b(String str, boolean z) {
        k71.k.g(str, "query");
        v71.d1Shadow d1Var = this.t;
        if (d1Var != null) {
            d1Var.m((CancellationException) null);
        }
        this.t = null;
        return y71.n1.y(new f3(new y71.y(new com.github.rudroid.d0(this, (a71.c) null, 7), com.github.service.wrapper.a.o(this.r, new ng("type:issue ".concat(str), "type:pr ".concat(str), str, "type:user ".concat(str), "type:org ".concat(str), str, z), null, false, null, null, 62)), 0), this.s);
    }

    public final Object h() {
        return this;
    }
}
