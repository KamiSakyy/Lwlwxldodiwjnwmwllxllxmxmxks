package com.github.rudroid.projects.domain;

import com.github.rudroid.projects.domain.a;
import l01.s;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class c<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f17688r;

    public c(y71.j jVar) {
        this.f17688r = jVar;
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
            int i10 = bVar.f17686v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f17686v = i10 - Integer.MIN_VALUE;
                Object obj2 = bVar.f17685u;
                b71.a aVar = b71.a.r;
                i = bVar.f17686v;
                if (i != 0) {
                    y.j(obj2);
                    a.AbstractC0054a.C0055a c0055a = new a.AbstractC0054a.C0055a((s) obj);
                    bVar.f17686v = 1;
                    if (this.f17688r.c(c0055a, bVar) == aVar) {
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
        Object obj22 = bVar.f17685u;
        b71.a aVar2 = b71.a.r;
        i = bVar.f17686v;
        if (i != 0) {
        }
        return a0.a;
    }
}
