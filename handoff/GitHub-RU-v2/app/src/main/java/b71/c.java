package b71;

import a71.h;
import k71.k;
import k71.z;
import sy.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends c71.c {
    public int u;
    public final /* synthetic */ j71.e v;
    public final /* synthetic */ a71.c w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a71.c cVar, h hVar, j71.e eVar, a71.c cVar2) {
        super(cVar, hVar);
        this.v = eVar;
        this.w = cVar2;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.u = 2;
            y.j(obj);
            return obj;
        }
        this.u = 1;
        y.j(obj);
        j71.e eVar = this.v;
        k.e(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        z.c(2, eVar);
        return eVar.s(this.w, this);
    }
}
