package ow0;

import java.util.List;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d1 implements aa.n0 {
    public static final z0 Companion = new z0();
    public final String r;

    public d1(String str) {
        k71.k.g(str, "issueId");
        this.r = str;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        aa.q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = qw0.h.a;
        List list2 = qw0.h.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && k71.k.b(this.r, ((d1) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(pw0.l0.a, false);
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
