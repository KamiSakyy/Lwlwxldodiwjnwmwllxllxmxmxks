package lo0;

import aa.n0;
import aa.p0;
import aa.q0;
import aa.u0;
import aa.w;
import java.util.List;
import jo.f4Shadow;
import pz0.sk;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements n0 {
    public static final k Companion = new k();
    public String r;
    public u0 s;

    public o(u0 u0Var, String str) {
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = no0.b.a;
        List list2 = no0.b.a;
        k71.k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.rShadow.equals(oVar.r) && this.s.equals(oVar.s);
    }

    public final p0 g() {
        return aa.c.c(mo0.i.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.rShadow.hashCode() * 31);
    }

    public final String i() {
        return "78beafb1d05becd359a92fc0a7eb57abf4aa0faa331cdc89fa17580418a7e25f";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateDraftIssue($id: ID!, $title: String) { updateProjectV2DraftIssue(input: { draftIssueId: $id title: $title } ) { clientMutationId draftIssue { id title __typename } } }";
    }

    public final String name() {
        return "UpdateDraftIssue";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("title");
        aa.c.d(aa.c.i).d(fVar, wVar, this.s);
    }

    public final String toString() {
        return f4Shadow.k(this.s, "UpdateDraftIssueMutation(id=", this.r, ", title=", ")");
    }
}
