package com.github.rudroid.settings.applock.settings;

import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.settings.applock.settings.AppLockSettingsActivity$sendAnalyticsEvent$1", f = "AppLockSettingsActivity.kt", l = {232}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f extends c71.j implements j71.e {
    public com.github.rudroid.utilities.e v;
    public int w;
    public final /* synthetic */ AppLockSettingsActivity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AppLockSettingsActivity appLockSettingsActivity, a71.c cVar) {
        super(2, cVar);
        this.x = appLockSettingsActivity;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f(this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        com.github.rudroid.utilities.e eVar;
        b71.a aVar = b71.a.r;
        int i = this.w;
        if (i == 0) {
            y.j(obj);
            AppLockSettingsActivity appLockSettingsActivity = this.x;
            com.github.rudroid.utilities.e y0 = appLockSettingsActivity.y0();
            com.github.rudroid.activities.util.c w0 = appLockSettingsActivity.w0();
            this.v = y0;
            this.w = 1;
            obj = com.github.rudroid.activities.util.a.c(w0, this);
            if (obj == aVar) {
                return aVar;
            }
            eVar = y0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = this.v;
            y.j(obj);
        }
        eVar.a((oa.j) obj, new wj.e(MobileAppAction.PRESS, MobileAppElement.SETTINGS_ENABLE_APP_LOCK, null, null));
        return a0.a;
    }
}
