package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jo implements aa.n0 {
    public static final fo Companion = new fo();
    public final String r;
    public final List s;
    public final aa1.b t;

    public jo(String str, List list, aa1.b bVar) {
        k71.k.g(str, "checkSuiteId");
        k71.k.g(list, "environments");
        this.r = str;
        this.s = list;
        this.t = bVar;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.x2.a;
        List list2 = fc0.x2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo)) {
            return false;
        }
        jo joVar = (jo) obj;
        return k71.k.b(this.r, joVar.r) && k71.k.b(this.s, joVar.s) && k71.k.b(this.t, joVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.kg.a, false);
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
        if (u0Var instanceof aa.u0) {
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
