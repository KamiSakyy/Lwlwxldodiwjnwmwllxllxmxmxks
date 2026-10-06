package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mb implements aaShadow.w0 {
    public static final ib Companion = new ib();
    public String r;

    public mb(String str) {
        k71.k.g(str, "ownerName");
        this.r = str;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.x0.a;
        List list2 = en0.x0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb) && k71.k.b(this.r, ((mb) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.o7.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "9ed3dfabbf222aff1e7289de803e2418ee9e4bea7903a423a38d9eb6e98611f9";
    }

    public final String j() {
        Companion.getClass();
        return "query DiscussionRepositoryName($ownerName: String!) { organization(login: $ownerName) { organizationDiscussionsRepository { name id __typename } id __typename } }";
    }

    public final String name() {
        return "DiscussionRepositoryName";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ownerName");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("DiscussionRepositoryNameQuery(ownerName=", this.r, ")");
    }
}
