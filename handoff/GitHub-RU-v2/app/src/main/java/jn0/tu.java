package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tu implements aa.n0 {
    public static final pu Companion = new pu();
    public final String r;

    public tu(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.s3.a;
        List list2 = kz0.s3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu) && k71.k.b(this.r, ((tu) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.dl.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "8a76667ef661ffc54bd87813f8b1ed624f51fd3befaa69a77873df3d1e18f5c5";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ReopenIssue($id: ID!) { reopenIssue(input: { issueId: $id } ) { issue { __typename ...UpdateIssueStateFragment id } } }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment UpdateIssueStateFragment on Issue { id state stateReason viewerCanReopen parent { __typename id ...SubIssueProgressFragment } __typename }";
    }

    public final String name() {
        return "ReopenIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("ReopenIssueMutation(id=", this.r, ")");
    }
}
