package qo;

import java.util.List;
import jo.f4Shadow;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements aa.w0 {
    public static final r Companion = new r();
    public String r;
    public aa.u0 s;
    public aa.u0 t;

    public w(aa.u0 u0Var, aa.u0 u0Var2, String str) {
        k71.k.g(str, "checkSuiteId");
        this.r = str;
        this.s = u0Var;
        this.t = u0Var2;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = cp.b.a;
        List list2 = cp.b.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.r, wVar.r) && this.s.equals(wVar.s) && this.t.equals(wVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ro.p.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f4.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "646a5ab539a52fe37d500c36ab0532968deb6fca1410f598553b456d1b4131a4";
    }

    public final String j() {
        Companion.getClass();
        return "query CheckRunByName($checkSuiteId: ID!, $first: Int, $checkRunName: String) { node(id: $checkSuiteId) { __typename id ... on CheckSuite { id checkRuns(first: $first, after: null, filterBy: { checkName: $checkRunName } ) { totalCount nodes { id startedAt status conclusion __typename } } } } id __typename }";
    }

    public final String name() {
        return "CheckRunByName";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("checkSuiteId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        aa.c.d(aa.c.b(tp.a.a)).d(fVar, wVar, this.s);
        fVar.z0("checkRunName");
        aa.c.d(aa.c.i).d(fVar, wVar, this.t);
    }

    public final String toString() {
        return f1.e.j(f4.t(this.s, "CheckRunByNameQuery(checkSuiteId=", this.r, ", first=", ", checkRunName="), this.t, ")");
    }
}
