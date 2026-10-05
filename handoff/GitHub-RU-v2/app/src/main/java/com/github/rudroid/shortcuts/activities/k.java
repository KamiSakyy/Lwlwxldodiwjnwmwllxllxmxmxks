package com.github.rudroid.shortcuts.activities;

import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.shortcuts.navigation.ChooseShortcutRepositoryRoute;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class k implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ ConfigureShortcutFragment s;

    public /* synthetic */ k(ConfigureShortcutFragment configureShortcutFragment, int i) {
        this.r = i;
        this.s = configureShortcutFragment;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
                ei.c cVar = ei.c.w;
                runtimeFeatureFlag.getClass();
                boolean a = RuntimeFeatureFlag.a(cVar);
                ConfigureShortcutFragment configureShortcutFragment = this.s;
                w61.a0 a0Var = w61.a0.a;
                if (a && com.github.rudroid.main.navigation.f.b(configureShortcutFragment)) {
                    x6.a0 i = sy.s.i(configureShortcutFragment);
                    k71.k.g(i, "<this>");
                    com.github.rudroid.main.navigation.f.c(i, ChooseShortcutRepositoryRoute.INSTANCE, (x6.d0) null, 6);
                } else {
                    androidx.fragment.app.t tVar = configureShortcutFragment.G0;
                    if (tVar == null) {
                        k71.k.m("chooseRepositoryLauncher");
                        throw null;
                    }
                    tVar.a(a0Var);
                }
                return a0Var;
            case 1:
                this.s.D4().V();
                break;
            case 2:
                this.s.E4().P();
                break;
            default:
                this.s.g4().m().c();
                break;
        }
        return w61.a0.a;
    }



}
