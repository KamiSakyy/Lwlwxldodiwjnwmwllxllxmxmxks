package com.github.rudroid.discussions;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class s2<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f11786r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i2 f11787s;

    public s2(y71.j jVar, i2 i2Var) {
        this.f11786r = jVar;
        this.f11787s = i2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        r2 r2Var;
        int i;
        jk.e eVar;
        fl.f c10;
        if (cVar instanceof r2) {
            r2Var = (r2) cVar;
            int i10 = r2Var.f11644v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                r2Var.f11644v = i10 - Integer.MIN_VALUE;
                Object obj2 = r2Var.f11643u;
                b71.a aVar = b71.a.r;
                i = r2Var.f11644v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List list = (List) obj;
                    i2 i2Var = this.f11787s;
                    jk.g gVar = (jk.g) i2Var.R.getValue();
                    if ((gVar == null || !gVar.a) && ((eVar = (jk.e) i2Var.S.getValue()) == null || !eVar.a)) {
                        fl.f.Companion.getClass();
                        c10 = fl.e.c(list);
                    } else {
                        fl.f.Companion.getClass();
                        c10 = fl.e.b(list);
                    }
                    r2Var.f11644v = 1;
                    if (this.f11786r.c(c10, r2Var) == aVar) {
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
        r2Var = new r2(this, cVar);
        Object obj22 = r2Var.f11643u;
        b71.a aVar2 = b71.a.r;
        i = r2Var.f11644v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
