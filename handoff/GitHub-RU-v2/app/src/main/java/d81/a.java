package d81;

import k71.k;
import v71.b0;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final /* synthetic */ class a extends k71.i implements j71.f {
    public static final a z = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    public final Object f(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        f fVar = (f) obj2;
        long j = bVar.a;
        a0 a0Var = a0.a;
        if (j <= 0) {
            ((e) fVar).v = a0Var;
            return a0Var;
        }
        Runnable fVar2 = new b9.f(3, fVar, bVar);
        k.e(fVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        e eVar = (e) fVar;
        a71.h hVar = eVar.r;
        eVar.t = b0.p(hVar).E0(j, fVar2, hVar);
        return a0Var;
    }
}
