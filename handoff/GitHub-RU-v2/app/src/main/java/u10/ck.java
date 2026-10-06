package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ck implements aaShadow.w0 {
    public static final xj Companion = new xj();
    public String r;
    public String s;
    public int t;

    public ck(String str, int i, String str2) {
        this.r = str;
        this.s = str2;
        this.t = i;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.i2.a;
        List list2 = fc0.i2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        return k71.k.b(this.r, ckVar.r) && k71.k.b(this.s, ckVar.s) && this.t == ckVar.t;
    }

    public final aa.p0 g() {
        return aa.c.c(p20.gd.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.t) + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "228520cf9cd4e66d5c80d80c6214c731c2a26faba6f882e1790635a9f16fbf12";
    }

    public final String j() {
        Companion.getClass();
        return "query MergeStatus($repositoryOwner: String!, $repositoryName: String!, $number: Int!) { repository(owner: $repositoryOwner, name: $repositoryName) { id issueOrPullRequest(number: $number) { __typename ...NodeIdFragment ... on PullRequest { id headRefOid mergeStateStatus } } __typename } }  fragment NodeIdFragment on Node { id __typename }";
    }

    public final String name() {
        return "MergeStatus";
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
    }

    public final String toString() {
        return a0.s0.l(a0.s0.o("MergeStatusQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", number="), this.t, ")");
    }
}
