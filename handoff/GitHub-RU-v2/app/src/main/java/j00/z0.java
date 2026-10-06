package j00;

import java.util.List;
import jo.f4;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 implements aa.n0 {
    public static final u0 Companion = new u0();
    public aa.u0 r;

    public z0(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        aa.q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = l00.i.a;
        List list2 = l00.i.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && this.r.equals(((z0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(k00.e0.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "6ea0872b03d88c5dcf988554430d325f721d70fed29626e28bb696d7ef52c95e";
    }

    public final String j() {
        Companion.getClass();
        return "mutation updateLiveActivityCopilotCodingAgentSettings($enabled: Boolean) { updateMobilePushNotificationSettings(input: { getLiveActivityCopilotCodingAgent: $enabled } ) { clientMutationId user { mobilePushNotificationSettings { getsLiveActivityCopilotCodingAgentV2 } id __typename } } }";
    }

    public final String name() {
        return "updateLiveActivityCopilotCodingAgentSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("enabled");
        aa.c.d(aa.c.k).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return f4.j(this.r, "UpdateLiveActivityCopilotCodingAgentSettingsMutation(enabled=", ")");
    }
}
