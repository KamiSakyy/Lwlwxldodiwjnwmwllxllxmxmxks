package com.github.rudroid.achievements;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.viewmodel.d;
import java.util.concurrent.CancellationException;
import v71.a0Shadow;
import v71.b0;
import v71.q1;
import y71.i1;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class k extends k1 implements com.github.rudroid.utilities.viewmodel.d {
    public static final a Companion = new a();
    public y1 A;
    public i1 B;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d.a f4448s;

    /* renamed from: t, reason: collision with root package name */
    public ki.b f4449t;

    /* renamed from: u, reason: collision with root package name */
    public ki.c f4450u;

    /* renamed from: v, reason: collision with root package name */
    public ki.a f4451v;

    /* renamed from: w, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f4452w;

    /* renamed from: x, reason: collision with root package name */
    public q1 f4453x;

    /* renamed from: y, reason: collision with root package name */
    public q1 f4454y;

    /* renamed from: z, reason: collision with root package name */
    public String f4455z;

    public static final class a {
    }

    public k(ki.b bVar, ki.c cVar, ki.a aVar, com.github.rudroid.activities.util.c cVar2, a1 a1Var) {
        k71.k.g(bVar, "observeUserAchievementsUseCase");
        k71.k.g(cVar, "refreshUserAchievementsUseCase");
        k71.k.g(aVar, "loadUserAchievementsPageUseCase");
        k71.k.g(cVar2, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.f4448s = new d.a();
        this.f4449t = bVar;
        this.f4450u = cVar;
        this.f4451v = aVar;
        this.f4452w = cVar2;
        this.f4455z = (String) h2.a(a1Var, "login");
        y1 c10 = n1Shadow.c(g1.a.c(g1.Companion));
        this.A = c10;
        this.B = new i1(c10);
        P();
    }

    public final void P() {
        q1 q1Var = this.f4453x;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        q1 q1Var2 = this.f4454y;
        if (q1Var2 != null) {
            q1Var2.m((CancellationException) null);
        }
        this.f4453x = b0.z(d1.k(this), (a71.h) null, (a0Shadow) null, new q(this, null), 3);
    }
}
