package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i10 implements aa.w0 {
    public static final c10 Companion = new c10();
    public final aa1.b r;
    public final aa1.b s;
    public final aa1.b t;

    public i10(aa1.b bVar, aa1.b bVar2, int i) {
        int i2 = i & 2;
        aa1.b bVar3 = aa.t0.d;
        this.r = i2 != 0 ? bVar3 : bVar;
        this.s = bVar2;
        this.t = bVar3;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.t4.a;
        List list2 = fc0.t4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i10)) {
            return false;
        }
        i10 i10Var = (i10) obj;
        return this.r.equals(i10Var.r) && this.s.equals(i10Var.s) && this.t.equals(i10Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.op.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, f1.e.a(this.r, Integer.hashCode(30) * 31, 31), 31);
    }

    public final String i() {
        return "6eaee1a1fd1d178b4c5a549e690651a933418af138b04e6b6d4fe5768ed40f75";
    }

    public final String j() {
        Companion.getClass();
        return "query TopRepositoriesQuery($first: Int!, $after: String, $type: RepositoryType = null , $includeIssueTemplateProperties: Boolean = false ) { viewer { topRepositories(type: $type, first: $first, after: $after, orderBy: { field: PUSHED_AT direction: DESC } ) { pageInfo { hasNextPage endCursor hasPreviousPage } nodes { __typename ...SimpleRepositoryFragment ...IssueTemplateFragment hasIssuesEnabled isDiscussionsEnabled isArchived id } } id __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }  fragment labelFields on Label { __typename id name color }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }";
    }

    public final String name() {
        return "TopRepositoriesQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.r;
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.s;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("type");
            aa.c.d(aa.c.b(ic0.b.i)).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("type");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        aa.u0 u0Var3 = this.t;
        if (u0Var3 instanceof aa.u0) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var3);
        } else if (z) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        return f1.e.k(jo.f4.u("TopRepositoriesQuery(first=30, after=", this.r, ", type=", this.s, ", includeIssueTemplateProperties="), this.t, ")");
    }
}
