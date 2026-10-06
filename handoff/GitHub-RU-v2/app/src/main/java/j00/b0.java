package j00;

import java.util.List;
import jo.f4;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements aa.n0 {
    public static final w Companion = new w();
    public final aa.u0 r;

    public b0(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        aa.q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = l00.e.a;
        List list2 = l00.e.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.r.equals(((b0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(k00.o.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "1457ad37920beaceab964879ff669fc62f67a9b85c1d88fd8a053083f3e0a656";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateCIActivityNotificationSettings($enabled: Boolean) { updateMobilePushNotificationSettings(input: { getCiActivity: $enabled getCiFailedOnly: $enabled } ) { clientMutationId user { mobilePushNotificationSettings { getsCiFailedOnly getsCiActivity } id __typename } } }";
    }

    public final String name() {
        return "UpdateCIActivityNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("enabled");
        aa.c.d(aa.c.k).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return f4.j(this.r, "UpdateCIActivityNotificationSettingsMutation(enabled=", ")");
    }
}
