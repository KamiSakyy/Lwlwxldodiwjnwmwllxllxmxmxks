package vb0;

import com.github.service.models.response.discussions.type.DiscussionCloseReason;
import rm0.ya;
import u10.a40;
import u10.ba;
import u10.f40;
import u10.jm;
import u10.lg;
import u10.ml;
import u10.q9;
import u10.s20;
import u10.u9;
import u10.ua;
import u10.v30;
import u10.y90;
import u10.za;
import u10.zk;
import u10.zq;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k1 implements z01.n, y90 {
    public static final n0 Companion = new n0();
    public com.github.service.wrapper.j r;
    public com.github.service.wrapper.b s;
    public v71.v t;
    public jy.d u;
    public jy.d v;
    public jy.d w;
    public wb0.q x;
    public jy.d y;

    public k1(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, String str) {
        k71.k.g(jVar, "client");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(vVar, "ioDispatcher");
        k71.k.g(str, "userLogin");
        this.r = jVar;
        this.s = bVar;
        this.t = vVar;
        s0.n0 n0Var = new s0.n0(10);
        ya yaVar = new ya(12);
        s01.oShadow oVar = s01.oShadow.s;
        jy.d dVar = new jy.d(jVar, bVar, vVar, n0Var, yaVar, oVar, new ya(13), new s0.n0(11), new s0.n0(12), new s0.n0(13), new s0.n0(14), null, null, 126976);
        this.u = dVar;
        jy.d dVar2 = new jy.d(jVar, bVar, vVar, new s0.n0(15), new ya(14), oVar, new ya(15), new s0.n0(16), new s0.n0(17), new s0.n0(18), new s0.n0(19), null, null, 126976);
        this.v = dVar2;
        jy.d dVar3 = new jy.d(jVar, bVar, vVar, new s0.n0(20), new ya(16), oVar, new ya(17), new s0.n0(21), new s0.n0(22), new s0.n0(23), new s0.n0(24), null, null, 126976);
        this.w = dVar3;
        this.x = new wb0.q(bVar, str, dVar, dVar2, dVar3);
        this.y = new jy.d(jVar, bVar, vVar, new s0.n0(25), new ya(18), s01.oShadow.r, new ya(19), new s0.n0(26), new s0.n0(27), new s0.n0(28), new s0.n0(29), new ya(20), null, 120832);
    }

    @Override // z01.n
    public final Object A(String str) {
        return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.r.d(new u10.u7(str)))), this.t);
    }

    @Override // z01.n
    public final y71.i B(String str) {
        return this.u.e(new s20.f(str));
    }

    @Override // z01.n
    public final Object C(String str, String str2) {
        return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.s.d(new f40(str, str2)))), this.t);
    }

    @Override // z01.n
    public final Object D(String str, String str2, String str3, boolean z) {
        return y71.n1Shadow.y(new u(new y00.l(com.github.service.wrapper.a.o(this.r, new q9(str, str2, z, new aa.u0(str3)), null, false, null, null, 58), 10), 11), this.t);
    }

    @Override // z01.n
    public final y71.i E(String str, String str2) {
        k71.w v = no.a.v(str, "discussionCommentId");
        v.r = x61.rShadow.r;
        return y71.n1Shadow.y(in.rShadow.l(new y71.y(new y71.y(new v0(v, this, str, str2, null, 1), in.rShadow.h(this.s.d(new lg(str)))), new rm0.j1(v, (a71.c) null, 7))), this.t);
    }

    @Override // z01.n
    public final y71.i F(String str, String str2, String str3) {
        k71.k.g(str, "query");
        return y71.n1Shadow.y(this.y.h(new s20.n(str, str2, str3)), this.t);
    }

    @Override // z01.n
    public final y71.i G(String str) {
        return y71.n1Shadow.y(new t00.g3(in.rShadow.h(y71.n1Shadow.I(new rm0.v1(new t00.f8(new t0(1, null, str, this)), str, 2), new p0(1, null, str, this))), 29), this.t);
    }

    @Override // z01.n
    public final y71.i H(String str, b01.e eVar) {
        return y71.n1Shadow.y(new rm0.y1(in.rShadow.h(y71.n1Shadow.I(new t00.f8(new t0(2, null, str, this)), new c00.a((a71.c) null, this, str, eVar, 11))), str, 5), this.t);
    }

    @Override // z01.n
    public final y71.i I(String str, String str2, String str3) {
        k71.k.g(str2, "repositoryName");
        return y71.n1Shadow.y(new t00.h7(com.github.service.wrapper.a.o(this.r, new u9(str, str2, str3), null, false, null, null, 58), 22), this.t);
    }

    @Override // z01.n
    public final y71.i J(String str) {
        return this.u.b(new s20.f(str));
    }

    @Override // z01.n
    public final y71.i K(String str) {
        return this.u.h(new s20.f(str));
    }

    @Override // z01.n
    public final y71.i a(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return this.w.h(new s20.h(str, i));
    }

    @Override // z01.n
    public final y71.i b(String str, String str2) {
        k71.k.g(str, "discussionId");
        k71.k.g(str2, "body");
        return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new u10.m(str, str2))), 10), new t00.z1(this, str, (a71.c) null, 11), 6), 3), this.t);
    }

    @Override // z01.n
    public final y71.i c(String str, String str2, String str3) {
        k71.k.g(str, "query");
        return y71.n1Shadow.y(this.y.e(new s20.n(str, str2, str3)), this.t);
    }

    @Override // z01.n
    public final y71.i d(String str, DiscussionCloseReason discussionCloseReason) {
        k71.k.g(discussionCloseReason, "reason");
        return y71.n1Shadow.y(new t00.g3(in.rShadow.h(y71.n1Shadow.I(new rm0.e1(new t00.f8(new t0(0, null, str, this)), discussionCloseReason, str, 2), new c00.a((a71.c) null, this, str, discussionCloseReason, 10))), 28), this.t);
    }

    @Override // z01.n
    public final y71.i e(String str, String str2) {
        k71.w v = no.a.v(str, "discussionCommentId");
        v.r = x61.rShadow.r;
        return y71.n1Shadow.y(in.rShadow.l(new y71.y(new y71.y(new v0(v, this, str, str2, null, 2), in.rShadow.h(this.s.d(new s20(str)))), new rm0.j1(v, (a71.c) null, 8))), this.t);
    }

    @Override // z01.n
    public final y71.i f(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return y71.n1Shadow.y(new rm0.s1(com.github.service.wrapper.b.a(this.s, new ua(str, i, str2), ga.h.t, false, null, 56), str2, str, i, 2), this.t);
    }

    @Override // z01.n
    public final y71.i g(String str, String str2, String str3) {
        k71.k.g(str, "query");
        return y71.n1Shadow.y(this.y.b(new s20.n(str, str2, str3)), this.t);
    }

    public final Object h() {
        return this;
    }

    @Override // z01.n
    public final Object i(String str, String str2) {
        return y71.n1Shadow.y(new rm0.y1(in.rShadow.h(this.s.d(new a40(str, str2))), str, 4), this.t);
    }

    @Override // z01.n
    public final y71.i j(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return y71.n1Shadow.y(new do0.h(com.github.service.wrapper.b.a(this.s, new ml(str, i), ga.h.t, false, null, 56), str, i, 6), this.t);
    }

    @Override // z01.n
    public final Object k(String str, String str2) {
        return y71.n1Shadow.y(new u(new y00.l(com.github.service.wrapper.a.o(this.r, new jm(str, str2), null, false, null, null, 58), 10), 12), this.t);
    }

    @Override // z01.n
    public final y71.i l(String str, String str2) {
        k71.k.g(str2, "optionId");
        return y71.n1Shadow.I(new t00.f8(new an.b(this, str, str2, (a71.c) null, 13)), new p0(0, null, str2, this));
    }

    @Override // z01.n
    public final y71.i m(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return this.v.h(new s20.g(str, i, str2));
    }

    @Override // z01.n
    public final Object n(String str, String str2, String str3, String str4) {
        return y71.n1Shadow.y(new u(new y00.l(in.rShadow.h(this.r.d(new u10.h6(str, str2, str3, str4))), 10), 9), this.t);
    }

    @Override // z01.n
    public final y71.i o(String str) {
        return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.e(new u10.a2(str), new la0.d(0), str, new v00.n(13)))), this.t);
    }

    @Override // z01.n
    public final y71.i p(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return this.w.e(new s20.h(str, i));
    }

    @Override // z01.n
    public final y71.i q(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return this.v.b(new s20.g(str, i, str2));
    }

    @Override // z01.n
    public final y71.i r(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "commentUrl");
        return y71.n1Shadow.y(new t00.h7(com.github.service.wrapper.a.o(this.s, new zk(str, i, str2), ga.h.r, false, null, null, 56), 24), this.t);
    }

    @Override // z01.n
    public final y71.i s(String str) {
        return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.e(new zq(str), new la0.d(0), str, new v00.n(14)))), this.t);
    }

    @Override // z01.n
    public final Object t(String str) {
        return y71.n1Shadow.y(new u(new y00.l(com.github.service.wrapper.a.o(this.r, new za(str), null, false, null, null, 58), 10), 10), this.t);
    }

    @Override // z01.n
    public final y71.i u(String str, String str2, String str3) {
        k71.k.g(str, "discussionId");
        k71.k.g(str2, "body");
        k71.k.g(str3, "parentCommentId");
        return y71.n1Shadow.y(new y00.l(new c00.g(in.rShadow.h(this.s.d(new u10.n0(str, str2, str3))), str3, this, 22), 10), this.t);
    }

    @Override // z01.n
    public final y71.i v(int i, String str, String str2, String str3) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(str3, "commentUrl");
        return y71.n1Shadow.y(new t00.h7(com.github.service.wrapper.a.o(this.s, new ba(i, str, str2, str3), ga.h.r, false, null, null, 56), 23), this.t);
    }

    @Override // z01.n
    public final y71.i w(String str, String str2) {
        k71.w v = no.a.v(str, "discussionCommentId");
        v.r = x61.rShadow.r;
        return y71.n1Shadow.y(new y71.y(in.rShadow.l(new y71.y(new v0(v, this, str, str2, null, 0), new y00.l(in.rShadow.h(this.s.d(new u10.q7(str))), 10))), new rm0.j1(v, (a71.c) null, 6)), this.t);
    }

    @Override // z01.n
    public final y71.i x(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return this.v.e(new s20.g(str, i, str2));
    }

    @Override // z01.n
    public final y71.i y(String str, String str2) {
        k71.k.g(str, "discussionCommentId");
        k71.k.g(str2, "body");
        return y71.n1Shadow.y(new u(new y00.l(in.rShadow.h(this.s.d(new v30(str, str2))), 10), 13), this.t);
    }

    @Override // z01.n
    public final y71.i z(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return this.w.b(new s20.h(str, i));
    }
}
