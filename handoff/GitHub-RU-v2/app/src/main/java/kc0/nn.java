package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nnShadow implements aaShadow.w0 {
    public static final hn Companion = new hn();
    public String r;
    public String s;

    public nn(String str, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.v2.a;
        List list2 = en0.v2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnShadow)) {
            return false;
        }
        nnShadow nnVar = (nnShadow) obj;
        return k71.k.b(this.r, nnVar.r) && k71.k.b(this.s, nnVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.rf.a, false);
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
