package com.github.rudroid.viewmodels.notifications;

import java.util.ArrayList;
import java.util.List;
import y71.y1;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel$runBatchedApiAction$1", f = "NotificationsViewModel.kt", l = {942}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z0 extends c71.j implements j71.e {
    public final /* synthetic */ s A;
    public final /* synthetic */ f B;
    public final /* synthetic */ c71.j C;
    public k71.w v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ List y;
    public final /* synthetic */ androidx.lifecycle.p0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(List list, androidx.lifecycle.p0 p0Var, s sVar, f fVar, j71.f fVar2, a71.c cVar) {
        super(2, cVar);
        this.y = list;
        this.z = p0Var;
        this.A = sVar;
        this.B = fVar;
        this.C = (c71.j) fVar2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        z0 z0Var = new z0(this.y, this.z, this.A, this.B, this.C, cVar);
        z0Var.x = obj;
        return z0Var;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        k71.w wVar;
        v71.z zVar = (v71.z) this.x;
        b71.a aVar = b71.a.r;
        int i = this.w;
        if (i == 0) {
            sy.y.j(obj);
            k71.w wVar2 = new k71.w();
            ArrayList M = x61.m.M(this.y, 50);
            ArrayList arrayList = new ArrayList(x61.n.F(M, 10));
            int size = M.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = M.get(i2);
                i2++;
                arrayList.add(v71.b0.f(zVar, (w71.d) null, new y0(this.C, (List) obj2, wVar2, null), 3));
            }
            this.x = null;
            this.v = wVar2;
            this.w = 1;
            if (v71.b0.x(arrayList, this) == aVar) {
                return aVar;
            }
            wVar = wVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = this.v;
            sy.y.j(obj);
        }
        fl.b bVar = (fl.b) wVar.r;
        w61.a0 a0Var = w61.a0.a;
        s sVar = this.A;
        androidx.lifecycle.p0 p0Var = this.z;
        if (bVar != null) {
            fl.f.Companion.getClass();
            p0Var.k(fl.e.a(bVar, null));
            sVar.T(bVar);
            return a0Var;
        }
        fl.f.Companion.getClass();
        p0Var.k(fl.e.c(a0Var));
        y1 y1Var = sVar.Z;
        y1Var.getClass();
        y1Var.k((Object) null, this.B);
        return a0Var;
    }
}
