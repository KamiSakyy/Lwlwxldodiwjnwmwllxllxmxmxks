package rz;

import java.util.List;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k1 implements aa.n0 {
    public static final h1 Companion = new h1();
    public String r;

    public k1(String str) {
        k71.k.g(str, "projectId");
        this.r = str;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        aa.q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = b00.k.a;
        List list2 = b00.k.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && k71.k.b(this.r, ((k1) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(sz.m0.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "9e107ef7f13c1fdc348cc66363ae5a350216aff40988fcca0315a851819518e5";
    }

    public final String j() {
        Companion.getClass();
        return "mutation updateProjectV2LastViewed($projectId: ID!) { updateProjectV2LastViewed(input: { projectId: $projectId } ) { clientMutationId } }";
    }

    public final String name() {
        return "updateProjectV2LastViewed";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("projectId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UpdateProjectV2LastViewedMutation(projectId=", this.r, ")");
    }
}
