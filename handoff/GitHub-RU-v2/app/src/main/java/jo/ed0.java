package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ed0 implements aaShadow.n0 {
    public static final zc0 Companion = new zc0();
    public String r;
    public aa1.b s;

    public ed0(String str, aa1.b bVar) {
        k71.k.g(str, "issueId");
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.m6.a;
        List list2 = h10.m6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed0)) {
            return false;
        }
        ed0 ed0Var = (ed0) obj;
        return k71.k.b(this.r, ed0Var.r) && k71.k.b(this.s, ed0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.zx.a, false);
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
        return f4.l(this.s, "UpdateIssueIssueTypeMutation(issueId=", this.r, ", issueTypeId=", ")");
    }
}
