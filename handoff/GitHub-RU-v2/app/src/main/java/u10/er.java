package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class er implements aaShadow.n0 {
    public static final ar Companion = new ar();
    public String r;

    public er(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.g3.a;
        List list2 = fc0.g3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er) && k71.k.b(this.r, ((er) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ni.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "785c60aaae89ed5a66245e75a4d0eecc00ea7aef3d93abbf3163a16558925ded";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ReopenIssue($id: ID!) { reopenIssue(input: { issueId: $id } ) { issue { __typename ...UpdateIssueStateFragment id } } }  fragment UpdateIssueStateFragment on Issue { id state stateReason viewerCanReopen __typename }";
    }

    public final String name() {
        return "ReopenIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("ReopenIssueMutation(id=", this.r, ")");
    }
}
