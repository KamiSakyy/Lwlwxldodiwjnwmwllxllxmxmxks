package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bg implements aaShadow.w0 {
    public static final sf Companion = new sf();
    public String r;
    public String s;
    public String t;
    public String u;

    public bg(String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "oid");
        k71.k.g(str4, "path");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.o1.a;
        List list2 = h10.o1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return k71.k.b(this.r, bgVar.r) && k71.k.b(this.s, bgVar.s) && k71.k.b(this.t, bgVar.t) && k71.k.b(this.u, bgVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.oa.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String i() {
        return "73c7a9f3050b016bb99e66e12c73d49fb090d5b212179caebf24f001af3dbf4c";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchFileContents($owner: String!, $name: String!, $oid: String!, $path: String!) { repository(owner: $owner, name: $name) { id repoObject: object(expression: $oid) { __typename ...NodeIdFragment oid ... on Commit { id file(path: $path) { extension fileType { __typename ... on MarkdownFileType { contentRaw } ... on TextFileType { contentRaw } } } } } __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }";
    }

    public final String name() {
        return "FetchFileContents";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("oid");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("path");
        bVar.b(fVar, wVar, this.u);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("FetchFileContentsQuery(owner=", this.r, ", name=", this.s, ", oid="), this.t, ", path=", this.u, ")");
    }
}
