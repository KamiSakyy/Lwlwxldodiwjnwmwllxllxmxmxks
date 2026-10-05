package com.github.rudroid.projects.table;

import v71.q1;

/* loaded from: /home/user/work/p/classes.dex */
public final class o0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f17927r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c0 f17928s;

    public o0(y71.j jVar, c0 c0Var) {
        this.f17927r = jVar;
        this.f17928s = c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        n0 n0Var;
        int i;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i10 = n0Var.f17921v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                n0Var.f17921v = i10 - Integer.MIN_VALUE;
                Object obj2 = n0Var.f17920u;
                b71.a aVar = b71.a.r;
                i = n0Var.f17921v;
                if (i != 0) {
                    sy.y.j(obj2);
                    q1 q1Var = this.f17928s.L;
                    if (q1Var == null || !q1Var.f()) {
                        n0Var.f17921v = 1;
                        if (this.f17927r.c(obj, n0Var) == aVar) {
                            return aVar;
                        }
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
        n0Var = new n0(this, cVar);
        Object obj22 = n0Var.f17920u;
        b71.a aVar2 = b71.a.r;
        i = n0Var.f17921v;
        if (i != 0) {
        }
        return w61.a0.a;
    }







}
