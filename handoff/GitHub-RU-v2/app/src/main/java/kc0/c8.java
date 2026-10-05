package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c8 implements aa.n0 {
    public static final z7 Companion = new z7();
    public final String r;

    public c8(String str) {
        k71.k.g(str, "discussionId");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.j0.a;
        List list2 = en0.j0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8) && k71.k.b(this.r, ((c8) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.h5.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "85b1c22de71134c543d2d612b4f682eec87a3fdc96c712df7635cdb2d4ee688b";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DeleteDiscussion($discussionId: ID!) { deleteDiscussion(input: { id: $discussionId } ) { __typename } }";
    }

    public final String name() {
        return "DeleteDiscussion";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("discussionId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("DeleteDiscussionMutation(discussionId=", this.r, ")");
    }
}
