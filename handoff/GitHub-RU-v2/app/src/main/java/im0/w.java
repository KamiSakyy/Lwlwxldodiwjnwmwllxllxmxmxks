package im0;

import gn0.wh;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w implements aa.n0 {
    public static final r Companion = new r();
    public aa.u0 r;

    public w(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        wh.Companion.getClass();
        aa.q0 q0Var = wh.e1;
        k71.k.g(q0Var, "type");
        List list = km0.d.a;
        List list2 = km0.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.r.equals(((w) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(jm0.l.a, false);
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
