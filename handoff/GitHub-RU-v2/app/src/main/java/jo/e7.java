package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e7 implements aaShadow.w0 {
    public static final w6 Companion = new w6();
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public aa.u0 w;

    public e7(String str, String str2, String str3, String str4, String str5, aa.u0 u0Var) {
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
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.e0.a;
        List list2 = h10.e0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return k71.k.b(this.r, e7Var.r) && k71.k.b(this.s, e7Var.s) && k71.k.b(this.t, e7Var.t) && k71.k.b(this.u, e7Var.u) && k71.k.b(this.v, e7Var.v) && this.w.equals(e7Var.w);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.p4.a, false);
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
        aa.c.d(aa.c.b(aa.c.a(aa.c.c(n10.a.y, false)))).d(fVar, wVar, this.w);
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
