package t00;

import com.github.service.models.response.discussions.type.DiscussionCloseReason;
import java.util.LinkedHashSet;
import java.util.Set;
import jo.ac;
import jo.aq;
import jo.bb0;
import jo.ec0;
import jo.jc0;
import jo.jk;
import jo.lw;
import jo.mi0;
import jo.np;
import jo.oc0;
import jo.pb;
import jo.tb;
import jo.tc;
import jo.xq;
import jo.yc;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s1 implements z01.n, mi0 {
    public static final v0 Companion = new v0();
    public com.github.service.wrapper.j r;
    public com.github.service.wrapper.b s;
    public v71.v t;
    public jy.d u;
    public jy.d v;
    public jy.d w;
    public u00.q x;
    public jy.d y;

    public s1(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, String str) {
        k71.k.g(jVar, "client");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(vVar, "ioDispatcher");
        k71.k.g(str, "userLogin");
        this.r = jVar;
        this.s = bVar;
        this.t = vVar;
        m7.rShadow rVar = new m7.r(16);
        n0.xShadow xVar = new n0.x(3);
        s01.oShadow oVar = s01.oShadow.s;
        jy.d dVar = new jy.d(jVar, bVar, vVar, rVar, xVar, oVar, new n0.x(4), new m7.r(17), new m7.r(18), new m7.r(19), new m7.r(20), null, null, 126976);
        this.u = dVar;
        jy.d dVar2 = new jy.d(jVar, bVar, vVar, new m7.r(21), new n0.x(5), oVar, new n0.x(6), new m7.r(22), new m7.r(23), new m7.r(24), new m7.r(25), new n0.x(7), null, 118784);
        this.v = dVar2;
        jy.d dVar3 = new jy.d(jVar, bVar, vVar, new m7.r(26), new n0.x(8), oVar, new n0.x(9), new m7.r(27), new m7.r(28), new m7.r(29), new np.h(0), new n0.x(10), null, 118784);
        this.w = dVar3;
        this.x = new u00.q(bVar, str, dVar, dVar2, dVar3);
        this.y = new jy.d(jVar, bVar, vVar, new np.h(1), new n0.x(11), s01.oShadow.r, new n0.x(12), new np.h(2), new np.h(3), new np.h(4), new np.h(5), new n0.x(13), null, 120832);
    }

    public final Object A(String str) {
        return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.r.d(new jo.t9(str)))), this.t);
    }

    public final y71.i B(String str) {
        return this.u.e(new np.f(str));
    }

    public final Object C(String str, String str2) {
        return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.s.d(new oc0(str, str2)))), this.t);
    }

    public final Object D(String str, String str2, String str3, boolean z) {
        return y71.n1Shadow.y(new rm0.v9(new y00.l(com.github.service.wrapper.a.o(this.r, new pb(str, str2, z, new aa.u0(str3)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 20), this.t);
    }

    public final y71.i E(String str, String str2) {
        k71.w v = no.a.v(str, "discussionCommentId");
        v.r = x61.rShadow.r;
        return y71.n1Shadow.y(in.rShadow.l(new y71.y(new y71.y(new d1(v, this, str, str2, null, 1), in.rShadow.h(this.s.d(new jk(str)))), new rm0.j1(v, (a71.c) null, 4))), this.t);
    }

    public final y71.i F(String str, String str2, String str3) {
        k71.k.g(str, "query");
        return y71.n1Shadow.y(this.y.h(new np.o(str, str2, str3)), this.t);
    }

    public final y71.i G(String str) {
        a71.c cVar = null;
        return y71.n1Shadow.y(new rm0.o3(in.rShadow.h(y71.n1Shadow.I(new rm0.v1(new f8(new b1(1, cVar, str, this)), str, 1), new x0(1, cVar, str, this))), 25), this.t);
    }

    public final y71.i H(String str, b01.e eVar) {
        a71.c cVar = null;
        return y71.n1Shadow.y(new rm0.y1(in.rShadow.h(y71.n1Shadow.I(new f8(new b1(2, cVar, str, this)), new c00.a(cVar, this, str, eVar, 9))), str, 3), this.t);
    }

    public final y71.i I(String str, String str2, String str3) {
        k71.k.g(str2, "repositoryName");
        return y71.n1Shadow.y(new sm.b(com.github.service.wrapper.a.o(this.r, new tb(str, str2, str3), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 3), this.t);
    }

    public final y71.i J(String str) {
        return this.u.b(new np.f(str));
    }

    public final y71.i K(String str) {
        return this.u.h(new np.f(str));
    }

    public final y71.i a(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return this.w.h(new np.i(str, i));
    }

    public final y71.i b(String str, String str2) {
        k71.k.g(str, "discussionId");
        k71.k.g(str2, "body");
        return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new jo.r(str, str2))), 10), new h1.u(this, str, (a71.c) null, 29), 6), 20), this.t);
    }

    public final y71.i c(String str, String str2, String str3) {
        k71.k.g(str, "query");
        return y71.n1Shadow.y(this.y.e(new np.o(str, str2, str3)), this.t);
    }

    public final y71.i d(String str, DiscussionCloseReason discussionCloseReason) {
        k71.k.g(discussionCloseReason, "reason");
        a71.c cVar = null;
        return y71.n1Shadow.y(new rm0.o3(in.rShadow.h(y71.n1Shadow.I(new rm0.e1(new f8(new b1(0, cVar, str, this)), discussionCloseReason, str, 1), new c00.a(cVar, this, str, discussionCloseReason, 8))), 24), this.t);
    }

    public final y71.i e(String str, String str2) {
        k71.w v = no.a.v(str, "discussionCommentId");
        v.r = x61.rShadow.r;
        return y71.n1Shadow.y(in.rShadow.l(new y71.y(new y71.y(new d1(v, this, str, str2, null, 2), in.rShadow.h(this.s.d(new bb0(str)))), new rm0.j1(v, (a71.c) null, 5))), this.t);
    }

    public final y71.i f(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return y71.n1Shadow.y(new rm0.s1(com.github.service.wrapper.b.a(this.s, new tc(str, i, str2), ga.h.t, false, (LinkedHashSet) null, 56), str2, str, i, 1), this.t);
    }

    public final y71.i g(String str, String str2, String str3) {
        k71.k.g(str, "query");
        return y71.n1Shadow.y(this.y.b(new np.o(str, str2, str3)), this.t);
    }

    public final Object h() {
        return this;
    }

    public final Object i(String str, String str2) {
        return y71.n1Shadow.y(new rm0.y1(in.rShadow.h(this.s.d(new jc0(str, str2))), str, 2), this.t);
    }

    public final y71.i j(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return y71.n1Shadow.y(new do0.h(com.github.service.wrapper.b.a(this.s, new aq(str, i), ga.h.t, false, (LinkedHashSet) null, 56), str, i, 5), this.t);
    }

    public final Object k(String str, String str2) {
        return y71.n1Shadow.y(new rm0.v9(new y00.l(com.github.service.wrapper.a.o(this.r, new xq(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 21), this.t);
    }

    public final y71.i l(String str, String str2) {
        k71.k.g(str2, "optionId");
        a71.c cVar = null;
        return y71.n1Shadow.I(new f8(new an.b(this, str, str2, cVar, 12)), new x0(0, cVar, str2, this));
    }

    public final y71.i m(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return this.v.h(new np.g(str, i, str2));
    }

    public final Object n(String str, String str2, String str3, String str4) {
        return y71.n1Shadow.y(new rm0.v9(new y00.l(in.rShadow.h(this.r.d(new jo.t7(str, str2, str3, str4))), 10), 18), this.t);
    }

    public final y71.i o(String str) {
        return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.e(new jo.l2(str), new cq.s0(), str, new sw0.e(7)))), this.t);
    }

    public final y71.i p(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return this.w.e(new np.i(str, i));
    }

    public final y71.i q(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return this.v.b(new np.g(str, i, str2));
    }

    public final y71.i r(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "commentUrl");
        return y71.n1Shadow.y(new sm.b(com.github.service.wrapper.a.o(this.s, new np(str, i, str2), ga.h.r, false, (LinkedHashSet) null, (Set) null, 56), 5), this.t);
    }

    public final y71.i s(String str) {
        return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.e(new lw(str), new cq.s0(), str, new sw0.e(8)))), this.t);
    }

    public final Object t(String str) {
        return y71.n1Shadow.y(new rm0.v9(new y00.l(com.github.service.wrapper.a.o(this.r, new yc(str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 19), this.t);
    }

    public final y71.i u(String str, String str2, String str3) {
        k71.k.g(str, "discussionId");
        k71.k.g(str2, "body");
        k71.k.g(str3, "parentCommentId");
        return y71.n1Shadow.y(new y00.l(new c00.g(in.rShadow.h(this.s.d(new jo.s0(str, str2, str3))), str3, this, 19), 10), this.t);
    }

    public final y71.i v(int i, String str, String str2, String str3) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(str3, "commentUrl");
        return y71.n1Shadow.y(new sm.b(com.github.service.wrapper.a.o(this.s, new ac(i, str, str2, str3), ga.h.r, false, (LinkedHashSet) null, (Set) null, 56), 4), this.t);
    }

    public final y71.i w(String str, String str2) {
        k71.w v = no.a.v(str, "discussionCommentId");
        v.r = x61.rShadow.r;
        return y71.n1Shadow.y(new y71.y(in.rShadow.l(new y71.y(new d1(v, this, str, str2, null, 0), new y00.l(in.rShadow.h(this.s.d(new jo.p9(str))), 10))), new rm0.j1(v, (a71.c) null, 3)), this.t);
    }

    public final y71.i x(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return this.v.e(new np.g(str, i, str2));
    }

    public final y71.i y(String str, String str2) {
        k71.k.g(str, "discussionCommentId");
        k71.k.g(str2, "body");
        return y71.n1Shadow.y(new rm0.v9(new y00.l(in.rShadow.h(this.s.d(new ec0(str, str2))), 10), 22), this.t);
    }

    public final y71.i z(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return this.w.b(new np.i(str, i));
    }
}
