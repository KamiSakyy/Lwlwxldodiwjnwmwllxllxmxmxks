package com.github.rudroid.copilot.inapppurchase.billingclient;

import com.github.rudroid.copilot.inapppurchase.billingclient.i;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class b<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9652r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c71.j f9653s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x9.b f9654t;

    public b(y71.j jVar, j71.e eVar, x9.b bVar) {
        this.f9652r = jVar;
        this.f9653s = (c71.j) eVar;
        this.f9654t = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (r2.c(r4, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        a aVar;
        int i;
        int i10;
        y71.j jVar;
        Object bVar;
        int i11;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i12 = aVar.f9648v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f9648v = i12 - Integer.MIN_VALUE;
                Object obj2 = aVar.f9647u;
                b71.a aVar2 = b71.a.r;
                i = aVar.f9648v;
                if (i != 0) {
                    y.j(obj2);
                    int intValue = ((Number) obj).intValue();
                    i10 = 0;
                    jVar = this.f9652r;
                    if (intValue == 0) {
                        aVar.f9650x = jVar;
                        aVar.f9651y = 0;
                        aVar.f9648v = 1;
                        Object s2 = this.f9653s.s(this.f9654t, aVar);
                        if (s2 != aVar2) {
                            obj2 = s2;
                            i11 = 0;
                        }
                        return aVar2;
                    }
                    bVar = new i.b();
                    aVar.f9650x = null;
                    aVar.f9651y = i10;
                    aVar.f9648v = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj2);
                        return a0.a;
                    }
                    i11 = aVar.f9651y;
                    jVar = aVar.f9650x;
                    y.j(obj2);
                }
                bVar = new i.a(obj2);
                i10 = i11;
                aVar.f9650x = null;
                aVar.f9651y = i10;
                aVar.f9648v = 2;
            }
        }
        aVar = new a(this, cVar);
        Object obj22 = aVar.f9647u;
        b71.a aVar22 = b71.a.r;
        i = aVar.f9648v;
        if (i != 0) {
        }
        bVar = new i.a(obj22);
        i10 = i11;
        aVar.f9650x = null;
        aVar.f9651y = i10;
        aVar.f9648v = 2;
    }
}
