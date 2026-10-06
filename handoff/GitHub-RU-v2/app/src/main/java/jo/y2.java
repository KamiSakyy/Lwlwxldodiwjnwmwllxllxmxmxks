package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y2 implements aaShadow.n0 {
    public static final v2 Companion = new v2();
    public String r;
    public List s;
    public aa1.b t;

    public y2(String str, List list, aa1.b bVar) {
        k71.k.g(str, "checkSuiteId");
        k71.k.g(list, "environments");
        this.r = str;
        this.s = list;
        this.t = bVar;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.q.a;
        List list2 = h10.q.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return k71.k.b(this.r, y2Var.r) && k71.k.b(this.s, y2Var.s) && k71.k.b(this.t, y2Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.p1.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.c(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "f8f9f0eab85baca22ba3274fca862802c8ff2b9350c2b27a2b0a423a701defa3";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ApproveDeploymentsMutation($checkSuiteId: ID!, $environments: [ID!]!, $comment: String) { approveDeployments(input: { workflowRunId: $checkSuiteId environmentIds: $environments comment: $comment } ) { deployments { id __typename } } }";
    }

    public final String name() {
        return "ApproveDeploymentsMutation";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("checkSuiteId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("environments");
        aa.c.a(bVar).e(fVar, wVar, this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("comment");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApproveDeploymentsMutation(checkSuiteId=");
        sb.append(this.r);
        sb.append(", environments=");
        sb.append(this.s);
        sb.append(", comment=");
        return f1.e.k(sb, this.t, ")");
    }
}
