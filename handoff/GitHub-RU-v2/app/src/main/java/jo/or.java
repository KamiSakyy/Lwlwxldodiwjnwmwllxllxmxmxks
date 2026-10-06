package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class or implements aaShadow.w0 {
    public static final ir Companion = new ir();
    public String r;
    public String s;
    public String t;
    public String u;

    public or(String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "baseRef");
        k71.k.g(str4, "headRef");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.k3.a;
        List list2 = h10.k3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or)) {
            return false;
        }
        or orVar = (or) obj;
        return k71.k.b(this.r, orVar.r) && k71.k.b(this.s, orVar.s) && k71.k.b(this.t, orVar.t) && k71.k.b(this.u, orVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ni.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String i() {
        return "364d1add9f167c425d0be7a0505cd4e5b0c9e9f94424d58a6093644fd097ff10";
    }

    public final String j() {
        Companion.getClass();
        return "query PullRequestAheadBehind($owner: String!, $name: String!, $baseRef: String!, $headRef: String!) { repository(owner: $owner, name: $name) { id ref(qualifiedName: $baseRef) { id compare(headRef: $headRef) { aheadBy behindBy commits(first: 50) { totalCount nodes { __typename ...CommitDiffEntryFragment id } } id __typename } __typename } __typename } id __typename }  fragment CommitDiffEntryFragment on Commit { id abbreviatedOid oid messageHeadline messageBody __typename }";
    }

    public final String name() {
        return "PullRequestAheadBehind";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("baseRef");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("headRef");
        bVar.b(fVar, wVar, this.u);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("PullRequestAheadBehindQuery(owner=", this.r, ", name=", this.s, ", baseRef="), this.t, ", headRef=", this.u, ")");
    }
}
