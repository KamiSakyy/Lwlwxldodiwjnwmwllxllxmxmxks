package com.github.rudroid.settings.applock.settings;

import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.settings.applock.settings.AppLockSettingsViewModel$updateSelectedAutomaticLockOption$1", f = "AppLockSettingsViewModel.kt", l = {46}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class n extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ o w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, int i, a71.c cVar) {
        super(2, cVar);
        this.w = oVar;
        this.x = i;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new n(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            y.j(obj);
            com.github.rudroid.settings.applock.usecases.j jVar = this.w.u;
            this.v = 1;
            if (jVar.a(this.x, this) == aVar) {
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
