package com.github.rudroid.settings;

@c71.e(c = "com.github.rudroid.settings.SettingsNotificationViewModel$onCleared$1", f = "SettingsNotificationViewModel.kt", l = {200, 200}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p1 extends c71.j implements j71.e {
    public com.github.rudroid.fragments.onboarding.notifications.usecase.s v;
    public int w;
    public final /* synthetic */ i1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(i1 i1Var, a71.c cVar) {
        super(2, cVar);
        this.x = i1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new p1(this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r1.a((oa.j) r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r5 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        com.github.rudroid.fragments.onboarding.notifications.usecase.s sVar;
        b71.a aVar = b71.a.r;
        int i = this.w;
        if (i == 0) {
            sy.y.j(obj);
            i1 i1Var = this.x;
            sVar = i1Var.A;
            com.github.rudroid.activities.util.c cVar = i1Var.B;
            this.v = sVar;
            this.w = 1;
            cVar.getClass();
            obj = com.github.rudroid.activities.util.a.c(cVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sVar = this.v;
            sy.y.j(obj);
        }
        this.v = null;
        this.w = 2;
    }
}
