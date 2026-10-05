package com.github.rudroid.searchandfilter;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public n(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        m mVar;
        int i;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i2 = mVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = mVar.u;
                b71.a aVar = b71.a.r;
                i = mVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    if (!((d0) obj).b.isEmpty()) {
                        mVar.v = 1;
                        if (this.r.c(obj, mVar) == aVar) {
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
        mVar = new m(this, cVar);
        Object obj22 = mVar.u;
        b71.a aVar2 = b71.a.r;
        i = mVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
