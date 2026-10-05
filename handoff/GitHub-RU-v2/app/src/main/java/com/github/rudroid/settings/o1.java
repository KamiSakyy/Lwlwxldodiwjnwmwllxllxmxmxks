package com.github.rudroid.settings;

@c71.e(c = "com.github.rudroid.settings.SettingsNotificationViewModel$observePushNotificationSettings$1", f = "SettingsNotificationViewModel.kt", l = {105}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class o1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ i1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(i1 i1Var, a71.c cVar) {
        super(2, cVar);
        this.w = i1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new o1(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            i1 i1Var = this.w;
            y71.i A = i1Var.t.A(i1Var.B.d());
            n1 n1Var = new n1(i1Var);
            this.v = 1;
            if (A.b(n1Var, this) == aVar) {
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
