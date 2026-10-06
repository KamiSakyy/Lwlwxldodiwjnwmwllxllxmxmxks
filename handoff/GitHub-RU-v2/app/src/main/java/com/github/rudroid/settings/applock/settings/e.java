package com.github.rudroid.settings.applock.settings;

import androidx.lifecycle.d1;
import com.github.rudroid.settings.applock.settings.AppLockSettingsActivity;
import kotlin.NoWhenBranchMatchedException;
import sy.y;
import v71.b0;
import w61.a0;
import yf.f;

@c71.e(c = "com.github.rudroid.settings.applock.settings.AppLockSettingsActivity$authenticateAppLockSwitchAction$1", f = "AppLockSettingsActivity.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class e extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ AppLockSettingsActivity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z, AppLockSettingsActivity appLockSettingsActivity, a71.c cVar) {
        super(2, cVar);
        this.w = z;
        this.x = appLockSettingsActivity;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        e eVar = new e(this.w, this.x, cVar);
        eVar.v = obj;
        return eVar;
    }

    public final Object s(Object obj, Object obj2) {
        e r = r((a71.c) obj2, (yf.f) obj);
        a0 a0Var = a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        yf.f fVar = (yf.f) this.v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        if (fVar instanceof f.b) {
            boolean z = this.w;
            AppLockSettingsActivity appLockSettingsActivity = this.x;
            if (z) {
                AppLockSettingsActivity.a aVar2 = AppLockSettingsActivity.Companion;
                b0.z(d1.i(appLockSettingsActivity), (a71.h) null, (v71.a0Shadow) null, new f(appLockSettingsActivity, null), 3);
            }
            AppLockSettingsActivity.a aVar3 = AppLockSettingsActivity.Companion;
            o oVar = (o) appLockSettingsActivity.u0.getValue();
            b0.z(d1.k(oVar), (a71.h) null, (v71.a0Shadow) null, new m(oVar, null), 3);
        } else if (!(fVar instanceof f.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return a0.a;
    }
}
