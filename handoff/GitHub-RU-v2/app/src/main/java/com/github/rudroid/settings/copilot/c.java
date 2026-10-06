package com.github.rudroid.settings.copilot;

import android.content.Context;
import android.content.Intent;
import com.github.rudroid.activities.n3;
import com.github.rudroid.settings.copilot.CopilotChatSettingsActivity;
import com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionActivity;
import com.github.service.models.response.type.MobileAppElement;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ CopilotChatSettingsActivity s;

    public /* synthetic */ c(CopilotChatSettingsActivity copilotChatSettingsActivity, int i) {
        this.r = i;
        this.s = copilotChatSettingsActivity;
    }

    public final Object a() {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        n3 n3Var = this.s;
        switch (i) {
            case 0:
                CopilotChatSettingsActivity.a aVar = CopilotChatSettingsActivity.Companion;
                CopilotChatSettingsActivity.L0(n3Var, MobileAppElement.COPILOT_AGREEMENT);
                n3Var.J0(2131954550, 2131952331);
                break;
            case 1:
                CopilotChatSettingsActivity.a aVar2 = CopilotChatSettingsActivity.Companion;
                CopilotChatSettingsActivity.L0(n3Var, MobileAppElement.COPILOT_MANAGE_SUBSCRIPTION);
                CopilotManageSubscriptionActivity.Companion.getClass();
                n3Var.u0(new Intent((Context) n3Var, (Class<?>) CopilotManageSubscriptionActivity.class), n3Var.s0());
                break;
            case 2:
                CopilotChatSettingsActivity.a aVar3 = CopilotChatSettingsActivity.Companion;
                CopilotChatSettingsActivity.L0(n3Var, MobileAppElement.COPILOT_POLICY_DISABLED_LINK);
                n3Var.J0(2131954551, 2131952002);
                break;
            case 3:
                CopilotChatSettingsActivity.a aVar4 = CopilotChatSettingsActivity.Companion;
                n3Var.J0(2131954551, 2131952268);
                break;
            case 4:
                CopilotChatSettingsActivity.a aVar5 = CopilotChatSettingsActivity.Companion;
                n3Var.finish();
                break;
            case 5:
                CopilotChatSettingsActivity.a aVar6 = CopilotChatSettingsActivity.Companion;
                CopilotChatSettingsActivity.L0(n3Var, MobileAppElement.COPILOT_LEARN_MORE);
                n3Var.J0(2131954518, 2131951983);
                break;
            case 6:
                CopilotChatSettingsActivity.a aVar7 = CopilotChatSettingsActivity.Companion;
                n3Var.J0(2131954519, 2131952061);
                break;
            default:
                CopilotChatSettingsActivity.a aVar8 = CopilotChatSettingsActivity.Companion;
                CopilotChatSettingsActivity.L0(n3Var, MobileAppElement.COPILOT_PRIVACY_POLICY);
                n3Var.J0(2131954548, 2131953438);
                break;
        }
        return a0Var;
    }
    public Object v(Object p1) { return null; }
    public Object v(Object p1) { return null; }
}
