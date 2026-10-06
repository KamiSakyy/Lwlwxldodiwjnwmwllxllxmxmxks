package fp;

import f1.q6;
import f1.qb;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jo.mi0;
import jo.o7;
import kotlin.NoWhenBranchMatchedException;
import m10.i7;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements on.e, mi0 {
    public com.github.service.wrapper.j r;
    public com.github.service.wrapper.b s;
    public v71.v t;
    public com.github.rudroid.common.k u;
    public w61.p v;
    public w61.p w;
    public w61.p x;
    public w61.p y;

    public o(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, com.github.rudroid.common.k kVar) {
        k71.k.g(jVar, "client");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(vVar, "ioDispatcher");
        k71.k.g(kVar, "featureManager");
        this.r = jVar;
        this.s = bVar;
        this.t = vVar;
        this.u = kVar;
        final int i = 0;
        this.v = sy.w.t(new j71.a(this) { // from class: fp.h
            public final /* synthetic */ o s;

            {
                this.s = this;
            }

            public final Object a() {
                switch (i) {
                    case 0:
                        o oVar = this.s;
                        com.github.service.wrapper.j jVar2 = oVar.r;
                        com.github.service.wrapper.b bVar2 = oVar.s;
                        v71.v vVar2 = oVar.t;
                        com.github.rudroid.common.k kVar2 = oVar.u;
                        k71.k.g(jVar2, "client");
                        k71.k.g(bVar2, "cachedClient");
                        k71.k.g(vVar2, "ioDispatcher");
                        k71.k.g(kVar2, "featureManager");
                        return new g(jVar2, bVar2, vVar2, new com.github.rudroid.support.u(26, kVar2), new com.github.rudroid.issueorpullrequest.mergebox.ui.e0(23, kVar2), s01.oShadow.r, new qb(2), new q6(17), new q6(18), new q6(19), new q6(20), new qb(3), null, 120832);
                    case 1:
                        o oVar2 = this.s;
                        com.github.service.wrapper.j jVar3 = oVar2.r;
                        com.github.service.wrapper.b bVar3 = oVar2.s;
                        v71.v vVar3 = oVar2.t;
                        k71.k.g(jVar3, "client");
                        k71.k.g(bVar3, "cachedClient");
                        k71.k.g(vVar3, "ioDispatcher");
                        return new z0(jVar3, bVar3, vVar3, new y(1), new qb(10), s01.oShadow.r, new qb(11), new y(2), new y(3), new y(4), new y(5), new qb(12), null, 120832);
                    case 2:
                        o oVar3 = this.s;
                        com.github.service.wrapper.j jVar4 = oVar3.r;
                        com.github.service.wrapper.b bVar4 = oVar3.s;
                        v71.v vVar4 = oVar3.t;
                        k71.k.g(jVar4, "client");
                        k71.k.g(bVar4, "cachedClient");
                        k71.k.g(vVar4, "ioDispatcher");
                        return new z(jVar4, bVar4, vVar4, new q6(26), new qb(7), s01.oShadow.r, new qb(8), new q6(27), new q6(28), new q6(29), new y(0), new qb(9), null, 120832);
                    default:
                        o oVar4 = this.s;
                        com.github.service.wrapper.j jVar5 = oVar4.r;
                        com.github.service.wrapper.b bVar5 = oVar4.s;
                        v71.v vVar5 = oVar4.t;
                        k71.k.g(jVar5, "client");
                        k71.k.g(bVar5, "cachedClient");
                        k71.k.g(vVar5, "ioDispatcher");
                        return new r(jVar5, bVar5, vVar5, new q6(21), new qb(4), s01.oShadow.r, new qb(5), new q6(22), new q6(23), new q6(24), new q6(25), new qb(6), null, 120832);
                }
            }
        });
        final int i2 = 1;
        this.w = sy.w.t(new j71.a(this) { // from class: fp.h
            public final /* synthetic */ o s;

            {
                this.s = this;
            }

            public final Object a() {
                switch (i2) {
                    case 0:
                        o oVar = this.s;
                        com.github.service.wrapper.j jVar2 = oVar.r;
                        com.github.service.wrapper.b bVar2 = oVar.s;
                        v71.v vVar2 = oVar.t;
                        com.github.rudroid.common.k kVar2 = oVar.u;
                        k71.k.g(jVar2, "client");
                        k71.k.g(bVar2, "cachedClient");
                        k71.k.g(vVar2, "ioDispatcher");
                        k71.k.g(kVar2, "featureManager");
                        return new g(jVar2, bVar2, vVar2, new com.github.rudroid.support.u(26, kVar2), new com.github.rudroid.issueorpullrequest.mergebox.ui.e0(23, kVar2), s01.oShadow.r, new qb(2), new q6(17), new q6(18), new q6(19), new q6(20), new qb(3), null, 120832);
                    case 1:
                        o oVar2 = this.s;
                        com.github.service.wrapper.j jVar3 = oVar2.r;
                        com.github.service.wrapper.b bVar3 = oVar2.s;
                        v71.v vVar3 = oVar2.t;
                        k71.k.g(jVar3, "client");
                        k71.k.g(bVar3, "cachedClient");
                        k71.k.g(vVar3, "ioDispatcher");
                        return new z0(jVar3, bVar3, vVar3, new y(1), new qb(10), s01.oShadow.r, new qb(11), new y(2), new y(3), new y(4), new y(5), new qb(12), null, 120832);
                    case 2:
                        o oVar3 = this.s;
                        com.github.service.wrapper.j jVar4 = oVar3.r;
                        com.github.service.wrapper.b bVar4 = oVar3.s;
                        v71.v vVar4 = oVar3.t;
                        k71.k.g(jVar4, "client");
                        k71.k.g(bVar4, "cachedClient");
                        k71.k.g(vVar4, "ioDispatcher");
                        return new z(jVar4, bVar4, vVar4, new q6(26), new qb(7), s01.oShadow.r, new qb(8), new q6(27), new q6(28), new q6(29), new y(0), new qb(9), null, 120832);
                    default:
                        o oVar4 = this.s;
                        com.github.service.wrapper.j jVar5 = oVar4.r;
                        com.github.service.wrapper.b bVar5 = oVar4.s;
                        v71.v vVar5 = oVar4.t;
                        k71.k.g(jVar5, "client");
                        k71.k.g(bVar5, "cachedClient");
                        k71.k.g(vVar5, "ioDispatcher");
                        return new r(jVar5, bVar5, vVar5, new q6(21), new qb(4), s01.oShadow.r, new qb(5), new q6(22), new q6(23), new q6(24), new q6(25), new qb(6), null, 120832);
                }
            }
        });
        final int i3 = 2;
        this.x = sy.w.t(new j71.a(this) { // from class: fp.h
            public final /* synthetic */ o s;

            {
                this.s = this;
            }

            public final Object a() {
                switch (i3) {
                    case 0:
                        o oVar = this.s;
                        com.github.service.wrapper.j jVar2 = oVar.r;
                        com.github.service.wrapper.b bVar2 = oVar.s;
                        v71.v vVar2 = oVar.t;
                        com.github.rudroid.common.k kVar2 = oVar.u;
                        k71.k.g(jVar2, "client");
                        k71.k.g(bVar2, "cachedClient");
                        k71.k.g(vVar2, "ioDispatcher");
                        k71.k.g(kVar2, "featureManager");
                        return new g(jVar2, bVar2, vVar2, new com.github.rudroid.support.u(26, kVar2), new com.github.rudroid.issueorpullrequest.mergebox.ui.e0(23, kVar2), s01.oShadow.r, new qb(2), new q6(17), new q6(18), new q6(19), new q6(20), new qb(3), null, 120832);
                    case 1:
                        o oVar2 = this.s;
                        com.github.service.wrapper.j jVar3 = oVar2.r;
                        com.github.service.wrapper.b bVar3 = oVar2.s;
                        v71.v vVar3 = oVar2.t;
                        k71.k.g(jVar3, "client");
                        k71.k.g(bVar3, "cachedClient");
                        k71.k.g(vVar3, "ioDispatcher");
                        return new z0(jVar3, bVar3, vVar3, new y(1), new qb(10), s01.oShadow.r, new qb(11), new y(2), new y(3), new y(4), new y(5), new qb(12), null, 120832);
                    case 2:
                        o oVar3 = this.s;
                        com.github.service.wrapper.j jVar4 = oVar3.r;
                        com.github.service.wrapper.b bVar4 = oVar3.s;
                        v71.v vVar4 = oVar3.t;
                        k71.k.g(jVar4, "client");
                        k71.k.g(bVar4, "cachedClient");
                        k71.k.g(vVar4, "ioDispatcher");
                        return new z(jVar4, bVar4, vVar4, new q6(26), new qb(7), s01.oShadow.r, new qb(8), new q6(27), new q6(28), new q6(29), new y(0), new qb(9), null, 120832);
                    default:
                        o oVar4 = this.s;
                        com.github.service.wrapper.j jVar5 = oVar4.r;
                        com.github.service.wrapper.b bVar5 = oVar4.s;
                        v71.v vVar5 = oVar4.t;
                        k71.k.g(jVar5, "client");
                        k71.k.g(bVar5, "cachedClient");
                        k71.k.g(vVar5, "ioDispatcher");
                        return new r(jVar5, bVar5, vVar5, new q6(21), new qb(4), s01.oShadow.r, new qb(5), new q6(22), new q6(23), new q6(24), new q6(25), new qb(6), null, 120832);
                }
            }
        });
        final int i4 = 3;
        this.y = sy.w.t(new j71.a(this) { // from class: fp.h
            public final /* synthetic */ o s;

            {
                this.s = this;
            }

            public final Object a() {
                switch (i4) {
                    case 0:
                        o oVar = this.s;
                        com.github.service.wrapper.j jVar2 = oVar.r;
                        com.github.service.wrapper.b bVar2 = oVar.s;
                        v71.v vVar2 = oVar.t;
                        com.github.rudroid.common.k kVar2 = oVar.u;
                        k71.k.g(jVar2, "client");
                        k71.k.g(bVar2, "cachedClient");
                        k71.k.g(vVar2, "ioDispatcher");
                        k71.k.g(kVar2, "featureManager");
                        return new g(jVar2, bVar2, vVar2, new com.github.rudroid.support.u(26, kVar2), new com.github.rudroid.issueorpullrequest.mergebox.ui.e0(23, kVar2), s01.oShadow.r, new qb(2), new q6(17), new q6(18), new q6(19), new q6(20), new qb(3), null, 120832);
                    case 1:
                        o oVar2 = this.s;
                        com.github.service.wrapper.j jVar3 = oVar2.r;
                        com.github.service.wrapper.b bVar3 = oVar2.s;
                        v71.v vVar3 = oVar2.t;
                        k71.k.g(jVar3, "client");
                        k71.k.g(bVar3, "cachedClient");
                        k71.k.g(vVar3, "ioDispatcher");
                        return new z0(jVar3, bVar3, vVar3, new y(1), new qb(10), s01.oShadow.r, new qb(11), new y(2), new y(3), new y(4), new y(5), new qb(12), null, 120832);
                    case 2:
                        o oVar3 = this.s;
                        com.github.service.wrapper.j jVar4 = oVar3.r;
                        com.github.service.wrapper.b bVar4 = oVar3.s;
                        v71.v vVar4 = oVar3.t;
                        k71.k.g(jVar4, "client");
                        k71.k.g(bVar4, "cachedClient");
                        k71.k.g(vVar4, "ioDispatcher");
                        return new z(jVar4, bVar4, vVar4, new q6(26), new qb(7), s01.oShadow.r, new qb(8), new q6(27), new q6(28), new q6(29), new y(0), new qb(9), null, 120832);
                    default:
                        o oVar4 = this.s;
                        com.github.service.wrapper.j jVar5 = oVar4.r;
                        com.github.service.wrapper.b bVar5 = oVar4.s;
                        v71.v vVar5 = oVar4.t;
                        k71.k.g(jVar5, "client");
                        k71.k.g(bVar5, "cachedClient");
                        k71.k.g(vVar5, "ioDispatcher");
                        return new r(jVar5, bVar5, vVar5, new q6(21), new qb(4), s01.oShadow.r, new qb(5), new q6(22), new q6(23), new q6(24), new q6(25), new qb(6), null, 120832);
                }
            }
        });
    }

    @Override // on.e
    public final y71.i a(List list, on.g gVar) {
        k71.k.g(list, "filters");
        k71.k.g(gVar, "order");
        return n1.y(((g) this.v.getValue()).b(new a(list, gVar, 30)), this.t);
    }

    @Override // on.e
    public final y71.i b(String str, String str2) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        ga.h hVar = ga.h.t;
        return n1.y(new bz0.e(com.github.service.wrapper.a.o(this.s, new l1(1, aa.t0.d, str, str2), hVar, false, (LinkedHashSet) null, (Set) null, 60), 23), this.t);
    }

    @Override // on.e
    public final y71.i c(String str) {
        return n1.y(new bz0.e(com.github.service.wrapper.a.o(this.s, new r0(str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 22), this.t);
    }

    @Override // on.e
    public final y71.i d(String str, String str2) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        return n1.y(((z0) this.w.getValue()).b(new h0(str, str2)), this.t);
    }

    @Override // on.e
    public final y71.i e(String str, String str2, List list, on.g gVar) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        k71.k.g(list, "filters");
        k71.k.g(gVar, "order");
        return n1.y(((r) this.y.getValue()).b(new q(str, str2, list, gVar, 30)), this.t);
    }

    @Override // on.e
    public final y71.i f(String str, String str2, List list, on.g gVar) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        k71.k.g(list, "filters");
        k71.k.g(gVar, "order");
        return n1.y(((r) this.y.getValue()).e(new q(str, str2, list, gVar, 30)), this.t);
    }

    @Override // on.e
    public final y71.i g(String str, String str2) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        return n1.y(((z) this.x.getValue()).b(new p(str, str2)), this.t);
    }

    public final Object h() {
        return this;
    }

    @Override // on.e
    public final y71.i i(String str) {
        return n1.y(new bz0.e(com.github.service.wrapper.a.o(this.s, new m0(str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 25), this.t);
    }

    @Override // on.e
    public final y71.i j(List list, on.g gVar, Integer num) {
        k71.k.g(list, "filters");
        k71.k.g(gVar, "order");
        return n1.y(((g) this.v.getValue()).e(new a(list, gVar, num != null ? num.intValue() : 30)), this.t);
    }

    @Override // on.e
    public final y71.i k(String str, String str2, List list, on.g gVar) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        k71.k.g(list, "filters");
        k71.k.g(gVar, "order");
        return n1.y(((r) this.y.getValue()).h(new q(str, str2, list, gVar, 30)), this.t);
    }

    @Override // on.e
    public final y71.i l(String str) {
        return n1.y(new bz0.e(com.github.service.wrapper.a.o(this.r, new f(str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 24), this.t);
    }

    @Override // on.e
    public final y71.i m(String str, String str2) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        return n1.y(((z0) this.w.getValue()).e(new h0(str, str2)), this.t);
    }

    @Override // on.e
    public final y71.i n(String str, String str2) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        return n1.y(((z) this.x.getValue()).e(new p(str, str2)), this.t);
    }

    @Override // on.e
    public final y71.i o(List list, on.g gVar, Integer num) {
        k71.k.g(list, "filters");
        k71.k.g(gVar, "order");
        return n1.y(((g) this.v.getValue()).h(new a(list, gVar, num != null ? num.intValue() : 30)), this.t);
    }

    @Override // on.e
    public final y71.i p(String str, String str2, com.github.rudroid.common.d dVar, String str3, String str4, Integer num, String str5) {
        i7 i7Var;
        k71.k.g(str, "repositoryId");
        k71.k.g(str2, "baseRef");
        aa.u0 u0Var = new aa.u0(str2);
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            i7Var = i7.s;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i7Var = i7.t;
        }
        i7 i7Var2 = i7Var;
        aa.u0 u0Var2 = new aa.u0(str3);
        aa.u0 u0Var3 = new aa.u0(str4);
        aa1.b bVar = aa.t0.d;
        aa1.b u0Var4 = num == null ? bVar : new aa.u0(num);
        if (str5 != null) {
            bVar = new aa.u0(str5);
        }
        return n1.y(new bz0.t(in.rShadow.h(this.r.d(new o7(str, u0Var, i7Var2, u0Var2, u0Var3, u0Var4, bVar, new aa.u0(Boolean.valueOf(!this.u.a()))))), 14), this.t);
    }
    public static final Object b = null;
    public static final Object c = null;
}
