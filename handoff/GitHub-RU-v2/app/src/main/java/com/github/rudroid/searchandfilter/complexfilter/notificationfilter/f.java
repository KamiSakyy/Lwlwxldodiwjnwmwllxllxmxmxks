package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;

@c71.e(c = "com.github.rudroid.searchandfilter.complexfilter.notificationfilter.FocusedFilterExplainerBottomSheet$sendDismissedAnalyticAndDismiss$1", f = "FocusedFilterExplainerBottomSheet.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f extends c71.j implements j71.e {
    public final /* synthetic */ FocusedFilterExplainerBottomSheet v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FocusedFilterExplainerBottomSheet focusedFilterExplainerBottomSheet, a71.c cVar) {
        super(2, cVar);
        this.v = focusedFilterExplainerBottomSheet;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        f r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        FocusedFilterExplainerBottomSheet focusedFilterExplainerBottomSheet = this.v;
        com.github.rudroid.utilities.e eVar = focusedFilterExplainerBottomSheet.U0;
        if (eVar == null) {
            k71.k.m("analytics");
            throw null;
        }
        com.github.rudroid.activities.util.c cVar = focusedFilterExplainerBottomSheet.S0;
        if (cVar == null) {
            k71.k.m("accountHolder");
            throw null;
        }
        eVar.a(cVar.d(), new wj.e(MobileAppElement.FOCUS_CTA_DISMISSED, MobileAppAction.PRESS, null, null, 12));
        focusedFilterExplainerBottomSheet.s4();
        return w61.a0.a;
    }
}
