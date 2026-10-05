package com.github.rudroid.shortcuts.activities;

import com.github.rudroid.fragments.BindingFragment;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class p0 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ BindingFragment s;

    public /* synthetic */ p0(BindingFragment bindingFragment, int i) {
        this.r = i;
        this.s = bindingFragment;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                String str = (String) obj;
                com.github.rudroid.viewmodels.search.c cVar = (com.github.rudroid.viewmodels.search.c) ((ShortcutViewFragment) this.s).G0.getValue();
                if (str == null) {
                    str = "";
                }
                cVar.T(str);
                break;
            case 1:
                String str2 = (String) obj;
                com.github.rudroid.viewmodels.search.c cVar2 = (com.github.rudroid.viewmodels.search.c) ((ShortcutViewFragment) this.s).G0.getValue();
                if (str2 == null) {
                    str2 = "";
                }
                cVar2.R(str2);
                break;
            default:
                ShortcutsOverviewFragment shortcutsOverviewFragment = (ShortcutsOverviewFragment) this.s;
                ig.a aVar = (ig.a) obj;
                k71.k.g(aVar, "it");
                wm.b bVar = aVar.s;
                wm.b bVar2 = aVar.r;
                if (bVar2 != null) {
                    shortcutsOverviewFragment.J4().R(bVar2, bVar);
                } else {
                    shortcutsOverviewFragment.J4().Q(bVar);
                }
                return w61.a0.a;
        }
        return w61.a0.a;
    }

}
