package my0;

import java.util.List;
import jo.f4;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.n0 {
    public static final f Companion = new f();
    public final aa.u0 r;

    public k(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        aa.q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = oy0.b.a;
        List list2 = oy0.b.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.r.equals(((k) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ny0.d.a, false);
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
