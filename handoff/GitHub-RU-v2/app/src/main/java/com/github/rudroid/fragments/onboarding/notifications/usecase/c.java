package com.github.rudroid.fragments.onboarding.notifications.usecase;

import a61.l0;
import android.content.Context;
import com.google.android.gms.internal.measurement.z3;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public Context f14200a;

    /* renamed from: b, reason: collision with root package name */
    public gi.c f14201b;

    /* renamed from: c, reason: collision with root package name */
    public com.github.rudroid.settings.notifications.e f14202c;

    public c(Context context, gi.c cVar, com.github.rudroid.settings.notifications.e eVar) {
        k71.k.g(cVar, "systemPreferences");
        k71.k.g(eVar, "userSettingsUseCase");
        this.f14200a = context;
        this.f14201b = cVar;
        this.f14202c = eVar;
    }

    public final c00.g a(oa.j jVar) {
        k71.k.g(jVar, "user");
        l0 l0Var = this.f14201b.b;
        com.github.rudroid.settings.notifications.e eVar = this.f14202c;
        eVar.getClass();
        return new c00.g(l0Var, z3.G(((n5.f) eVar.a.a(jVar)).getData(), new com.github.rudroid.fragments.onboarding.notifications.viewmodel.z(27, eVar)), new b(this, null), 27);
    }
}
