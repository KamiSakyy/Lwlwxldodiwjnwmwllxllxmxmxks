package com.github.rudroid.projects.domain;

import com.github.rudroid.projects.domain.a;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class f<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f17693r;

    public f(y71.j jVar) {
        this.f17693r = jVar;
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
            int i10 = eVar.f17691v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f17691v = i10 - Integer.MIN_VALUE;
                Object obj2 = eVar.f17690u;
                b71.a aVar = b71.a.r;
                i = eVar.f17691v;
                if (i != 0) {
                    y.j(obj2);
                    eVar.f17691v = 1;
                    if (this.f17693r.c(a.AbstractC0054a.b.f17684a, eVar) == aVar) {
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
        eVar = new e(this, cVar);
        Object obj22 = eVar.f17690u;
        b71.a aVar2 = b71.a.r;
        i = eVar.f17691v;
        if (i != 0) {
        }
        return a0.a;
    }
}
