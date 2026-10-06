package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x40 implements aaShadow.n0 {
    public static final r40 Companion = new r40();
    public String r;
    public String s;

    public x40(String str, String str2) {
        k71.k.g(str, "pullId");
        k71.k.g(str2, "path");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.i5.a;
        List list2 = en0.i5.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x40)) {
            return false;
        }
        x40 x40Var = (x40) obj;
        return k71.k.b(this.r, x40Var.r) && k71.k.b(this.s, x40Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.zr.a, false);
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
