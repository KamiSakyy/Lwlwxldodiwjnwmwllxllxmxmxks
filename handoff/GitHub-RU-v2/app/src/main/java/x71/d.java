package x71;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import v71.a2;

/* loaded from: /home/user/work/p/classes5.dex */
public final /* synthetic */ class d extends k71.i implements j71.f {
    public static final d z = new d(3, h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return w61.a0.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2, Object obj3) {
        p pVar;
        h hVar = (h) obj;
        d81.f fVar = (d81.f) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.s;
        hVar.getClass();
        p pVar2 = (p) h.x.get(hVar);
        while (true) {
            if (hVar.y()) {
                ((d81.e) fVar).v = j.l;
                break;
            }
            long andIncrement = h.t.getAndIncrement(hVar);
            long j = j.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (pVar2.t != j2) {
                p r = hVar.r(j2, pVar2);
                if (r == null) {
                    continue;
                } else {
                    pVar = r;
                }
            } else {
                pVar = pVar2;
            }
            Object J = hVar.J(pVar, i, andIncrement, fVar);
            p pVar3 = pVar;
            if (J == j.m) {
                a2 a2Var = fVar instanceof a2 ? (a2) fVar : null;
                if (a2Var != null) {
                    a2Var.a(pVar3, i);
                }
            } else if (J == j.o) {
                if (andIncrement < hVar.v()) {
                    pVar3.a();
                }
                pVar2 = pVar3;
            } else {
                if (J == j.n) {
                    throw new IllegalStateException("unexpected");
                }
                pVar3.a();
                ((d81.e) fVar).v = J;
            }
        }
    }
}
