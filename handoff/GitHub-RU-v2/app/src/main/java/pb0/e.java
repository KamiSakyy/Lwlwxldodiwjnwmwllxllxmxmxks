package pb0;

import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import hc0.pm;
import java.util.List;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements w0 {
    public static final a Companion = new a();
    public final String r;

    public e(String str) {
        k71.k.g(str, "repositoryId");
        this.r = str;
    }

    public final aa.m d() {
        pm.Companion.getClass();
        q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = tb0.a.a;
        List list2 = tb0.a.a;
        k71.k.g(list2, "selections");
        r rVar = r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k71.k.b(this.r, ((e) obj).r);
    }

    public final p0 g() {
        return aa.c.c(qb0.a.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "4df8323317df9dccc0fd701d1a668b63d13af4d2d89d464e02eb001de642c4f2";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryCreateIssueInformation($repositoryId: ID!) { node(id: $repositoryId) { __typename ... on Repository { __typename ...RepositoryCreateIssueInformationFragment } id } }  fragment RepositoryCreateIssueInformationFragment on Repository { id isInOrganization __typename }";
    }

    public final String name() {
        return "RepositoryCreateIssueInformation";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("RepositoryCreateIssueInformationQuery(repositoryId=", this.r, ")");
    }
}
