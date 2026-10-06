package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z4 implements aaShadow.n0 {
    public static final w4 Companion = new w4();
    public String r;

    public z4(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.x.a;
        List list2 = en0.x.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4) && k71.k.b(this.r, ((z4) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.c3.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "cd717fd32d2ab8154517d74dfbdf48b6b6691d95b688dbc3be00e9fc2e0c2307";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ClosePullRequest($id: ID!) { closePullRequest(input: { pullRequestId: $id } ) { pullRequest { id state viewerCanReopen viewerCanDeleteHeadRef __typename } } }";
    }

    public final String name() {
        return "ClosePullRequest";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("ClosePullRequestMutation(id=", this.r, ")");
    }
}
