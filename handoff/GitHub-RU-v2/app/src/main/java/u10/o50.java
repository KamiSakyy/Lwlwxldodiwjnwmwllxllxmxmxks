package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o50 implements aaShadow.n0 {
    public static final k50 Companion = new k50();
    public final String r;
    public final String s;

    public o50(String str, String str2) {
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.n5.a;
        List list2 = fc0.n5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o50)) {
            return false;
        }
        o50 o50Var = (o50) obj;
        return k71.k.b(this.r, o50Var.r) && k71.k.b(this.s, o50Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.is.a, false);
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
