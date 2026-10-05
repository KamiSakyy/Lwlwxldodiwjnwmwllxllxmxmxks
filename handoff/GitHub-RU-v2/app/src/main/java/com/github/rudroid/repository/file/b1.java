package com.github.rudroid.repository.file;

/* loaded from: /home/user/work/p/classes.dex */
public final class b1<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f19371r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u0 f19372s;

    public b1(y71.j jVar, u0 u0Var) {
        this.f19371r = jVar;
        this.f19372s = u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        a1 a1Var;
        int i;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i10 = a1Var.f19367v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a1Var.f19367v = i10 - Integer.MIN_VALUE;
                Object obj2 = a1Var.f19366u;
                b71.a aVar = b71.a.r;
                i = a1Var.f19367v;
                if (i != 0) {
                    sy.y.j(obj2);
                    fl.f A = i21.a.A((fl.f) obj, new z0(this.f19372s));
                    a1Var.f19367v = 1;
                    if (this.f19371r.c(A, a1Var) == aVar) {
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
        a1Var = new a1(this, cVar);
        Object obj22 = a1Var.f19366u;
        b71.a aVar2 = b71.a.r;
        i = a1Var.f19367v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
