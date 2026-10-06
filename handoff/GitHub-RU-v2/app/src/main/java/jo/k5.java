package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k5 implements aaShadow.n0 {
    public static final g5 Companion = new g5();
    public String r;
    public aa1.b s;
    public aa1.b t;

    public k5(String str, aa1.b bVar, aa1.b bVar2) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = bVar;
        this.t = bVar2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.y.a;
        List list2 = h10.y.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return k71.k.b(this.r, k5Var.r) && k71.k.b(this.s, k5Var.s) && k71.k.b(this.t, k5Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.j3.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "3c34d03f3a43e458ba3367e9ec131a00adf9ca4dcdcca8658a915b8997ab8460";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CloseIssue($id: ID!, $stateReason: IssueClosedStateReason, $duplicateIssueId: ID) { closeIssue(input: { issueId: $id stateReason: $stateReason duplicateIssueId: $duplicateIssueId } ) { issue { __typename ...UpdateIssueStateFragment duplicateOf { __typename ...DuplicateOfFragment id } id } } }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment DuplicateOfFragment on Issue { id title repository { owner { id login } name isPrivate id __typename } number state stateReason __typename }  fragment UpdateIssueStateFragment on Issue { id state stateReason viewerCanReopen parent { __typename id ...SubIssueProgressFragment } duplicateOf { __typename ...DuplicateOfFragment id } __typename }";
    }

    public final String name() {
        return "CloseIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("stateReason");
            aa.c.d(aa.c.b(n10.b.d)).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("duplicateIssueId");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        return f1.e.k(f1.e.o(this.s, "CloseIssueMutation(id=", this.r, ", stateReason=", ", duplicateIssueId="), this.t, ")");
    }
}
