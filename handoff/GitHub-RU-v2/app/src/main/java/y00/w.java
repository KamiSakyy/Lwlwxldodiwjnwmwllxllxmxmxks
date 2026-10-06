package y00;

import aa.t0;
import aa.u0;
import b6.v0;
import bz0.c0;
import com.github.service.models.response.PullsWidgetFilter;
import cq.g1;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import jo.ae;
import jo.ai;
import jo.b8;
import jo.bj0;
import jo.fa0;
import jo.fj0;
import jo.ga0;
import jo.gi0;
import jo.ha0;
import jo.ia0;
import jo.j50;
import jo.jj0;
import jo.ma0;
import jo.mh0;
import jo.mi0;
import jo.o70;
import jo.oy;
import jo.rh;
import jo.ss;
import jo.th;
import jo.u3;
import jo.uh;
import jo.ui0;
import jo.uj;
import jo.vh;
import jo.wh;
import jo.wy;
import jo.xh0;
import jo.yw;
import jo.z90;
import m10.rf0;
import wy0.d6;
import wy0.h1;
import wy0.n6;
import wy0.s6;
import xn.q1;
import y71.n1Shadow;
import z01.r1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements r1, mi0 {
    public com.github.service.wrapper.j r;
    public com.github.service.wrapper.b s;
    public v71.v t;
    public com.github.rudroid.common.k u;
    public c0 v;

    public w(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, com.github.rudroid.common.k kVar) {
        k71.k.g(jVar, "client");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(vVar, "ioDispatcher");
        k71.k.g(kVar, "featureManager");
        this.r = jVar;
        this.s = bVar;
        this.t = vVar;
        this.u = kVar;
        this.v = new c0(bVar, 6);
    }

    public final Object A(String str, String str2, lm.i iVar) {
        return n1Shadow.y(new l(com.github.service.wrapper.a.o(this.r, new j50(new u0(str2), f1.e.g("type:user ", str)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 1), this.t);
    }

    public final y71.i a(String str) {
        k71.w v = no.a.v(str, "userId");
        v.r = new bz0.c(1, (a71.c) null, 18);
        return n1Shadow.y(in.rShadow.l(in.rShadow.h(new y71.y(new y71.y(new a(v, this, str, null, 1), this.s.d(new ai(str))), new bz0.b(v, (a71.c) null, 9)))), this.t);
    }

    public final Object b(String str, gn.q qVar) {
        wh whVar = new wh(str);
        rf0.Companion.getClass();
        return n1Shadow.y(new h1(in.rShadow.h(this.s.k(whVar, new th(new uh(new vh("User", str, new g1(str, ((aa.q) rf0.g0).a, true)))))), 26), this.t);
    }

    public final y71.i c(String str) {
        k71.k.g(str, "login");
        return n1Shadow.y(new l(com.github.service.wrapper.b.a(this.s, new xh0(new u0(100), str), ga.h.t, false, (LinkedHashSet) null, 56), 6), this.t);
    }

    public final y71.i d() {
        return com.github.rudroid.common.v.b(in.rShadow.l(com.github.service.wrapper.a.o(this.s, new bj0(), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58)), this.t);
    }

    public final Object e(String str, String str2, gn.i iVar) {
        return n1Shadow.y(new d6(com.github.service.wrapper.a.o(this.r, new o70(new u0(str2), str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 27), this.t);
    }

    public final Object f(String str, String str2, gn.k kVar) {
        return n1Shadow.y(new d6(com.github.service.wrapper.a.o(this.r, new oy(new u0(str2), str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 28), this.t);
    }

    public final y71.i g() {
        return n1Shadow.y(new l(com.github.service.wrapper.a.o(this.r, new mh0(), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 0), this.t);
    }

    public final Object h() {
        return this;
    }

    public final Object i(String str, String str2, gn.o oVar) {
        return n1Shadow.y(new l(com.github.service.wrapper.a.o(this.r, new wy(new u0(str2), str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 5), this.t);
    }

    public final Object j(String str, String str2, gn.e eVar) {
        return n1Shadow.y(new d6(com.github.service.wrapper.a.o(this.r, new rh(new u0(str2), str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 26), this.t);
    }

    public final y71.i k(String str) {
        k71.w wVar = new k71.w();
        wVar.r = new bz0.c(1, (a71.c) null, 17);
        return n1Shadow.y(in.rShadow.l(in.rShadow.h(new y71.y(new y71.y(new a(wVar, this, str, null, 0), this.s.d(new u3(str))), new bz0.b(wVar, (a71.c) null, 8)))), this.t);
    }

    public final y71.i l() {
        t0 t0Var = t0.d;
        return n1Shadow.y(in.rShadow.l(new y71.y(in.rShadow.h(this.s.d(new oz.g(t0Var, t0Var, t0Var, t0Var, t0Var))), new v0(this, (a71.c) null, 6), 6)), this.t);
    }

    public final y71.i m(String str, String str2) {
        boolean d = this.u.d();
        v71.v vVar = this.t;
        com.github.service.wrapper.b bVar = this.s;
        return d ? n1Shadow.y(new s6(new l(in.rShadow.h(bVar.d(new b8(str, str2))), 10), 18), vVar) : n1Shadow.y(new s6(new l(in.rShadow.h(bVar.d(new uj(str, str2))), 10), 19), vVar);
    }

    public final y71.i n(String str) {
        k71.w v = no.a.v(str, "userId");
        v.r = new bz0.c(1, (a71.c) null, 20);
        return n1Shadow.y(in.rShadow.l(in.rShadow.h(new y71.y(new y71.y(new a(v, this, str, null, 3), this.s.d(new ma0(str))), new bz0.b(v, (a71.c) null, 11)))), this.t);
    }

    public final y71.i o() {
        return com.github.rudroid.common.v.b(new nm.g(com.github.rudroid.common.flow.f.b(com.github.service.wrapper.b.a(this.s, new bj0(), ga.h.t, false, (LinkedHashSet) null, 56), 3, new n6(5), new q1(6), 4), 19), this.t);
    }

    public final Object p(mm.e eVar) {
        return n1Shadow.y(new l(com.github.service.wrapper.a.o(this.r, new jj0(), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 4), this.t);
    }

    public final Object q(String str, lm.a aVar) {
        return n1Shadow.y(new d6(com.github.service.wrapper.a.o(this.s, new gi0(str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 29), this.t);
    }

    public final y71.i r() {
        return n1Shadow.y(new l(com.github.service.wrapper.a.o(this.s, new fj0(), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 3), this.t);
    }

    public final y71.i s(String str, String str2, String str3, boolean z, ZonedDateTime zonedDateTime) {
        u0 u0Var = t0.d;
        u0 u0Var2 = str == null ? u0Var : new u0(str);
        u0 u0Var3 = str2 == null ? u0Var : new u0(str2);
        u0 u0Var4 = str3 == null ? u0Var : new u0(str3);
        u0 u0Var5 = new u0(Boolean.valueOf(z));
        if (zonedDateTime != null) {
            u0Var = new u0(zonedDateTime);
        }
        return n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.d(new oz.g(u0Var2, u0Var3, u0Var4, u0Var5, u0Var)))), this.t);
    }

    public final Object t(mm.b bVar) {
        return n1Shadow.y(new d6(com.github.service.wrapper.a.o(this.r, new ae(), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 24), this.t);
    }

    public final y71.i u(PullsWidgetFilter pullsWidgetFilter) {
        boolean z = pullsWidgetFilter == PullsWidgetFilter.REVIEW_REQUESTED;
        return n1Shadow.y(new bz0.n(com.github.service.wrapper.a.o(this.r, new ss(pullsWidgetFilter == PullsWidgetFilter.CREATED, pullsWidgetFilter == PullsWidgetFilter.ASSIGNED, pullsWidgetFilter == PullsWidgetFilter.MENTIONED, z), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), pullsWidgetFilter, 1), this.t);
    }

    public final Object v(String str, String str2, gn.c cVar) {
        return n1Shadow.y(new d6(com.github.service.wrapper.a.o(this.r, new rh(new u0(str2), str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 25), this.t);
    }

    public final y71.i w(String str) {
        k71.w v = no.a.v(str, "userId");
        v.r = new bz0.c(1, (a71.c) null, 19);
        return n1Shadow.y(in.rShadow.l(in.rShadow.h(new y71.y(new y71.y(new a(v, this, str, null, 2), this.s.d(new z90(str))), new bz0.b(v, (a71.c) null, 10)))), this.t);
    }

    public final Object x(String str, String str2, gn.a aVar) {
        return n1Shadow.y(new d6(com.github.service.wrapper.a.o(this.r, new yw(new u0(str2), str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 23), this.t);
    }

    public final Object y(String str, gn.s sVar) {
        ia0 ia0Var = new ia0(str);
        rf0.Companion.getClass();
        return n1Shadow.y(new h1(in.rShadow.h(this.s.k(ia0Var, new fa0(new ga0(new ha0("User", str, new g1(str, ((aa.q) rf0.g0).a, false)))))), 27), this.t);
    }

    public final y71.i z() {
        return n1Shadow.y(new l(com.github.service.wrapper.a.o(this.s, new ui0(), ga.h.r, false, (LinkedHashSet) null, (Set) null, 56), 2), this.t);
    }
}
