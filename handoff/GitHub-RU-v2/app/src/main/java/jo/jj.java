package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jj implements aa.w0 {
    public static final gj Companion = new gj();
    public final String r;
    public final String s;
    public final aa1.b t;

    public jj(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
        this.t = aa.t0.d;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.a2.a;
        List list2 = h10.a2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj)) {
            return false;
        }
        jj jjVar = (jj) obj;
        return k71.k.b(this.r, jjVar.r) && k71.k.b(this.s, jjVar.s) && k71.k.b(this.t, jjVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ed.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "85fa7df091a3b1680bfa0122cb3d93af5a8020bd0788abc5f9672c41a8e290b4";
    }

    public final String j() {
        Companion.getClass();
        return "query IssueTemplate($owner: String!, $name: String!, $includeIssueTemplateProperties: Boolean = true ) { repository(owner: $owner, name: $name) { __typename ...IssueTemplateFragment id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment labelFields on Label { __typename id name color }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } type { __typename ...IssueTypeFragment id } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }";
    }

    public final String name() {
        return "IssueTemplate";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.l.b(fVar, wVar, Boolean.TRUE);
        }
    }

    public final String toString() {
        return f1.e.k(a0.s0.o("IssueTemplateQuery(owner=", this.r, ", name=", this.s, ", includeIssueTemplateProperties="), this.t, ")");
    }
}
