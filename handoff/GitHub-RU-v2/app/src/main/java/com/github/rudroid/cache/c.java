package com.github.rudroid.cache;

import java.io.File;
import sy.y;
import w61.a0;
import y71.j;

/* loaded from: /home/user/work/p/classes.dex */
public final class c<T> implements j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f8736r;

    public c(j jVar) {
        this.f8736r = jVar;
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
            int i10 = bVar.f8734v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f8734v = i10 - Integer.MIN_VALUE;
                Object obj2 = bVar.f8733u;
                b71.a aVar = b71.a.r;
                i = bVar.f8734v;
                if (i != 0) {
                    y.j(obj2);
                    File file = new File((File) obj, "logs");
                    bVar.f8734v = 1;
                    if (this.f8736r.c(file, bVar) == aVar) {
                        return aVar;
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
        bVar = new b(this, cVar);
        Object obj22 = bVar.f8733u;
        b71.a aVar2 = b71.a.r;
        i = bVar.f8734v;
        if (i != 0) {
        }
        return a0.a;
    }
}
