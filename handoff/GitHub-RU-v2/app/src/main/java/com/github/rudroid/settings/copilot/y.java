package com.github.rudroid.settings.copilot;

import androidx.lifecycle.d1;
import com.github.rudroid.common.e;
import com.github.rudroid.settings.copilot.CopilotChatSettingsActivity;
import com.github.rudroid.utilities.ui.g1;
import com.github.service.models.response.type.MobileAppElement;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class y implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ y(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object k(Object obj) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                qe.a aVar = ((o) obj2).z;
                Exception exc = new Exception("failed to load user copilot permissions");
                e.a aVar2 = com.github.rudroid.common.e.Companion;
                aVar.b("CopilotChatSettingsViewModel", exc, true);
                break;
            case 1:
                y1 y1Var = ((o) obj2).D;
                g1.Companion.getClass();
                com.github.rudroid.utilities.ui.n0 b = g1.a.b((fl.b) obj, null);
                y1Var.getClass();
                y1Var.k((Object) null, b);
                break;
            default:
                CopilotChatSettingsActivity copilotChatSettingsActivity = (CopilotChatSettingsActivity) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                CopilotChatSettingsActivity.a aVar3 = CopilotChatSettingsActivity.Companion;
                CopilotChatSettingsActivity.L0(copilotChatSettingsActivity, MobileAppElement.COPILOT_SETTINGS_ENABLE);
                o oVar = (o) copilotChatSettingsActivity.u0.getValue();
                v71.b0.z(d1.k(oVar), (a71.h) null, (v71.a0Shadow) null, new b0(oVar, booleanValue, null), 3);
                break;
        }
        return a0Var;
    }
}
