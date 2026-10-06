package j00;

import java.util.List;
import jo.f4Shadow;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p implements aa.n0 {
    public static final k Companion = new k();
    public aa.u0 r;

    public p(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        aa.q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = l00.c.a;
        List list2 = l00.c.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.r.equals(((p) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(k00.g.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "4425bc5a8845595da06902d4380024d0f597bf6a3a3f23febee0c7e3c2f0b58c";
    }

    public final String j() {
        Companion.getClass();
        return "mutation updateAssignmentPushNotificationSettings($enabled: Boolean) { updateMobilePushNotificationSettings(input: { getAssignments: $enabled } ) { clientMutationId user { mobilePushNotificationSettings { getsAssignments } id __typename } } }";
    }

    public final String name() {
        return "updateAssignmentPushNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("enabled");
        aa.c.d(aa.c.k).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return f4.j(this.r, "UpdateAssignmentPushNotificationSettingsMutation(enabled=", ")");
    }
}
