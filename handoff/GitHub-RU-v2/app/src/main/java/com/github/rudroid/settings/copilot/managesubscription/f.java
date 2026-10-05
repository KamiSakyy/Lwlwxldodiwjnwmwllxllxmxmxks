package com.github.rudroid.settings.copilot.managesubscription;

import com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionActivity;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class f implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ CopilotManageSubscriptionActivity s;

    public /* synthetic */ f(CopilotManageSubscriptionActivity copilotManageSubscriptionActivity, int i) {
        this.r = i;
        this.s = copilotManageSubscriptionActivity;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.app.Activity, com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionActivity] */
    public final Object a() {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        CopilotManageSubscriptionActivity r2 = this.s;
        switch (i) {
            case 0:
                CopilotManageSubscriptionActivity.a aVar = CopilotManageSubscriptionActivity.Companion;
                r2.J0().P();
                break;
            case 1:
                CopilotManageSubscriptionActivity.a aVar2 = CopilotManageSubscriptionActivity.Companion;
                r2.J0().P();
                break;
            default:
                CopilotManageSubscriptionActivity.a aVar3 = CopilotManageSubscriptionActivity.Companion;
                r2.finish();
                break;
        }
        return a0Var;
    }
}
