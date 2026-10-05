package t00;

import java.util.LinkedHashSet;
import java.util.Set;
import jn0.yf0;
import jo.mi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l5 implements z01.q0, mi0, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final com.github.service.wrapper.b t;
    public final v71.v u;

    public l5(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
        }
    }

    public final y71.i a(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repositoryName");
                rz.v0 v0Var = new rz.v0(30, new aa.u0(str3), new aa.u0((Object) null), str2, str);
                return y71.n1.y(in.r.g(new f8(new m7.x(this, v0Var, (a71.c) null, 11)), new sw0.e(17), new sw0.e(18), new a0.p0(this, str, str2, str3, 12), new f1.f4(13, this, v0Var)), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repositoryName");
                ux0.v0 v0Var2 = new ux0.v0(30, new aa.u0(str3), new aa.u0((Object) null), str2, str);
                return y71.n1.y(in.r.g(new f8(new m7.x(this, v0Var2, (a71.c) null, 19)), new wa.g(29), new wy0.p4(0), new a0.p0(this, str, str2, str3, 14), new f1.f4(15, this, v0Var2)), this.u);
        }
    }

    public final y71.i b(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repositoryName");
                return y71.n1.y(new b10.b(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.b.q(this.t, new rz.v0(30, new aa.u0(str3), aa.t0.d, str2, str), ga.h.t, false, (Set) null, (Set) null, new bd.m(str, 8), new sw0.e(19), 28)), 8), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repositoryName");
                return y71.n1.y(new b10.b(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.b.q(this.t, new ux0.v0(30, new aa.u0(str3), aa.t0.d, str2, str), ga.h.t, false, (Set) null, (Set) null, new bd.m(str, 8), new wy0.p4(1), 28)), 13), this.u);
        }
    }

    public final y71.i c(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repositoryName");
                return y71.n1.y(in.r.l(new y00.l(com.github.service.wrapper.a.o(this.t, new rz.v0(30, new aa.u0(str3), aa.t0.d, str2, str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10)), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repositoryName");
                return y71.n1.y(in.r.l(new y00.l(com.github.service.wrapper.a.o(this.t, new ux0.v0(30, new aa.u0(str3), aa.t0.d, str2, str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10)), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
