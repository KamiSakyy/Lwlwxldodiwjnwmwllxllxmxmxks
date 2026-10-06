package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u4 implements aaShadow.n0 {
    public static final r4 Companion = new r4();
    public String r;
    public aa1.b s;

    public u4(String str, aa1.b bVar) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.w.a;
        List list2 = fc0.w.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return k71.k.b(this.r, u4Var.r) && k71.k.b(this.s, u4Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.z2.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "6296583ce7e378c819ae29232211ae8ae923027ddcb367b19070519c6e80e601";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CloseIssue($id: ID!, $stateReason: IssueClosedStateReason) { closeIssue(input: { issueId: $id stateReason: $stateReason } ) { issue { __typename ...UpdateIssueStateFragment id } } }  fragment UpdateIssueStateFragment on Issue { id state stateReason viewerCanReopen __typename }";
    }

    public final String name() {
        return "CloseIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("stateReason");
            aa.c.d(aa.c.b(ic0.a.s)).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return jo.f4.l(this.s, "CloseIssueMutation(id=", this.r, ", stateReason=", ")");
    }
}
