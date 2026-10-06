package t00;

import java.util.LinkedHashSet;
import java.util.Set;
import jn0.cg;
import jn0.yf0;
import jo.mi0;
import jo.zg;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 implements z01.g, mi0, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public v71.v t;
    public s01.p u;

    public r0(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                this.u = new a00.b(jVar, bVar, vVar, new h0.r(18), new he.c(5), s01.o.r, new he.c(6), new h0.r(19), new h0.r(20), new h0.r(21), new h0.r(22), new he.c(7), null, 120832);
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                this.u = new jy.d(jVar, bVar, vVar, new lm0.g(4), new lb0.a(3), s01.o.r, new lb0.a(4), new lm0.g(5), new lm0.g(6), new lm0.g(7), new lm0.g(8), new lb0.a(5), null, 120832);
                break;
        }
    }

    public final y71.i a(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return ((jy.d) this.u).e(new lp.a(str, str2, str3, str4));
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return ((a00.b) this.u).e(new ho0.a(str, str2, str3, str4));
        }
    }

    public final y71.i b(String str, String str2, String str3, String str4, String str5) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "branch");
                k71.k.g(str4, "path");
                return y71.n1.y(new rm0.v9(new y00.l(com.github.service.wrapper.a.o(this.s, new zg(new aa.u0(str5), str, str2, str3, str4), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 17), this.t);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "branch");
                k71.k.g(str4, "path");
                return y71.n1.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.s, new cg(new aa.u0(str5), str, str2, str3, str4), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 14), this.t);
        }
    }

    public final y71.i c(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return ((jy.d) this.u).h(new lp.a(str, str2, str3, str4));
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return ((a00.b) this.u).h(new ho0.a(str, str2, str3, str4));
        }
    }

    public final y71.i d(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "commitId");
                return y71.n1.y(new rm0.v9(new y00.l(com.github.service.wrapper.a.o(this.s, new jo.g6(str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 14), this.t);
            default:
                k71.k.g(str, "commitId");
                return y71.n1.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.s, new jn0.w5(str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 11), this.t);
        }
    }

    public final y71.i e(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return ((jy.d) this.u).b(new lp.a(str, str2, str3, str4));
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return ((a00.b) this.u).b(new ho0.a(str, str2, str3, str4));
        }
    }

    public final Object f(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new rm0.v9(new y00.l(com.github.service.wrapper.a.o(this.s, new jo.v6(new aa.u0(str2), new aa.u0(str3), str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 16), this.t);
            default:
                return y71.n1.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.s, new jn0.l6(new aa.u0(str2), new aa.u0(str3), str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 13), this.t);
        }
    }

    public final y71.i g(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repoOwner");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-commitOid$0");
                return y71.n1.y(new rm0.v9(new y00.l(com.github.service.wrapper.a.o(this.s, new jo.c6(str, str2, str3), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 15), this.t);
            default:
                k71.k.g(str, "repoOwner");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-commitOid$0");
                return y71.n1.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.s, new jn0.s5(str, str2, str3), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 12), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
    public static Object isEmpty() { return null; }
}
