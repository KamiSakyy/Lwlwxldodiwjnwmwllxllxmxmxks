package my0;

import java.util.List;
import jo.f4;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 implements aa.n0 {
    public static final j0 Companion = new j0();
    public aa.u0 r;

    public o0(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        aa.q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = oy0.g.a;
        List list2 = oy0.g.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && this.r.equals(((o0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ny0.x.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "a370573b9a79eae9560d6edfb661b190c3fdeff5ce452a47daf42e2dedfe3907";
    }

    public final String j() {
        Companion.getClass();
        return "mutation updateDirectMentionsPushNotificationSettings($enabled: Boolean) { updateMobilePushNotificationSettings(input: { getDirectMentions: $enabled } ) { clientMutationId user { mobilePushNotificationSettings { getsDirectMentions } id __typename } } }";
    }

    public final String name() {
        return "updateDirectMentionsPushNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("enabled");
        aa.c.d(aa.c.k).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return f4.j(this.r, "UpdateDirectMentionsPushNotificationSettingsMutation(enabled=", ")");
    }
}
