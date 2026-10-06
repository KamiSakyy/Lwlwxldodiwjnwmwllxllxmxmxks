package zx;

import java.util.List;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d2 implements aa.n0 {
    public static final z1 Companion = new z1();
    public String r;

    public d2(String str) {
        k71.k.g(str, "issueId");
        this.r = str;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        aa.q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = dy.l.a;
        List list2 = dy.l.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2) && k71.k.b(this.r, ((d2) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ay.d1.a, false);
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
