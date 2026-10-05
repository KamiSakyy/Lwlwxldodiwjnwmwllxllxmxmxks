package com.github.rudroid.settings.applock.settings;

import a61.l0;
import com.google.android.gms.internal.measurement.z3;
import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.settings.applock.settings.AppLockSettingsViewModel$observeAppLockPreferences$1", f = "AppLockSettingsViewModel.kt", l = {38}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class l extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ o w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, a71.c cVar) {
        super(2, cVar);
        this.w = oVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new l(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            y.j(obj);
            o oVar = this.w;
            com.github.rudroid.settings.applock.usecases.a aVar2 = oVar.s;
            l0 G = z3.G(aVar2.a.getData(), new com.github.rudroid.fragments.onboarding.notifications.viewmodel.z(25, aVar2));
            k kVar = new k(oVar);
            this.v = 1;
            if (G.b(kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
        }
        return a0.a;
    }
}
