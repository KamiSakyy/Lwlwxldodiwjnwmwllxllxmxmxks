package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cj implements aaShadow.w0 {
    public static final qi Companion = new qi();
    public aa.u0 r;
    public String s;

    public cj(aa.u0 u0Var, String str) {
        k71.k.g(str, "nodeID");
        this.r = u0Var;
        this.s = str;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.e2.a;
        List list2 = fc0.e2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj)) {
            return false;
        }
        cj cjVar = (cj) obj;
        return this.r.equals(cjVar.r) && k71.k.b(this.s, cjVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.hc.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(30) + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "d27cbfa62777aba3d7541ce4efb3b1b4aa4b0e32f7910a184d9a67e7ca41bd37";
    }

    public final String j() {
        Companion.getClass();
        return "query MentionableItemsQuery($query: String, $nodeID: ID!, $first: Int!) { node(id: $nodeID) { __typename ... on Issue { mentionableItems(query: $query, first: $first) { nodes { __typename ...mentionableItem } } } ... on PullRequest { mentionableItems(query: $query, first: $first) { nodes { __typename ...mentionableItem } } } ... on Discussion { mentionableItems(query: $query, first: $first) { nodes { __typename ...mentionableItem } } } id } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment mentionableItem on MentionableItem { __typename ...NodeIdFragment ... on User { __typename name login ...avatarFragment id } ... on Team { __typename teamName: name teamLogin: combinedSlug teamAvatarUrl: avatarUrl id } ... on Bot { __typename login ...avatarFragment id } }";
    }

    public final String name() {
        return "MentionableItemsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("query");
        jo.f4.y(aa.c.i, fVar, wVar, this.r, "nodeID");
        aa.c.a.b(fVar, wVar, this.s);
        fVar.z0("first");
        fVar.z(30);
    }

    public final String toString() {
        return "MentionableItemsQuery(query=" + this.r + ", nodeID=" + this.s + ", first=30)";
    }
}
