package na0;

import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 implements aa.n0 {
    public static final q0 Companion = new q0();
    public String r;

    public u0(String str) {
        k71.k.g(str, "issueId");
        this.r = str;
    }

    public final aa.m d() {
        wg.Companion.getClass();
        aa.q0 q0Var = wg.c1;
        k71.k.g(q0Var, "type");
        List list = pa0.f.a;
        List list2 = pa0.f.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && k71.k.b(this.r, ((u0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(oa0.g0.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "7dd932de92ca3044178466e1cf41823c6c9ab85fe72b19aa9ef2943c702e5f2c";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnPinIssue($issueId: ID!) { unpinIssue(input: { issueId: $issueId } ) { issue { id isPinned __typename } } }";
    }

    public final String name() {
        return "UnPinIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("issueId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UnPinIssueMutation(issueId=", this.r, ")");
    }
}
