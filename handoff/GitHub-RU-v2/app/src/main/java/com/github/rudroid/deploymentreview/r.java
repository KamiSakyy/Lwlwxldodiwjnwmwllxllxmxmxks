package com.github.rudroid.deploymentreview;

import com.github.rudroid.deploymentreview.v1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class r<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f10919r;

    public r(y71.j jVar, h0 h0Var) {
        this.f10919r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        q qVar;
        int i;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f10910v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f10910v = i10 - Integer.MIN_VALUE;
                Object obj2 = qVar.f10909u;
                b71.a aVar = b71.a.r;
                i = qVar.f10910v;
                if (i != 0) {
                    sy.y.j(obj2);
                    a01.d dVar = (a01.d) obj;
                    fl.e eVar = fl.f.Companion;
                    r71.e[] eVarArr = h0.A;
                    ArrayList arrayList = new ArrayList();
                    v1.e eVar2 = new v1.e(dVar);
                    List<a01.e> list = dVar.j;
                    arrayList.add(eVar2);
                    List list2 = dVar.i;
                    int i11 = 0;
                    for (T t10 : list2) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            sy.d0.x();
                            throw null;
                        }
                        a01.a aVar2 = (a01.a) t10;
                        arrayList.add(new v1.d(aVar2.a, aVar2, i11 == list2.size() + (-1)));
                        i11 = i12;
                    }
                    if (!list.isEmpty()) {
                        arrayList.add(new v1.b(dVar.a));
                        for (a01.e eVar3 : list) {
                            arrayList.add(new v1.a(eVar3.a, eVar3));
                        }
                    }
                    eVar.getClass();
                    fl.f c10 = fl.e.c(arrayList);
                    qVar.f10910v = 1;
                    if (this.f10919r.c(c10, qVar) == aVar) {
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
        qVar = new q(this, cVar);
        Object obj22 = qVar.f10909u;
        b71.a aVar3 = b71.a.r;
        i = qVar.f10910v;
        if (i != 0) {
        }
        return w61.a0.a;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class h0<T1,T2,T3,T4> {
        public h0() {
        }
    }
}
