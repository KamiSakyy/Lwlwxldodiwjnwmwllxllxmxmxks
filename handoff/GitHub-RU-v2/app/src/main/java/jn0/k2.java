package jn0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k2 implements aaShadow.n0 {
    public static final i2 Companion = new i2();
    public String r;
    public String s;
    public ArrayList t;
    public aa1.b u;

    public k2(String str, String str2, ArrayList arrayList, aa1.b bVar) {
        k71.k.g(str, "pull_request_id");
        k71.k.g(str2, "current_oid");
        this.r = str;
        this.s = str2;
        this.t = arrayList;
        this.u = bVar;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.n.a;
        List list2 = kz0.n.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return k71.k.b(this.r, k2Var.r) && k71.k.b(this.s, k2Var.s) && this.t.equals(k2Var.t) && this.u.equals(k2Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.i1.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + no.a.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "37ef258800856bfa9133829a4ac902f0f8f1964607e06c991a040c9a6b1dd6fb";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ApplyMobileSuggestedChanges($pull_request_id: ID!, $current_oid: GitObjectID!, $suggestions: [MobileSuggestedChangeInput!]!, $commitMessage: String) { applyMobileSuggestedChanges(input: { pullRequestId: $pull_request_id currentOID: $current_oid changes: $suggestions message: $commitMessage } ) { __typename } }";
    }

    public final String name() {
        return "ApplyMobileSuggestedChanges";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("pull_request_id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("current_oid");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("suggestions");
        aa.c.a(aa.c.c(qz0.a.D, false)).e(fVar, wVar, this.t);
        aa.u0 u0Var = this.u;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("commitMessage");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ApplyMobileSuggestedChangesMutation(pull_request_id=", this.r, ", current_oid=", this.s, ", suggestions=");
        o.append(this.t);
        o.append(", commitMessage=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }
}
