package com.github.developersettings;

import a5.g1;
import a5.t;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.l1;
import d71.b;
import ei.c;
import ei.e;
import f0.b2;
import f0.o0;
import h11.f;
import ii.d;
import java.util.Iterator;
import k.i;
import k71.k;
import sy.w;
import w61.p;

/* loaded from: /home/user/work/p/classes3.dex */
public final class DeveloperSettingsFragment extends Hilt_DeveloperSettingsFragment implements t {
    public static final d Companion = new d();
    public final p y0 = w.t(new b2(21, this));
    public final f z0 = new f(new o0(2, this, DeveloperSettingsFragment.class, "onFeatureFlagChanged", "onFeatureFlagChanged(Lcom/github/commonandroid/featureflag/FeatureFlags;Z)V", 0, 0, 2), (byte) 0);

    public final boolean a0(MenuItem menuItem) {
        ei.d dVar;
        k.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        p pVar = this.y0;
        f fVar = this.z0;
        if (itemId == 2131363020) {
            dVar = ei.d.t;
        } else if (itemId == 2131363027) {
            dVar = ei.d.u;
        } else if (itemId == 2131363016) {
            dVar = ei.d.v;
        } else {
            if (itemId != 2131363026) {
                if (itemId != 2131363017) {
                    return false;
                }
                SharedPreferences sharedPreferences = ((e) pVar.getValue()).a;
                k.f(sharedPreferences, "preferences");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                Iterator it = c.e0.iterator();
                while (it.hasNext()) {
                    edit.remove(((c) it.next()).r);
                }
                edit.apply();
                fVar.n();
                return true;
            }
            dVar = ei.d.w;
        }
        b bVar = c.e0;
        bVar.getClass();
        g1 g1Var = new g1(8, bVar);
        while (g1Var.hasNext()) {
            c cVar = (c) g1Var.next();
            e eVar = (e) pVar.getValue();
            cVar.getClass();
            boolean z = dVar.ordinal() <= cVar.t.ordinal();
            eVar.getClass();
            SharedPreferences sharedPreferences2 = eVar.a;
            k.f(sharedPreferences2, "preferences");
            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
            edit2.putBoolean(cVar.r, z);
            edit2.apply();
        }
        fVar.n();
        return true;
    }

    public final void c4(View view, Bundle bundle) {
        k.g(view, "view");
        i g4 = g4();
        l1 F3 = F3();
        androidx.lifecycle.w wVar = androidx.lifecycle.w.r;
        g4.B(this, F3);
        view.findViewById(2131362334).setAdapter(this.z0);
    }

    public final void o2(Menu menu, MenuInflater menuInflater) {
        k.g(menu, "menu");
        k.g(menuInflater, "menuInflater");
        menuInflater.inflate(2131689479, menu);
    }

    public static Object g4(Object... a) {
        return null;
    }

    public static Object F3(Object... a) {
        return null;
    }
}
