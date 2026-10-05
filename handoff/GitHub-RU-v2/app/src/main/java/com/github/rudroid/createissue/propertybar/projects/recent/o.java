package com.github.rudroid.createissue.propertybar.projects.recent;

import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class o<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f10491r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f10492s;

    public o(y71.j jVar, g gVar) {
        this.f10491r = jVar;
        this.f10492s = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        n nVar;
        int i;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i10 = nVar.f10489v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f10489v = i10 - Integer.MIN_VALUE;
                Object obj2 = nVar.f10488u;
                b71.a aVar = b71.a.r;
                i = nVar.f10489v;
                if (i != 0) {
                    y.j(obj2);
                    fl.f A = i21.a.A((fl.f) obj, new l(this.f10492s));
                    nVar.f10489v = 1;
                    if (this.f10491r.c(A, nVar) == aVar) {
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
        nVar = new n(this, cVar);
        Object obj22 = nVar.f10488u;
        b71.a aVar2 = b71.a.r;
        i = nVar.f10489v;
        if (i != 0) {
        }
        return a0.a;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class g<T1,T2,T3,T4> {
        public g() {
        }
    }
}
