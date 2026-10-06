package rm0;

import jn0.oz;
import jn0.r00;
import jn0.rp;
import jn0.tz;
import jn0.yf0;
import jn0.zx;
import jo.a00;
import jo.mi0;
import jo.o10;
import jo.or;
import jo.r20;
import jo.t10;
import kc0.bx;
import kc0.dw;
import kc0.pv;
import kc0.yb0;
import kc0.zn;
import u10.bu;
import u10.nv;
import u10.pu;
import u10.vm;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j7 implements z01.c1, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.bShadow t;
    public v71.v u;

    public j7(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
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
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            case 3:
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

    @Override // z01.c1
    public final y71.i a(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repoId");
                k71.k.g(str2, "refName");
                k71.k.g(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-refOid$0");
                return y71.n1Shadow.y(new o3(in.rShadow.h(this.s.d(new kc0.g7(str, str2, str3))), 11), this.u);
            case 1:
                k71.k.g(str, "repoId");
                k71.k.g(str2, "refName");
                k71.k.g(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-refOid$0");
                return y71.n1Shadow.y(new t00.g3(in.rShadow.h(this.s.d(new jo.t8(str, str2, str3))), 14), this.u);
            case 2:
                k71.k.g(str, "repoId");
                k71.k.g(str2, "refName");
                k71.k.g(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-refOid$0");
                return y71.n1Shadow.y(new vb0.p1(in.rShadow.h(this.s.d(new u10.y6(str, str2, str3))), 15), this.u);
            default:
                k71.k.g(str, "repoId");
                k71.k.g(str2, "refName");
                k71.k.g(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-refOid$0");
                return y71.n1Shadow.y(new wy0.h1(in.rShadow.h(this.s.d(new jn0.w7(str, str2, str3))), 19), this.u);
        }
    }

    @Override // z01.c1
    public final y71.i b(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                aa.u0 u0Var = new aa.u0(str3);
                if (str4 == null || t71.p.T(str4)) {
                    str4 = null;
                }
                aa1.bShadow bVar = aa.t0.d;
                return y71.n1Shadow.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new pv(str, str2, u0Var, str4 == null ? bVar : new aa.u0(str4), bVar), null, false, null, null, 58), 10), 20), this.u);
            case 1:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                aa.u0 u0Var2 = new aa.u0(str3);
                if (str4 == null || t71.p.T(str4)) {
                    str4 = null;
                }
                aa1.bShadow bVar2 = aa.t0.d;
                return y71.n1Shadow.y(new t00.q6(new y00.l(com.github.service.wrapper.a.o(this.s, new a00(str, str2, u0Var2, str4 == null ? bVar2 : new aa.u0(str4), bVar2), null, false, null, null, 58), 10), 5), this.u);
            case 2:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                aa.u0 u0Var3 = new aa.u0(str3);
                if (str4 == null || t71.p.T(str4)) {
                    str4 = null;
                }
                aa1.bShadow bVar3 = aa.t0.d;
                return y71.n1Shadow.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new bu(str, str2, u0Var3, str4 == null ? bVar3 : new aa.u0(str4), bVar3), null, false, null, null, 58), 10), 17), this.u);
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                aa.u0 u0Var4 = new aa.u0(str3);
                if (str4 == null || t71.p.T(str4)) {
                    str4 = null;
                }
                aa1.bShadow bVar4 = aa.t0.d;
                return y71.n1Shadow.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.s, new zx(str, str2, u0Var4, str4 == null ? bVar4 : new aa.u0(str4), bVar4), null, false, null, null, 58), 10), 29), this.u);
        }
    }

    @Override // z01.c1
    public final y71.i c(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                if (str3 == null || t71.p.T(str3)) {
                    str3 = null;
                }
                return y71.n1Shadow.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new bx(str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 10), 19), this.u);
            case 1:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                if (str3 == null || t71.p.T(str3)) {
                    str3 = null;
                }
                return y71.n1Shadow.y(new t00.q6(new y00.l(com.github.service.wrapper.a.o(this.s, new r20(str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 10), 4), this.u);
            case 2:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                if (str3 == null || t71.p.T(str3)) {
                    str3 = null;
                }
                return y71.n1Shadow.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new nv(str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 10), 16), this.u);
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                if (str3 == null || t71.p.T(str3)) {
                    str3 = null;
                }
                return y71.n1Shadow.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.s, new r00(str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 10), 28), this.u);
        }
    }

    @Override // z01.c1
    public final y71.i d(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                return y71.n1Shadow.y(new j3(com.github.service.wrapper.a.o(this.s, new dw(str, str2), null, false, null, null, 58), 15), this.u);
            case 1:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                return y71.n1Shadow.y(new t00.h7(com.github.service.wrapper.a.o(this.s, new t10(str, str2), null, false, null, null, 58), 1), this.u);
            case 2:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                return y71.n1Shadow.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new pu(str, str2), null, false, null, null, 58), 13), this.u);
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                return y71.n1Shadow.y(new wy0.d6(com.github.service.wrapper.a.o(this.s, new tz(str, str2), null, false, null, null, 58), 4), this.u);
        }
    }

    @Override // z01.c1
    public final y71.i e(String str, String str2, String str3, String str4, String str5) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repoId");
                k71.k.g(str2, "title");
                k71.k.g(str3, "body");
                k71.k.g(str4, "baseRefName");
                k71.k.g(str5, "headRefName");
                return y71.n1Shadow.y(new o3(in.rShadow.h(this.s.d(new kc0.b7(new aa.u0(str3), str, str4, str5, str2))), 10), this.u);
            case 1:
                k71.k.g(str, "repoId");
                k71.k.g(str2, "title");
                k71.k.g(str3, "body");
                k71.k.g(str4, "baseRefName");
                k71.k.g(str5, "headRefName");
                return y71.n1Shadow.y(new t00.g3(in.rShadow.h(this.s.d(new jo.o8(new aa.u0(str3), str, str4, str5, str2))), 13), this.u);
            case 2:
                k71.k.g(str, "repoId");
                k71.k.g(str2, "title");
                k71.k.g(str3, "body");
                k71.k.g(str4, "baseRefName");
                k71.k.g(str5, "headRefName");
                return y71.n1Shadow.y(new vb0.p1(in.rShadow.h(this.s.d(new u10.t6(new aa.u0(str3), str, str4, str5, str2))), 14), this.u);
            default:
                k71.k.g(str, "repoId");
                k71.k.g(str2, "title");
                k71.k.g(str3, "body");
                k71.k.g(str4, "baseRefName");
                k71.k.g(str5, "headRefName");
                return y71.n1Shadow.y(new wy0.h1(in.rShadow.h(this.s.d(new jn0.r7(new aa.u0(str3), str, str4, str5, str2))), 18), this.u);
        }
    }

    @Override // z01.c1
    public final y71.i f(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                return y41.t1.S("fetchRefComparisonAndActivePrs", "3.12");
            case 1:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                return y71.n1Shadow.y(new t00.h7(com.github.service.wrapper.a.o(this.t, new o10(str, str2, str3, str4), null, false, null, null, 62), 0), this.u);
            case 2:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                return y41.t1.S("fetchRefComparisonAndActivePrs", "3.10");
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                return y71.n1Shadow.y(new wy0.d6(com.github.service.wrapper.a.o(this.t, new oz(str, str2, str3, str4), null, false, null, null, 62), 3), this.u);
        }
    }

    @Override // z01.c1
    public final y71.i g(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return y71.n1Shadow.y(new j3(com.github.service.wrapper.b.a(this.t, new zn(str, str2, str3, str4), ga.h.t, false, null, 56), 14), this.u);
            case 1:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return y71.n1Shadow.y(new sm.b(com.github.service.wrapper.b.a(this.t, new or(str, str2, str3, str4), ga.h.t, false, null, 56), 29), this.u);
            case 2:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return y71.n1Shadow.y(new vb0.e2(com.github.service.wrapper.b.a(this.t, new vm(str, str2, str3, str4), ga.h.t, false, null, 56), 12), this.u);
            default:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return y71.n1Shadow.y(new wy0.d6(com.github.service.wrapper.b.a(this.t, new rp(str, str2, str3, str4), ga.h.t, false, null, 56), 2), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
