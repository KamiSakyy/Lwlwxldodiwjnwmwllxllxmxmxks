package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t9 implements aaShadow.n0 {
    public static final q9 Companion = new q9();
    public String r;

    public t9(String str) {
        k71.k.g(str, "discussionId");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.p0.a;
        List list2 = h10.p0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9) && k71.k.b(this.r, ((t9) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.l6.a, false);
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
