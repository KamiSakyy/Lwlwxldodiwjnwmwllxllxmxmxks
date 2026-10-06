package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qw implements aaShadow.n0 {
    public static final mw Companion = new mw();
    public String r;

    public qw(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.z3.a;
        List list2 = h10.z3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qw) && k71.k.b(this.r, ((qw) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.lm.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "f22f76ddd7bc271bb14ab304d6d4c3174cbb5bc218bd88447d49cb72e5492b1e";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ReopenIssue($id: ID!) { reopenIssue(input: { issueId: $id } ) { issue { __typename ...UpdateIssueStateFragment id } } }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment DuplicateOfFragment on Issue { id title repository { owner { id login } name isPrivate id __typename } number state stateReason __typename }  fragment UpdateIssueStateFragment on Issue { id state stateReason viewerCanReopen parent { __typename id ...SubIssueProgressFragment } duplicateOf { __typename ...DuplicateOfFragment id } __typename }";
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








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f {
        public f() {
        }
    }
}
