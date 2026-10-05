package com.github.rudroid.utilities;

@c71.e(c = "com.github.rudroid.utilities.FlowExtensionsKt$combine$$inlined$combine$1$3", f = "FlowExtensions.kt", l = {235, 234}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 extends c71.j implements j71.f {
    public int v;
    public /* synthetic */ y71.j w;
    public /* synthetic */ Object[] x;
    public y71.j y;

    public final Object f(Object obj, Object obj2, Object obj3) {
        q0 q0Var = new q0(3, (a71.c) obj3);
        q0Var.w = (y71.j) obj;
        q0Var.x = (Object[]) obj2;
        return q0Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i != 0) {
            if (i == 1) {
                y71.j jVar = this.y;
                sy.y.j(obj);
                this.w = null;
                this.x = null;
                this.y = null;
                this.v = 2;
                if (jVar.c(obj, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
            }
            return w61.a0.a;
        }
        sy.y.j(obj);
        y71.j jVar2 = this.w;
        Object[] objArr = this.x;
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        Object obj4 = objArr[2];
        Object obj5 = objArr[3];
        Object obj6 = objArr[4];
        Object obj7 = objArr[5];
        this.w = null;
        this.x = null;
        this.y = jVar2;
        this.v = 1;
        throw null;
    }
}
