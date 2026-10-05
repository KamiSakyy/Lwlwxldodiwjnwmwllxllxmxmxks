package com.github.rudroid.copilot.inapppurchase.usecases;

import com.github.rudroid.copilot.inapppurchase.billingclient.i;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class g<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9766r;

    public g(y71.j jVar) {
        this.f9766r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        f fVar;
        int i;
        x9.m mVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f9762v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f9762v = i10 - Integer.MIN_VALUE;
                Object obj2 = fVar.f9761u;
                b71.a aVar = b71.a.r;
                i = fVar.f9762v;
                if (i != 0) {
                    sy.y.j(obj2);
                    com.github.rudroid.copilot.inapppurchase.billingclient.i iVar = (com.github.rudroid.copilot.inapppurchase.billingclient.i) obj;
                    if (iVar instanceof i.a) {
                        mVar = (x9.m) ((i.a) iVar).f9666a;
                    } else {
                        if (!(iVar instanceof i.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mVar = null;
                    }
                    if (mVar != null) {
                        fVar.f9762v = 1;
                        if (this.f9766r.c(mVar, fVar) == aVar) {
                            return aVar;
                        }
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
        fVar = new f(this, cVar);
        Object obj22 = fVar.f9761u;
        b71.a aVar2 = b71.a.r;
        i = fVar.f9762v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
