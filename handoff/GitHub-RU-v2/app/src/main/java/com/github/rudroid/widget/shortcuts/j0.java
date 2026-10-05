package com.github.rudroid.widget.shortcuts;

import android.view.ViewGroup;
import androidx.compose.runtime.f1;
import androidx.compose.ui.platform.ComposeView;
import com.github.rudroid.activities.m0;

@c71.e(c = "com.github.rudroid.widget.shortcuts.ShortcutWidgetSettingsActivity$onCreate$1$1$2$4$1", f = "ShortcutWidgetSettingsActivity.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class j0 extends c71.j implements j71.e {
    public final /* synthetic */ ShortcutWidgetSettingsActivity v;
    public final /* synthetic */ String w;
    public final /* synthetic */ f1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ShortcutWidgetSettingsActivity shortcutWidgetSettingsActivity, String str, f1 f1Var, a71.c cVar) {
        super(2, cVar);
        this.v = shortcutWidgetSettingsActivity;
        this.w = str;
        this.x = f1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new j0(this.v, this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        j0 r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        com.github.rudroid.activities.m0.q0(this.v, this.w, (m0.b) null, (ViewGroup) null, (ComposeView) null, 62);
        this.x.setValue(Boolean.FALSE);
        return w61.a0.a;
    }
}
