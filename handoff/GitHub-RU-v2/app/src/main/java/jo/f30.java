package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f30 implements aaShadow.w0 {
    public static final b30 Companion = new b30();
    public String r;
    public String s;
    public aa1.b t;

    public f30(aa1.b bVar, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
        this.t = bVar;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.w4.a;
        List list2 = h10.w4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f30)) {
            return false;
        }
        f30 f30Var = (f30) obj;
        return k71.k.b(this.r, f30Var.r) && k71.k.b(this.s, f30Var.s) && k71.k.b(this.t, f30Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.gr.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "4842ea2918a3ae2374ab47c046ea2b7051a5eeb3657321cf2b4952fb25bf4f7f";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryMergeQueue($owner: String!, $name: String!, $branchName: String) { repository(owner: $owner, name: $name) { id mergeQueue(branch: $branchName) { __typename ...MergeQueueFragment id } __typename } id __typename }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }";
    }

    public final String name() {
        return "RepositoryMergeQueue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("branchName");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return f1.e.k(a0.s0.o("RepositoryMergeQueueQuery(owner=", this.r, ", name=", this.s, ", branchName="), this.t, ")");
    }
}
