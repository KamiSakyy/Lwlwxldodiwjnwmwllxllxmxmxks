package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cd0 implements aaShadow.n0 {
    public static final yc0 Companion = new yc0();
    public String r;
    public String s;

    public cd0(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.m6.a;
        List list2 = kz0.m6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd0)) {
            return false;
        }
        cd0 cd0Var = (cd0) obj;
        return k71.k.b(this.r, cd0Var.r) && k71.k.b(this.s, cd0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.zx.a, false);
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
