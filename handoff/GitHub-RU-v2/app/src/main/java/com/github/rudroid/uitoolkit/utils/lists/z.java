package com.github.rudroid.uitoolkit.utils.lists;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public z(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        y yVar;
        int i;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i2 = yVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = yVar.u;
                b71.a aVar = b71.a.r;
                i = yVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    w61.k kVar = (w61.k) obj;
                    if (((Number) kVar.r).intValue() + 5 > ((Number) kVar.s).intValue()) {
                        yVar.v = 1;
                        if (this.r.c(obj, yVar) == aVar) {
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
        yVar = new y(this, cVar);
        Object obj22 = yVar.u;
        b71.a aVar2 = b71.a.r;
        i = yVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
