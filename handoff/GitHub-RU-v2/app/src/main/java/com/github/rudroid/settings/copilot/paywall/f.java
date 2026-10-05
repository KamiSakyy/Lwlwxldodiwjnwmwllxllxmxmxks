package com.github.rudroid.settings.copilot.paywall;

import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.copilot.inapppurchase.usecases.x0;
import com.github.rudroid.settings.copilot.paywall.CopilotChatProPaywallActivity;
import sy.y;
import v71.z;
import w61.a0;
import xn.e1;

@c71.e(c = "com.github.rudroid.settings.copilot.paywall.CopilotChatProPaywallActivity$launchBillingFlow$1", f = "CopilotChatProPaywallActivity.kt", l = {266, 265}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f extends c71.j implements j71.e {
    public final /* synthetic */ String A;
    public x0 v;
    public int w;
    public final /* synthetic */ CopilotChatProPaywallActivity x;
    public final /* synthetic */ e1 y;
    public final /* synthetic */ x9.l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CopilotChatProPaywallActivity copilotChatProPaywallActivity, e1 e1Var, x9.l lVar, String str, a71.c cVar) {
        super(2, cVar);
        this.x = copilotChatProPaywallActivity;
        this.y = e1Var;
        this.z = lVar;
        this.A = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f(this.x, this.y, this.z, this.A, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r5.a(r12.x, r7, r12.z, r9, r12.A, r12) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        if (r13 == r0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        x0 x0Var;
        e1 e1Var;
        b71.a aVar = b71.a.r;
        int i = this.w;
        CopilotChatProPaywallActivity copilotChatProPaywallActivity = this.x;
        if (i == 0) {
            y.j(obj);
            x0Var = copilotChatProPaywallActivity.t0;
            if (x0Var == null) {
                k71.k.m("purchaseCopilotLicenseUseCase");
                throw null;
            }
            com.github.rudroid.activities.util.c w0 = copilotChatProPaywallActivity.w0();
            this.v = x0Var;
            this.w = 1;
            obj = com.github.rudroid.activities.util.a.c(w0, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y.j(obj);
                return a0.a;
            }
            x0Var = this.v;
            y.j(obj);
        }
        x0 x0Var2 = x0Var;
        oa.j jVar = (oa.j) obj;
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.N;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar)) {
            e1Var = this.y;
        } else {
            CopilotChatProPaywallActivity.a aVar2 = CopilotChatProPaywallActivity.Companion;
            e1Var = copilotChatProPaywallActivity.L0().B;
        }
        e1 e1Var2 = e1Var;
        this.v = null;
        this.w = 2;
    }
}
