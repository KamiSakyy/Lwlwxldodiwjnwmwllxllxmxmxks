package com.github.rudroid.achievements.ui;

import androidx.compose.runtime.f1;

@c71.e(c = "com.github.rudroid.achievements.ui.UserAchievementBadgeKt$UserAchievementBadge$1$1$1", f = "UserAchievementBadge.kt", l = {66}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class v extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f4613v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f4614w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f1 f4615x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(l lVar, f1 f1Var, a71.c cVar) {
        super(2, cVar);
        this.f4614w = lVar;
        this.f4615x = f1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new v(this.f4614w, this.f4615x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.f4613v;
        w61.a0 a0Var = w61.a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return a0Var;
        }
        sy.y.j(obj);
        y71.d dVar = new y71.d(this.f4614w.f4535d);
        u uVar = new u(this.f4615x, null);
        this.f4613v = 1;
        Object b10 = dVar.b(new y71.k0(z71.t.r, uVar, 2), this);
        if (b10 != aVar) {
            b10 = a0Var;
        }
        if (b10 != aVar) {
            b10 = a0Var;
        }
        return b10 == aVar ? aVar : a0Var;
    }
}
