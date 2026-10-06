package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qf0 implements aaShadow.n0 {
    public static final mf0 Companion = new mf0();
    public String r;
    public String s;

    public qf0(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.v6.a;
        List list2 = h10.v6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf0)) {
            return false;
        }
        qf0 qf0Var = (qf0) obj;
        return k71.k.b(this.r, qf0Var.r) && k71.k.b(this.s, qf0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.vz.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "a8ba05ff24db98cf8023024192a36d5a6ac4b228d6edc359b7d01a7dfa002985";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdatePullRequestTitleMutation($id: ID!, $title: String!) { updatePullRequest(input: { pullRequestId: $id title: $title } ) { pullRequest { id title titleHTML __typename } } }";
    }

    public final String name() {
        return "UpdatePullRequestTitleMutation";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("title");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("UpdatePullRequestTitleMutation(id=", this.r, ", title=", this.s, ")");
    }
}
