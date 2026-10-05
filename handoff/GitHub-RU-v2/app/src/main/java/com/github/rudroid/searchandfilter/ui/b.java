package com.github.rudroid.searchandfilter.ui;

import android.os.Bundle;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.searchandfilter.q;
import com.github.rudroid.shortcuts.activities.ConfigureShortcutActivity;
import com.github.service.models.response.shortcuts.ShortcutType;

/* loaded from: /home/user/work/p/classes3.dex */
final /* synthetic */ class b extends k71.i implements j71.a {
    public final Object a() {
        FilterBarFragmentBase filterBarFragmentBase = (FilterBarFragmentBase) ((k71.c) this).s;
        q.d dVar = filterBarFragmentBase.H4().z;
        if (dVar != null) {
            ShortcutType shortcutType = dVar.b;
            com.github.service.models.response.shortcuts.a aVar = dVar.c;
            RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
            ei.c cVar = ei.c.w;
            runtimeFeatureFlag.getClass();
            if (RuntimeFeatureFlag.a(cVar) && com.github.rudroid.main.navigation.f.b(filterBarFragmentBase)) {
                ig.f.a(sy.s.i(filterBarFragmentBase), filterBarFragmentBase.H4().R(), aVar, shortcutType);
            } else {
                filterBarFragmentBase.E(ConfigureShortcutActivity.Companion.b(filterBarFragmentBase.i4(), filterBarFragmentBase.H4().R(), aVar, shortcutType), (Bundle) null);
            }
        }
        return w61.a0.a;
    }
}
