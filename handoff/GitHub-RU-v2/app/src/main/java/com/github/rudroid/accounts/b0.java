package com.github.rudroid.accounts;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import kotlin.KotlinNothingValueException;
import y71.n1;
import y71.q1;
import y71.w1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0 extends k1 {
    public static final a Companion = new a();

    /* renamed from: s, reason: collision with root package name */
    public final oa.m f4342s;

    /* renamed from: t, reason: collision with root package name */
    public final m0 f4343t;

    /* renamed from: u, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f4344u;

    /* renamed from: v, reason: collision with root package name */
    public final kj.w f4345v;

    /* renamed from: w, reason: collision with root package name */
    public final y1 f4346w;

    /* renamed from: x, reason: collision with root package name */
    public final y1 f4347x;

    /* renamed from: y, reason: collision with root package name */
    public final y1 f4348y;

    public static final class a {
    }

    public b0(oa.m mVar, m0 m0Var, com.github.rudroid.activities.util.c cVar, kj.w wVar, a1 a1Var) {
        k71.k.g(mVar, "userManager");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(wVar, "fetchUsersUnreadNotificationNumberUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        this.f4342s = mVar;
        this.f4343t = m0Var;
        this.f4344u = cVar;
        this.f4345v = wVar;
        this.f4346w = n1.c(Boolean.FALSE);
        x61.r rVar = x61.r.r;
        this.f4347x = n1.c(rVar);
        this.f4348y = n1.c(rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void P(b0 b0Var, c71.c cVar) {
        c0 c0Var;
        int i;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i10 = c0Var.f4352w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0Var.f4352w = i10 - Integer.MIN_VALUE;
                Object obj = c0Var.f4350u;
                b71.a aVar = b71.a.r;
                i = c0Var.f4352w;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    throw new KotlinNothingValueException();
                }
                sy.y.j(obj);
                y1 y1Var = b0Var.f4347x;
                e0 e0Var = new e0(b0Var);
                c0Var.f4352w = 1;
                y1Var.b(e0Var, c0Var);
                return;
            }
        }
        c0Var = new c0(b0Var, cVar);
        Object obj2 = c0Var.f4350u;
        b71.a aVar2 = b71.a.r;
        i = c0Var.f4352w;
        if (i == 0) {
        }
    }

    public final w1 Q() {
        return n1.G(n1.m(this.f4344u.f5919b, this.f4346w, this.f4347x, this.f4348y, new g0(this, null)), d1.k(this), q1.a, new b(x61.r.r, false));
    }
}
