package com.github.rudroid.shortcuts.activities;

import com.github.domain.shortcuts.model.ShortcutConfigurationModel;
import com.github.service.models.response.shortcuts.ShortcutScope;
import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.ArrayList;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class l implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ ConfigureShortcutFragment s;

    public /* synthetic */ l(ConfigureShortcutFragment configureShortcutFragment, int i) {
        this.r = i;
        this.s = configureShortcutFragment;
    }

    public final Object k(Object obj) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        ConfigureShortcutFragment configureShortcutFragment = this.s;
        switch (i) {
            case 0:
                com.github.service.models.response.shortcuts.a aVar = (com.github.service.models.response.shortcuts.a) obj;
                k71.k.g(aVar, "it");
                configureShortcutFragment.E4().R(aVar, new w(1, 0, com.github.rudroid.searchandfilter.q.class, configureShortcutFragment.D4(), "resetToNewDefaultSet", "resetToNewDefaultSet(Ljava/util/List;Ljava/util/List;)V"));
                break;
            case 1:
                ShortcutType shortcutType = (ShortcutType) obj;
                k71.k.g(shortcutType, "it");
                com.github.rudroid.shortcuts.e E4 = configureShortcutFragment.E4();
                x xVar = new x(1, 0, com.github.rudroid.searchandfilter.q.class, configureShortcutFragment.D4(), "resetToNewDefaultSet", "resetToNewDefaultSet(Ljava/util/List;Ljava/util/List;)V");
                ArrayList arrayList = bm.e.a;
                y1 y1Var = E4.A;
                ArrayList c = bm.e.c(((ShortcutConfigurationModel) y1Var.getValue()).v, shortcutType);
                y1Var.k((Object) null, ShortcutConfigurationModel.c((ShortcutConfigurationModel) y1Var.getValue(), c, null, null, null, shortcutType, null, 93));
                xVar.k(c);
                break;
            default:
                ShortcutScope.SpecificRepository specificRepository = (ShortcutScope.SpecificRepository) obj;
                k71.k.g(specificRepository, "it");
                configureShortcutFragment.E4().R(specificRepository, new y(1, 0, com.github.rudroid.searchandfilter.q.class, configureShortcutFragment.D4(), "resetToNewDefaultSet", "resetToNewDefaultSet(Ljava/util/List;Ljava/util/List;)V"));
                break;
        }
        return a0Var;
    }
}
