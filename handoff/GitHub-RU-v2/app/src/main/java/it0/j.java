package it0;

import aa.m;
import aa.n0;
import aa.p0;
import aa.q0;
import aa.w;
import java.util.List;
import k71.k;
import pz0.sk;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements n0 {
    public static final f Companion = new f();
    public String r;

    public j(String str) {
        k.g(str, "organizationId");
        this.r = str;
    }

    public final m d() {
        sk.Companion.getClass();
        q0 q0Var = sk.v1;
        k.g(q0Var, "type");
        List list = mt0.b.a;
        List list2 = mt0.b.a;
        k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && k.b(this.r, ((j) obj).r);
    }

    public final p0 g() {
        return aa.c.c(jt0.d.a, false);
    }

    public final int hashCode() {
        return this.rShadow.hashCode();
    }

    public final String i() {
        return "0721b8e507fdc3834fe1e8a5bc9ec6c5253cdbe79885ae7fc38b5112b0575971";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnfollowOrganization($organizationId: ID!) { unfollowOrganization(input: { organizationId: $organizationId } ) { organization { __typename ...FollowOrganizationFragment id } } }  fragment FollowOrganizationFragment on Organization { id viewerIsFollowing __typename }";
    }

    public final String name() {
        return "UnfollowOrganization";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k.g(wVar, "customScalarAdapters");
        fVar.z0("organizationId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UnfollowOrganizationMutation(organizationId=", this.r, ")");
    }



}
