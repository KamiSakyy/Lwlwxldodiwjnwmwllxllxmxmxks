package com.github.rudroid.widget.shortcuts;

import com.github.rudroid.widget.shortcuts.ShortcutWidgetSettingsActivity;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c0 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ c0(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object k(Object obj) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                ShortcutWidgetSettingsActivity.a aVar = ShortcutWidgetSettingsActivity.Companion;
                ((ShortcutWidgetSettingsActivity) obj2).s0().Q(floatValue);
                break;
            case 1:
                com.github.rudroid.activities.m0 m0Var = (ShortcutWidgetSettingsActivity) obj2;
                ShortcutWidgetSettingsActivity.a aVar2 = ShortcutWidgetSettingsActivity.Companion;
                m0Var.setResult(-1);
                m0Var.finish();
                break;
            default:
                com.github.rudroid.widget.shortcuts.model.h hVar = (com.github.rudroid.widget.shortcuts.model.h) obj2;
                d6.h hVar2 = (d6.h) obj;
                k71.k.g(hVar2, "$this$LazyColumn");
                ArrayList arrayList = hVar.c;
                hVar2.b(arrayList.size(), new y(arrayList), new r1.d(new z(arrayList, hVar), true, 329696715));
                hVar2.a(Long.MIN_VALUE, new r1.d(new w(0, hVar), true, -350593209));
                break;
        }
        return a0Var;
    }
}
