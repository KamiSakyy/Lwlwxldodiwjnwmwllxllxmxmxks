package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;

@c71.e(c = "com.github.rudroid.searchandfilter.complexfilter.notificationfilter.FocusedFilterExplainerBottomSheet$onCreate$1", f = "FocusedFilterExplainerBottomSheet.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class e extends c71.j implements j71.e {
    public final /* synthetic */ FocusedFilterExplainerBottomSheet v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FocusedFilterExplainerBottomSheet focusedFilterExplainerBottomSheet, a71.c cVar) {
        super(2, cVar);
        this.v = focusedFilterExplainerBottomSheet;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new e(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        e r = r((a71.c) obj2, (v71.z) obj);
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
        if (cVar != null) {
            eVar.a(cVar.d(), new wj.e(MobileAppElement.FOCUS_CTA_VIEWED, MobileAppAction.PRESS, null, null, 12));
            return w61.a0.a;
        }
        k71.k.m("accountHolder");
        throw null;
    }
    public Object t(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
