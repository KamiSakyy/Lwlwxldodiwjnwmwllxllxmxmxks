package j00;

import java.util.List;
import jo.f4;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l1 implements aa.n0 {
    public static final g1 Companion = new g1();
    public final aa.u0 r;

    public l1(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        aa.q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = l00.k.a;
        List list2 = l00.k.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && this.r.equals(((l1) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(k00.m0.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "66af95d1b7fece9783ba2c938a2121586f00d843f7fe516872db962961793947";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateReleasesActivityNotificationSettings($enabled: Boolean) { updateMobilePushNotificationSettings(input: { getReleases: $enabled } ) { clientMutationId user { id mobilePushNotificationSettings { getsReleases } __typename } } }";
    }

    public final String name() {
        return "UpdateReleasesActivityNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("enabled");
        aa.c.d(aa.c.k).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return f4.j(this.r, "UpdateReleasesActivityNotificationSettingsMutation(enabled=", ")");
    }
}
