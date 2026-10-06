package t00;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jo.bj;
import jo.gi;
import jo.mi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q2 implements z01.z, mi0 {
    public static final n2 Companion = new n2();
    public com.github.service.wrapper.j r;
    public v71.v s;
    public v71.d1 t;

    public q2(com.github.service.wrapper.j jVar, v71.v vVar) {
        k71.k.g(jVar, "client");
        k71.k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = vVar;
    }

    public final y71.i a(String str, String str2) {
        return y71.n1.y(new rm0.v9(new y00.l(com.github.service.wrapper.a.o(this.r, new gi(str, str2 == null ? aa.t0.d : new aa.u0(str2)), (ga.h) null, true, (LinkedHashSet) null, (Set) null, 58), 10), 27), this.s);
    }

    public final y71.i b(String str, boolean z) {
        k71.k.g(str, "query");
        v71.d1 d1Var = this.t;
        if (d1Var != null) {
            d1Var.m((CancellationException) null);
        }
        this.t = null;
        return y71.n1.y(new rm0.f3(new y71.y(new com.github.rudroid.d0(this, (a71.c) null, 8), com.github.service.wrapper.a.o(this.r, new bj("type:issue ".concat(str), "type:pr ".concat(str), str, "type:user ".concat(str), "type:org ".concat(str), str, z), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62)), 3), this.s);
    }

    public final Object h() {
        return this;
    }
}
