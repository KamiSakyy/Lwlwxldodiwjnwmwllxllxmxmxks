package com.github.rudroid.starredreposandlists;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.github.rudroid.starredreposandlists.createoreditlist.CreateNewListActivity;

/* loaded from: /home/user/work/p/classes3.dex */
final /* synthetic */ class e1 extends k71.i implements j71.a {
    public final Object a() {
        StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment = (StarredRepositoriesAndListsFragment) ((k71.c) this).s;
        starredRepositoriesAndListsFragment.getClass();
        CreateNewListActivity.a aVar = CreateNewListActivity.Companion;
        Context i4 = starredRepositoriesAndListsFragment.i4();
        aVar.getClass();
        starredRepositoriesAndListsFragment.E(new Intent(i4, (Class<?>) CreateNewListActivity.class), (Bundle) null);
        return w61.a0.a;
    }
}
