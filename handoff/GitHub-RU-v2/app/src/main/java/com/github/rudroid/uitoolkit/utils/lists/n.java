package com.github.rudroid.uitoolkit.utils.lists;

import y71.n1Shadow;

@c71.e(c = "com.github.rudroid.uitoolkit.utils.lists.LazyListStateExtensionsKt$ObservePaging$1$1", f = "LazyListStateExtensions.kt", l = {42}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class n extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ m0.s w;
    public final /* synthetic */ j71.a x;
    public final /* synthetic */ j71.a y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m0.s sVar, j71.a aVar, j71.a aVar2, a71.c cVar) {
        super(2, cVar);
        this.w = sVar;
        this.x = aVar;
        this.y = aVar2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new n(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            j jVar = new j(n1Shadow.p(new m(new g(new d(androidx.compose.runtime.t.J(new ah.f(this.w, 11)))), this.x)));
            a aVar2 = new a(this.y);
            this.v = 1;
            if (jVar.b(aVar2, this) == aVar) {
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
