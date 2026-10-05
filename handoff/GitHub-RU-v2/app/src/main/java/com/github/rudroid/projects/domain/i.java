package com.github.rudroid.projects.domain;

import com.github.rudroid.projects.domain.a;
import l01.s;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class i<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f17698r;

    public i(y71.j jVar) {
        this.f17698r = jVar;
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
            int i10 = hVar.f17696v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f17696v = i10 - Integer.MIN_VALUE;
                Object obj2 = hVar.f17695u;
                b71.a aVar = b71.a.r;
                i = hVar.f17696v;
                if (i != 0) {
                    y.j(obj2);
                    a.AbstractC0054a abstractC0054a = (a.AbstractC0054a) obj;
                    s sVar = abstractC0054a instanceof a.AbstractC0054a.C0055a ? ((a.AbstractC0054a.C0055a) abstractC0054a).f17683a : null;
                    if (sVar != null) {
                        hVar.f17696v = 1;
                        if (this.f17698r.c(sVar, hVar) == aVar) {
                            return aVar;
                        }
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
        hVar = new h(this, cVar);
        Object obj22 = hVar.f17695u;
        b71.a aVar2 = b71.a.r;
        i = hVar.f17696v;
        if (i != 0) {
        }
        return a0.a;
    }
}
