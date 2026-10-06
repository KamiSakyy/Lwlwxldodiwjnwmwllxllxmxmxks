package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nt implements aaShadow.n0 {
    public static final jt Companion = new jt();
    public String r;
    public List s;
    public aa1.b t;

    public nt(String str, List list, aa1.b bVar) {
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
        List list = h10.p3.a;
        List list2 = h10.p3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt)) {
            return false;
        }
        nt ntVar = (nt) obj;
        return k71.k.b(this.r, ntVar.r) && k71.k.b(this.s, ntVar.s) && k71.k.b(this.t, ntVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ck.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.c(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "bd7dfd656578369bd8d4c9382c4d48dc40ca6237e8648af8a99b18e5716d8fe9";
    }

    public final String j() {
        Companion.getClass();
        return "mutation RejectDeployments($checkSuiteId: ID!, $environments: [ID!]!, $comment: String) { rejectDeployments(input: { workflowRunId: $checkSuiteId environmentIds: $environments comment: $comment } ) { deployments { id __typename } } }";
    }

    public final String name() {
        return "RejectDeployments";
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
        StringBuilder sb = new StringBuilder("RejectDeploymentsMutation(checkSuiteId=");
        sb.append(this.r);
        sb.append(", environments=");
        sb.append(this.s);
        sb.append(", comment=");
        return f1.e.k(sb, this.t, ")");
    }
}
