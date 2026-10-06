package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b7 implements aaShadow.n0 {
    public static final v6 Companion = new v6();
    public String r;
    public String s;
    public String t;
    public String u;
    public aa.u0 v;

    public b7(aa.u0 u0Var, String str, String str2, String str3, String str4) {
        k71.k.g(str, "repositoryId");
        k71.k.g(str2, "baseRefName");
        k71.k.g(str3, "headRefName");
        k71.k.g(str4, "title");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
        this.v = u0Var;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.f0.a;
        List list2 = en0.f0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7)) {
            return false;
        }
        b7 b7Var = (b7) obj;
        return k71.k.b(this.r, b7Var.r) && k71.k.b(this.s, b7Var.s) && k71.k.b(this.t, b7Var.t) && k71.k.b(this.u, b7Var.u) && this.v.equals(b7Var.v);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.m4.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), this.u, 31);
    }

    public final String i() {
        return "d9cf5628e563c270812ae49fa81be09606bc0ca6cdfb6a97a577700c0c26388e";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreatePullRequest($repositoryId: ID!, $baseRefName: String!, $headRefName: String!, $title: String!, $body: String) { createPullRequest(input: { repositoryId: $repositoryId baseRefName: $baseRefName headRefName: $headRefName title: $title body: $body } ) { pullRequest { id repository { id name owner { id login } __typename } number title __typename } } }";
    }

    public final String name() {
        return "CreatePullRequest";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("baseRefName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("headRefName");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("title");
        bVar.b(fVar, wVar, this.u);
        fVar.z0("body");
        aa.c.d(aa.c.i).d(fVar, wVar, this.v);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("CreatePullRequestMutation(repositoryId=", this.r, ", baseRefName=", this.s, ", headRefName=");
        f1.e.x(o, this.t, ", title=", this.u, ", body=");
        return f1.e.j(o, this.v, ")");
    }
}
