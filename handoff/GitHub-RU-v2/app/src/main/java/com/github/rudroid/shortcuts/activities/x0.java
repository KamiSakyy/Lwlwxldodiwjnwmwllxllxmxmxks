package com.github.rudroid.shortcuts.activities;

import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.shortcuts.navigation.ConfigureShortcutRoute;
import jg.g;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class x0 implements g.a, h.b {
    public final /* synthetic */ ShortcutsOverviewFragment r;

    public /* synthetic */ x0(ShortcutsOverviewFragment shortcutsOverviewFragment) {
        this.r = shortcutsOverviewFragment;
    }

    @Override // jg.g.a
    public void a() {
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        boolean a = RuntimeFeatureFlag.a(cVar);
        ShortcutsOverviewFragment shortcutsOverviewFragment = this.r;
        if (a && com.github.rudroid.main.navigation.f.b(shortcutsOverviewFragment)) {
            x6.a0 i = sy.s.i(shortcutsOverviewFragment);
            k71.k.g(i, "<this>");
            com.github.rudroid.main.navigation.f.c(i, new ConfigureShortcutRoute(null, false, false, false, true), (x6.d0) null, 6);
        } else {
            androidx.fragment.app.t tVar = shortcutsOverviewFragment.L0;
            if (tVar != null) {
                tVar.a((Object) null);
            } else {
                k71.k.m("shortcutConfigurationLauncher");
                throw null;
            }
        }
    }

    public void d(Object obj) {
        ig.a aVar = (ig.a) obj;
        if (aVar != null) {
            wm.b bVar = aVar.s;
            wm.b bVar2 = aVar.r;
            ShortcutsOverviewFragment shortcutsOverviewFragment = this.r;
            if (bVar2 != null) {
                shortcutsOverviewFragment.J4().R(bVar2, bVar);
            } else {
                shortcutsOverviewFragment.J4().Q(bVar);
            }
        }
    }
}
