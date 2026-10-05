package com.github.rudroid.shortcuts.activities;

import android.os.Bundle;
import androidx.fragment.app.f1;
import com.github.service.models.response.shortcuts.ShortcutScope;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class m implements h.b, f1 {
    public final /* synthetic */ ConfigureShortcutFragment r;

    public /* synthetic */ m(ConfigureShortcutFragment configureShortcutFragment) {
        this.r = configureShortcutFragment;
    }

    public void d(Object obj) {
        com.github.service.models.response.shortcuts.a aVar = (ShortcutScope.SpecificRepository) obj;
        if (aVar != null) {
            ConfigureShortcutFragment configureShortcutFragment = this.r;
            configureShortcutFragment.E4().R(aVar, new q(1, 0, com.github.rudroid.searchandfilter.q.class, configureShortcutFragment.D4(), "resetToNewDefaultSet", "resetToNewDefaultSet(Ljava/util/List;Ljava/util/List;)V"));
        }
    }

    public void e(String str, Bundle bundle) {
        ConfigureShortcutFragment.C4(this.r, str, bundle);
    }
}
