package com.github.rudroid.copilot.inapppurchase.usecases;

import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class p<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9794r;

    public p(y71.j jVar) {
        this.f9794r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        o oVar;
        int i;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.f9791v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f9791v = i10 - Integer.MIN_VALUE;
                Object obj2 = oVar.f9790u;
                b71.a aVar = b71.a.r;
                i = oVar.f9791v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (T t10 : (List) obj) {
                        if (((Purchase) t10).f4265c.optInt("purchaseState", 1) != 4) {
                            arrayList.add(t10);
                        }
                    }
                    oVar.f9791v = 1;
                    if (this.f9794r.c(arrayList, oVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        oVar = new o(this, cVar);
        Object obj22 = oVar.f9790u;
        b71.a aVar2 = b71.a.r;
        i = oVar.f9791v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
