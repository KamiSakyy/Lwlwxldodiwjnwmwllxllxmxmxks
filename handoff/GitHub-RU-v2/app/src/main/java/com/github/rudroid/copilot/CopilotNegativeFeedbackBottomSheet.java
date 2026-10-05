package com.github.rudroid.copilot;

/* loaded from: /home/user/work/p/classes.dex */
public final class CopilotNegativeFeedbackBottomSheet extends Hilt_CopilotNegativeFeedbackBottomSheet {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] T0;
    public final com.github.rudroid.fragments.util.c S0 = new com.github.rudroid.fragments.util.c("EXTRA_MESSAGE_ID");

    public static final class a {
    }

    static {
        r71.e pVar = new k71.p(CopilotNegativeFeedbackBottomSheet.class, "messageId", "getMessageId()Ljava/lang/String;", 0);
        k71.x.a.getClass();
        T0 = new r71.e[]{pVar};
        Companion = new a();
    }

    @Override // com.github.rudroid.fragments.BaseComposeBottomSheetDialog
    public final com.github.rudroid.fragments.g0 D4() {
        com.github.rudroid.fragments.g0.Companion.getClass();
        return com.github.rudroid.fragments.g0.f13904u;
    }

    @Override // com.github.rudroid.fragments.BaseComposeBottomSheetDialog
    public final r1.d E4() {
        return new r1.d(new t(2, this), true, -1411435202);
    }
}
