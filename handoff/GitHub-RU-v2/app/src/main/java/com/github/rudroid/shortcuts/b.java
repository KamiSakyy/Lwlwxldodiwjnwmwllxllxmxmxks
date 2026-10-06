package com.github.rudroid.shortcuts;

import com.github.domain.shortcuts.model.ShortcutConfigurationModel;
import com.github.rudroid.utilities.ui.g1;

@c71.e(c = "com.github.rudroid.shortcuts.ConfigureShortcutViewModel$1$1", f = "ConfigureShortcutViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
class b extends c71.j implements j71.g {
    public /* synthetic */ ShortcutConfigurationModel v;
    public /* synthetic */ boolean w;
    public /* synthetic */ g1 x;

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        b bVar = new b(4, (a71.c) obj4);
        bVar.v = (ShortcutConfigurationModel) obj;
        bVar.w = booleanValue;
        bVar.x = (g1) obj3;
        return bVar.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        ShortcutConfigurationModel shortcutConfigurationModel = this.v;
        boolean z = this.w;
        g1 g1Var = this.x;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        return new a(shortcutConfigurationModel, z, g1Var);
    }
}
