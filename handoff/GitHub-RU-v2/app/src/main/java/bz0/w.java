package bz0;

import aa.n0;
import aa.t0;
import aa.u0;
import ap0.y0;
import b6.v0;
import com.github.service.models.response.PullsWidgetFilter;
import gn0.s00;
import hc0.kz;
import java.time.ZonedDateTime;
import jn0.bv;
import jn0.dd;
import jn0.dh;
import jn0.gg0;
import jn0.j30;
import jn0.jf0;
import jn0.kg0;
import jn0.m3;
import jn0.m70;
import jn0.nw;
import jn0.s70;
import jn0.sf0;
import jn0.t70;
import jn0.u70;
import jn0.ug;
import jn0.v70;
import jn0.vq;
import jn0.vw;
import jn0.wg;
import jn0.xg;
import jn0.ye0;
import jn0.yf0;
import jn0.yg;
import jn0.z70;
import jn0.zg;
import kc0.c40;
import kc0.cf;
import kc0.du;
import kc0.ef;
import kc0.ff;
import kc0.g3;
import kc0.gc0;
import kc0.gf;
import kc0.hf;
import kc0.jb0;
import kc0.jc;
import kc0.kc0;
import kc0.lu;
import kc0.mf;
import kc0.qs;
import kc0.sb0;
import kc0.t30;
import kc0.uz;
import kc0.v30;
import kc0.w30;
import kc0.x30;
import kc0.y30;
import kc0.ya0;
import kc0.yb0;
import pz0.w80;
import t00.f8;
import u10.a20;
import u10.bc;
import u10.e20;
import u10.ga0;
import u10.j90;
import u10.je;
import u10.ka0;
import u10.le;
import u10.me;
import u10.mr;
import u10.ne;
import u10.oe;
import u10.os;
import u10.s90;
import u10.se;
import u10.v10;
import u10.vx;
import u10.ws;
import u10.x10;
import u10.y10;
import u10.y80;
import u10.y90;
import u10.z10;
import vb0.e2;
import vb0.p1;
import wy0.h1;
import xn.e1;
import y41.t1;
import y71.n1;
import z01.r1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w implements r1, yf0, yb0, y90 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.b t;
    public v71.v u;
    public Object v;

    public w(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new c0(bVar, 5);
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new c0(bVar, 7);
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new c0(bVar, 0);
                break;
        }
    }

    @Override // z01.r1
    public final Object A(String str, String str2, lm.i iVar) {
        switch (this.r) {
            case 0:
                return n1.y(new e(com.github.service.wrapper.a.o(this.s, new j30(new u0(str2), f1.e.g("type:user ", str)), null, false, null, null, 58), 7), this.u);
            case 1:
                return n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new uz(new u0(str2), f1.e.g("type:user ", str)), null, false, null, null, 58), 2), this.u);
            default:
                return n1.y(new y00.l(com.github.service.wrapper.a.o(this.s, new vx(new u0(str2), f1.e.g("type:user ", str)), null, false, null, null, 58), 18), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i a(String str) {
        switch (this.r) {
            case 0:
                k71.w v = no.a.v(str, "userId");
                v.r = new c(1, null, 1);
                return n1.y(in.r.l(in.r.h(new y71.y(new y71.y(new a(v, this, str, null, 1), this.t.d(new dh(str))), new b(v, null, 1)))), this.u);
            case 1:
                k71.w v2 = no.a.v(str, "userId");
                v2.r = new c(1, null, 10);
                return n1.y(in.r.l(in.r.h(new y71.y(new y71.y(new vm0.a(v2, this, str, null, 1), this.t.d(new mf(str))), new b(v2, null, 5)))), this.u);
            default:
                k71.w v3 = no.a.v(str, "userId");
                v3.r = new c(1, null, 26);
                return n1.y(in.r.l(in.r.h(new y71.y(new y71.y(new zb0.a(v3, this, str, null, 1), this.t.d(new se(str))), new b(v3, null, 13)))), this.u);
        }
    }

    @Override // z01.r1
    public final Object b(String str, gn.q qVar) {
        switch (this.r) {
            case 0:
                zg zgVar = new zg(str);
                w80.Companion.getClass();
                return n1.y(new t(in.r.h(this.t.k(zgVar, new wg(new xg(new yg("User", str, new y0(str, ((aa.q) w80.W).a, true)))))), 0), this.u);
            case 1:
                hf hfVar = new hf(str);
                s00.Companion.getClass();
                return n1.y(new p1(in.r.h(this.t.k(hfVar, new ef(new ff(new gf("User", str, new sd0.q(str, ((aa.q) s00.P).a, true)))))), 22), this.u);
            default:
                n0 oeVar = new oe(str);
                kz.Companion.getClass();
                return n1.y(new h1(in.r.h(this.t.k(oeVar, new le(new me(new ne("User", str, new c30.h(str, ((aa.q) kz.O).a, true)))))), 28), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i c(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "login");
                return n1.y(new e(com.github.service.wrapper.b.a(this.t, new jf0(new u0(100), str), ga.h.t, false, null, 56), 11), this.u);
            case 1:
                k71.k.g(str, "login");
                return n1.y(new vm0.h(com.github.service.wrapper.b.a(this.t, new jb0(new u0(100), str), ga.h.t, false, null, 56), 6), this.u);
            default:
                k71.k.g(str, "login");
                return n1.y(new y00.l(com.github.service.wrapper.b.a(this.t, new j90(new u0(100), str), ga.h.t, false, null, 56), 22), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i d() {
        switch (this.r) {
            case 0:
                return t1.S("refreshViewerCopilotPermissions", "3.17");
            case 1:
                return t1.S("refreshViewerCopilotPermissions", "3.12");
            default:
                return t1.S("refreshViewerCopilotPermissions", "3.10");
        }
    }

    @Override // z01.r1
    public final Object e(String str, String str2, gn.i iVar) {
        switch (this.r) {
            case 0:
                return t1.S("fetchSponsorables", "3.17");
            case 1:
                return t1.S("fetchSponsorables", "3.12");
            default:
                return t1.S("fetchSponsorables", "3.10");
        }
    }

    @Override // z01.r1
    public final Object f(String str, String str2, gn.k kVar) {
        switch (this.r) {
            case 0:
                return n1.y(new e(com.github.service.wrapper.a.o(this.s, new nw(new u0(str2), str), null, false, null, null, 58), 4), this.u);
            case 1:
                return n1.y(new e2(com.github.service.wrapper.a.o(this.s, new du(new u0(str2), str), null, false, null, null, 58), 29), this.u);
            default:
                return n1.y(new y00.l(com.github.service.wrapper.a.o(this.s, new os(new u0(str2), str), null, false, null, null, 58), 15), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i g() {
        switch (this.r) {
            case 0:
                return n1.y(new e(com.github.service.wrapper.a.o(this.s, new ye0(), null, false, null, null, 62), 6), this.u);
            case 1:
                return n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new ya0(), null, false, null, null, 62), 1), this.u);
            default:
                return n1.y(new y00.l(com.github.service.wrapper.a.o(this.s, new y80(), null, false, null, null, 62), 17), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    @Override // z01.r1
    public final Object i(String str, String str2, gn.o oVar) {
        switch (this.r) {
            case 0:
                return n1.y(new e(com.github.service.wrapper.a.o(this.s, new vw(new u0(str2), str), null, false, null, null, 58), 10), this.u);
            case 1:
                return n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new lu(new u0(str2), str), null, false, null, null, 58), 5), this.u);
            default:
                return n1.y(new y00.l(com.github.service.wrapper.a.o(this.s, new ws(new u0(str2), str), null, false, null, null, 58), 21), this.u);
        }
    }

    @Override // z01.r1
    public final Object j(String str, String str2, gn.e eVar) {
        switch (this.r) {
            case 0:
                return n1.y(new e(com.github.service.wrapper.a.o(this.s, new ug(new u0(str2), str), null, false, null, null, 58), 3), this.u);
            case 1:
                return n1.y(new e2(com.github.service.wrapper.a.o(this.s, new cf(new u0(str2), str), null, false, null, null, 58), 28), this.u);
            default:
                return n1.y(new y00.l(com.github.service.wrapper.a.o(this.s, new je(new u0(str2), str), null, false, null, null, 58), 14), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i k(String str) {
        switch (this.r) {
            case 0:
                k71.w wVar = new k71.w();
                wVar.r = new c(1, null, 0);
                return n1.y(in.r.l(in.r.h(new y71.y(new y71.y(new a(wVar, this, str, null, 0), this.t.d(new m3(str))), new b(wVar, null, 0)))), this.u);
            case 1:
                k71.w wVar2 = new k71.w();
                wVar2.r = new c(1, null, 9);
                return n1.y(in.r.l(in.r.h(new y71.y(new y71.y(new vm0.a(wVar2, this, str, null, 0), this.t.d(new g3(str))), new b(wVar2, null, 4)))), this.u);
            default:
                k71.w wVar3 = new k71.w();
                wVar3.r = new c(1, null, 25);
                return n1.y(in.r.l(in.r.h(new y71.y(new y71.y(new zb0.a(wVar3, this, str, null, 0), this.t.d(new u10.g3(str))), new b(wVar3, null, 12)))), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i l() {
        switch (this.r) {
            case 0:
                t0 t0Var = t0.d;
                return n1.y(in.r.l(new y71.y(in.r.h(this.t.d(new rx0.g(t0Var, t0Var, t0Var, t0Var, t0Var))), new v0(this, (a71.c) null, 2), 6)), this.u);
            case 1:
                t0 t0Var2 = t0.d;
                return n1.y(in.r.l(new y71.y(in.r.h(this.t.d(new dm0.g(t0Var2, t0Var2, t0Var2, t0Var2, t0Var2))), new v0(this, (a71.c) null, 5), 6)), this.u);
            default:
                t0 t0Var3 = t0.d;
                return n1.y(in.r.l(new y71.y(in.r.h(this.t.d(new ib0.g(t0Var3, t0Var3, t0Var3, t0Var3, t0Var3))), new v0(this, (a71.c) null, 7), 6)), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i m(String str, String str2) {
        switch (this.r) {
            case 0:
                return t1.S("createGoogleSubscription", "3.17");
            case 1:
                return t1.S("createGoogleSubscription", "3.12");
            default:
                return t1.S("createGoogleSubscription", "3.10");
        }
    }

    @Override // z01.r1
    public final y71.i n(String str) {
        switch (this.r) {
            case 0:
                k71.w v = no.a.v(str, "userId");
                v.r = new c(1, null, 3);
                return n1.y(in.r.l(in.r.h(new y71.y(new y71.y(new a(v, this, str, null, 3), this.t.d(new z70(str))), new b(v, null, 3)))), this.u);
            case 1:
                k71.w v2 = no.a.v(str, "userId");
                v2.r = new c(1, null, 12);
                return n1.y(in.r.l(in.r.h(new y71.y(new y71.y(new vm0.a(v2, this, str, null, 3), this.t.d(new c40(str))), new b(v2, null, 7)))), this.u);
            default:
                k71.w v3 = no.a.v(str, "userId");
                v3.r = new c(1, null, 28);
                return n1.y(in.r.l(in.r.h(new y71.y(new y71.y(new zb0.a(v3, this, str, null, 3), this.t.d(new e20(str))), new b(v3, null, 15)))), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i o() {
        switch (this.r) {
            case 0:
                return t1.S("observeViewerCopilotPermissions", "3.17");
            case 1:
                return t1.S("observeViewerCopilotPermissions", "3.12");
            default:
                return t1.S("observeViewerCopilotChatPermissions", "3.10");
        }
    }

    @Override // z01.r1
    public final Object p(mm.e eVar) {
        switch (this.r) {
            case 0:
                return n1.y(new e(com.github.service.wrapper.a.o(this.s, new kg0(), null, false, null, null, 58), 9), this.u);
            case 1:
                return n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new kc0(), null, false, null, null, 58), 4), this.u);
            default:
                return n1.y(new y00.l(com.github.service.wrapper.a.o(this.s, new ka0(), null, false, null, null, 58), 20), this.u);
        }
    }

    @Override // z01.r1
    public final Object q(String str, lm.a aVar) {
        switch (this.r) {
            case 0:
                return n1.y(new e(com.github.service.wrapper.a.o(this.t, new sf0(str), null, false, null, null, 58), 5), this.u);
            case 1:
                return n1.y(new vm0.h(com.github.service.wrapper.a.o(this.t, new sb0(str), null, false, null, null, 58), 0), this.u);
            default:
                return n1.y(new y00.l(com.github.service.wrapper.a.o(this.t, new s90(str), null, false, null, null, 58), 16), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i r() {
        switch (this.r) {
            case 0:
                return n1.y(new e(com.github.service.wrapper.a.o(this.t, new gg0(), null, false, null, null, 62), 8), this.u);
            case 1:
                return n1.y(new vm0.h(com.github.service.wrapper.a.o(this.t, new gc0(), null, false, null, null, 62), 3), this.u);
            default:
                return n1.y(new y00.l(com.github.service.wrapper.a.o(this.t, new ga0(), null, false, null, null, 62), 19), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i s(String str, String str2, String str3, boolean z, ZonedDateTime zonedDateTime) {
        switch (this.r) {
            case 0:
                u0 u0Var = t0.d;
                u0 u0Var2 = str == null ? u0Var : new u0(str);
                u0 u0Var3 = str2 == null ? u0Var : new u0(str2);
                u0 u0Var4 = str3 == null ? u0Var : new u0(str3);
                u0 u0Var5 = new u0(Boolean.valueOf(z));
                if (zonedDateTime != null) {
                    u0Var = new u0(zonedDateTime);
                }
                return n1.y(in.r.l(in.r.h(this.t.d(new rx0.g(u0Var2, u0Var3, u0Var4, u0Var5, u0Var)))), this.u);
            case 1:
                u0 u0Var6 = t0.d;
                u0 u0Var7 = str == null ? u0Var6 : new u0(str);
                u0 u0Var8 = str2 == null ? u0Var6 : new u0(str2);
                u0 u0Var9 = str3 == null ? u0Var6 : new u0(str3);
                u0 u0Var10 = new u0(Boolean.valueOf(z));
                if (zonedDateTime != null) {
                    u0Var6 = new u0(zonedDateTime);
                }
                return n1.y(in.r.l(in.r.h(this.t.d(new dm0.g(u0Var7, u0Var8, u0Var9, u0Var10, u0Var6)))), this.u);
            default:
                aa1.b bVar = t0.d;
                aa1.b u0Var11 = str == null ? bVar : new u0(str);
                aa1.b u0Var12 = str2 == null ? bVar : new u0(str2);
                aa1.b u0Var13 = str3 == null ? bVar : new u0(str3);
                u0 u0Var14 = new u0(Boolean.valueOf(z));
                if (zonedDateTime != null) {
                    bVar = new u0(zonedDateTime);
                }
                return n1.y(in.r.l(in.r.h(this.t.d(new ib0.g(u0Var11, u0Var12, u0Var13, u0Var14, bVar)))), this.u);
        }
    }

    @Override // z01.r1
    public final Object t(mm.b bVar) {
        switch (this.r) {
            case 0:
                return n1.y(new e(com.github.service.wrapper.a.o(this.s, new dd(), null, false, null, null, 58), 1), this.u);
            case 1:
                return n1.y(new e2(com.github.service.wrapper.a.o(this.s, new jc(), null, false, null, null, 58), 26), this.u);
            default:
                return n1.y(new y00.l(com.github.service.wrapper.a.o(this.s, new bc(), null, false, null, null, 58), 12), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i u(PullsWidgetFilter pullsWidgetFilter) {
        switch (this.r) {
            case 0:
                boolean z = pullsWidgetFilter == PullsWidgetFilter.REVIEW_REQUESTED;
                return n1.y(new n(com.github.service.wrapper.a.o(this.s, new vq(pullsWidgetFilter == PullsWidgetFilter.CREATED, pullsWidgetFilter == PullsWidgetFilter.ASSIGNED, pullsWidgetFilter == PullsWidgetFilter.MENTIONED, z), null, false, null, null, 62), pullsWidgetFilter, 0), this.u);
            case 1:
                return t1.S("fetchUserPullRequestWidgetData", "3.12");
            default:
                return t1.S("fetchUserPullRequestWidgetData", "3.10");
        }
    }

    @Override // z01.r1
    public final Object v(String str, String str2, gn.c cVar) {
        switch (this.r) {
            case 0:
                return n1.y(new e(com.github.service.wrapper.a.o(this.s, new ug(new u0(str2), str), null, false, null, null, 58), 2), this.u);
            case 1:
                return n1.y(new e2(com.github.service.wrapper.a.o(this.s, new cf(new u0(str2), str), null, false, null, null, 58), 27), this.u);
            default:
                return n1.y(new y00.l(com.github.service.wrapper.a.o(this.s, new je(new u0(str2), str), null, false, null, null, 58), 13), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i w(String str) {
        switch (this.r) {
            case 0:
                k71.w v = no.a.v(str, "userId");
                v.r = new c(1, null, 2);
                return n1.y(in.r.l(in.r.h(new y71.y(new y71.y(new a(v, this, str, null, 2), this.t.d(new m70(str))), new b(v, null, 2)))), this.u);
            case 1:
                k71.w v2 = no.a.v(str, "userId");
                v2.r = new c(1, null, 11);
                return n1.y(in.r.l(in.r.h(new y71.y(new y71.y(new vm0.a(v2, this, str, null, 2), this.t.d(new t30(str))), new b(v2, null, 6)))), this.u);
            default:
                k71.w v3 = no.a.v(str, "userId");
                v3.r = new c(1, null, 27);
                return n1.y(in.r.l(in.r.h(new y71.y(new y71.y(new zb0.a(v3, this, str, null, 2), this.t.d(new v10(str))), new b(v3, null, 14)))), this.u);
        }
    }

    @Override // z01.r1
    public final Object x(String str, String str2, gn.a aVar) {
        switch (this.r) {
            case 0:
                return n1.y(new e(com.github.service.wrapper.a.o(this.s, new bv(new u0(str2), str), null, false, null, null, 58), 0), this.u);
            case 1:
                return n1.y(new e2(com.github.service.wrapper.a.o(this.s, new qs(new u0(str2), str), null, false, null, null, 58), 25), this.u);
            default:
                return n1.y(new y00.l(com.github.service.wrapper.a.o(this.s, new mr(new u0(str2), str), null, false, null, null, 58), 11), this.u);
        }
    }

    @Override // z01.r1
    public final Object y(String str, gn.s sVar) {
        switch (this.r) {
            case 0:
                v70 v70Var = new v70(str);
                w80.Companion.getClass();
                return n1.y(new t(in.r.h(this.t.k(v70Var, new s70(new t70(new u70("User", str, new y0(str, ((aa.q) w80.W).a, false)))))), 1), this.u);
            case 1:
                y30 y30Var = new y30(str);
                s00.Companion.getClass();
                return n1.y(new p1(in.r.h(this.t.k(y30Var, new v30(new w30(new x30("User", str, new sd0.q(str, ((aa.q) s00.P).a, false)))))), 23), this.u);
            default:
                n0 a20Var = new a20(str);
                kz.Companion.getClass();
                return n1.y(new h1(in.r.h(this.t.k(a20Var, new x10(new y10(new z10("User", str, new c30.h(str, ((aa.q) kz.O).a, false)))))), 29), this.u);
        }
    }

    @Override // z01.r1
    public final y71.i z() {
        switch (this.r) {
        }
        return new f8(21, e1.s);
    }
}
