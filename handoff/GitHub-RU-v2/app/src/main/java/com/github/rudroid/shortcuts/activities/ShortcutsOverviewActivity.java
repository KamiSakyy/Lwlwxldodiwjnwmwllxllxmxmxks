package com.github.rudroid.shortcuts.activities;

import android.os.Bundle;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import androidx.navigation.fragment.NavHostFragment;
import com.github.rudroid.shortcuts.navigation.ShortcutsOverviewRoute;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ShortcutsOverviewActivity extends l0<ic.d0> implements com.github.rudroid.main.f {
    public static final a Companion = new a();
    public int v0;
    public KeyboardShortcutGroup w0;

    public static final class a {
    }

    public ShortcutsOverviewActivity() {
        this.u0 = false;
        C(new k0(this));
        this.v0 = 2131558443;
    }

    public final int L0() {
        return this.v0;
    }

    public final void o(KeyboardShortcutGroup keyboardShortcutGroup) {
        this.w0 = keyboardShortcutGroup;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NavHostFragment E = H().E(2131363076);
        k71.k.e(E, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        x6.a0 s4 = E.s4();
        x6.y yVar = new x6.y(s4.b.s, ShortcutsOverviewRoute.INSTANCE, (k71.e) null);
        com.github.rudroid.m0.D(new z6.i(com.github.rudroid.m0.r(yVar.g, z6.e.class), k71.x.a(ShortcutsOverviewRoute.class), x61.s.r, k71.x.a(ShortcutsOverviewFragment.class)), yVar.j, yVar, s4);
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        KeyboardShortcutGroup keyboardShortcutGroup;
        if (list == null || (keyboardShortcutGroup = this.w0) == null) {
            return;
        }
        list.add(keyboardShortcutGroup);
    }
    public Object C(Object) { return null; }
}
