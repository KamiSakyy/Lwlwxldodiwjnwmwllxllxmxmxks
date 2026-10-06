package im0;

import gn0.wh;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements aa.n0 {
    public static final l Companion = new l();
    public final aa.u0 r;

    public q(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        wh.Companion.getClass();
        aa.q0 q0Var = wh.e1;
        k71.k.g(q0Var, "type");
        List list = km0.c.a;
        List list2 = km0.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.r.equals(((q) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(jm0.h.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "ce99c9d9b3f298905379f571ab635dc4b67519fb9035c5fb0ab03ba10c9c9add";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateCIActivityFailedOnlyNotificationSettings($enabled: Boolean) { updateMobilePushNotificationSettings(input: { getCiFailedOnly: $enabled } ) { clientMutationId user { mobilePushNotificationSettings { getsCiFailedOnly } id __typename } } }";
    }

    public final String name() {
        return "UpdateCIActivityFailedOnlyNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("enabled");
        aa.c.d(aa.c.k).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return f4.j(this.r, "UpdateCIActivityFailedOnlyNotificationSettingsMutation(enabled=", ")");
    }
}
