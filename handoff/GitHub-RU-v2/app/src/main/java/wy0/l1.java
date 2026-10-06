package wy0;

import com.github.service.models.response.discussions.type.DiscussionCloseReason;
import jn0.aa0;
import jn0.bc;
import jn0.db;
import jn0.ej;
import jn0.fp;
import jn0.io;
import jn0.n80;
import jn0.ou;
import jn0.q90;
import jn0.sa;
import jn0.un;
import jn0.v90;
import jn0.wa;
import jn0.wb;
import jn0.yf0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l1 implements z01.n, yf0 {
    public static final o0 Companion = new o0();
    public com.github.service.wrapper.j r;
    public com.github.service.wrapper.b s;
    public v71.v t;
    public a00.b u;
    public a00.b v;
    public a00.b w;
    public xy0.q x;
    public a00.b y;

    public l1(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, String str) {
        k71.k.g(jVar, "client");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(vVar, "ioDispatcher");
        k71.k.g(str, "userLogin");
        this.r = jVar;
        this.s = bVar;
        this.t = vVar;
        io0.f fVar = new io0.f(0);
        ie.d dVar = new ie.d(6);
        s01.oShadow oVar = s01.oShadow.s;
        a00.b bVar2 = new a00.b(jVar, bVar, vVar, fVar, dVar, oVar, new ie.d(7), new io0.f(1), new io0.f(2), new io0.f(3), new io0.f(4), null, null, 126976);
        this.u = bVar2;
        a00.b bVar3 = new a00.b(jVar, bVar, vVar, new io0.f(5), new ie.d(8), oVar, new ie.d(9), new io0.f(6), new io0.f(7), new io0.f(8), new io0.f(9), new ie.d(10), null, 118784);
        this.v = bVar3;
        a00.b bVar4 = new a00.b(jVar, bVar, vVar, new io0.f(10), new ie.d(11), oVar, new ie.d(12), new io0.f(11), new io0.f(12), new io0.f(13), new io0.f(14), new ie.d(13), null, 118784);
        this.w = bVar4;
        this.x = new xy0.q(bVar, str, bVar2, bVar3, bVar4);
        this.y = new a00.b(jVar, bVar, vVar, new io0.f(15), new ie.d(14), s01.oShadow.r, new ie.d(15), new io0.f(16), new io0.f(17), new io0.f(18), new io0.f(19), new ie.d(16), null, 120832);
    }

    @Override // z01.n
    public final Object A(String str) {
        return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.r.d(new jn0.w8(str)))), this.t);
    }

    @Override // z01.n
    public final y71.i B(String str) {
        return this.u.e(new io0.g(str));
    }

    @Override // z01.n
    public final Object C(String str, String str2) {
        return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.s.d(new aa0(str, str2)))), this.t);
    }

    @Override // z01.n
    public final Object D(String str, String str2, String str3, boolean z) {
        return y71.n1Shadow.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.r, new sa(str, str2, z, new aa.u0(str3)), null, false, null, null, 58), 10), 17), this.t);
    }

    @Override // z01.n
    public final y71.i E(String str, String str2) {
        k71.w v = no.a.v(str, "discussionCommentId");
        v.r = x61.rShadow.r;
        return y71.n1Shadow.y(in.rShadow.l(new y71.y(new y71.y(new w0(v, this, str, str2, null, 1), in.rShadow.h(this.s.d(new ej(str)))), new rm0.j1(v, (a71.c) null, 10))), this.t);
    }

    @Override // z01.n
    public final y71.i F(String str, String str2, String str3) {
        k71.k.g(str, "query");
        return y71.n1Shadow.y(this.y.h(new io0.o(str, str2, str3)), this.t);
    }

    @Override // z01.n
    public final y71.i G(String str) {
        return y71.n1Shadow.y(new h1(in.rShadow.h(y71.n1Shadow.I(new rm0.v1(new t00.f8(new u0(1, null, str, this)), str, 3), new q0(1, null, str, this))), 0), this.t);
    }

    @Override // z01.n
    public final y71.i H(String str, b01.e eVar) {
        return y71.n1Shadow.y(new rm0.y1(in.rShadow.h(y71.n1Shadow.I(new t00.f8(new u0(2, null, str, this)), new c00.a((a71.c) null, this, str, eVar, 14))), str, 7), this.t);
    }

    @Override // z01.n
    public final y71.i I(String str, String str2, String str3) {
        k71.k.g(str2, "repositoryName");
        return y71.n1Shadow.y(new vm0.h(com.github.service.wrapper.a.o(this.r, new wa(str, str2, str3), null, false, null, null, 58), 8), this.t);
    }

    @Override // z01.n
    public final y71.i J(String str) {
        return this.u.b(new io0.g(str));
    }

    @Override // z01.n
    public final y71.i K(String str) {
        return this.u.h(new io0.g(str));
    }

    @Override // z01.n
    public final y71.i a(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return this.w.h(new io0.i(str, i));
    }

    @Override // z01.n
    public final y71.i b(String str, String str2) {
        k71.k.g(str, "discussionId");
        k71.k.g(str2, "body");
        return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new jn0.m(str, str2))), 10), new t00.z1(this, str, (a71.c) null, 17), 6), 12), this.t);
    }

    @Override // z01.n
    public final y71.i c(String str, String str2, String str3) {
        k71.k.g(str, "query");
        return y71.n1Shadow.y(this.y.e(new io0.o(str, str2, str3)), this.t);
    }

    @Override // z01.n
    public final y71.i d(String str, DiscussionCloseReason discussionCloseReason) {
        k71.k.g(discussionCloseReason, "reason");
        return y71.n1Shadow.y(new vb0.p1(in.rShadow.h(y71.n1Shadow.I(new rm0.e1(new t00.f8(new u0(0, null, str, this)), discussionCloseReason, str, 3), new c00.a((a71.c) null, this, str, discussionCloseReason, 13))), 29), this.t);
    }

    @Override // z01.n
    public final y71.i e(String str, String str2) {
        k71.w v = no.a.v(str, "discussionCommentId");
        v.r = x61.rShadow.r;
        return y71.n1Shadow.y(in.rShadow.l(new y71.y(new y71.y(new w0(v, this, str, str2, null, 2), in.rShadow.h(this.s.d(new n80(str)))), new rm0.j1(v, (a71.c) null, 11))), this.t);
    }

    @Override // z01.n
    public final y71.i f(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return y71.n1Shadow.y(new rm0.s1(com.github.service.wrapper.b.a(this.s, new wb(str, i, str2), ga.h.t, false, null, 56), str2, str, i, 3), this.t);
    }

    @Override // z01.n
    public final y71.i g(String str, String str2, String str3) {
        k71.k.g(str, "query");
        return y71.n1Shadow.y(this.y.b(new io0.o(str, str2, str3)), this.t);
    }

    public final Object h() {
        return this;
    }

    @Override // z01.n
    public final Object i(String str, String str2) {
        return y71.n1Shadow.y(new rm0.y1(in.rShadow.h(this.s.d(new v90(str, str2))), str, 6), this.t);
    }

    @Override // z01.n
    public final y71.i j(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return y71.n1Shadow.y(new do0.h(com.github.service.wrapper.b.a(this.s, new io(str, i), ga.h.t, false, null, 56), str, i, 7), this.t);
    }

    @Override // z01.n
    public final Object k(String str, String str2) {
        return y71.n1Shadow.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.r, new fp(str, str2), null, false, null, null, 58), 10), 18), this.t);
    }

    @Override // z01.n
    public final y71.i l(String str, String str2) {
        k71.k.g(str2, "optionId");
        return y71.n1Shadow.I(new t00.f8(new an.b(this, str, str2, (a71.c) null, 14)), new q0(0, null, str2, this));
    }

    @Override // z01.n
    public final y71.i m(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return this.v.h(new io0.h(str, i, str2));
    }

    @Override // z01.n
    public final Object n(String str, String str2, String str3, String str4) {
        return y71.n1Shadow.y(new vb0.s7(new y00.l(in.rShadow.h(this.r.d(new jn0.e7(str, str2, str3, str4))), 10), 15), this.t);
    }

    @Override // z01.n
    public final y71.i o(String str) {
        return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.e(new jn0.g2(str), new ap0.k0(), str, new wa.g(19)))), this.t);
    }

    @Override // z01.n
    public final y71.i p(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return this.w.e(new io0.i(str, i));
    }

    @Override // z01.n
    public final y71.i q(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return this.v.b(new io0.h(str, i, str2));
    }

    @Override // z01.n
    public final y71.i r(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "commentUrl");
        return y71.n1Shadow.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new un(str, i, str2), ga.h.r, false, null, null, 56), 10), this.t);
    }

    @Override // z01.n
    public final y71.i s(String str) {
        return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.e(new ou(str), new ap0.k0(), str, new wa.g(20)))), this.t);
    }

    @Override // z01.n
    public final Object t(String str) {
        return y71.n1Shadow.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.r, new bc(str), null, false, null, null, 58), 10), 16), this.t);
    }

    @Override // z01.n
    public final y71.i u(String str, String str2, String str3) {
        k71.k.g(str, "discussionId");
        k71.k.g(str2, "body");
        k71.k.g(str3, "parentCommentId");
        return y71.n1Shadow.y(new y00.l(new c00.g(in.rShadow.h(this.s.d(new jn0.n0(str, str2, str3))), str3, this, 24), 10), this.t);
    }

    @Override // z01.n
    public final y71.i v(int i, String str, String str2, String str3) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(str3, "commentUrl");
        return y71.n1Shadow.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new db(i, str, str2, str3), ga.h.r, false, null, null, 56), 9), this.t);
    }

    @Override // z01.n
    public final y71.i w(String str, String str2) {
        k71.w v = no.a.v(str, "discussionCommentId");
        v.r = x61.rShadow.r;
        return y71.n1Shadow.y(new y71.y(in.rShadow.l(new y71.y(new w0(v, this, str, str2, null, 0), new y00.l(in.rShadow.h(this.s.d(new jn0.s8(str))), 10))), new rm0.j1(v, (a71.c) null, 9)), this.t);
    }

    @Override // z01.n
    public final y71.i x(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return this.v.e(new io0.h(str, i, str2));
    }

    @Override // z01.n
    public final y71.i y(String str, String str2) {
        k71.k.g(str, "discussionCommentId");
        k71.k.g(str2, "body");
        return y71.n1Shadow.y(new vb0.s7(new y00.l(in.rShadow.h(this.s.d(new q90(str, str2))), 10), 19), this.t);
    }

    @Override // z01.n
    public final y71.i z(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return this.w.b(new io0.i(str, i));
    }
}
