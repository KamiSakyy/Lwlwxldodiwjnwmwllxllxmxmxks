package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c70 implements aaShadow.n0 {
    public static final y60 Companion = new y60();
    public String r;
    public String s;

    public c70(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.r5.a;
        List list2 = fc0.r5.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c70)) {
            return false;
        }
        c70 c70Var = (c70) obj;
        return k71.k.b(this.r, c70Var.r) && k71.k.b(this.s, c70Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.pt.a, false);
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
