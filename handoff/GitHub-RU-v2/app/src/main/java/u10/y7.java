package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y7 implements aaShadow.n0 {
    public static final v7 Companion = new v7();
    public String r;

    public y7(String str) {
        k71.k.g(str, "commentId");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.j0.a;
        List list2 = fc0.j0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7) && k71.k.b(this.r, ((y7) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.d5.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "9dd84ccf7929ec0b0e682b51b96a38c99ac3253d1de940359704f247784d3a22";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DeleteIssueComment($commentId: ID!) { deleteIssueComment(input: { id: $commentId } ) { __typename } }";
    }

    public final String name() {
        return "DeleteIssueComment";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("commentId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("DeleteIssueCommentMutation(commentId=", this.r, ")");
    }
}
