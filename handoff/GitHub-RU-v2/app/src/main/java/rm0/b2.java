package rm0;

import com.github.service.models.response.discussions.type.DiscussionCloseReason;
import kc0.cb;
import kc0.d60;
import kc0.dm;
import kc0.ds;
import kc0.hb;
import kc0.nh;
import kc0.nn;
import kc0.q40;
import kc0.qm;
import kc0.t50;
import kc0.y50;
import kc0.yb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b2 implements z01.n, yb0 {
    public static final y0 Companion = new y0();
    public com.github.service.wrapper.j r;
    public com.github.service.wrapper.bShadow s;
    public v71.v t;
    public a00.b u;
    public a00.b v;
    public a00.b w;
    public sm0.r x;
    public a00.b y;

    public b2(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, String str) {
        k71.k.g(jVar, "client");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(vVar, "ioDispatcher");
        k71.k.g(str, "userLogin");
        this.r = jVar;
        this.s = bVar;
        this.t = vVar;
        id.a aVar = new id.a(1);
        he.c cVar = new he.c(21);
        s01.oShadow oVar = s01.oShadow.s;
        a00.b bVar2 = new a00.b(jVar, bVar, vVar, aVar, cVar, oVar, new he.c(22), new id.a(2), new id.a(3), new id.a(4), new id.a(5), null, null, 126976);
        this.u = bVar2;
        a00.b bVar3 = new a00.b(jVar, bVar, vVar, new id.a(6), new he.c(23), oVar, new he.c(24), new id.a(7), new id.a(8), new id.a(9), new id.a(10), null, null, 126976);
        this.v = bVar3;
        a00.b bVar4 = new a00.b(jVar, bVar, vVar, new id.a(11), new he.c(25), oVar, new he.c(26), new id.a(12), new id.a(13), new id.a(14), new id.a(15), null, null, 126976);
        this.w = bVar4;
        this.x = new sm0.r(bVar, str, bVar2, bVar3, bVar4);
        this.y = new a00.b(jVar, bVar, vVar, new id.a(16), new he.c(27), s01.oShadow.r, new he.c(28), new id.a(17), new id.a(18), new id.a(19), new id.a(20), new he.c(29), null, 120832);
    }

    @Override // z01.n
    public final Object A(String str) {
        return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.r.d(new kc0.c8(str)))), this.t);
    }

    @Override // z01.n
    public final y71.i B(String str) {
        return this.u.e(new id0.f(str));
    }

    @Override // z01.n
    public final Object C(String str, String str2) {
        return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.s.d(new d60(str, str2)))), this.t);
    }

    @Override // z01.n
    public final Object D(String str, String str2, String str3, boolean z) {
        return y71.n1Shadow.y(new y(new y00.l(com.github.service.wrapper.a.o(this.r, new kc0.y9(str, str2, z, new aa.u0(str3)), null, false, null, null, 58), 10), 12), this.t);
    }

    @Override // z01.n
    public final y71.i E(String str, String str2) {
        k71.w v = no.a.v(str, "discussionCommentId");
        v.r = x61.rShadow.r;
        return y71.n1Shadow.y(in.rShadow.l(new y71.y(new y71.y(new i1(v, this, str, str2, null, 1), in.rShadow.h(this.s.d(new nh(str)))), new j1(v, (a71.c) null, 1))), this.t);
    }

    @Override // z01.n
    public final y71.i F(String str, String str2, String str3) {
        k71.k.g(str, "query");
        return y71.n1Shadow.y(this.y.h(new id0.n(str, str2, str3)), this.t);
    }

    @Override // z01.n
    public final y71.i G(String str) {
        return y71.n1Shadow.y(new bz0.t(in.rShadow.h(y71.n1Shadow.I(new v1(new t00.f8(new g1(1, null, str, this)), str, 0), new a1(1, null, str, this))), 27), this.t);
    }

    @Override // z01.n
    public final y71.i H(String str, b01.e eVar) {
        return y71.n1Shadow.y(new y1(in.rShadow.h(y71.n1Shadow.I(new t00.f8(new g1(2, null, str, this)), new c00.a((a71.c) null, this, str, eVar, 7))), str, 1), this.t);
    }

    @Override // z01.n
    public final y71.i I(String str, String str2, String str3) {
        k71.k.g(str2, "repositoryName");
        return y71.n1Shadow.y(new gl.f(com.github.service.wrapper.a.o(this.r, new kc0.ca(str, str2, str3), null, false, null, null, 58), 21), this.t);
    }

    @Override // z01.n
    public final y71.i J(String str) {
        return this.u.b(new id0.f(str));
    }

    @Override // z01.n
    public final y71.i K(String str) {
        return this.u.h(new id0.f(str));
    }

    @Override // z01.n
    public final y71.i a(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return this.w.h(new id0.h(str, i));
    }

    @Override // z01.n
    public final y71.i b(String str, String str2) {
        k71.k.g(str, "discussionId");
        k71.k.g(str2, "body");
        return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new kc0.m(str, str2))), 10), new h1.u(this, str, (a71.c) null, 23), 6), 10), this.t);
    }

    @Override // z01.n
    public final y71.i c(String str, String str2, String str3) {
        k71.k.g(str, "query");
        return y71.n1Shadow.y(this.y.e(new id0.n(str, str2, str3)), this.t);
    }

    @Override // z01.n
    public final y71.i d(String str, DiscussionCloseReason discussionCloseReason) {
        k71.k.g(discussionCloseReason, "reason");
        return y71.n1Shadow.y(new bz0.t(in.rShadow.h(y71.n1Shadow.I(new e1(new t00.f8(new g1(0, null, str, this)), discussionCloseReason, str, 0), new c00.a((a71.c) null, this, str, discussionCloseReason, 6))), 26), this.t);
    }

    @Override // z01.n
    public final y71.i e(String str, String str2) {
        k71.w v = no.a.v(str, "discussionCommentId");
        v.r = x61.rShadow.r;
        return y71.n1Shadow.y(in.rShadow.l(new y71.y(new y71.y(new i1(v, this, str, str2, null, 2), in.rShadow.h(this.s.d(new q40(str)))), new j1(v, (a71.c) null, 2))), this.t);
    }

    @Override // z01.n
    public final y71.i f(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return y71.n1Shadow.y(new s1(com.github.service.wrapper.b.a(this.s, new cb(str, i, str2), ga.h.t, false, null, 56), str2, str, i, 0), this.t);
    }

    @Override // z01.n
    public final y71.i g(String str, String str2, String str3) {
        k71.k.g(str, "query");
        return y71.n1Shadow.y(this.y.b(new id0.n(str, str2, str3)), this.t);
    }

    public final Object h() {
        return this;
    }

    @Override // z01.n
    public final Object i(String str, String str2) {
        return y71.n1Shadow.y(new y1(in.rShadow.h(this.s.d(new y50(str, str2))), str, 0), this.t);
    }

    @Override // z01.n
    public final y71.i j(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return y71.n1Shadow.y(new do0.h(com.github.service.wrapper.b.a(this.s, new qm(str, i), ga.h.t, false, null, 56), str, i, 4), this.t);
    }

    @Override // z01.n
    public final Object k(String str, String str2) {
        return y71.n1Shadow.y(new y(new y00.l(com.github.service.wrapper.a.o(this.r, new nn(str, str2), null, false, null, null, 58), 10), 13), this.t);
    }

    @Override // z01.n
    public final y71.i l(String str, String str2) {
        k71.k.g(str2, "optionId");
        return y71.n1Shadow.I(new t00.f8(new an.b(this, str, str2, (a71.c) null, 9)), new a1(0, null, str2, this));
    }

    @Override // z01.n
    public final y71.i m(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return this.v.h(new id0.g(str, i, str2));
    }

    @Override // z01.n
    public final Object n(String str, String str2, String str3, String str4) {
        return y71.n1Shadow.y(new y(new y00.l(in.rShadow.h(this.r.d(new kc0.p6(str, str2, str3, str4))), 10), 10), this.t);
    }

    @Override // z01.n
    public final y71.i o(String str) {
        return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.e(new kc0.a2(str), new sd0.m(), str, new s(3)))), this.t);
    }

    @Override // z01.n
    public final y71.i p(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return this.w.e(new id0.h(str, i));
    }

    @Override // z01.n
    public final y71.i q(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return this.v.b(new id0.g(str, i, str2));
    }

    @Override // z01.n
    public final y71.i r(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "commentUrl");
        return y71.n1Shadow.y(new gl.f(com.github.service.wrapper.a.o(this.s, new dm(str, i, str2), ga.h.r, false, null, null, 56), 23), this.t);
    }

    @Override // z01.n
    public final y71.i s(String str) {
        return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.e(new ds(str), new sd0.m(), str, new s(2)))), this.t);
    }

    @Override // z01.n
    public final Object t(String str) {
        return y71.n1Shadow.y(new y(new y00.l(com.github.service.wrapper.a.o(this.r, new hb(str), null, false, null, null, 58), 10), 11), this.t);
    }

    @Override // z01.n
    public final y71.i u(String str, String str2, String str3) {
        k71.k.g(str, "discussionId");
        k71.k.g(str2, "body");
        k71.k.g(str3, "parentCommentId");
        return y71.n1Shadow.y(new y00.l(new c00.g(in.rShadow.h(this.s.d(new kc0.n0(str, str2, str3))), str3, this, 16), 10), this.t);
    }

    @Override // z01.n
    public final y71.i v(int i, String str, String str2, String str3) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(str3, "commentUrl");
        return y71.n1Shadow.y(new gl.f(com.github.service.wrapper.a.o(this.s, new kc0.ja(i, str, str2, str3), ga.h.r, false, null, null, 56), 22), this.t);
    }

    @Override // z01.n
    public final y71.i w(String str, String str2) {
        k71.w v = no.a.v(str, "discussionCommentId");
        v.r = x61.rShadow.r;
        return y71.n1Shadow.y(new y71.y(in.rShadow.l(new y71.y(new i1(v, this, str, str2, null, 0), new y00.l(in.rShadow.h(this.s.d(new kc0.y7(str))), 10))), new j1(v, (a71.c) null, 0)), this.t);
    }

    @Override // z01.n
    public final y71.i x(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        return this.v.e(new id0.g(str, i, str2));
    }

    @Override // z01.n
    public final y71.i y(String str, String str2) {
        k71.k.g(str, "discussionCommentId");
        k71.k.g(str2, "body");
        return y71.n1Shadow.y(new y(new y00.l(in.rShadow.h(this.s.d(new t50(str, str2))), 10), 14), this.t);
    }

    @Override // z01.n
    public final y71.i z(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        return this.w.b(new id0.h(str, i));
    }
}
