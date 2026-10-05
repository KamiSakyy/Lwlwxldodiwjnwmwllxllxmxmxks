package com.github.rudroid.uitoolkit.utils.lists;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public i(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        h hVar;
        int i;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i2 = hVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = hVar.u;
                b71.a aVar = b71.a.r;
                i = hVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    if (((Boolean) obj).booleanValue()) {
                        hVar.v = 1;
                        if (this.r.c(obj, hVar) == aVar) {
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
        hVar = new h(this, cVar);
        Object obj22 = hVar.u;
        b71.a aVar2 = b71.a.r;
        i = hVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
