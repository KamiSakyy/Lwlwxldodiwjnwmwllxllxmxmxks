package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ao implements aaShadow.w0 {
    public static final vn Companion = new vn();
    public String r;
    public m10.ny s;
    public m10.py t;
    public boolean u;

    public ao(String str, m10.ny nyVar, m10.py pyVar, boolean z) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = nyVar;
        this.t = pyVar;
        this.u = z;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.w2.a;
        List list2 = h10.w2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return k71.k.b(this.r, aoVar.r) && this.s == aoVar.s && this.t == aoVar.t && this.u == aoVar.u;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.cg.a, false);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + ((this.t.hashCode() + ((this.s.hashCode() + (this.r.hashCode() * 31)) * 31)) * 31);
    }

    public final String i() {
        return "ae8ab7bfa4718a3f1bcb568ec84d10aedf85c80c288f37a105e79f5a7c0b3975";
    }

    public final String j() {
        Companion.getClass();
        return "query MergeRequirements($id: ID!, $mergeAction: PullRequestMergeAction!, $mergeMethod: PullRequestMergeMethod!, $bypassRequirements: Boolean!) { node(id: $id) { __typename ... on PullRequest { __typename id mergeRequirements(mergeAction: $mergeAction, mergeMethod: $mergeMethod, bypassRequirements: $bypassRequirements) { commitMessageBody commitMessageHeadline possibleCommitAuthorEmails state } } id } id __typename }";
    }

    public final String name() {
        return "MergeRequirements";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("mergeAction");
        fVar.I(this.s.r);
        fVar.z0("mergeMethod");
        fVar.I(this.t.r);
        fVar.z0("bypassRequirements");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(this.u));
    }

    public final String toString() {
        return "MergeRequirementsQuery(id=" + this.r + ", mergeAction=" + this.s + ", mergeMethod=" + this.t + ", bypassRequirements=" + this.u + ")";
    }
}
