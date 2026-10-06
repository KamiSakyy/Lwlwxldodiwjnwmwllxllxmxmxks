package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fc implements aaShadow.n0 {
    public static final bc Companion = new bc();
    public String r;
    public aa1.b s;
    public aa1.b t;
    public aa1.b u;
    public aa1.b v;
    public aa1.b w;

    public fc(String str, aa1.b bVar, aa1.b bVar2, aa1.b bVar3, aa1.b bVar4, aa1.b bVar5) {
        this.r = str;
        this.s = bVar;
        this.t = bVar2;
        this.u = bVar3;
        this.v = bVar4;
        this.w = bVar5;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.a1.a;
        List list2 = en0.a1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        return k71.k.b(this.r, fcVar.r) && k71.k.b(this.s, fcVar.s) && k71.k.b(this.t, fcVar.t) && k71.k.b(this.u, fcVar.u) && k71.k.b(this.v, fcVar.v) && k71.k.b(this.w, fcVar.w);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.b8.a, false);
    }

    public final int hashCode() {
        return this.w.hashCode() + f1.e.a(this.v, f1.e.a(this.u, f1.e.a(this.t, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String i() {
        return "f0bc1eef179efd84a337ae443b6bf7ad1b9b51e4a66e42fda43aefa0016f6119";
    }

    public final String j() {
        Companion.getClass();
        return "mutation EnableAutoMerge($id: ID!, $method: PullRequestMergeMethod, $authorEmail: String, $commitHeadline: String, $commitBody: String, $expectedHeadOid: GitObjectID) { enablePullRequestAutoMerge(input: { pullRequestId: $id mergeMethod: $method authorEmail: $authorEmail commitHeadline: $commitHeadline commitBody: $commitBody expectedHeadOid: $expectedHeadOid } ) { actor { __typename ...NodeIdFragment login } pullRequest { __typename ...AutoMergeRequestFragment id } } }  fragment NodeIdFragment on Node { id __typename }  fragment AutoMergeRequestFragment on PullRequest { id viewerCanDisableAutoMerge viewerCanEnableAutoMerge autoMergeRequest { mergeMethod } __typename }";
    }

    public final String name() {
        return "EnableAutoMerge";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("method");
            aa.c.d(aa.c.b(hn0.a.E)).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("authorEmail");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.u;
        if (u0Var3 instanceof aaShadow.u0) {
            fVar.z0("commitHeadline");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        }
        aa.u0 u0Var4 = this.v;
        if (u0Var4 instanceof aaShadow.u0) {
            fVar.z0("commitBody");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var4);
        }
        aa.u0 u0Var5 = this.w;
        if (u0Var5 instanceof aaShadow.u0) {
            fVar.z0("expectedHeadOid");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var5);
        }
    }

    public final String toString() {
        StringBuilder o = f1.e.o(this.s, "EnableAutoMergeMutation(id=", this.r, ", method=", ", authorEmail=");
        f1.e.w(o, this.t, ", commitHeadline=", this.u, ", commitBody=");
        return f1.e.l(o, this.v, ", expectedHeadOid=", this.w, ")");
    }
}
