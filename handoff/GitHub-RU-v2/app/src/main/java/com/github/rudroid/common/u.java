package com.github.rudroid.common;

@c71.e(c = "com.github.rudroid.common.FlowExtensionsKt$safeFlowOn$2", f = "FlowExtensions.kt", l = {22}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class u extends c71.j implements j71.f {

    /* renamed from: v, reason: collision with root package name */
    public int f9376v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ y71.j f9377w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Throwable f9378x;

    public final Object f(Object obj, Object obj2, Object obj3) {
        u uVar = new u(3, (a71.c) obj3);
        uVar.f9377w = (y71.j) obj;
        uVar.f9378x = (Throwable) obj2;
        return uVar.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        y71.j jVar = this.f9377w;
        Throwable th = this.f9378x;
        b71.a aVar = b71.a.r;
        int i = this.f9376v;
        if (i == 0) {
            sy.y.j(obj);
            j jVar2 = new j(th);
            this.f9377w = null;
            this.f9378x = null;
            this.f9376v = 1;
            if (jVar.c(jVar2, this) == aVar) {
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
