package com.github.rudroid.uitoolkit.utils.lists;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public c(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        b bVar;
        int i;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.u;
                b71.a aVar = b71.a.r;
                i = bVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    if (((Number) ((w61.k) obj).s).intValue() > 0) {
                        bVar.v = 1;
                        if (this.r.c(obj, bVar) == aVar) {
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
        bVar = new b(this, cVar);
        Object obj22 = bVar.u;
        b71.a aVar2 = b71.a.r;
        i = bVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
