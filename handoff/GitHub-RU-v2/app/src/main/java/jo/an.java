package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class an implements aaShadow.w0 {
    public static final om Companion = new om();
    public final aa.u0 r;
    public final String s;

    public an(aa.u0 u0Var, String str) {
        k71.k.g(str, "nodeID");
        this.r = u0Var;
        this.s = str;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.s2.a;
        List list2 = h10.s2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        return this.r.equals(anVar.r) && k71.k.b(this.s, anVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.cf.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(30) + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "4dd3899702a69690b7a498851e3807762c880dd4261892c1e77be5e45a24682b";
    }

    public final String j() {
        Companion.getClass();
        return "query MentionableItemsQuery($query: String, $nodeID: ID!, $first: Int!) { node(id: $nodeID) { __typename ... on Issue { mentionableItems(query: $query, first: $first) { nodes { __typename ...mentionableItem } } } ... on PullRequest { mentionableItems(query: $query, first: $first) { nodes { __typename ...mentionableItem } } } ... on Discussion { mentionableItems(query: $query, first: $first) { nodes { __typename ...mentionableItem } } } id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment mentionableItem on MentionableItem { __typename ...NodeIdFragment ... on User { __typename name login ...avatarFragment id } ... on Team { __typename teamName: name teamLogin: combinedSlug teamAvatarUrl: avatarUrl id } ... on Bot { __typename login isCopilot displayName ...avatarFragment id } }";
    }

    public final String name() {
        return "MentionableItemsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("query");
        f4.y(aa.c.i, fVar, wVar, this.r, "nodeID");
        aa.c.a.b(fVar, wVar, this.s);
        fVar.z0("first");
        fVar.z(30);
    }

    public final String toString() {
        return "MentionableItemsQuery(query=" + this.r + ", nodeID=" + this.s + ", first=30)";
    }
}
