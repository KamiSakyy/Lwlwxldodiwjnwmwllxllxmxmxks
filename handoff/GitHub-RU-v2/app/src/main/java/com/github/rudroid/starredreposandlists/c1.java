package com.github.rudroid.starredreposandlists;

import android.app.ActivityOptions;
import android.util.Pair;
import com.github.rudroid.agents.copilothome.navigation.a;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;

/* loaded from: /home/user/work/p/classes3.dex */
final /* synthetic */ class c1 extends k71.i implements j71.a {
    public final Object a() {
        StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment = (StarredRepositoriesAndListsFragment) ((k71.c) this).s;
        starredRepositoriesAndListsFragment.getClass();
        StarredRepositoriesAndListsFragment.F4(starredRepositoriesAndListsFragment, MobileAppElement.COPILOT_CHAT_BUTTON, MobileAppAction.PRESS);
        starredRepositoriesAndListsFragment.E(a.a.a(com.github.rudroid.agents.copilothome.navigation.a.Companion, starredRepositoriesAndListsFragment.i4(), (String) null, (String) null, (String) null, (String) null, 62), ActivityOptions.makeSceneTransitionAnimation(starredRepositoriesAndListsFragment.g4(), new Pair[0]).toBundle());
        return w61.a0.a;
    }
}
