package com.github.rudroid.searchandfilter.newflags;

import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import java.util.List;
import sy.d0Shadow;
import sy.y;
import w61.a0;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public g(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        f fVar;
        int i;
        List list;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i2 = fVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = fVar.u;
                b71.a aVar = b71.a.r;
                i = fVar.v;
                if (i != 0) {
                    y.j(obj2);
                    if (!((Boolean) obj).booleanValue()) {
                        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
                        ei.c cVar2 = ei.c.P;
                        runtimeFeatureFlag.getClass();
                        if (RuntimeFeatureFlag.a(cVar2)) {
                            list = d0Shadow.n(bm.l.d0);
                            fVar.v = 1;
                            if (this.rShadow.c(list, fVar) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    list = rShadow.r;
                    fVar.v = 1;
                    if (this.rShadow.c(list, fVar) == aVar) {
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
        fVar = new f(this, cVar);
        Object obj22 = fVar.u;
        b71.a aVar2 = b71.a.r;
        i = fVar.v;
        if (i != 0) {
        }
        return a0.a;
    }
}
