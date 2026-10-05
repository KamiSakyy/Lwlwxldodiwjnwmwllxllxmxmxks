package com.github.rudroid.settings.applock;

import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public final com.github.rudroid.settings.applock.usecases.a a;
    public final com.github.rudroid.settings.applock.usecases.m b;
    public final com.github.rudroid.settings.applock.usecases.g c;
    public final com.github.rudroid.lifecycle.a d;
    public final v71.z e;
    public final y1 f;
    public final i1 g;

    public k(com.github.rudroid.settings.applock.usecases.a aVar, com.github.rudroid.settings.applock.usecases.m mVar, com.github.rudroid.settings.applock.usecases.g gVar, com.github.rudroid.lifecycle.a aVar2, c cVar, v71.z zVar) {
        k71.k.g(aVar, "observeAppLockPreferencesUseCase");
        k71.k.g(mVar, "setLastActiveTimeMillisUseCase");
        k71.k.g(gVar, "setAppUnlockRequiredUseCase");
        k71.k.g(aVar2, "foregroundObserver");
        k71.k.g(zVar, "applicationScope");
        this.a = aVar;
        this.b = mVar;
        this.c = gVar;
        this.d = aVar2;
        this.e = zVar;
        y1 c = n1.c(Boolean.FALSE);
        this.f = c;
        this.g = new i1(c);
        v71.b0.z(zVar, (a71.h) null, (v71.a0) null, new h(this, null), 3);
    }







}
