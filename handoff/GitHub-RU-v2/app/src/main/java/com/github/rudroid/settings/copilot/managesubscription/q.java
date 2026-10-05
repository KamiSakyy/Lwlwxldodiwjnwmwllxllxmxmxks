package com.github.rudroid.settings.copilot.managesubscription;

import android.app.Activity;
import com.github.rudroid.copilot.inapppurchase.usecases.x0;
import java.util.ArrayList;
import xn.e1;

@c71.e(c = "com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionActivity$purchaseCopilotLicense$1", f = "CopilotManageSubscriptionActivity.kt", l = {190}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class q extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ CopilotManageSubscriptionActivity w;
    public final /* synthetic */ cg.a x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(CopilotManageSubscriptionActivity copilotManageSubscriptionActivity, cg.a aVar, a71.c cVar) {
        super(2, cVar);
        this.w = copilotManageSubscriptionActivity;
        this.x = aVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new q(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, com.github.rudroid.activities.p2, com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionActivity] */
    public final Object v(Object obj) {
        x9.k kVar;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            ?? r2 = this.w;
            x0 x0Var = r2.t0;
            if (x0Var == null) {
                k71.k.m("purchaseCopilotLicenseUseCase");
                throw null;
            }
            oa.j d = r2.w0().d();
            cg.a aVar2 = this.x;
            String str = null;
            x9.l lVar = aVar2.a;
            e1 e1Var = aVar2.b;
            ArrayList arrayList = lVar.h;
            if (arrayList != null && (kVar = (x9.k) x61.m.W(arrayList)) != null) {
                str = kVar.a;
            }
            if (str == null) {
                str = "";
            }
            this.v = 1;
            if (x0Var.a((Activity) r2, d, lVar, e1Var, str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
