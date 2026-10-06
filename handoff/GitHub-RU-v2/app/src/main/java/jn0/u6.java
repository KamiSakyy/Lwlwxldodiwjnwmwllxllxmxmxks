package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u6 implements aaShadow.w0 {
    public static final m6 Companion = new m6();
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public aa.u0 w;

    public u6(String str, String str2, String str3, String str4, String str5, aa.u0 u0Var) {
        k71.k.g(str, "ownerName");
        k71.k.g(str2, "repoName");
        k71.k.g(str3, "baseRefName");
        k71.k.g(str4, "headRefName");
        k71.k.g(str5, "path");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
        this.v = str5;
        this.w = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.d0.a;
        List list2 = kz0.d0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        return k71.k.b(this.r, u6Var.r) && k71.k.b(this.s, u6Var.s) && k71.k.b(this.t, u6Var.t) && k71.k.b(this.u, u6Var.u) && k71.k.b(this.v, u6Var.v) && this.w.equals(u6Var.w);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.i4.a, false);
    }

    public final int hashCode() {
        return this.w.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), this.u, 31), this.v, 31);
    }

    public final String i() {
        return "403ea4d1857f763ad13fa90d43745319857ee7f52145a40c83784fdba1d1e0a9";
    }

    public final String j() {
        Companion.getClass();
        return "query CompareRefsExpandCodeLines($ownerName: String!, $repoName: String!, $baseRefName: String!, $headRefName: String!, $path: String!, $contextLines: [DiffLineRange!]) { repository(owner: $ownerName, name: $repoName) { id comparison: ref(qualifiedName: $baseRefName) { id compare(headRef: $headRefName) { id diff { patch(path: $path) { id diffLines(injectedContextLines: $contextLines) { __typename ...DiffLineFragment } __typename } } __typename } __typename } __typename } id __typename }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }";
    }

    public final String name() {
        return "CompareRefsExpandCodeLines";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ownerName");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repoName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("baseRefName");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("headRefName");
        bVar.b(fVar, wVar, this.u);
        fVar.z0("path");
        bVar.b(fVar, wVar, this.v);
        fVar.z0("contextLines");
        aa.c.d(aa.c.b(aa.c.a(aa.c.c(qz0.a.n, false)))).d(fVar, wVar, this.w);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("CompareRefsExpandCodeLinesQuery(ownerName=", this.r, ", repoName=", this.s, ", baseRefName=");
        f1.e.x(o, this.t, ", headRefName=", this.u, ", path=");
        o.append(this.v);
        o.append(", contextLines=");
        o.append(this.w);
        o.append(")");
        return o.toString();
    }
}
