package com.apollographql.apollo.internal;

import sy.y;
import w61.a0;
import y71.j;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c00.b f4296r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f4297s;

    public c(c00.b bVar, j jVar) {
        this.f4296r = bVar;
        this.f4297s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        b bVar;
        Object obj2;
        int i;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f4294v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f4294v = i10 - Integer.MIN_VALUE;
                obj2 = bVar.f4293u;
                b71.a aVar = b71.a.r;
                i = bVar.f4294v;
                if (i != 0) {
                    y.j(obj2);
                    bVar.f4294v = 1;
                    obj2 = this.f4296r.f(this.f4297s, obj, bVar);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    throw new AbortFlowException(this);
                }
                return a0.a;
            }
        }
        bVar = new b(this, cVar);
        obj2 = bVar.f4293u;
        b71.a aVar2 = b71.a.r;
        i = bVar.f4294v;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
