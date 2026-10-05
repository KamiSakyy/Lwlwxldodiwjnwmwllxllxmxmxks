package com.github.rudroid.common;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
final class m<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f9347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j71.c f9348s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y71.j f9349t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k71.s f9350u;

    public m(List list, j71.c cVar, y71.j jVar, k71.s sVar) {
        this.f9347r = list;
        this.f9348s = cVar;
        this.f9349t = jVar;
        this.f9350u = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        l lVar;
        int i;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.f9344w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f9344w = i10 - Integer.MIN_VALUE;
                Object obj2 = lVar.f9342u;
                b71.a aVar = b71.a.r;
                i = lVar.f9344w;
                w61.a0 a0Var = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj2);
                    this.f9347r.add(obj);
                    if (obj != null && ((Boolean) this.f9348s.k(obj)).booleanValue()) {
                        lVar.f9344w = 1;
                        if (this.f9349t.c(obj, lVar) == aVar) {
                            return aVar;
                        }
                    }
                    return a0Var;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj2);
                this.f9350u.r = true;
                return a0Var;
            }
        }
        lVar = new l(this, cVar);
        Object obj22 = lVar.f9342u;
        b71.a aVar2 = b71.a.r;
        i = lVar.f9344w;
        w61.a0 a0Var2 = w61.a0.a;
        if (i != 0) {
        }
        this.f9350u.r = true;
        return a0Var2;
    }
}
