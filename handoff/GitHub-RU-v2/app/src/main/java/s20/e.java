package s20;

import aa.n0;
import aa.p0;
import aa.q0;
import aa.u0;
import aa.w;
import hc0.wg;
import java.util.List;
import jo.f4;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements n0 {
    public static final b Companion = new b();
    public String r;
    public u0 s;

    public e(u0 u0Var, String str) {
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        wg.Companion.getClass();
        q0 q0Var = wg.c1;
        k71.k.g(q0Var, "type");
        List list = u20.a.a;
        List list2 = u20.a.a;
        k71.k.g(list2, "selections");
        r rVar = r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.r.equals(eVar.r) && this.s.equals(eVar.s);
    }

    public final p0 g() {
        return aa.c.c(t20.b.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "a2d039725ad54282c61c1fe4c19197a94cd5df0c93ea1ada5b48b5e606b6a8ad";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CloseDiscussionMutation($discussionId: ID!, $reason: DiscussionCloseReason) { closeDiscussion(input: { discussionId: $discussionId reason: $reason } ) { discussion { __typename ...DiscussionClosedStateFragment id } } }  fragment DiscussionClosedStateFragment on Discussion { id closed viewerCanClose viewerCanReopen closedAt stateReason __typename }";
    }

    public final String name() {
        return "CloseDiscussionMutation";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("discussionId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("reason");
        aa.c.d(aa.c.b(ic0.a.n)).d(fVar, wVar, this.s);
    }

    public final String toString() {
        return f4.k(this.s, "CloseDiscussionMutation(discussionId=", this.r, ", reason=", ")");
    }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
