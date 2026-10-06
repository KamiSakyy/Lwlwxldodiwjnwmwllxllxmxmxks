package qo;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f3 implements aa.w0 {
    public static final b3 Companion = new b3();
    public String r;
    public String s;
    public aa1.b t;

    public f3(aa1.b bVar, String str, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(bVar, "after");
        this.r = str;
        this.s = str2;
        this.t = bVar;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = cp.o.a;
        List list2 = cp.o.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return k71.k.b(this.r, f3Var.r) && k71.k.b(this.s, f3Var.s) && k71.k.b(this.t, f3Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ro.z1.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + a0.s0.b(30, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "e15a1754c34abf186ed5cbd424113255cf41b7e93912cd3a0b0f9260916bfe46";
    }

    public final String j() {
        Companion.getClass();
        return "query WorkflowsByRepositoryId($repositoryOwner: String!, $repositoryName: String!, $first: Int!, $after: String) { repository(owner: $repositoryOwner, name: $repositoryName) { id workflows(first: $first, after: $after, orderBy: { field: NAME direction: ASC } ) { __typename ...WorkflowConnectionFragment } __typename } id __typename }  fragment WorkflowFragment on Workflow { id name state runs(first: 1) { totalCount nodes { createdAt id __typename } } __typename }  fragment WorkflowConnectionFragment on WorkflowConnection { nodes { __typename ...WorkflowFragment id } pageInfo { hasNextPage endCursor hasPreviousPage } }";
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
