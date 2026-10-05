package com.github.rudroid.profile;

import androidx.lifecycle.d1;
import com.github.rudroid.utilities.c1;
import com.github.rudroid.utilities.w0;
import com.github.service.models.ApiFailure;
import java.util.Map;
import java.util.concurrent.CancellationException;
import rh.c;
import v71.q1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class j<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f17303r;

    public j(m mVar) {
        this.f17303r = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a71.c cVar) {
        i iVar;
        int i;
        y1 y1Var;
        rh.b bVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f17301y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f17301y = i10 - Integer.MIN_VALUE;
                Object obj = iVar.f17299w;
                b71.a aVar = b71.a.r;
                i = iVar.f17301y;
                if (i != 0) {
                    sy.y.j(obj);
                    m mVar = this.f17303r;
                    if (c1.c(mVar.S())) {
                        String S = mVar.S();
                        q1 q1Var = mVar.J;
                        if (q1Var != null) {
                            q1Var.m((CancellationException) null);
                        }
                        mVar.J = v71.b0.z(d1.k(mVar), (a71.h) null, (v71.a0) null, new y(mVar, S, null), 3);
                        return w61.a0.a;
                    }
                    y1 y1Var2 = mVar.I;
                    com.github.rudroid.activities.util.c cVar2 = mVar.B;
                    iVar.f17297u = y1Var2;
                    rh.b bVar2 = rh.b.a;
                    iVar.f17298v = bVar2;
                    iVar.f17301y = 1;
                    cVar2.getClass();
                    obj = com.github.rudroid.activities.util.a.c(cVar2, iVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    y1Var = y1Var2;
                    bVar = bVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = iVar.f17298v;
                    y1Var = iVar.f17297u;
                    sy.y.j(obj);
                }
                oa.j jVar = (oa.j) obj;
                bVar.getClass();
                k71.k.g(jVar, "user");
                w0.q(y1Var, new c.b(new fl.b(fl.c.s, (String) null, (Integer) null, (Map) null, jVar, (ApiFailure) null, 104), 2131954933, false, true));
                return w61.a0.a;
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f17299w;
        b71.a aVar2 = b71.a.r;
        i = iVar.f17301y;
        if (i != 0) {
        }
        oa.j jVar2 = (oa.j) obj2;
        bVar.getClass();
        k71.k.g(jVar2, "user");
        w0.q(y1Var, new c.b(new fl.b(fl.c.s, (String) null, (Integer) null, (Map) null, jVar2, (ApiFailure) null, 104), 2131954933, false, true));
        return w61.a0.a;
    }

    public final /* bridge */ /* synthetic */ Object c(Object obj, a71.c cVar) {
        return a(cVar);
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class m<T1,T2,T3,T4> {
        public m() {
        }
    }
}
