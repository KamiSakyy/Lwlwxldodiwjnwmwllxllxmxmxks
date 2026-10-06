package b20;

import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r2 implements aa.w0 {
    public static final n2 Companion = new n2();
    public String r;
    public String s;
    public aa1.b t;

    public r2(aa1.b bVar, String str, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(bVar, "after");
        this.r = str;
        this.s = str2;
        this.t = bVar;
    }

    public final aa.m d() {
        pm.Companion.getClass();
        aa.q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = n20.l.a;
        List list2 = n20.l.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return k71.k.b(this.r, r2Var.r) && k71.k.b(this.s, r2Var.s) && k71.k.b(this.t, r2Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(c20.r1.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + a0.s0.b(30, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "2001aba5fa6f4716938d7f35cc75d91af00d7dbcdd9dd21d33c3ef7d16455b39";
    }

    public final String j() {
        Companion.getClass();
        return "query WorkflowsByRepositoryId($repositoryOwner: String!, $repositoryName: String!, $first: Int!, $after: String) { repository(owner: $repositoryOwner, name: $repositoryName) { id workflows(first: $first, after: $after, orderBy: { field: NAME direction: ASC } ) { __typename ...WorkflowConnectionFragment } __typename } }  fragment WorkflowFragment on Workflow { id name state runs(first: 1) { totalCount nodes { createdAt id __typename } } __typename }  fragment WorkflowConnectionFragment on WorkflowConnection { nodes { __typename ...WorkflowFragment id } pageInfo { hasNextPage endCursor hasPreviousPage } }";
    }

    public final String name() {
        return "WorkflowsByRepositoryId";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return f1.e.k(a0.s0.o("WorkflowsByRepositoryIdQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", first=30, after="), this.t, ")");
    }
}
