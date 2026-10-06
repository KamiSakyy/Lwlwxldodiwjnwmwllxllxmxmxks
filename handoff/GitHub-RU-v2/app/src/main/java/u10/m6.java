package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m6 implements aaShadow.n0 {
    public static final i6 Companion = new i6();
    public hc0.i5 r;

    public m6(hc0.i5 i5Var) {
        this.r = i5Var;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.d0.a;
        List list2 = fc0.d0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6) && k71.k.b(this.r, ((m6) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.d4.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "ea6fd338d8877fefe0c2dbd8986803242ceb77025689a76a6e3333f4a47252ac";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreateIssue($createIssueInput: CreateIssueInput!) { createIssue(input: $createIssueInput) { issue { id url number __typename } } }";
    }

    public final String name() {
        return "CreateIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("createIssueInput");
        aa.c.c(ic0.a.g, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "CreateIssueMutation(createIssueInput=" + this.r + ")";
    }
}
