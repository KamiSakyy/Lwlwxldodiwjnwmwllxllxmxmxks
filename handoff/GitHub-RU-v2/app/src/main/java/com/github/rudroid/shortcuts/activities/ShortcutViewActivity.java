package com.github.rudroid.shortcuts.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.github.rudroid.shortcuts.navigation.ShortcutViewRoute;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ShortcutViewActivity extends j0<ic.d0> {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] x0;
    public final int v0;
    public final com.github.rudroid.activities.util.g w0;

    public static final class a {
        public static Intent a(Context context, String str) {
            k71.k.g(context, "context");
            k71.k.g(str, "shortcutId");
            Intent intent = new Intent(context, (Class<?>) ShortcutViewActivity.class);
            intent.putExtra("EXTRA_SHORTCUT_ID", str);
            return intent;
        }
    }

    static {
        r71.e mVar = new k71.m(ShortcutViewActivity.class, "shortcutId", "getShortcutId()Ljava/lang/String;", 0);
        k71.x.a.getClass();
        x0 = new r71.e[]{mVar};
        Companion = new a();
    }

    public ShortcutViewActivity() {
        this.u0 = false;
        C(new i0(this));
        this.v0 = 2131558443;
        this.w0 = new com.github.rudroid.activities.util.g("EXTRA_SHORTCUT_ID");
    }

    public final int L0() {
        return this.v0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NavHostFragment E = H().E(2131363076);
        k71.k.e(E, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        x6.a0 s4 = E.s4();
        x6.y yVar = new x6.y(s4.b.s, new ShortcutViewRoute((String) this.w0.c(this, x0[0])), (k71.e) null);
        com.github.rudroid.m0.D(new z6.i(com.github.rudroid.m0.r(yVar.g, z6.e.class), k71.x.a(ShortcutViewRoute.class), x61.s.r, k71.x.a(ShortcutViewFragment.class)), yVar.j, yVar, s4);
    }

    public static  C(Object... a) {
        return null;
    }
}
