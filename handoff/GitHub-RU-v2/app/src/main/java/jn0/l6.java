package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l6 implements aaShadow.w0 {
    public static final z5 Companion = new z5();
    public String r;
    public aa.u0 s;
    public aa.u0 t;

    public l6(aa.u0 u0Var, aa.u0 u0Var2, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
        this.t = u0Var2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.c0.a;
        List list2 = kz0.c0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return k71.k.b(this.r, l6Var.r) && this.s.equals(l6Var.s) && this.t.equals(l6Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.v3.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + jo.f4.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "ab8fda04fcc0c606e87b0090592e2af214d4115aa8467f027805a76f040db5c5";
    }

    public final String j() {
        Companion.getClass();
        return "query Commits($id: ID!, $after: String, $branch: String) { node(id: $id) { __typename ...NodeIdFragment ... on PullRequest { commits(first: 25, after: $after) { pageInfo { hasNextPage endCursor } nodes { id commit { __typename ...commitFields id } __typename } } } ... on Repository { gitObject: object(expression: $branch) { __typename ...NodeIdFragment ... on Commit { history(first: 25, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename id ...commitFields } } id } } } id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment commitFields on Commit { id committedDate messageHeadline committedViaWeb authoredByCommitter abbreviatedOid committer { __typename avatarUrl name user { login id __typename } } author { __typename avatarUrl name user { __typename login id } } statusCheckRollup { id state __typename } __typename }";
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
