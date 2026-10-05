package com.github.rudroid.uitoolkit.utils.lists;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public f(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        e eVar;
        int i;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i2 = eVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = eVar.u;
                b71.a aVar = b71.a.r;
                i = eVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    w61.k kVar = (w61.k) obj;
                    if (((Number) kVar.r).intValue() + 5 > ((Number) kVar.s).intValue()) {
                        eVar.v = 1;
                        if (this.r.c(obj, eVar) == aVar) {
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
        eVar = new e(this, cVar);
        Object obj22 = eVar.u;
        b71.a aVar2 = b71.a.r;
        i = eVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
