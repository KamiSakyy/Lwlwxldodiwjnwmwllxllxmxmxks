package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p5 implements aaShadow.n0 {
    public static final m5 Companion = new m5();
    public String r;

    public p5(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.z.a;
        List list2 = h10.z.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p5) && k71.k.b(this.r, ((p5) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.n3.a, false);
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
