package com.github.rudroid.copilot.inapppurchase.usecases;

import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import xn.e1;

/* loaded from: /home/user/work/p/classes.dex */
public final class i0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9774r;

    public i0(y71.j jVar, r0 r0Var) {
        this.f9774r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        h0 h0Var;
        int i;
        e1 e1Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i10 = h0Var.f9769v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h0Var.f9769v = i10 - Integer.MIN_VALUE;
                Object obj2 = h0Var.f9768u;
                b71.a aVar = b71.a.r;
                i = h0Var.f9769v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (T t10 : (List) obj) {
                        if (((Purchase) t10).f4265c.optInt("purchaseState", 1) != 4) {
                            arrayList.add(t10);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        ArrayList a10 = ((Purchase) obj3).a();
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = a10.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj4 = a10.get(i12);
                            i12++;
                            String str = (String) obj4;
                            k71.k.d(str);
                            int hashCode = str.hashCode();
                            if (hashCode == -1935215878) {
                                if (str.equals("com.github.rudroid.copilot.pro.plus")) {
                                    e1Var = e1.v;
                                }
                                e1Var = null;
                            } else if (hashCode != -919376059) {
                                if (hashCode == 792559982 && str.equals("com.github.rudroid.copilot.monthly")) {
                                    e1Var = e1.u;
                                }
                                e1Var = null;
                            } else {
                                if (str.equals("com.github.rudroid.copilot.max")) {
                                    e1Var = e1.w;
                                }
                                e1Var = null;
                            }
                            if (e1Var != null) {
                                arrayList3.add(e1Var);
                            }
                        }
                        x61.m.J(arrayList2, arrayList3);
                    }
                    h0Var.f9769v = 1;
                    if (this.f9774r.c(arrayList2, h0Var) == aVar) {
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
        h0Var = new h0(this, cVar);
        Object obj22 = h0Var.f9768u;
        b71.a aVar2 = b71.a.r;
        i = h0Var.f9769v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
