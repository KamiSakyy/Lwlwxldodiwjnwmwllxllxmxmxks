package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jm implements aaShadow.w0 {
    public static final dm Companion = new dm();
    public String r;
    public String s;

    public jm(String str, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.r2.a;
        List list2 = fc0.r2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm)) {
            return false;
        }
        jm jmVar = (jm) obj;
        return k71.k.b(this.r, jmVar.r) && k71.k.b(this.s, jmVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ue.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "88c2543c6e73931dcd9791e85eabf192f54b8549c654786a44ed4702f2657efd";
    }

    public final String j() {
        Companion.getClass();
        return "query PinnedDiscussionsQuery($repositoryOwner: String!, $repositoryName: String!) { repository(owner: $repositoryOwner, name: $repositoryName) { id pinnedDiscussions(first: 10) { nodes { id discussion { number title author { __typename ...actorFields } category { name id __typename } id __typename } pattern gradientStopColors __typename } } __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }";
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
