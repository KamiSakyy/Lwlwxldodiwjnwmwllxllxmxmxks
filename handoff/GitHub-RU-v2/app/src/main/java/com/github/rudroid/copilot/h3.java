package com.github.rudroid.copilot;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
final class h3<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g2 f9604r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f9605s;

    public h3(g2 g2Var, String str) {
        this.f9604r = g2Var;
        this.f9605s = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a71.c cVar) {
        g3 g3Var;
        int i;
        if (cVar instanceof g3) {
            g3Var = (g3) cVar;
            int i10 = g3Var.f9593w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g3Var.f9593w = i10 - Integer.MIN_VALUE;
                Object obj = g3Var.f9591u;
                w61.a0 a0Var = b71.a.r;
                i = g3Var.f9593w;
                w61.a0 a0Var2 = w61.a0.a;
                String str = this.f9605s;
                g2 g2Var = this.f9604r;
                if (i != 0) {
                    sy.y.j(obj);
                    y71.y1 y1Var = g2Var.Z;
                    g3Var.f9593w = 1;
                    y1Var.c(str, g3Var);
                    if (a0Var2 == a0Var) {
                        return a0Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                y71.y1 y1Var2 = g2Var.f9577o0;
                Iterable<xn.x> iterable = (Iterable) y1Var2.getValue();
                ArrayList arrayList = new ArrayList(x61.n.F(iterable, 10));
                for (xn.x xVar : iterable) {
                    if (k71.k.b(xVar.getId(), str) && (xVar instanceof xn.x)) {
                        xVar = xn.x.a(xVar, (String) null, (String) null, (ArrayList) null, (ArrayList) null, (xn.w) null, 12287);
                    }
                    arrayList.add(xVar);
                }
                y1Var2.getClass();
                y1Var2.k((Object) null, arrayList);
                com.github.rudroid.utilities.w0.r(g2Var.f9570h0, new u1(str, 2));
                return a0Var2;
            }
        }
        g3Var = new g3(this, cVar);
        Object obj2 = g3Var.f9591u;
        w61.a0 a0Var3 = b71.a.r;
        i = g3Var.f9593w;
        w61.a0 a0Var22 = w61.a0.a;
        String str2 = this.f9605s;
        g2 g2Var2 = this.f9604r;
        if (i != 0) {
        }
        y71.y1 y1Var22 = g2Var2.f9577o0;
        Iterable<xn.x> iterable2 = (Iterable) y1Var22.getValue();
        ArrayList arrayList2 = new ArrayList(x61.n.F(iterable2, 10));
        while (r0.hasNext()) {
        }
        y1Var22.getClass();
        y1Var22.k((Object) null, arrayList2);
        com.github.rudroid.utilities.w0.r(g2Var2.f9570h0, new u1(str2, 2));
        return a0Var22;
    }

    public final /* bridge */ /* synthetic */ Object c(Object obj, a71.c cVar) {
        return a(cVar);
    }


}
