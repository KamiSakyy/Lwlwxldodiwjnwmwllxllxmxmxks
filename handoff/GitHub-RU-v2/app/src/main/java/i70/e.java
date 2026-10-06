package i70;

import aa.m;
import aa.n0;
import aa.p0;
import aa.q0;
import aa.w;
import hc0.wg;
import java.util.List;
import k71.k;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements n0 {
    public static final a Companion = new a();
    public String r;

    public e(String str) {
        k.g(str, "organizationId");
        this.r = str;
    }

    public final m d() {
        wg.Companion.getClass();
        q0 q0Var = wg.c1;
        k.g(q0Var, "type");
        List list = m70.a.a;
        List list2 = m70.a.a;
        k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k.b(this.r, ((e) obj).r);
    }

    public final p0 g() {
        return aa.c.c(j70.a.a, false);
    }

    public final int hashCode() {
        return this.rShadow.hashCode();
    }

    public final String i() {
        return "47b2a81d4d111bea07f80138b5daf7fce8d9f74dc79f1c4f3ce18ea9ae69479f";
    }

    public final String j() {
        Companion.getClass();
        return "mutation FollowOrganization($organizationId: ID!) { followOrganization(input: { organizationId: $organizationId } ) { organization { __typename ...FollowOrganizationFragment id } } }  fragment FollowOrganizationFragment on Organization { id viewerIsFollowing __typename }";
    }

    public final String name() {
        return "FollowOrganization";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k.g(wVar, "customScalarAdapters");
        fVar.z0("organizationId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("FollowOrganizationMutation(organizationId=", this.r, ")");
    }



}
