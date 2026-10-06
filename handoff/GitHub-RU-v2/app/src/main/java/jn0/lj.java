package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lj implements aaShadow.n0 {
    public static final fj Companion = new fj();
    public String r;
    public String s;

    public lj(String str, String str2) {
        k71.k.g(str, "pullId");
        k71.k.g(str2, "path");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.b2.a;
        List list2 = kz0.b2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj)) {
            return false;
        }
        lj ljVar = (lj) obj;
        return k71.k.b(this.r, ljVar.r) && k71.k.b(this.s, ljVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.cd.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "ee5f22c1973fcfa32cec70275538a85b810f7a63cfedd6d0c5866faf8451f7e4";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkFileAsViewed($pullId: ID!, $path: String!) { markFileAsViewed(input: { pullRequestId: $pullId path: $path } ) { clientMutationId pullRequest { number repository { owner { __typename ...NodeIdFragment login } name id __typename } id __typename } } }  fragment NodeIdFragment on Node { id __typename }";
    }

    public final String name() {
        return "MarkFileAsViewed";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("pullId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("path");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("MarkFileAsViewedMutation(pullId=", this.r, ", path=", this.s, ")");
    }
}
