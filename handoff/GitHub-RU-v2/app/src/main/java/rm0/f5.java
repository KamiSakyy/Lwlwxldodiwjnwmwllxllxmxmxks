package rm0;

import gn0.dj;
import hc0.di;
import jn0.c30;
import jn0.gc;
import jn0.hf;
import jn0.rg0;
import jn0.wo;
import jn0.yf0;
import jo.c50;
import jo.dd;
import jo.fg;
import jo.mi0;
import jo.oq;
import jo.zj0;
import kc0.en;
import kc0.mb;
import kc0.nz;
import kc0.qd;
import kc0.rc0;
import kc0.yb0;
import m10.gr;
import pz0.bm;
import u10.am;
import u10.eb;
import u10.ox;
import u10.ra0;
import u10.xc;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f5 implements z01.o0, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.bShadow t;
    public v71.v u;

    public f5(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedApolloClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedApolloClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedApolloClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedApolloClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
        }
    }

    @Override // z01.o0
    public final Object a(String str) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new y(new y00.l(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.a.b(this.s, new mb(str), null, false, null, null, new bd.m(str, 8), new s(5), 30)), 10), 27), this.u);
            case 1:
                return y71.n1Shadow.y(new t00.w3(new y00.l(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.a.b(this.s, new dd(str), null, false, null, null, new bd.m(str, 8), new sw0.e(10), 30)), 10), 8), this.u);
            case 2:
                return y71.n1Shadow.y(new vb0.u(new y00.l(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.a.b(this.s, new eb(str), null, false, null, null, new bd.m(str, 8), new v00.n(16), 30)), 10), 26), this.u);
            default:
                return y71.n1Shadow.y(new wy0.q3(new y00.l(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.a.b(this.s, new gc(str), null, false, null, null, new bd.m(str, 8), new wa.g(22), 30)), 10), 3), this.u);
        }
    }

    @Override // z01.o0
    public final Object b(String str, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new nz(new aa.u0(str2), f1.e.g("type:org ", str)), null, false, null, null, 62), 10), 1), this.u);
            case 1:
                return y71.n1Shadow.y(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.s, new c50(new aa.u0(str2), f1.e.g("type:org ", str)), null, false, null, null, 62), 10), 12), this.u);
            case 2:
                return y71.n1Shadow.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new ox(new aa.u0(str2), f1.e.g("type:org ", str)), null, false, null, null, 62), 10), 0), this.u);
            default:
                return y71.n1Shadow.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.s, new c30(new aa.u0(str2), f1.e.g("type:org ", str)), null, false, null, null, 62), 10), 7), this.u);
        }
    }

    @Override // z01.o0
    public final y71.i c(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                dj.Companion.getClass();
                ai0.b bVar = new ai0.b(new ai0.c(new ai0.d("Organization", str, new ci0.a(str, ((aa.q) dj.m).a, true))));
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.t.k(new ai0.e(str), bVar))), this.u);
            case 1:
                k71.k.g(str, "id");
                gr.Companion.getClass();
                aa.m0 bVar2 = new ru.b(new ru.c(new ru.d("Organization", str, new tu.a(str, ((aa.q) gr.o).a, true))));
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.t.k(new ru.e(str), bVar2))), this.u);
            case 2:
                k71.k.g(str, "id");
                di.Companion.getClass();
                aa.m0 bVar3 = new i70.b(new i70.c(new i70.d("Organization", str, new k70.a(str, ((aa.q) di.m).a, true))));
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.t.k(new i70.e(str), bVar3))), this.u);
            default:
                k71.k.g(str, "id");
                bm.Companion.getClass();
                it0.b bVar4 = new it0.b(new it0.c(new it0.d("Organization", str, new kt0.a(str, ((aa.q) bm.o).a, true))));
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.t.k(new it0.e(str), bVar4))), this.u);
        }
    }

    @Override // z01.o0
    public final y71.i d(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                dj.Companion.getClass();
                ai0.g gVar = new ai0.g(new ai0.i(new ai0.h("Organization", str, new ci0.a(str, ((aa.q) dj.m).a, false))));
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.t.k(new ai0.j(str), gVar))), this.u);
            case 1:
                k71.k.g(str, "id");
                gr.Companion.getClass();
                aa.m0 gVar2 = new ru.g(new ru.i(new ru.h("Organization", str, new tu.a(str, ((aa.q) gr.o).a, false))));
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.t.k(new ru.j(str), gVar2))), this.u);
            case 2:
                k71.k.g(str, "id");
                di.Companion.getClass();
                aa.m0 gVar3 = new i70.g(new i70.i(new i70.h("Organization", str, new k70.a(str, ((aa.q) di.m).a, false))));
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.t.k(new i70.j(str), gVar3))), this.u);
            default:
                k71.k.g(str, "id");
                bm.Companion.getClass();
                it0.g gVar4 = new it0.g(new it0.i(new it0.h("Organization", str, new kt0.a(str, ((aa.q) bm.o).a, false))));
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.t.k(new it0.j(str), gVar4))), this.u);
        }
    }

    @Override // z01.o0
    public final Object e(String str) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new rc0(new aa.u0(str)), null, false, null, null, 58), 10), 0), this.u);
            case 1:
                return y71.n1Shadow.y(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.s, new zj0(new aa.u0(str)), null, false, null, null, 58), 10), 11), this.u);
            case 2:
                return y71.n1Shadow.y(new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new ra0(new aa.u0(str)), null, false, null, null, 58), 10), 29), this.u);
            default:
                return y71.n1Shadow.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.s, new rg0(new aa.u0(str)), null, false, null, null, 58), 10), 6), this.u);
        }
    }

    @Override // z01.o0
    public final Object f(String str, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new en(new aa.u0(str2), str), null, false, null, null, 62), 10), 29), this.u);
            case 1:
                return y71.n1Shadow.y(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.s, new oq(new aa.u0(str2), str), null, false, null, null, 62), 10), 10), this.u);
            case 2:
                return y71.n1Shadow.y(new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new am(new aa.u0(str2), str), null, false, null, null, 62), 10), 28), this.u);
            default:
                return y71.n1Shadow.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.s, new wo(new aa.u0(str2), str), null, false, null, null, 62), 10), 5), this.u);
        }
    }

    @Override // z01.o0
    public final y71.i g(String str) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new y(new y00.l(com.github.service.wrapper.a.o(this.t, new qd(str), ga.h.r, false, null, null, 56), 10), 28), this.u);
            case 1:
                return y71.n1Shadow.y(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.t, new fg(str), ga.h.r, false, null, null, 56), 10), 9), this.u);
            case 2:
                return y71.n1Shadow.y(new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.t, new xc(str), ga.h.r, false, null, null, 56), 10), 27), this.u);
            default:
                return y71.n1Shadow.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.t, new hf(str), ga.h.r, false, null, null, 56), 10), 4), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
