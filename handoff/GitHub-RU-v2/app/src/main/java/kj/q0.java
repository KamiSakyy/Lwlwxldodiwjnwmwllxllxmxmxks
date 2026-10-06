package kj;

import com.github.service.models.response.type.SubscriptionState;
import z01.k1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 {
    public oa.g a;

    public q0(oa.g gVar) {
        k71.k.g(gVar, "subscribeServiceFactory");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, j71.c cVar, c71.c cVar2) {
        p0 p0Var;
        int i;
        if (cVar2 instanceof p0) {
            p0Var = (p0) cVar2;
            int i2 = p0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = p0Var.w;
                b71.a aVar = b71.a.r;
                i = p0Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    k1 k1Var = (k1) this.a.a(jVar);
                    SubscriptionState subscriptionState = SubscriptionState.UNSUBSCRIBED;
                    p0Var.u = jVar;
                    p0Var.v = cVar;
                    p0Var.y = 1;
                    obj = k1Var.c(str, subscriptionState, p0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = p0Var.v;
                    jVar = p0Var.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        p0Var = new p0(this, cVar2);
        Object obj2 = p0Var.w;
        b71.a aVar2 = b71.a.r;
        i = p0Var.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
