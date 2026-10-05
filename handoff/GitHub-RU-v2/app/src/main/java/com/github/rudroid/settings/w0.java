package com.github.rudroid.settings;

import com.github.rudroid.common.f;
import com.github.rudroid.settings.a1;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public w0(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        v0 v0Var;
        int i;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i2 = v0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = v0Var.u;
                b71.a aVar = b71.a.r;
                i = v0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    pm.c cVar2 = (pm.c) obj;
                    f.a aVar2 = com.github.rudroid.common.f.Companion;
                    ArrayList q = m71.a.q(cVar2);
                    aVar2.getClass();
                    Object bVar = x61.m.K0(com.github.rudroid.common.f.s).equals(x61.m.K0(q)) ? new a1.a.b(cVar2) : new a1.a.C0005a(cVar2);
                    v0Var.v = 1;
                    if (this.r.c(bVar, v0Var) == aVar) {
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
        v0Var = new v0(this, cVar);
        Object obj22 = v0Var.u;
        b71.a aVar3 = b71.a.r;
        i = v0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
