package com.github.rudroid.repository.file;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import le.n;
import yz0.a4;
import yz0.b4;
import yz0.m1;
import yz0.w3;
import yz0.x3;
import yz0.y3;
import yz0.z3;
import zh.c;

/* loaded from: /home/user/work/p/classes.dex */
final class z0 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u0 f19505r;

    public z0(u0 u0Var) {
        this.f19505r = u0Var;
    }

    public final Object k(Object obj) {
        x61.rShadow arrayList;
        a4 a4Var = (b4) obj;
        k71.k.g(a4Var, "it");
        u0 u0Var = this.f19505r;
        Integer num = u0Var.G;
        int i = 0;
        if (a4Var instanceof a4) {
            ArrayList arrayList2 = a4Var.k;
            arrayList = new ArrayList(x61.n.F(arrayList2, 10));
            int size = arrayList2.size();
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                arrayList.add(new n.b((m1) obj2, num));
            }
        } else {
            boolean z10 = a4Var instanceof y3;
            x61.rShadow rVar = x61.rShadow.r;
            if (!z10) {
                if (a4Var instanceof x3) {
                    x3 x3Var = (x3) a4Var;
                    arrayList = sy.d0Shadow.n(new c.c(x3Var.a, x3Var.j, u0Var.S(), false, 0, (String) null, (String) null, 120));
                } else if (a4Var instanceof z3) {
                    ArrayList arrayList3 = ((z3) a4Var).j;
                    arrayList = new ArrayList(x61.n.F(arrayList3, 10));
                    int size2 = arrayList3.size();
                    while (i < size2) {
                        Object obj3 = arrayList3.get(i);
                        i++;
                        arrayList.add(new n.b((m1) obj3, num));
                    }
                } else if (!(a4Var instanceof w3)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            arrayList = rVar;
        }
        return new w61.k(a4Var, arrayList);
    }
}
