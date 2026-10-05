package com.github.rudroid.commit;

import java.util.ArrayList;
import le.c;

/* loaded from: /home/user/work/p/classes.dex */
final class e0 implements j71.c {
    public final Object k(Object obj) {
        yz0.u0 u0Var = (yz0.u0) obj;
        k71.k.g(u0Var, "it");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c.g(2131951935));
        String str = u0Var.d;
        ArrayList arrayList2 = u0Var.o;
        ArrayList arrayList3 = u0Var.p;
        String str2 = u0Var.e;
        if (str.length() > 0 && str2.length() > 0) {
            arrayList.add(new c.C0078c(str, str2));
        }
        arrayList.add(new c.f("divider:contributors"));
        arrayList.add(new c.g(2131951936));
        ArrayList arrayList4 = u0Var.n;
        int size = arrayList4.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList4.get(i10);
            i10++;
            arrayList.add(new c.a((com.github.service.models.response.a) obj2));
        }
        arrayList.add(new c.f("divider:authors"));
        if (!arrayList3.isEmpty()) {
            arrayList.add(new c.g(2131951932));
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                arrayList.add(new c.e((yz0.t0) obj3));
            }
            arrayList.add(new c.f("divider:pulls"));
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new c.g(2131951937));
            int size3 = arrayList2.size();
            while (i < size3) {
                Object obj4 = arrayList2.get(i);
                i++;
                arrayList.add(new c.b((yz0.r0) obj4));
            }
        }
        return arrayList;
    }
}
