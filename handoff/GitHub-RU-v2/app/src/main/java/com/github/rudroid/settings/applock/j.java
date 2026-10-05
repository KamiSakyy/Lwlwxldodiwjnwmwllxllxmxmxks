package com.github.rudroid.settings.applock;

import android.os.SystemClock;

@c71.e(c = "com.github.rudroid.settings.applock.AppLockAuthenticationStore$updateLastActiveMillis$1", f = "AppLockAuthenticationStore.kt", l = {68}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class j extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ k w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, a71.c cVar) {
        super(2, cVar);
        this.w = kVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new j(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            com.github.rudroid.settings.applock.usecases.m mVar = this.w.b;
            Long l = new Long(SystemClock.elapsedRealtime());
            this.v = 1;
            if (mVar.a(l, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
