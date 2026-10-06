package im0;

import gn0.wh;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 implements aa.n0 {
    public static final d0 Companion = new d0();
    public aa.u0 r;

    public i0(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        wh.Companion.getClass();
        aa.q0 q0Var = wh.e1;
        k71.k.g(q0Var, "type");
        List list = km0.f.a;
        List list2 = km0.f.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.r.equals(((i0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(jm0.t.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "9811ec132ace4d06ff7167dae539d073a2924f15c4021a8bea481587e1cb52ec";
    }

    public final String j() {
        Companion.getClass();
        return "mutation updateDeploymentReviewRequestedPushNotificationSettings($enabled: Boolean) { updateMobilePushNotificationSettings(input: { getDeploymentRequests: $enabled } ) { clientMutationId user { mobilePushNotificationSettings { getsDeploymentRequests } id __typename } } }";
    }

    public final String name() {
        return "updateDeploymentReviewRequestedPushNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("enabled");
        aa.c.d(aa.c.k).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return f4.j(this.r, "UpdateDeploymentReviewRequestedPushNotificationSettingsMutation(enabled=", ")");
    }
}
