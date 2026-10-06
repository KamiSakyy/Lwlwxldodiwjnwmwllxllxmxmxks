package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cm implements aaShadow.w0 {
    public static final wl Companion = new wl();
    public final aa.u0 r;
    public final String s;

    public cm(aa.u0 u0Var, String str) {
        k71.k.g(str, "nodeID");
        this.r = u0Var;
        this.s = str;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.p2.a;
        List list2 = kz0.p2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm)) {
            return false;
        }
        cm cmVar = (cm) obj;
        return this.r.equals(cmVar.r) && k71.k.b(this.s, cmVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.re.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(30) + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "eed6729b70166cf83c48998c9a48dbb0b7c7672f1727b1aededf523c7e8f54ad";
    }

    public final String j() {
        Companion.getClass();
        return "query MentionableUsersQuery($query: String, $nodeID: ID!, $first: Int!) { node(id: $nodeID) { __typename ... on Repository { mentionableUsers(query: $query, first: $first) { nodes { __typename name login ...avatarFragment id } } } id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }";
    }

    public final String name() {
        return "MentionableUsersQuery";
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
        return "MentionableUsersQuery(query=" + this.r + ", nodeID=" + this.s + ", first=30)";
    }
}
