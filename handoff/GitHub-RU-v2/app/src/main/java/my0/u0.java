package my0;

import java.util.List;
import jo.f4Shadow;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u0 implements aa.n0 {
    public static final p0 Companion = new p0();
    public aa.u0 r;

    public u0(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        aa.q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = oy0.h.a;
        List list2 = oy0.h.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && this.r.equals(((u0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ny0.b0.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "0e80146fb17323e338c2e9ee618b1826fc5efb06d8969e521a921780c66894ae";
    }

    public final String j() {
        Companion.getClass();
        return "mutation updatePullRequestReviewedPushNotificationSettings($enabled: Boolean) { updateMobilePushNotificationSettings(input: { getPullRequestReviews: $enabled } ) { clientMutationId user { __typename ...NodeIdFragment mobilePushNotificationSettings { getsPullRequestReviews } id } } }  fragment NodeIdFragment on Node { id __typename }";
    }

    public final String name() {
        return "updatePullRequestReviewedPushNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("enabled");
        aa.c.d(aa.c.k).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return f4Shadow.j(this.r, "UpdatePullRequestReviewedPushNotificationSettingsMutation(enabled=", ")");
    }
}
