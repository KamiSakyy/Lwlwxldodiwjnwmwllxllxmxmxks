package com.github.rudroid.shortcuts.activities;

import com.github.rudroid.agents.w6;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ ChooseShortcutRepositoryFragment s;

    public /* synthetic */ c(ChooseShortcutRepositoryFragment chooseShortcutRepositoryFragment, int i) {
        this.r = i;
        this.s = chooseShortcutRepositoryFragment;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                ((w6) this.s.I0.getValue()).Q();
                break;
            default:
                ChooseShortcutRepositoryFragment chooseShortcutRepositoryFragment = this.s;
                ((w6) chooseShortcutRepositoryFragment.I0.getValue()).Q();
                com.github.rudroid.utilities.e eVar = chooseShortcutRepositoryFragment.E0;
                if (eVar == null) {
                    k71.k.m("analytics");
                    throw null;
                }
                com.github.rudroid.activities.util.c cVar = chooseShortcutRepositoryFragment.F0;
                if (cVar == null) {
                    k71.k.m("accountHolder");
                    throw null;
                }
                eVar.a(cVar.d(), new wj.e(MobileAppElement.VIEWER_PULL_TO_REFRESH, MobileAppAction.SWIPE, null, null, 12));
                break;
        }
        return w61.a0.a;
    }
}
