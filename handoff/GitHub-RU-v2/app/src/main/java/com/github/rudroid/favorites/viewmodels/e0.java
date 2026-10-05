package com.github.rudroid.favorites.viewmodels;

import java.util.ArrayList;
import java.util.List;
import y71.m1;
import y71.y1;
import yz0.d4;

/* loaded from: /home/user/work/p/classes.dex */
final class e0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f12358r;

    public e0(o oVar) {
        this.f12358r = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(d4 d4Var, a71.c cVar) {
        d0 d0Var;
        int i;
        x01.i iVar;
        o oVar = this.f12358r;
        y1 y1Var = oVar.D;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i10 = d0Var.f12356x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d0Var.f12356x = i10 - Integer.MIN_VALUE;
                Object obj = d0Var.f12354v;
                b71.a aVar = b71.a.r;
                i = d0Var.f12356x;
                if (i != 0) {
                    sy.y.j(obj);
                    int i11 = d4Var.a;
                    ArrayList arrayList = d4Var.b;
                    iVar = d4Var.c;
                    x01.i iVar2 = oVar.B;
                    x01.i.Companion.getClass();
                    if (k71.k.b(iVar2, x01.i.d)) {
                        fl.f.Companion.getClass();
                        fl.f c10 = fl.e.c(arrayList);
                        y1Var.getClass();
                        y1Var.k((Object) null, c10);
                        m1 m1Var = oVar.F;
                        Integer num = new Integer(i11);
                        d0Var.f12353u = iVar;
                        d0Var.f12356x = 1;
                        if (m1Var.c(num, d0Var) == aVar) {
                            return aVar;
                        }
                    } else {
                        fl.e eVar = fl.f.Companion;
                        x61.r rVar = (List) ((fl.f) y1Var.getValue()).b;
                        if (rVar == null) {
                            rVar = x61.r.r;
                        }
                        ArrayList l02 = x61.m.l0(rVar, arrayList);
                        eVar.getClass();
                        fl.f c11 = fl.e.c(l02);
                        y1Var.getClass();
                        y1Var.k((Object) null, c11);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = d0Var.f12353u;
                    sy.y.j(obj);
                }
                oVar.B = iVar;
                return w61.a0.a;
            }
        }
        d0Var = new d0(this, cVar);
        Object obj2 = d0Var.f12354v;
        b71.a aVar2 = b71.a.r;
        i = d0Var.f12356x;
        if (i != 0) {
        }
        oVar.B = iVar;
        return w61.a0.a;
    }
}
