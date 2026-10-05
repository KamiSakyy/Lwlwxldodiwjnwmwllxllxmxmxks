package com.github.rudroid.widget;

import android.content.Context;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.rudroid.profile.status.ui.x;
import com.github.rudroid.widget.WidgetUIState;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final void a(WidgetUIState widgetUIState, m6.e eVar, s sVar, int i) {
        String str;
        k71.k.g(widgetUIState, "widgetUIState");
        sVar.e0(-412310642);
        int i2 = (sVar.f(widgetUIState) ? 4 : 2) | i | (sVar.f(eVar) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) sVar.j(z5.g.b);
            k71.k.g(context, "context");
            if (widgetUIState.equals(WidgetUIState.Waiting.INSTANCE)) {
                str = context.getString(2131954956);
            } else if (widgetUIState.equals(WidgetUIState.Loading.INSTANCE)) {
                str = context.getString(2131954954);
            } else if (widgetUIState.equals(WidgetUIState.Retrying.INSTANCE)) {
                str = context.getString(2131954955);
            } else if (widgetUIState instanceof WidgetUIState.Error) {
                String str2 = ((WidgetUIState.Error) widgetUIState).b;
                if (str2 == null) {
                    str = context.getString(2131952512);
                    k71.k.f(str, "getString(...)");
                } else {
                    str = str2;
                }
            } else {
                if (!widgetUIState.equals(WidgetUIState.Loaded.INSTANCE) && !widgetUIState.equals(WidgetUIState.SignedOut.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
            if (str == null) {
                sVar.c0(460290420);
            } else {
                sVar.c0(460290421);
                b(str, eVar, null, sVar, i2 & 112);
            }
            sVar.q(false);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.settings.copilot.debug.q(widgetUIState, eVar, i, 14);
        }
    }

    public static final void b(String str, m6.e eVar, z5.n nVar, s sVar, int i) {
        s sVar2;
        sVar.e0(394213387);
        int i2 = (sVar.f(str) ? 4 : 2) | i | (sVar.f(eVar) ? 32 : 16) | 384;
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            z5.n a = j.a(sVar);
            z5.n nVar2 = z5.l.a;
            sVar2 = sVar;
            b31.b.a(a.d(nVar2), i6.c.e, r1.i.d(-1240799251, new a(str, eVar, 0), sVar), sVar2, 384, 0);
            nVar = nVar2;
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new x(str, eVar, nVar, i, 20);
        }
    }
}
