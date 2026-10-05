package rm0;

import kc0.ke;
import kc0.yb0;
import u10.rd;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 implements z01.g, yb0, y90 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final v71.v t;

    public r0(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
        }
    }

    @Override // z01.g
    public final y71.i a(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return y41.t1.S("fetchRefComparisonCommits", "3.12");
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return y41.t1.S("fetchRefComparisonCommits", "3.10");
        }
    }

    @Override // z01.g
    public final y71.i b(String str, String str2, String str3, String str4, String str5) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "branch");
                k71.k.g(str4, "path");
                return y71.n1.y(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new ke(new aa.u0(str5), str, str2, str3, str4), null, false, null, null, 58), 10), 9), this.t);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "branch");
                k71.k.g(str4, "path");
                return y71.n1.y(new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new rd(new aa.u0(str5), str, str2, str3, str4), null, false, null, null, 58), 10), 8), this.t);
        }
    }

    @Override // z01.g
    public final y71.i c(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return y41.t1.S("fetchRefComparisonCommits", "3.12");
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return y41.t1.S("fetchRefComparisonCommits", "3.10");
        }
    }

    @Override // z01.g
    public final y71.i d(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "commitId");
                return y71.n1.y(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new kc0.q5(str), null, false, null, null, 58), 10), 6), this.t);
            default:
                k71.k.g(str, "commitId");
                return y71.n1.y(new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new u10.i5(str), null, false, null, null, 58), 10), 5), this.t);
        }
    }

    @Override // z01.g
    public final y71.i e(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return y41.t1.S("fetchRefComparisonCommits", "3.12");
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "baseRefName");
                k71.k.g(str4, "headRefName");
                return y41.t1.S("fetchRefComparisonCommits", "3.10");
        }
    }

    @Override // z01.g
    public final Object f(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new kc0.f6(new aa.u0(str2), new aa.u0(str3), str), null, false, null, null, 58), 10), 8), this.t);
            default:
                return y71.n1.y(new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new u10.x5(new aa.u0(str2), new aa.u0(str3), str), null, false, null, null, 58), 10), 7), this.t);
        }
    }

    @Override // z01.g
    public final y71.i g(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repoOwner");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-commitOid$0");
                return y71.n1.y(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new kc0.m5(str, str2, str3), null, false, null, null, 58), 10), 7), this.t);
            default:
                k71.k.g(str, "repoOwner");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-commitOid$0");
                return y71.n1.y(new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new u10.e5(str, str2, str3), null, false, null, null, 58), 10), 6), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
