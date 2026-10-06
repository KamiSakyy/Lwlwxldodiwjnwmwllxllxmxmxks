package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qa0 implements aaShadow.n0 {
    public static final la0 Companion = new la0();
    public final String r;
    public final aa1.b s;

    public qa0(String str, aa1.b bVar) {
        k71.k.g(str, "issueId");
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.d6.a;
        List list2 = kz0.d6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa0)) {
            return false;
        }
        qa0 qa0Var = (qa0) obj;
        return k71.k.b(this.r, qa0Var.r) && k71.k.b(this.s, qa0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ew.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "0496a7a69935d9dd713a5a23b3a626d78e66d472d5f0a075e223957247029612";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateIssueIssueType($issueId: ID!, $issueTypeId: ID) { updateIssueIssueType(input: { issueId: $issueId issueTypeId: $issueTypeId } ) { issue { id issueType { __typename ...IssueTypeFragment id } __typename } } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }";
    }

    public final String name() {
        return "UpdateIssueIssueType";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("issueId");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("issueTypeId");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return jo.f4.l(this.s, "UpdateIssueIssueTypeMutation(issueId=", this.r, ", issueTypeId=", ")");
    }
}
