package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wo implements aa.w0 {
    public static final ro Companion = new ro();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.z2.a;
        List list2 = h10.z2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == wo.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.rg.a, false);
    }

    public final int hashCode() {
        return k71.x.a(wo.class).hashCode();
    }

    public final String i() {
        return "63790dcbcb6aaf33f56e8ba032b1571627a60d1b1da1c5396ed733480b561723";
    }

    public final String j() {
        Companion.getClass();
        return "query MobileCopilotPaywallQuery { mobileCopilotPaywall { allFeatures { title features { __typename ...MobileCopilotFeatureComparisonSubsectionFragment ...MobileCopilotPaywallChatModelsFragment } } disclaimers paywallProducts { __typename ...PaywallProductFragment } } id __typename }  fragment PlanRowFragment on MobileCopilotFeatureComparisonSubsectionItem { copilotLicenseType icon planTitle subtitle }  fragment MobileCopilotFeatureComparisonSubsectionFragment on MobileCopilotFeatureComparisonSubsection { title planRows { __typename ...PlanRowFragment } }  fragment ChatModelPlanFragment on MobileCopilotPaywallChatModelPlan { copilotLicenseType title models { title } }  fragment MobileCopilotPaywallChatModelsFragment on MobileCopilotPaywallChatModels { title plans { __typename ...ChatModelPlanFragment } }  fragment PaywallProductFragment on MobileCopilotPaywallProduct { copilotLicenseType title subtitle featuresHeader features { title } }";
    }

    public final String name() {
        return "MobileCopilotPaywallQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
