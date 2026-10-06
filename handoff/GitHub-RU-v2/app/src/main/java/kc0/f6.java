package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f6 implements aaShadow.w0 {
    public static final t5 Companion = new t5();
    public String r;
    public aa.u0 s;
    public aa.u0 t;

    public f6(aa.u0 u0Var, aa.u0 u0Var2, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
        this.t = u0Var2;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.b0.a;
        List list2 = en0.b0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj;
        return k71.k.b(this.r, f6Var.r) && this.s.equals(f6Var.s) && this.t.equals(f6Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.r3.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + jo.f4.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "e1e22f909afcb55681c61d220d5f687687d83d68c7005f6181c515f37cc76927";
    }

    public final String j() {
        Companion.getClass();
        return "query Commits($id: ID!, $after: String, $branch: String) { node(id: $id) { __typename ...NodeIdFragment ... on PullRequest { commits(first: 25, after: $after) { pageInfo { hasNextPage endCursor } nodes { id commit { __typename ...commitFields id } __typename } } } ... on Repository { gitObject: object(expression: $branch) { __typename ...NodeIdFragment ... on Commit { history(first: 25, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename id ...commitFields } } id } } } id } }  fragment NodeIdFragment on Node { id __typename }  fragment commitFields on Commit { id committedDate messageHeadline committedViaWeb authoredByCommitter abbreviatedOid committer { __typename avatarUrl name user { login id __typename } } author { __typename avatarUrl name user { __typename login id } } statusCheckRollup { id state __typename } __typename }";
    }

    public final String name() {
        return "Commits";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("after");
        aa.o0 o0Var = aa.c.i;
        jo.f4.y(o0Var, fVar, wVar, this.s, "branch");
        aa.c.d(o0Var).d(fVar, wVar, this.t);
    }

    public final String toString() {
        return f1.e.j(jo.f4.t(this.s, "CommitsQuery(id=", this.r, ", after=", ", branch="), this.t, ")");
    }
}
