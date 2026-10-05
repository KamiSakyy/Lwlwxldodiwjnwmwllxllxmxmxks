package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m70 implements aa.n0 {
    public static final i70 Companion = new i70();
    public final String r;
    public final String s;

    public m70(String str, String str2) {
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.u5.a;
        List list2 = en0.u5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m70)) {
            return false;
        }
        m70 m70Var = (m70) obj;
        return k71.k.b(this.r, m70Var.r) && k71.k.b(this.s, m70Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.tt.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "2c5c2b54f839375ce8bdbe68fb45e86ae5bd3605ae5ed4ae854240cedd5d76a5";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdatePullRequestBaseBranch($id: ID!, $baseRefName: String!) { updatePullRequest(input: { pullRequestId: $id baseRefName: $baseRefName } ) { pullRequest { id __typename } } }";
    }

    public final String name() {
        return "UpdatePullRequestBaseBranch";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("baseRefName");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("UpdatePullRequestBaseBranchMutation(id=", this.r, ", baseRefName=", this.s, ")");
    }
}
