package com.github.rudroid.shortcuts.activities;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.github.rudroid.shortcuts.navigation.ChooseShortcutRepositoryRoute;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ChooseShortcutRepositoryActivity extends f0<ic.d0> {
    public static final a Companion = new a();
    public int v0;

    public static final class a {
    }

    public ChooseShortcutRepositoryActivity() {
        this.u0 = false;
        C(new e0(this));
        this.v0 = 2131558443;
    }

    public final int L0() {
        return this.v0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NavHostFragment E = H().E(2131363076);
        k71.k.e(E, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        x6.a0 s4 = E.s4();
        x6.y yVar = new x6.y(s4.b.s, ChooseShortcutRepositoryRoute.INSTANCE, (k71.e) null);
        com.github.rudroid.m0.D(new z6.i(com.github.rudroid.m0.r(yVar.g, z6.e.class), k71.xShadow.a(ChooseShortcutRepositoryRoute.class), x61.s.r, k71.xShadow.a(ChooseShortcutRepositoryFragment.class)), yVar.j, yVar, s4);
    }

    public static Object C(Object... a) {
        return null;
    }

    public static Object H(Object... a) {
        return null;
    }
}
