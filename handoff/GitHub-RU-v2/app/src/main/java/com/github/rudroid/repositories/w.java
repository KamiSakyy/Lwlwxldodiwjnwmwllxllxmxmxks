package com.github.rudroid.repositories;

import com.github.rudroid.repositories.o.b;

/* loaded from: /home/user/work/p/classes.dex */
public final class w<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f19160r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f19161s;

    public w(y71.j jVar, o oVar) {
        this.f19160r = jVar;
        this.f19161s = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        v vVar;
        int i;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i10 = vVar.f19158v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f19158v = i10 - Integer.MIN_VALUE;
                Object obj2 = vVar.f19157u;
                b71.a aVar = b71.a.r;
                i = vVar.f19158v;
                if (i != 0) {
                    sy.y.j(obj2);
                    fl.f A = i21.a.A((fl.f) obj, this.f19161s.new b());
                    vVar.f19158v = 1;
                    if (this.f19160r.c(A, vVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        vVar = new v(this, cVar);
        Object obj22 = vVar.f19157u;
        b71.a aVar2 = b71.a.r;
        i = vVar.f19158v;
        if (i != 0) {
        }
        return w61.a0.a;
    }







}
