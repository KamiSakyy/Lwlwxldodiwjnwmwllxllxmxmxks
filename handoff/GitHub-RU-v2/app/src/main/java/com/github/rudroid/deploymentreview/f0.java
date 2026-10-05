package com.github.rudroid.deploymentreview;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class f0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f10852r;

    public f0(y71.j jVar) {
        this.f10852r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        e0 e0Var;
        int i;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i10 = e0Var.f10849v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                e0Var.f10849v = i10 - Integer.MIN_VALUE;
                Object obj2 = e0Var.f10848u;
                b71.a aVar = b71.a.r;
                i = e0Var.f10849v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List list = ((a01.d) obj).h.e;
                    ArrayList arrayList = new ArrayList();
                    for (T t10 : list) {
                        if (((a01.c) t10).a) {
                            arrayList.add(t10);
                        }
                    }
                    e0Var.f10849v = 1;
                    if (this.f10852r.c(arrayList, e0Var) == aVar) {
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
        e0Var = new e0(this, cVar);
        Object obj22 = e0Var.f10848u;
        b71.a aVar2 = b71.a.r;
        i = e0Var.f10849v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
