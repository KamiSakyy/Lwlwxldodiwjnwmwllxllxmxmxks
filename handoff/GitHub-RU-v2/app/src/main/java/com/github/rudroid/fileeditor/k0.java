package com.github.rudroid.fileeditor;

/* loaded from: /home/user/work/p/classes.dex */
public final class k0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f12946r;

    public k0(y71.j jVar) {
        this.f12946r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        j0 j0Var;
        int i;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i10 = j0Var.f12942v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j0Var.f12942v = i10 - Integer.MIN_VALUE;
                Object obj2 = j0Var.f12941u;
                b71.a aVar = b71.a.r;
                i = j0Var.f12942v;
                if (i != 0) {
                    sy.y.j(obj2);
                    String str = ((p01.g) obj).c;
                    qb.a aVar2 = str != null ? new qb.a(str) : null;
                    j0Var.f12942v = 1;
                    if (this.f12946r.c(aVar2, j0Var) == aVar) {
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
        j0Var = new j0(this, cVar);
        Object obj22 = j0Var.f12941u;
        b71.a aVar3 = b71.a.r;
        i = j0Var.f12942v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
