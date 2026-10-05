package com.github.rudroid.common;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class s<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9374r;

    public s(y71.j jVar) {
        this.f9374r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        r rVar;
        int i;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i10 = rVar.f9372v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f9372v = i10 - Integer.MIN_VALUE;
                Object obj2 = rVar.f9371u;
                b71.a aVar = b71.a.r;
                i = rVar.f9372v;
                if (i != 0) {
                    sy.y.j(obj2);
                    o0 o0Var = (o0) obj;
                    if (o0Var instanceof j) {
                        throw ((j) o0Var).f9334a;
                    }
                    if (!(o0Var instanceof n0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj3 = ((n0) o0Var).f9365a;
                    rVar.f9372v = 1;
                    if (this.f9374r.c(obj3, rVar) == aVar) {
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
        rVar = new r(this, cVar);
        Object obj22 = rVar.f9371u;
        b71.a aVar2 = b71.a.r;
        i = rVar.f9372v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
