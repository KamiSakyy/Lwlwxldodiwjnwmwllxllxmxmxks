package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vl implements aaShadow.w0 {
    public static final jl Companion = new jl();
    public aa.u0 r;
    public String s;

    public vl(aa.u0 u0Var, String str) {
        k71.k.g(str, "nodeID");
        this.r = u0Var;
        this.s = str;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.o2.a;
        List list2 = kz0.o2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl)) {
            return false;
        }
        vl vlVar = (vl) obj;
        return this.r.equals(vlVar.r) && k71.k.b(this.s, vlVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ge.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(30) + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "328a786f87c85bf3125919526a15cfccfa3ddf1f1c87f67a523d45e0ecfd8f63";
    }

    public final String j() {
        Companion.getClass();
        return "query MentionableItemsQuery($query: String, $nodeID: ID!, $first: Int!) { node(id: $nodeID) { __typename ... on Issue { mentionableItems(query: $query, first: $first) { nodes { __typename ...mentionableItem } } } ... on PullRequest { mentionableItems(query: $query, first: $first) { nodes { __typename ...mentionableItem } } } ... on Discussion { mentionableItems(query: $query, first: $first) { nodes { __typename ...mentionableItem } } } id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment mentionableItem on MentionableItem { __typename ...NodeIdFragment ... on User { __typename name login ...avatarFragment id } ... on Team { __typename teamName: name teamLogin: combinedSlug teamAvatarUrl: avatarUrl id } ... on Bot { __typename login isCopilot ...avatarFragment id } }";
    }

    public final String name() {
        return "MentionableItemsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("query");
        jo.f4Shadow.y(aa.c.i, fVar, wVar, this.r, "nodeID");
        aa.c.a.b(fVar, wVar, this.s);
        fVar.z0("first");
        fVar.z(30);
    }

    public final String toString() {
        return "MentionableItemsQuery(query=" + this.r + ", nodeID=" + this.s + ", first=30)";
    }
}
