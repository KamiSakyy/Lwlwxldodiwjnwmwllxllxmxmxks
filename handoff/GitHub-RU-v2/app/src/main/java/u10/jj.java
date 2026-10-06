package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jj implements aaShadow.w0 {
    public static final dj Companion = new dj();
    public aa.u0 r;
    public String s;

    public jj(aa.u0 u0Var, String str) {
        k71.k.g(str, "nodeID");
        this.r = u0Var;
        this.s = str;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.f2.a;
        List list2 = fc0.f2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj)) {
            return false;
        }
        jj jjVar = (jj) obj;
        return this.r.equals(jjVar.r) && k71.k.b(this.s, jjVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.sc.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(30) + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "30774e05352c75e4f00395b40e739f6c93accfc3e429c900d6fdb4810527dccb";
    }

    public final String j() {
        Companion.getClass();
        return "query MentionableUsersQuery($query: String, $nodeID: ID!, $first: Int!) { node(id: $nodeID) { __typename ... on Repository { mentionableUsers(query: $query, first: $first) { nodes { __typename name login ...avatarFragment id } } } id } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }";
    }

    public final String name() {
        return "MentionableUsersQuery";
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
        return "MentionableUsersQuery(query=" + this.r + ", nodeID=" + this.s + ", first=30)";
    }
}
