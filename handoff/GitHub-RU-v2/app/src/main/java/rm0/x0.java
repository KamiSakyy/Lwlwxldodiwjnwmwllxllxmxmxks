package rm0;

import java.util.List;
import jn0.pr;
import jn0.yf0;
import jo.bb;
import jo.mi0;
import jo.nt;
import kc0.np;
import kc0.yb0;
import u10.jo;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 implements z01.m, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final v71.v t;

    public x0(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
        }
    }

    @Override // z01.m
    public final Object a(String str, String str2, List list) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new bz0.t(in.r.h(this.s.d(new np(str, list, str2 == null ? aa.t0.d : new aa.u0(str2)))), 25), this.t);
            case 1:
                return y71.n1.y(new o3(in.r.h(this.s.d(new nt(str, list, str2 == null ? aa.t0.d : new aa.u0(str2)))), 23), this.t);
            case 2:
                return y71.n1.y(new t00.g3(in.r.h(this.s.d(new jo(str, list, str2 == null ? aa.t0.d : new aa.u0(str2)))), 27), this.t);
            default:
                return y71.n1.y(new vb0.p1(in.r.h(this.s.d(new pr(str, list, str2 == null ? aa.t0.d : new aa.u0(str2)))), 28), this.t);
        }
    }

    @Override // z01.m
    public final Object b(String str, String str2, List list) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new bz0.t(in.r.h(this.s.d(new kc0.n2(str, list, str2 == null ? aa.t0.d : new aa.u0(str2)))), 24), this.t);
            case 1:
                return y71.n1.y(new o3(in.r.h(this.s.d(new jo.y2(str, list, str2 == null ? aa.t0.d : new aa.u0(str2)))), 22), this.t);
            case 2:
                return y71.n1.y(new t00.g3(in.r.h(this.s.d(new u10.n2(str, list, str2 == null ? aa.t0.d : new aa.u0(str2)))), 26), this.t);
            default:
                return y71.n1.y(new vb0.p1(in.r.h(this.s.d(new jn0.t2(str, list, str2 == null ? aa.t0.d : new aa.u0(str2)))), 27), this.t);
        }
    }

    @Override // z01.m
    public final Object c(String str) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new gl.f(com.github.service.wrapper.a.o(this.s, new kc0.k9(new aa.u0((Object) null), str), null, false, null, null, 58), 20), this.t);
            case 1:
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.s, new bb(new aa.u0((Object) null), str), null, false, null, null, 58), 2), this.t);
            case 2:
                return y71.n1.y(new t00.h7(com.github.service.wrapper.a.o(this.s, new u10.c9(new aa.u0((Object) null), str), null, false, null, null, 58), 21), this.t);
            default:
                return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new jn0.eaShadow(new aa.u0((Object) null), str), null, false, null, null, 58), 7), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
