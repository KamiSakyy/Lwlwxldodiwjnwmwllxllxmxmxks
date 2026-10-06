package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vm implements aaShadow.w0 {
    public static final pm Companion = new pm();
    public String r;
    public String s;
    public String t;
    public String u;

    public vm(String str, String str2, String str3, String str4) {
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
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.t2.a;
        List list2 = fc0.t2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm)) {
            return false;
        }
        vm vmVar = (vm) obj;
        return k71.k.b(this.r, vmVar.r) && k71.k.b(this.s, vmVar.s) && k71.k.b(this.t, vmVar.t) && k71.k.b(this.u, vmVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.df.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String i() {
        return "51f4590ade3322d11725586af809deddebbb12aa664c05a035d28d9832f0ebf5";
    }

    public final String j() {
        Companion.getClass();
        return "query PullRequestAheadBehind($owner: String!, $name: String!, $baseRef: String!, $headRef: String!) { repository(owner: $owner, name: $name) { id ref(qualifiedName: $baseRef) { id compare(headRef: $headRef) { aheadBy behindBy commits(first: 50) { totalCount nodes { __typename ...CommitDiffEntryFragment id } } id __typename } __typename } __typename } }  fragment CommitDiffEntryFragment on Commit { id abbreviatedOid oid messageHeadline messageBody __typename }";
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
