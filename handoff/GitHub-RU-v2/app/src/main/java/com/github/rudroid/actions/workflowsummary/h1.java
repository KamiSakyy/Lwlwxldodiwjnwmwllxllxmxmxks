package com.github.rudroid.actions.workflowsummary;

import com.github.rudroid.actions.workflowsummary.z;

/* loaded from: /home/user/work/p/classes.dex */
public final class h1<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f5566r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f5567s;

    public h1(y71.j jVar, z zVar) {
        this.f5566r = jVar;
        this.f5567s = zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r2.c(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        g1 g1Var;
        int i;
        y71.j jVar;
        int i10;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i11 = g1Var.f5557v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                g1Var.f5557v = i11 - Integer.MIN_VALUE;
                Object obj2 = g1Var.f5556u;
                b71.a aVar = b71.a.r;
                i = g1Var.f5557v;
                if (i != 0) {
                    sy.y.j(obj2);
                    z.a aVar2 = z.Companion;
                    z zVar = this.f5567s;
                    zVar.T();
                    y71.i1 i1Var = new y71.i1(zVar.H);
                    e1 e1Var = new e1(2, null);
                    jVar = this.f5566r;
                    g1Var.f5559x = jVar;
                    g1Var.f5560y = 0;
                    g1Var.f5557v = 1;
                    obj2 = y71.n1.w(i1Var, e1Var, g1Var);
                    if (obj2 != aVar) {
                        i10 = 0;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                    return w61.a0.a;
                }
                i10 = g1Var.f5560y;
                jVar = g1Var.f5559x;
                sy.y.j(obj2);
                g1Var.f5559x = null;
                g1Var.f5560y = i10;
                g1Var.f5557v = 2;
            }
        }
        g1Var = new g1(this, cVar);
        Object obj22 = g1Var.f5556u;
        b71.a aVar3 = b71.a.r;
        i = g1Var.f5557v;
        if (i != 0) {
        }
        g1Var.f5559x = null;
        g1Var.f5560y = i10;
        g1Var.f5557v = 2;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class z<T1,T2,T3,T4> {
        public z() {
        }
    }
}
