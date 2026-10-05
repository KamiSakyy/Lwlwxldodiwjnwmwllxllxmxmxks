package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a5 implements aa.n0 {
    public static final x4 Companion = new x4();
    public final String r;
    public final aa1.b s;

    public a5(String str, aa1.b bVar) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.x.a;
        List list2 = kz0.x.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj;
        return k71.k.b(this.r, a5Var.r) && k71.k.b(this.s, a5Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.d3.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "bba2ff92eb7f7c15ddf68b7dd7bbf91a98610d6134b8caddeee298ffbbccea72";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CloseIssue($id: ID!, $stateReason: IssueClosedStateReason) { closeIssue(input: { issueId: $id stateReason: $stateReason } ) { issue { __typename ...UpdateIssueStateFragment id } } }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment UpdateIssueStateFragment on Issue { id state stateReason viewerCanReopen parent { __typename id ...SubIssueProgressFragment } __typename }";
    }

    public final String name() {
        return "CloseIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("stateReason");
            aa.c.d(aa.c.b(qz0.a.w)).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return jo.f4.l(this.s, "CloseIssueMutation(id=", this.r, ", stateReason=", ")");
    }
}
