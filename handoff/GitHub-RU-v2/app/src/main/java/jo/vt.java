package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vt implements aaShadow.w0 {
    public static final ot Companion = new ot();
    public String r;
    public String s;
    public String t;
    public aa.u0 u;

    public vt(String str, String str2, String str3, aa.u0 u0Var) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "tagName");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = u0Var;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.q3.a;
        List list2 = h10.q3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt)) {
            return false;
        }
        vt vtVar = (vt) obj;
        return k71.k.b(this.r, vtVar.r) && k71.k.b(this.s, vtVar.s) && k71.k.b(this.t, vtVar.t) && this.u.equals(vtVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.fk.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + a0.s0.b(30, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), 31);
    }

    public final String i() {
        return "7210754fc9275c4470c018ec9b3804516bcc23ba816afe9cdc26271c2cbe49e0";
    }

    public final String j() {
        Companion.getClass();
        return "query ReleaseMentions($owner: String!, $name: String!, $tagName: String!, $first: Int!, $after: String) { repository(owner: $owner, name: $name) { release(tagName: $tagName) { mentions(after: $after, first: $first) { pageInfo { hasNextPage endCursor } nodes { __typename ...UserListItemFragment id } } id __typename } id __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
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
