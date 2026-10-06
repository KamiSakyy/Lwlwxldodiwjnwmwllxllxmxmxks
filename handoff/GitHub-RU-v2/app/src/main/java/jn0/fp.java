package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fp implements aaShadow.w0 {
    public static final zo Companion = new zo();
    public String r;
    public String s;

    public fp(String str, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.b3.a;
        List list2 = kz0.b3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp)) {
            return false;
        }
        fp fpVar = (fp) obj;
        return k71.k.b(this.r, fpVar.r) && k71.k.b(this.s, fpVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.wg.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "a844d6eac0a36bd5a50fe6c7560e6b1ab197f8c13a4dad3c902be31bc932ad18";
    }

    public final String j() {
        Companion.getClass();
        return "query PinnedDiscussionsQuery($repositoryOwner: String!, $repositoryName: String!) { repository(owner: $repositoryOwner, name: $repositoryName) { id pinnedDiscussions(first: 10) { nodes { id discussion { number title author { __typename ...actorFields } category { name id __typename } id __typename } pattern gradientStopColors __typename } } __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }";
    }

    public final String name() {
        return "PinnedDiscussionsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("PinnedDiscussionsQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ")");
    }
}
