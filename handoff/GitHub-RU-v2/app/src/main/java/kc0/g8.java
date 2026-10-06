package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g8 implements aaShadow.n0 {
    public static final d8 Companion = new d8();
    public final String r;

    public g8(String str) {
        k71.k.g(str, "commentId");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.k0.a;
        List list2 = en0.k0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8) && k71.k.b(this.r, ((g8) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.j5.a, false);
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
