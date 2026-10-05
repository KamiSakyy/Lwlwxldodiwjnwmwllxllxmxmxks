package com.github.rudroid.utilities.ui;

@c71.e(c = "com.github.rudroid.utilities.ui.StateLazyListKt$ScreenWrapper$3$1", f = "StateLazyList.kt", l = {214}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class m1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ m0.s w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(m0.s sVar, a71.c cVar) {
        super(2, cVar);
        this.w = sVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new m1(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            m0.s sVar = this.w;
            int i2 = sVar.h().n - 1;
            this.v = 1;
            if (m0.s.f(sVar, i2, this) == aVar) {
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
