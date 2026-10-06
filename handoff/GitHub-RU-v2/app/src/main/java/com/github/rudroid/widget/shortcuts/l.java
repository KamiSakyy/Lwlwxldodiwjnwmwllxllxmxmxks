package com.github.rudroid.widget.shortcuts;

import com.github.domain.shortcuts.model.StoredShortcutModel;
import rm0.r3Shadow;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l<T> implements y71.j {
    public final /* synthetic */ y71.j r;
    public final /* synthetic */ g s;

    public l(y71.j jVar, g gVar) {
        this.r = jVar;
        this.s = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r7.c(r10, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        k kVar;
        int i;
        float floatValue;
        int i2;
        y71.j jVar;
        r rVar;
        oa.j jVar2;
        int i3;
        y71.j jVar3;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i4 = kVar.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kVar.v = i4 - Integer.MIN_VALUE;
                Object obj2 = kVar.u;
                b71.a aVar = b71.a.r;
                i = kVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    w61.q qVar = (w61.q) obj;
                    oa.j jVar4 = (oa.j) qVar.r;
                    String str = (String) qVar.s;
                    floatValue = ((Number) qVar.t).floatValue();
                    i2 = 0;
                    jVar = this.r;
                    if (jVar4 != null && str != null) {
                        r3Shadow b = this.s.b.b(jVar4, str);
                        kVar.x = jVar;
                        kVar.y = jVar4;
                        kVar.z = 0;
                        kVar.A = floatValue;
                        kVar.v = 1;
                        Object v = n1.v(b, kVar);
                        if (v != aVar) {
                            jVar2 = jVar4;
                            obj2 = v;
                            i3 = 0;
                            jVar3 = jVar;
                        }
                        return aVar;
                    }
                    rVar = null;
                    kVar.x = null;
                    kVar.y = null;
                    kVar.z = i2;
                    kVar.v = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj2);
                        return w61.a0.a;
                    }
                    floatValue = kVar.A;
                    i3 = kVar.z;
                    jVar2 = kVar.y;
                    jVar3 = kVar.x;
                    sy.y.j(obj2);
                }
                rVar = new r(jVar2, (StoredShortcutModel) obj2, floatValue);
                jVar = jVar3;
                i2 = i3;
                kVar.x = null;
                kVar.y = null;
                kVar.z = i2;
                kVar.v = 2;
            }
        }
        kVar = new k(this, cVar);
        Object obj22 = kVar.u;
        b71.a aVar2 = b71.a.r;
        i = kVar.v;
        if (i != 0) {
        }
        rVar = new r(jVar2, (StoredShortcutModel) obj22, floatValue);
        jVar = jVar3;
        i2 = i3;
        kVar.x = null;
        kVar.y = null;
        kVar.z = i2;
        kVar.v = 2;
    }
}
