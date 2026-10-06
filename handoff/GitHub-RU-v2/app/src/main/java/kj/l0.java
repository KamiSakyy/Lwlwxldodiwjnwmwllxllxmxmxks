package kj;

import com.github.service.models.response.type.SubscriptionState;
import z01.k1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 {
    public final oa.g a;

    public l0(oa.g gVar) {
        k71.k.g(gVar, "subscribeServiceFactory");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, j71.c cVar, c71.c cVar2) {
        k0 k0Var;
        int i;
        if (cVar2 instanceof k0) {
            k0Var = (k0) cVar2;
            int i2 = k0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = k0Var.w;
                b71.a aVar = b71.a.r;
                i = k0Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    k1 k1Var = (k1) this.a.a(jVar);
                    SubscriptionState subscriptionState = SubscriptionState.SUBSCRIBED;
                    k0Var.u = jVar;
                    k0Var.v = cVar;
                    k0Var.y = 1;
                    obj = k1Var.c(str, subscriptionState, k0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = k0Var.v;
                    jVar = k0Var.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        k0Var = new k0(this, cVar2);
        Object obj2 = k0Var.w;
        b71.a aVar2 = b71.a.r;
        i = k0Var.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
