package com.github.rudroid.shortcuts.activities;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 implements a5.t {
    public final /* synthetic */ ShortcutsOverviewFragment r;

    public a1(ShortcutsOverviewFragment shortcutsOverviewFragment) {
        this.r = shortcutsOverviewFragment;
    }

    public final void I2(Menu menu) {
        k71.k.g(menu, "menu");
        MenuItem findItem = menu.findItem(2131363277);
        ShortcutsOverviewFragment shortcutsOverviewFragment = this.r;
        shortcutsOverviewFragment.K0 = findItem;
        MenuItem findItem2 = menu.findItem(2131363321);
        if (findItem2 != null) {
            com.github.rudroid.shortcuts.d0 d0Var = shortcutsOverviewFragment.I0;
            if (d0Var != null) {
                findItem2.setTitle(((Boolean) d0Var.j.getValue()).booleanValue() ? shortcutsOverviewFragment.C3(2131953151) : shortcutsOverviewFragment.C3(2131953225));
            } else {
                k71.k.m("dataAdapter");
                throw null;
            }
        }
    }

    public final boolean a0(MenuItem menuItem) {
        k71.k.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        ShortcutsOverviewFragment shortcutsOverviewFragment = this.r;
        if (itemId == 2131363277) {
            com.github.rudroid.utilities.w0.a(shortcutsOverviewFragment.J4().S(), shortcutsOverviewFragment.F3(), androidx.lifecycle.w.u, new z0(shortcutsOverviewFragment, null));
            return true;
        }
        if (itemId != 2131363321) {
            return true;
        }
        com.github.rudroid.shortcuts.d0 d0Var = shortcutsOverviewFragment.I0;
        if (d0Var == null) {
            k71.k.m("dataAdapter");
            throw null;
        }
        d0Var.j.k((Object) null, Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
        d0Var.n();
        return true;
    }

    public final void o2(Menu menu, MenuInflater menuInflater) {
        k71.k.g(menu, "menu");
        k71.k.g(menuInflater, "menuInflater");
        menuInflater.inflate(2131689492, menu);
    }
}
