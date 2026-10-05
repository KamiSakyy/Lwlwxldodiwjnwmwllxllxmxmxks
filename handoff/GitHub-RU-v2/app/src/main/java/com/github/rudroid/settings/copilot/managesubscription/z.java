package com.github.rudroid.settings.copilot.managesubscription;

import com.github.rudroid.utilities.w0;
import java.util.List;
import xn.e1;
import xn.g4;

/* loaded from: /home/user/work/p/classes3.dex */
final class z<T> implements y71.j {
    public final /* synthetic */ b0 r;
    public final /* synthetic */ oa.j s;

    public z(b0 b0Var, oa.j jVar) {
        this.r = b0Var;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(g4 g4Var, a71.c cVar) {
        y yVar;
        int i;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i2 = yVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.x = i2 - Integer.MIN_VALUE;
                Object obj = yVar.v;
                b71.a aVar = b71.a.r;
                i = yVar.x;
                b0 b0Var = this.r;
                if (i != 0) {
                    sy.y.j(obj);
                    com.github.rudroid.copilot.inapppurchase.usecases.f0 f0Var = b0Var.u;
                    e1 e1Var = g4Var.a;
                    yVar.u = g4Var;
                    yVar.x = 1;
                    obj = f0Var.a(this.s, e1Var, yVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g4Var = yVar.u;
                    sy.y.j(obj);
                }
                w0.p(b0Var.v, new cg.b((List) obj, g4Var.a, null));
                return w61.a0.a;
            }
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.v;
        b71.a aVar2 = b71.a.r;
        i = yVar.x;
        b0 b0Var2 = this.r;
        if (i != 0) {
        }
        w0.p(b0Var2.v, new cg.b((List) obj2, g4Var.a, null));
        return w61.a0.a;
    }
}
