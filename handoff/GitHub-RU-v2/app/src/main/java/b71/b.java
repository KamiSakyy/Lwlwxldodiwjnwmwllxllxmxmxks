package b71;

import c71.h;
import k71.k;
import k71.z;
import sy.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b extends h {
    public int s;
    public final /* synthetic */ j71.e t;
    public final /* synthetic */ a71.c u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a71.c cVar, a71.c cVar2, j71.e eVar) {
        super(cVar);
        this.t = eVar;
        this.u = cVar2;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        int i = this.s;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.s = 2;
            y.j(obj);
            return obj;
        }
        this.s = 1;
        y.j(obj);
        j71.e eVar = this.t;
        k.e(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        z.c(2, eVar);
        return eVar.s(this.u, this);
    }
}
