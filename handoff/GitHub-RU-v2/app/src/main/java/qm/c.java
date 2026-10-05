package qm;

import c71.j;
import java.util.List;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends j implements j71.f {
    public final /* synthetic */ oa.j A;
    public int v;
    public /* synthetic */ Throwable w;
    public final /* synthetic */ ak.a x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ak.a aVar, boolean z, d dVar, oa.j jVar, a71.c cVar) {
        super(3, cVar);
        this.x = aVar;
        this.y = z;
        this.z = dVar;
        this.A = jVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        d dVar = this.z;
        oa.j jVar = this.A;
        c cVar = new c(this.x, this.y, dVar, jVar, (a71.c) obj3);
        cVar.w = (Throwable) obj2;
        cVar.v(a0.a);
        return b71.a.r;
    }

    public final Object v(Object obj) {
        Throwable th2 = this.w;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
            throw th2;
        }
        y.j(obj);
        List c = y9.a.c(this.x, this.y);
        g gVar = this.z.a;
        this.w = th2;
        this.v = 1;
        if (gVar.b(this.A, c, this) == aVar) {
            return aVar;
        }
        throw th2;
    }
}
