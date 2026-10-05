package com.github.rudroid.activities.util;

import y71.n1;

/* loaded from: /home/user/work/p/classes.dex */
public interface a {

    /* renamed from: com.github.rudroid.activities.util.a$a, reason: collision with other inner class name */
    public static final class C0006a {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object c(a aVar, a71.c cVar) {
        b bVar;
        int i;
        oa.j jVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f5917w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f5917w = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f5915u;
                b71.a aVar2 = b71.a.r;
                i = bVar.f5917w;
                if (i != 0) {
                    sy.y.j(obj);
                    y00.l b10 = aVar.b();
                    bVar.f5917w = 1;
                    obj = n1.v(b10, bVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                jVar = (oa.j) obj;
                if (jVar == null) {
                    return jVar;
                }
                throw new IllegalStateException("activity user was not set");
            }
        }
        bVar = new b(aVar, cVar);
        Object obj2 = bVar.f5915u;
        b71.a aVar22 = b71.a.r;
        i = bVar.f5917w;
        if (i != 0) {
        }
        jVar = (oa.j) obj2;
        if (jVar == null) {
        }
    }

    default Object a(c71.j jVar) {
        return c(this, jVar);
    }

    y00.l b();

    oa.j d();
}
