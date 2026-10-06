package com.github.rudroid.fragments.onboarding.notifications.viewmodel;

import android.app.Application;
import android.content.SharedPreferences;
import com.github.rudroid.fragments.onboarding.notifications.viewmodel.i0;
import com.github.rudroid.settings.g3;
import java.util.Set;
import y71.i1;
import y71.n1Shadow;
import y71.w1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class k0 extends androidx.lifecycle.a implements l0 {

    /* renamed from: t, reason: collision with root package name */
    public Set f14293t;

    /* renamed from: u, reason: collision with root package name */
    public y1 f14294u;

    /* renamed from: v, reason: collision with root package name */
    public i1 f14295v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Application application) {
        super(application);
        k71.k.g(application, "application");
        this.f14293t = x61.l.j0(new String[]{"left_swipe_action", "right_swipe_action"});
        i0.a aVar = i0.Companion;
        Application P = P();
        aVar.getClass();
        y1 c10 = n1Shadow.c(i0.a.a(P));
        this.f14294u = c10;
        this.f14295v = new i1(c10);
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.github.rudroid.fragments.onboarding.notifications.viewmodel.j0
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                k0 k0Var = k0.this;
                if (x61.m.N(k0Var.f14293t, str)) {
                    y1 y1Var = k0Var.f14294u;
                    i0.a aVar2 = i0.Companion;
                    Application P2 = k0Var.P();
                    aVar2.getClass();
                    i0 a10 = i0.a.a(P2);
                    y1Var.getClass();
                    y1Var.k((Object) null, a10);
                }
            }
        };
        fi.a aVar2 = fi.b.Companion;
        Application P2 = P();
        aVar2.getClass();
        fi.a.g(P2).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // com.github.rudroid.fragments.onboarding.notifications.viewmodel.l0
    public final void j(g3 g3Var) {
        k71.k.g(g3Var, "action");
        fi.a aVar = fi.b.Companion;
        Application P = P();
        int i = g3Var.r;
        aVar.getClass();
        fi.a.f(P, i);
    }

    @Override // com.github.rudroid.fragments.onboarding.notifications.viewmodel.l0
    public final w1 k() {
        return this.f14295v;
    }

    @Override // com.github.rudroid.fragments.onboarding.notifications.viewmodel.l0
    public final void w(g3 g3Var) {
        k71.k.g(g3Var, "action");
        fi.a aVar = fi.b.Companion;
        Application P = P();
        int i = g3Var.r;
        aVar.getClass();
        fi.a.e(P, i);
    }
}
