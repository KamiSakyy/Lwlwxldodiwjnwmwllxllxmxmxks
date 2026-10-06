package t00;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class waShadow implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ Object t;

    public /* synthetic */ wa(y71.j jVar, Object obj, int i) {
        this.r = i;
        this.s = jVar;
        this.t = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        va vaVar;
        int i;
        ArrayList arrayList;
        rz.h0 h0Var;
        List list;
        rz.e0 e0Var;
        List list2;
        rz.f0 f0Var;
        List<rz.i0> list3;
        wy0.p9 p9Var;
        int i2;
        ArrayList arrayList2;
        ux0.h0 h0Var2;
        List list4;
        ux0.e0 e0Var2;
        List list5;
        ux0.f0 f0Var2;
        List<ux0.i0> list6;
        switch (this.r) {
            case 0:
                if (cVar instanceof va) {
                    vaVar = (va) cVar;
                    int i3 = vaVar.v;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vaVar.v = i3 - Integer.MIN_VALUE;
                        Object obj2 = vaVar.u;
                        b71.a aVar = b71.a.r;
                        i = vaVar.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            rz.g0 g0Var = ((rz.b0) obj).a;
                            if (g0Var == null || (h0Var = g0Var.c) == null || (list = h0Var.b.a) == null || (e0Var = (rz.e0) x61.m.W(list)) == null || (list2 = e0Var.b.a) == null || (f0Var = (rz.f0) x61.m.W(list2)) == null || (list3 = f0Var.a) == null) {
                                arrayList = x61.rShadow.r;
                            } else {
                                arrayList = new ArrayList(x61.n.F(list3, 10));
                                for (rz.i0 i0Var : list3) {
                                    arrayList.add(new l01.q0(i0Var.b, com.google.android.gms.internal.measurement.d5.f0(i0Var.a)));
                                }
                            }
                            w61.k kVar = new w61.k(this.t, arrayList);
                            vaVar.v = 1;
                            if (this.s.c(kVar, vaVar) == aVar) {
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
                vaVar = new va(this, cVar);
                Object obj22 = vaVar.u;
                b71.a aVar2 = b71.a.r;
                i = vaVar.v;
                if (i != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof wy0.p9) {
                    p9Var = (wy0.p9) cVar;
                    int i4 = p9Var.v;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        p9Var.v = i4 - Integer.MIN_VALUE;
                        Object obj3 = p9Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = p9Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            ux0.g0 g0Var2 = ((ux0.b0) obj).a;
                            if (g0Var2 == null || (h0Var2 = g0Var2.c) == null || (list4 = h0Var2.b.a) == null || (e0Var2 = (ux0.e0) x61.m.W(list4)) == null || (list5 = e0Var2.b.a) == null || (f0Var2 = (ux0.f0) x61.m.W(list5)) == null || (list6 = f0Var2.a) == null) {
                                arrayList2 = x61.rShadow.r;
                            } else {
                                arrayList2 = new ArrayList(x61.n.F(list6, 10));
                                for (ux0.i0 i0Var2 : list6) {
                                    arrayList2.add(new l01.q0(i0Var2.b, k41.b.W(i0Var2.a)));
                                }
                            }
                            w61.k kVar2 = new w61.k(this.t, arrayList2);
                            p9Var.v = 1;
                            if (this.s.c(kVar2, p9Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return w61.a0.a;
                    }
                }
                p9Var = new wy0.p9(this, cVar);
                Object obj32 = p9Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = p9Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
        }
    }
}
