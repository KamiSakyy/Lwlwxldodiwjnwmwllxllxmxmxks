package com.github.rudroid.copilot.inapppurchase;

import com.android.billingclient.api.Purchase;
import com.github.rudroid.copilot.inapppurchase.billingclient.j;
import kotlin.NoWhenBranchMatchedException;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class r<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f9739r;

    public r(b bVar) {
        this.f9739r = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.github.rudroid.copilot.inapppurchase.billingclient.j jVar, a71.c cVar) {
        q qVar;
        int i;
        Object value;
        i0 i0Var;
        b bVar = this.f9739r;
        com.github.rudroid.copilot.inapppurchase.billingclient.g gVar = bVar.f9637u;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f9738w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f9738w = i10 - Integer.MIN_VALUE;
                Object obj = qVar.f9736u;
                b71.a aVar = b71.a.r;
                i = qVar.f9738w;
                j.b bVar2 = j.b.f9668a;
                if (i != 0) {
                    sy.y.j(obj);
                    if (k71.k.b(jVar, j.a.f9667a)) {
                        y1 y1Var = bVar.F;
                        do {
                            value = y1Var.getValue();
                            i0Var = i0.f9698r;
                            ((l0) value).getClass();
                        } while (!y1Var.i(value, new l0(null, null, i0Var)));
                        y1 y1Var2 = gVar.f9664a;
                        y1Var2.getClass();
                        y1Var2.k((Object) null, bVar2);
                    } else if (jVar instanceof j.c) {
                        Purchase purchase = (Purchase) x61.m.W(((j.c) jVar).f9669a);
                        if (purchase != null) {
                            qVar.f9738w = 1;
                            if (b.P(bVar, purchase, qVar) == aVar) {
                                return aVar;
                            }
                        }
                    } else if (!k71.k.b(jVar, bVar2) && !k71.k.b(jVar, j.d.f9670a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return w61.a0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                y1 y1Var3 = gVar.f9664a;
                y1Var3.getClass();
                y1Var3.k((Object) null, bVar2);
                return w61.a0.a;
            }
        }
        qVar = new q(this, cVar);
        Object obj2 = qVar.f9736u;
        b71.a aVar2 = b71.a.r;
        i = qVar.f9738w;
        j.b bVar22 = j.b.f9668a;
        if (i != 0) {
        }
        y1 y1Var32 = gVar.f9664a;
        y1Var32.getClass();
        y1Var32.k((Object) null, bVar22);
        return w61.a0.a;
    }

}
