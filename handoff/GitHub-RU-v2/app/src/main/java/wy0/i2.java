package wy0;

import java.util.concurrent.CancellationException;
import jn0.ei;
import jn0.jh;
import jn0.yf0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i2 implements z01.z, yf0 {
    public static final f2 Companion = new f2();
    public com.github.service.wrapper.j r;
    public v71.v s;
    public v71.d1 t;

    public i2(com.github.service.wrapper.j jVar, v71.v vVar) {
        k71.k.g(jVar, "client");
        k71.k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = vVar;
    }

    @Override // z01.z
    public final y71.i a(String str, String str2) {
        return y71.n1.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.r, new jh(str, str2 == null ? aa.t0.d : new aa.u0(str2)), null, true, null, null, 58), 10), 24), this.s);
    }

    @Override // z01.z
    public final y71.i b(String str, boolean z) {
        k71.k.g(str, "query");
        v71.d1 d1Var = this.t;
        if (d1Var != null) {
            d1Var.m((CancellationException) null);
        }
        this.t = null;
        return y71.n1.y(new rm0.f3(new y71.y(new com.github.rudroid.d0(this, (a71.c) null, 10), com.github.service.wrapper.a.o(this.r, new ei("type:issue ".concat(str), "type:pr ".concat(str), str, "type:user ".concat(str), "type:org ".concat(str), str, z), null, false, null, null, 62)), 9), this.s);
    }

    public final Object h() {
        return this;
    }
}
