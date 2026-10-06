package mb0;

import hc0.wg;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 implements aa.n0 {
    public static final x Companion = new x();
    public aa.u0 r;

    public c0(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        wg.Companion.getClass();
        aa.q0 q0Var = wg.c1;
        k71.k.g(q0Var, "type");
        List list = ob0.e.a;
        List list2 = ob0.e.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.r.equals(((c0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(nb0.p.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "6ed934df65ff80cf37a551a7c8cb86bcc2fa44767a94cf479c41a780b6422062";
    }

    public final String j() {
        Companion.getClass();
        return "mutation updateCodeReviewRequestedPushNotificationSettings($enabled: Boolean) { updateMobilePushNotificationSettings(input: { getReviewRequests: $enabled } ) { clientMutationId user { mobilePushNotificationSettings { getsReviewRequests } id __typename } } }";
    }

    public final String name() {
        return "updateCodeReviewRequestedPushNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("enabled");
        aa.c.d(aa.c.k).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return f4Shadow.j(this.r, "UpdateCodeReviewRequestedPushNotificationSettingsMutation(enabled=", ")");
    }
}
