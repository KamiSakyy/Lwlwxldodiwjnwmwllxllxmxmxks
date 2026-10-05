package j00;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aa.w0 {
    public static final a Companion = new a();

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = l00.a.a;
        List list2 = l00.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == e.class;
    }

    public final aa.p0 g() {
        return aa.c.c(k00.a.a, false);
    }

    public final int hashCode() {
        return k71.x.a(e.class).hashCode();
    }

    public final String i() {
        return "cd49e01999c083718ad826f08b97ca0e2ecaf69ec109825c8581c873709fd43d";
    }

    public final String j() {
        Companion.getClass();
        return "query LiveActivityCopilotCodingAgentSetting { viewer { mobilePushNotificationSettings { getsLiveActivityCopilotCodingAgentV2 } id __typename } id __typename }";
    }

    public final String name() {
        return "LiveActivityCopilotCodingAgentSetting";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
