package com.github.rudroid.settings;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i3 extends androidx.lifecycle.l0 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public Context l;
    public Set m;

    public i3(Application application) {
        k71.k.g(application, "context");
        this.l = application;
        this.m = x61.l.j0(new String[]{"left_swipe_action", "right_swipe_action"});
    }

    public final void g() {
        Context context = this.l;
        j(new h3(context));
        fi.b.Companion.getClass();
        k71.k.g(context, "context");
        fi.a.g(context).registerOnSharedPreferenceChangeListener(this);
    }

    public final void h() {
        fi.b.Companion.getClass();
        Context context = this.l;
        k71.k.g(context, "context");
        fi.a.g(context).unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (x61.m.N(this.m, str)) {
            j(new h3(this.l));
        }
    }
    public Object e(Object p1, Object p2) { return null; }
    public Object e(Object p1, Object p2) { return null; }
    public Object j(Object p1) { return null; }
}
