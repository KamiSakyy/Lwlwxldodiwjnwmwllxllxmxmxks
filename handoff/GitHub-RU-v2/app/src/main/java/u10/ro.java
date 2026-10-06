package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ro implements aaShadow.w0 {
    public static final ko Companion = new ko();
    public String r;
    public String s;
    public String t;
    public aa.u0 u;

    public ro(String str, String str2, String str3, aa.u0 u0Var) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "tagName");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.y2.a;
        List list2 = fc0.y2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro)) {
            return false;
        }
        ro roVar = (ro) obj;
        return k71.k.b(this.r, roVar.r) && k71.k.b(this.s, roVar.s) && k71.k.b(this.t, roVar.t) && this.u.equals(roVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ng.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + a0.s0.b(30, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), 31);
    }

    public final String i() {
        return "47eae294a78add84bcedae631d3bb16588ed2c77ade1768126cb06b9c2a3215e";
    }

    public final String j() {
        Companion.getClass();
        return "query ReleaseMentions($owner: String!, $name: String!, $tagName: String!, $first: Int!, $after: String) { repository(owner: $owner, name: $name) { release(tagName: $tagName) { mentions(after: $after, first: $first) { pageInfo { hasNextPage endCursor } nodes { __typename ...UserListItemFragment id } } id __typename } id __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
    }

    public final String name() {
        return "ReleaseMentions";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("tagName");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("first");
        fVar.z(30);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.u);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ReleaseMentionsQuery(owner=", this.r, ", name=", this.s, ", tagName=");
        o.append(this.t);
        o.append(", first=30, after=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }
}
