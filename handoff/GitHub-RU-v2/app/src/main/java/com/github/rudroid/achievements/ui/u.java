package com.github.rudroid.achievements.ui;

import androidx.compose.runtime.f1;

@c71.e(c = "com.github.rudroid.achievements.ui.UserAchievementBadgeKt$UserAchievementBadge$1$1$1$1", f = "UserAchievementBadge.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class u extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f4611v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f1 f4612w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(f1 f1Var, a71.c cVar) {
        super(2, cVar);
        this.f4612w = f1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        u uVar = new u(this.f4612w, cVar);
        uVar.f4611v = obj;
        return uVar;
    }

    public final Object s(Object obj, Object obj2) {
        u r10 = r((a71.c) obj2, (j) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        j jVar = (j) this.f4611v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        this.f4612w.setValue(jVar);
        return w61.a0.a;
    }
}
