package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u80 implements aa.n0 {
    public static final o80 Companion = new o80();
    public final String r;
    public final String s;

    public u80(String str, String str2) {
        k71.k.g(str, "pullId");
        k71.k.g(str2, "path");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.u5.a;
        List list2 = kz0.u5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u80)) {
            return false;
        }
        u80 u80Var = (u80) obj;
        return k71.k.b(this.r, u80Var.r) && k71.k.b(this.s, u80Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.zu.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "a10384c4ffc0c211fd84c222a5dcb44cc83116193ce950574e63cb6bb2a04353";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnmarkFileAsViewed($pullId: ID!, $path: String!) { unmarkFileAsViewed(input: { pullRequestId: $pullId path: $path } ) { clientMutationId pullRequest { number repository { owner { __typename ...NodeIdFragment login } name id __typename } id __typename } } }  fragment NodeIdFragment on Node { id __typename }";
    }

    public final String name() {
        return "UnmarkFileAsViewed";
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
        return x.i.g("UnmarkFileAsViewedMutation(pullId=", this.r, ", path=", this.s, ")");
    }
}
