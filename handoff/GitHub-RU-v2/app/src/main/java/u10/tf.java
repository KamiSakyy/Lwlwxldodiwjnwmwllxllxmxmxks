package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tf implements aaShadow.w0 {
    public static final qf Companion = new qf();
    public String r;
    public String s;
    public aa1.b t;

    public tf(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
        this.t = aa.t0.d;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.n1.a;
        List list2 = fc0.n1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf)) {
            return false;
        }
        tf tfVar = (tf) obj;
        return k71.k.b(this.r, tfVar.r) && k71.k.b(this.s, tfVar.s) && k71.k.b(this.t, tfVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.pa.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "0396bee08cba89d6861549afdb649fdb71fc51112a28e50e0bd9e3d38efd61bc";
    }

    public final String j() {
        Companion.getClass();
        return "query IssueTemplate($owner: String!, $name: String!, $includeIssueTemplateProperties: Boolean = true ) { repository(owner: $owner, name: $name) { __typename ...IssueTemplateFragment id } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment labelFields on Label { __typename id name color }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }";
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
        if (u0Var instanceof aaShadow.u0) {
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
