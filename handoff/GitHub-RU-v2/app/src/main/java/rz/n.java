package rz;

import java.util.List;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements aa.n0 {
    public static final k Companion = new k();
    public final String r;
    public final String s;

    public n(String str, String str2) {
        k71.k.g(str, "projectId");
        k71.k.g(str2, "itemId");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        aa.q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = b00.c.a;
        List list2 = b00.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.r, nVar.r) && k71.k.b(this.s, nVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(sz.g.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "1790150868fe3c7ca619184f7e16f83153a80873444b9decee0cb80c4ff83831";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DeleteProjectV2Item($projectId: ID!, $itemId: ID!) { deleteProjectV2Item(input: { projectId: $projectId itemId: $itemId } ) { clientMutationId } }";
    }

    public final String name() {
        return "DeleteProjectV2Item";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("projectId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("itemId");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("DeleteProjectV2ItemMutation(projectId=", this.r, ", itemId=", this.s, ")");
    }
}
