package s20;

import aa.n0;
import aa.p0;
import aa.q0;
import aa.w;
import hc0.wg;
import java.util.List;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements n0 {
    public static final i Companion = new i();
    public String r;

    public m(String str) {
        this.r = str;
    }

    public final aa.m d() {
        wg.Companion.getClass();
        q0 q0Var = wg.c1;
        k71.k.g(q0Var, "type");
        List list = u20.b.a;
        List list2 = u20.b.a;
        k71.k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && k71.k.b(this.r, ((m) obj).r);
    }

    public final p0 g() {
        return aa.c.c(t20.d.a, false);
    }

    public final int hashCode() {
        return this.rShadow.hashCode();
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
