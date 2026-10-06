package com.github.rudroid.shortcuts.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.github.domain.shortcuts.model.ShortcutConfigurationModel;
import com.github.rudroid.shortcuts.navigation.ConfigureShortcutRoute;
import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ConfigureShortcutActivity extends h0<ic.d0> {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] x0;
    public final int v0;
    public final com.github.rudroid.activities.util.g w0;

    public static final class a {
        public static void a(a aVar, Intent intent, wm.b bVar, boolean z, int i) {
            if ((i & 1) != 0) {
                bVar = null;
            }
            intent.putExtra("EXTRA_ROUTE", new ConfigureShortcutRoute(bVar, (i & 2) == 0, (i & 4) != 0 ? false : z, (i & 8) == 0, (i & 16) == 0));
        }

        public final Intent b(Context context, List list, com.github.service.models.response.shortcuts.a aVar, ShortcutType shortcutType) {
            k71.k.g(list, "filters");
            k71.k.g(aVar, "shortcutScope");
            k71.k.g(shortcutType, "shortcutType");
            Intent intent = new Intent(context, (Class<?>) ConfigureShortcutActivity.class);
            com.github.rudroid.shortcuts.e.Companion.getClass();
            ShortcutConfigurationModel shortcutConfigurationModel = com.github.rudroid.shortcuts.e.F;
            a(this, intent, new ShortcutConfigurationModel(list, shortcutConfigurationModel.t, shortcutConfigurationModel.u, aVar, shortcutType, shortcutConfigurationModel.x), true, 18);
            return intent;
        }
    }

    static {
        r71.e pVar = new k71.p(ConfigureShortcutActivity.class, "route", "getRoute()Lcom/github/rudroid/shortcuts/navigation/ConfigureShortcutRoute;", 0);
        k71.x.a.getClass();
        x0 = new r71.e[]{pVar};
        Companion = new a();
    }

    public ConfigureShortcutActivity() {
        this.u0 = false;
        C(new g0(this));
        this.v0 = 2131558443;
        this.w0 = new com.github.rudroid.activities.util.g("EXTRA_ROUTE");
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
        x6.y yVar = new x6.y(s4.b.s, (ConfigureShortcutRoute) this.w0.c(this, x0[0]), (k71.e) null);
        com.github.rudroid.m0.D(new z6.i(com.github.rudroid.m0.r(yVar.g, z6.e.class), k71.x.a(ConfigureShortcutRoute.class), ig.b.a, k71.x.a(ConfigureShortcutFragment.class)), yVar.j, yVar, s4);
    }
}
