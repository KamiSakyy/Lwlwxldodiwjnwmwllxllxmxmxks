package com.github.rudroid.common.flow;

import sy.y;
import w61.a0;
import y71.j;

/* loaded from: /home/user/work/p/classes.dex */
public class b<T> implements j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f9304r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j71.c f9305s;

    public b(j jVar, j71.c cVar) {
        this.f9304r = jVar;
        this.f9305s = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        a aVar;
        int i;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f9302v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f9302v = i10 - Integer.MIN_VALUE;
                Object obj2 = aVar.f9301u;
                b71.a aVar2 = b71.a.r;
                i = aVar.f9302v;
                if (i != 0) {
                    y.j(obj2);
                    if (!((Boolean) this.f9305s.k(obj)).booleanValue()) {
                        throw new g(obj);
                    }
                    aVar.f9302v = 1;
                    if (this.f9304r.c(obj, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        aVar = new a(this, cVar);
        Object obj22 = aVar.f9301u;
        b71.a aVar22 = b71.a.r;
        i = aVar.f9302v;
        if (i != 0) {
        }
        return a0.a;
    }
}
