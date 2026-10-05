package com.github.rudroid.settings.copilot.paywall;

import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileEventContext;
import com.github.service.models.response.type.MobileSubjectType;
import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.settings.copilot.paywall.CopilotChatProPaywallActivity$sendAnalyticsEvent$1", f = "CopilotChatProPaywallActivity.kt", l = {288}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i extends c71.j implements j71.e {
    public final /* synthetic */ MobileSubjectType A;
    public final /* synthetic */ MobileEventContext B;
    public com.github.rudroid.utilities.e v;
    public int w;
    public final /* synthetic */ CopilotChatProPaywallActivity x;
    public final /* synthetic */ MobileAppElement y;
    public final /* synthetic */ MobileAppAction z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CopilotChatProPaywallActivity copilotChatProPaywallActivity, MobileAppElement mobileAppElement, MobileAppAction mobileAppAction, MobileSubjectType mobileSubjectType, MobileEventContext mobileEventContext, a71.c cVar) {
        super(2, cVar);
        this.x = copilotChatProPaywallActivity;
        this.y = mobileAppElement;
        this.z = mobileAppAction;
        this.A = mobileSubjectType;
        this.B = mobileEventContext;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new i(this.x, this.y, this.z, this.A, this.B, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        com.github.rudroid.utilities.e eVar;
        b71.a aVar = b71.a.r;
        int i = this.w;
        if (i == 0) {
            y.j(obj);
            CopilotChatProPaywallActivity copilotChatProPaywallActivity = this.x;
            com.github.rudroid.utilities.e y0 = copilotChatProPaywallActivity.y0();
            com.github.rudroid.activities.util.c w0 = copilotChatProPaywallActivity.w0();
            this.v = y0;
            this.w = 1;
            obj = com.github.rudroid.activities.util.a.c(w0, this);
            if (obj == aVar) {
                return aVar;
            }
            eVar = y0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = this.v;
            y.j(obj);
        }
        MobileSubjectType mobileSubjectType = this.A;
        eVar.a((oa.j) obj, new wj.e(this.z, this.y, this.B, mobileSubjectType));
        return a0.a;
    }
}
