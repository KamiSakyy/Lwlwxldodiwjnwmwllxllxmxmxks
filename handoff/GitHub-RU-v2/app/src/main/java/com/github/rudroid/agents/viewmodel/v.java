package com.github.rudroid.agents.viewmodel;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.common.logging.LogTag;
import java.util.LinkedHashSet;
import v71.q1;
import y71.n1;
import y71.y1;

@LogTag(tag = "ObserveAgentTaskCreationViewModel")
/* loaded from: /home/user/work/p/classes.dex */
public final class v extends k1 {
    public static final a Companion = new a();

    /* renamed from: s, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f8402s;

    /* renamed from: t, reason: collision with root package name */
    public vi.a f8403t;

    /* renamed from: u, reason: collision with root package name */
    public ui.e f8404u;

    /* renamed from: v, reason: collision with root package name */
    public q1 f8405v;

    /* renamed from: w, reason: collision with root package name */
    public LinkedHashSet f8406w;

    /* renamed from: x, reason: collision with root package name */
    public y1 f8407x;

    /* renamed from: y, reason: collision with root package name */
    public y00.l f8408y;

    public static final class a {
    }

    public v(com.github.rudroid.activities.util.c cVar, vi.a aVar, ui.e eVar) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(aVar, "observeCreationUseCase");
        k71.k.g(eVar, "fetchUserAgentSessionUseCase");
        this.f8402s = cVar;
        this.f8403t = aVar;
        this.f8404u = eVar;
        this.f8406w = new LinkedHashSet();
        y1 c10 = n1.c((Object) null);
        this.f8407x = c10;
        this.f8408y = new y00.l(c10, 10);
    }

    public final void P(String str) {
        this.f8406w.add(str);
        q1 q1Var = this.f8405v;
        if (q1Var == null || !q1Var.f()) {
            this.f8405v = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new z(this, null), 3);
        }
    }
}
