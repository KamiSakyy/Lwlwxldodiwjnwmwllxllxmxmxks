package com.github.rudroid.uitoolkit.swipetodismiss;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j71.a aVar, j71.e eVar, c71.c cVar) {
        f fVar;
        int i;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i2 = fVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.v = i2 - Integer.MIN_VALUE;
                Object obj = fVar.u;
                b71.a aVar2 = b71.a.r;
                i = fVar.v;
                if (i != 0) {
                    sy.y.j(obj);
                    j jVar = new j(aVar, eVar, null);
                    fVar.v = 1;
                    if (v71.b0.k(jVar, fVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            }
        }
        fVar = new f(cVar);
        Object obj2 = fVar.u;
        b71.a aVar22 = b71.a.r;
        i = fVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
