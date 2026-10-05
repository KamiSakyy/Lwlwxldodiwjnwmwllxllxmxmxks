package fz0;

import a0.s0;
import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import com.github.rudroid.copilot.h1;
import java.util.List;
import pz0.su;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements w0 {
    public static final d Companion = new d();
    public final String r;
    public final String s;
    public final String t;

    public n(String str, String str2, String str3) {
        k71.k.g(str2, "owner");
        k71.k.g(str3, "name");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = jz0.a.a;
        List list2 = jz0.a.a;
        k71.k.g(list2, "selections");
        r rVar = r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.r, nVar.r) && k71.k.b(this.s, nVar.s) && k71.k.b(this.t, nVar.t);
    }

    public final p0 g() {
        return aa.c.c(gz0.d.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "66f9986c07f713af7b2e2385847b4d3ba61e7c4cc3cc412efe9783fdb6e3a47a";
    }

    public final String j() {
        Companion.getClass();
        return "query ResolveResource($url: URI!, $owner: String!, $name: String!) { repository(owner: $owner, name: $name) { __typename name id } resource(url: $url) { __typename ...NodeIdFragment ... on Workflow { id } ... on WorkflowRun { id checkSuite { id matchingPullRequests(first: 1) { nodes { id __typename } } __typename } } ... on PullRequest { id commits(last: 1) { nodes { id commit { id __typename } __typename } } } } id __typename }  fragment NodeIdFragment on Node { id __typename }";
    }

    public final String name() {
        return "ResolveResource";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("url");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("owner");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.t);
    }

    public final String toString() {
        return h1.p(s0.o("ResolveResourceQuery(url=", this.r, ", owner=", this.s, ", name="), this.t, ")");
    }


}
