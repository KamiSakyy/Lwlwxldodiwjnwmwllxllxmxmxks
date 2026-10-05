package com.github.rudroid.copilot.inapppurchase.usecases;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class j<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9775r;

    public j(y71.j jVar) {
        this.f9775r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        i iVar;
        int i;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f9772v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f9772v = i10 - Integer.MIN_VALUE;
                Object obj2 = iVar.f9771u;
                b71.a aVar = b71.a.r;
                i = iVar.f9772v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List list = ((x9.m) obj).f34024b;
                    if (list != null) {
                        iVar.f9772v = 1;
                        if (this.f9775r.c(list, iVar) == aVar) {
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
        iVar = new i(this, cVar);
        Object obj22 = iVar.f9771u;
        b71.a aVar2 = b71.a.r;
        i = iVar.f9772v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
