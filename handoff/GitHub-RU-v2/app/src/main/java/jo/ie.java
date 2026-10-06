package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ie implements aaShadow.w0 {
    public static final be Companion = new be();
    public String r;
    public String s;
    public int t;
    public String u;
    public aa.u0 v;

    public ie(String str, String str2, int i, String str3, aa.u0 u0Var) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(str3, "path");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = str3;
        this.v = u0Var;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.i1.a;
        List list2 = h10.i1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie)) {
            return false;
        }
        ie ieVar = (ie) obj;
        return k71.k.b(this.r, ieVar.r) && k71.k.b(this.s, ieVar.s) && this.t == ieVar.t && k71.k.b(this.u, ieVar.u) && this.v.equals(ieVar.v);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.k9.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), this.u, 31);
    }

    public final String i() {
        return "a11e1d6d09101361bd75607dcd70f95de07c3d3959e0d8651103e505d749b71e";
    }

    public final String j() {
        Companion.getClass();
        return "query ExpandCodeLines($repositoryOwner: String!, $repositoryName: String!, $number: Int!, $path: String!, $contextLines: [DiffLineRange!]) { repository(owner: $repositoryOwner, name: $repositoryName) { id pullRequest(number: $number) { diff { patch(path: $path) { diffLines(injectedContextLines: $contextLines) { __typename ...DiffLineFragment } id __typename } } id __typename } __typename } id __typename }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }";
    }

    public final String name() {
        return "ExpandCodeLines";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("number");
        fVar.z(this.t);
        fVar.z0("path");
        bVar.b(fVar, wVar, this.u);
        fVar.z0("contextLines");
        aa.c.d(aa.c.b(aa.c.a(aa.c.c(n10.a.y, false)))).d(fVar, wVar, this.v);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ExpandCodeLinesQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", number=");
        x.i.r(this.t, ", path=", this.u, ", contextLines=", o);
        return f1.e.j(o, this.v, ")");
    }
}
