package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u6 implements aa.n0 {
    public static final q6 Companion = new q6();
    public final gn0.s5 r;

    public u6(gn0.s5 s5Var) {
        this.r = s5Var;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.e0.a;
        List list2 = en0.e0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6) && k71.k.b(this.r, ((u6) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.j4.a, false);
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
        aa.c.c(hn0.a.g, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "CreateIssueMutation(createIssueInput=" + this.r + ")";
    }
}
