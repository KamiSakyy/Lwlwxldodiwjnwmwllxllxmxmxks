package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yk implements aaShadow.n0 {
    public static final sk Companion = new sk();
    public final String r;
    public final gn0.bm s;
    public final aa1.b t;
    public final aa1.b u;
    public final aa1.b v;
    public final String w;

    public yk(String str, gn0.bm bmVar, aa1.b bVar, aa1.b bVar2, aa1.b bVar3, String str2) {
        this.r = str;
        this.s = bmVar;
        this.t = bVar;
        this.u = bVar2;
        this.v = bVar3;
        this.w = str2;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.l2.a;
        List list2 = en0.l2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk)) {
            return false;
        }
        yk ykVar = (yk) obj;
        return k71.k.b(this.r, ykVar.r) && this.s == ykVar.s && k71.k.b(this.t, ykVar.t) && k71.k.b(this.u, ykVar.u) && k71.k.b(this.v, ykVar.v) && k71.k.b(this.w, ykVar.w);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.vd.a, false);
    }

    public final int hashCode() {
        return this.w.hashCode() + f1.e.a(this.v, f1.e.a(this.u, f1.e.a(this.t, (this.s.hashCode() + (this.r.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String i() {
        return "fc80a30943968136192ab3d219594fbd309c7f29581e02eba38937b0dbaeb945";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MergePullRequest($id: ID!, $method: PullRequestMergeMethod!, $authorEmail: String, $commitHeadline: String, $commitBody: String, $expectedHeadOid: GitObjectID!) { mergePullRequest(input: { pullRequestId: $id mergeMethod: $method authorEmail: $authorEmail commitHeadline: $commitHeadline commitBody: $commitBody expectedHeadOid: $expectedHeadOid } ) { actor { __typename ...NodeIdFragment login } pullRequest { __typename id ...PullRequestStateFragment baseRefName mergeCommit { abbreviatedOid committedDate id __typename } mergedBy { __typename ...NodeIdFragment login } mergeStateStatus viewerCanDeleteHeadRef viewerCanReopen } } }  fragment NodeIdFragment on Node { id __typename }  fragment PullRequestStateFragment on PullRequest { id state __typename }";
    }

    public final String name() {
        return "MergePullRequest";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("method");
        fVar.I(this.s.r);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("authorEmail");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.u;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("commitHeadline");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.v;
        if (u0Var3 instanceof aaShadow.u0) {
            fVar.z0("commitBody");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        }
        fVar.z0("expectedHeadOid");
        bVar.b(fVar, wVar, this.w);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePullRequestMutation(id=");
        sb.append(this.r);
        sb.append(", method=");
        sb.append(this.s);
        sb.append(", authorEmail=");
        f1.e.w(sb, this.t, ", commitHeadline=", this.u, ", commitBody=");
        sb.append(this.v);
        sb.append(", expectedHeadOid=");
        sb.append(this.w);
        sb.append(")");
        return sb.toString();
    }
}
