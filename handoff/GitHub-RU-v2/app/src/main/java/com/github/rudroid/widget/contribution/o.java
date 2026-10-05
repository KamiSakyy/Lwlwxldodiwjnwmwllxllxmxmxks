package com.github.rudroid.widget.contribution;

import com.github.rudroid.widget.WidgetUIState;
import w61.a0;

@c71.e(c = "com.github.rudroid.widget.contribution.ContributionWidgetSettingsActivity$Companion$removeUserWidgets$2$1", f = "ContributionWidgetSettingsActivity.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class o extends c71.j implements j71.e {
    public final a71.c r(a71.c cVar, Object obj) {
        return new o(2, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (ContributionWidgetModel) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        return new ContributionWidgetModel(x61.s.r, WidgetUIState.Loaded.INSTANCE);
    }
}
