package com.github.rudroid.agents.viewmodel;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.common.logging.LogTag;
import y71.n1Shadow;
import y71.y1;

@LogTag(tag = "ObserveAgentTasksAliveViewModel")
/* loaded from: /home/user/work/p/classes.dex */
public final class j0 extends k1 {
    public static final a Companion = new a();

    /* renamed from: s, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f8371s;

    /* renamed from: t, reason: collision with root package name */
    public vi.a f8372t;

    /* renamed from: u, reason: collision with root package name */
    public vi.c f8373u;

    /* renamed from: v, reason: collision with root package name */
    public ui.e f8374v;

    /* renamed from: w, reason: collision with root package name */
    public y1 f8375w;

    public static final class a {
    }

    public j0(com.github.rudroid.activities.util.c cVar, vi.a aVar, vi.c cVar2, ui.e eVar) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(aVar, "createUseCase");
        k71.k.g(cVar2, "updateUseCase");
        k71.k.g(eVar, "fetchUserAgentSessionUseCase");
        this.f8371s = cVar;
        this.f8372t = aVar;
        this.f8373u = cVar2;
        this.f8374v = eVar;
        this.f8375w = n1Shadow.c((Object) null);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new g0(this, null), 3);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new i0(this, null), 3);
    }
}
