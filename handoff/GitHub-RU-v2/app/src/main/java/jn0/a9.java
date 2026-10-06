package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a9 implements aaShadow.n0 {
    public static final x8 Companion = new x8();
    public String r;

    public a9(String str) {
        k71.k.g(str, "commentId");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.n0.a;
        List list2 = kz0.n0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9) && k71.k.b(this.r, ((a9) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.x5.a, false);
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
