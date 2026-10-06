package com.github.rudroid.settings.copilot.paywall;

import com.github.rudroid.activities.WebViewActivity;
import com.github.rudroid.settings.copilot.paywall.CopilotChatProPaywallActivity;
import com.github.service.models.response.type.MobileAppElement;
import d.u;
import w61.a0;
import xn.e1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class b implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ CopilotChatProPaywallActivity s;

    public /* synthetic */ b(CopilotChatProPaywallActivity copilotChatProPaywallActivity, int i) {
        this.r = i;
        this.s = copilotChatProPaywallActivity;
    }

    public final Object k(Object obj) {
        int i = this.r;
        a0 a0Var = a0.a;
        k.i iVar = this.s;
        switch (i) {
            case 0:
                e1 e1Var = (e1) obj;
                CopilotChatProPaywallActivity.a aVar = CopilotChatProPaywallActivity.Companion;
                k71.k.g(e1Var, "license");
                com.github.rudroid.copilot.inapppurchase.b L0 = iVar.L0();
                y1 y1Var = L0.C;
                y1Var.getClass();
                y1Var.k((Object) null, e1Var);
                L0.Q();
                break;
            case 1:
                String str = (String) obj;
                CopilotChatProPaywallActivity.a aVar2 = CopilotChatProPaywallActivity.Companion;
                k71.k.g(str, "it");
                CopilotChatProPaywallActivity.O0(iVar, MobileAppElement.COPILOT_PRIVACY_POLICY, iVar.J0());
                WebViewActivity.a aVar3 = WebViewActivity.Companion;
                String string = iVar.getResources().getString(2131954548);
                aVar3.getClass();
                iVar.u0(WebViewActivity.a.a(iVar, str, string), iVar.s0());
                break;
            case 2:
                String str2 = (String) obj;
                CopilotChatProPaywallActivity.a aVar4 = CopilotChatProPaywallActivity.Companion;
                k71.k.g(str2, "it");
                CopilotChatProPaywallActivity.O0(iVar, MobileAppElement.COPILOT_AGREEMENT, iVar.J0());
                WebViewActivity.a aVar5 = WebViewActivity.Companion;
                String string2 = iVar.getResources().getString(2131954493);
                aVar5.getClass();
                iVar.u0(WebViewActivity.a.a(iVar, str2, string2), iVar.s0());
                break;
            default:
                CopilotChatProPaywallActivity.a aVar6 = CopilotChatProPaywallActivity.Companion;
                k71.k.g((u) obj, "$this$addCallback");
                CopilotChatProPaywallActivity.O0(iVar, MobileAppElement.COPILOT_DISMISS_PAYWALL, iVar.J0());
                iVar.setResult(0);
                iVar.finish();
                break;
        }
        return a0Var;
    }
    public Object R() { return null; }
    public Object S() { return null; }
    public Object C = null;
}
