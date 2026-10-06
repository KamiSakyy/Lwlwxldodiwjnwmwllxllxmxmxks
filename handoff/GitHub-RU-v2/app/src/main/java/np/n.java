package np;

import aa.n0;
import aa.p0;
import aa.q0;
import aa.w;
import java.util.List;
import m10.vp;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements n0 {
    public static final j Companion = new j();
    public String r;

    public n(String str) {
        this.r = str;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = pp.b.a;
        List list2 = pp.b.a;
        k71.k.g(list2, "selections");
        r rVar = r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && k71.k.b(this.r, ((n) obj).r);
    }

    public final p0 g() {
        return aa.c.c(op.d.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "8e1945bcdbdd12451348257b55f3522e1d4fc09a478b08121c1daae70cf1d61e";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ReopenDiscussionMutation($discussionId: ID!) { reopenDiscussion(input: { discussionId: $discussionId } ) { discussion { __typename ...DiscussionClosedStateFragment id } } }  fragment DiscussionClosedStateFragment on Discussion { id closed viewerCanClose viewerCanReopen closedAt stateReason __typename }";
    }

    public final String name() {
        return "ReopenDiscussionMutation";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("discussionId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("ReopenDiscussionMutation(discussionId=", this.r, ")");
    }
}
