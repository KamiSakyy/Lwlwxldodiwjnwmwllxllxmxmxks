package m00;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements w0 {
    public static final f Companion = new f();
    public String r;

    public j(String str) {
        k71.k.g(str, "repositoryId");
        this.r = str;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = r00.b.a;
        List list2 = r00.b.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && k71.k.b(this.r, ((j) obj).r);
    }

    public final p0 g() {
        return aa.c.c(n00.c.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "4b58c59c7fceb03a06e7f930cfc253c74962f6478e53307665c9d4d102e8e3f8";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryCreateIssueInformation($repositoryId: ID!) { node(id: $repositoryId) { __typename ... on Repository { __typename ...RepositoryCreateIssueInformationFragment } id } id __typename }  fragment RepositoryCreateIssueInformationFragment on Repository { id isInOrganization issueTypes { totalCount } __typename }";
    }

    public final String name() {
        return "RepositoryCreateIssueInformation";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("RepositoryCreateIssueInformationQuery(repositoryId=", this.r, ")");
    }
}
