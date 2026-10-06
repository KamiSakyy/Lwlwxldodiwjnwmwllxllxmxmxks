package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bj0 implements aaShadow.w0 {
    public static final vi0 Companion = new vi0();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.m7.a;
        List list2 = h10.m7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == bj0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.y10.a, false);
    }

    public final int hashCode() {
        return k71.x.a(bj0.class).hashCode();
    }

    public final String i() {
        return "de08afd711df866a1e8d6cfe9f83fb0f7cb1e1ecb2b9df6e19497f84755e9070";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerCopilotPermissionsQuery { viewer { copilotLicenseType isCopilotMobileChatEnabled viewerIsCopilotCodingAgentEnabled viewerCanSubscribeToCopilotIndividual viewerCanSubscribeToCopilotLimited copilotEndpoints { api } copilotLimitedUser { __typename ...CopilotLimitedUser } copilotConsumptiveUser { __typename ...CopilotConsumptiveUser } copilotSubscriptionPlatform availableCopilotUpgradeSkus id __typename } id __typename }  fragment CopilotLimitedUser on CopilotLimitedUser { resetDate hasUsageRemaining(feature: CHAT) quotaPercentageRemaining(feature: CHAT) }  fragment CopilotConsumptiveUser on CopilotConsumptiveUser { resetDate freeOverageCount: currentOverageCount(feature: CHAT) premiumOverageCount: currentOverageCount(feature: PREMIUM_INTERACTIONS) entitlement(feature: CHAT) isOveragePermitted freeRemaining: percentRemaining(feature: CHAT) premiumRemaining: percentRemaining(feature: PREMIUM_INTERACTIONS) quotaId(feature: CHAT) }";
    }

    public final String name() {
        return "ViewerCopilotPermissionsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
