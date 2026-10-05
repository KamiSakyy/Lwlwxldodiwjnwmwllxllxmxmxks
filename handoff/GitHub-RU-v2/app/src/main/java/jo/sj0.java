package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sj0 implements aa.w0 {
    public static final kj0 Companion = new kj0();
    public final String r;
    public final String s;
    public final int t;

    public sj0(String str, int i, String str2) {
        this.r = str;
        this.s = str2;
        this.t = i;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.p7.a;
        List list2 = h10.p7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj0)) {
            return false;
        }
        sj0 sj0Var = (sj0) obj;
        return k71.k.b(this.r, sj0Var.r) && k71.k.b(this.s, sj0Var.s) && this.t == sj0Var.t;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.e20.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.t) + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "9ece390c593b4d42b6466f08ba4aebdf9c9b93e4451b817b51b6b4c41b64a59f";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerMergeActions($repositoryOwner: String!, $repositoryName: String!, $number: Int!) { repository(owner: $repositoryOwner, name: $repositoryName) { id issueOrPullRequest(number: $number) { __typename ... on Issue { id } ... on PullRequest { id viewerMergeActions { allowableStatus mergeMethods { allowableStatus name isDefault } name } } } __typename } id __typename }";
    }

    public final String name() {
        return "ViewerMergeActions";
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
        return a0.s0.l(a0.s0.o("ViewerMergeActionsQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", number="), this.t, ")");
    }
}
