package com.github.rudroid.viewmodels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
final class b8<T> implements y71.j {
    public final /* synthetic */ g8 r;
    public final /* synthetic */ String s;

    public b8(g8 g8Var, String str) {
        this.r = g8Var;
        this.s = str;
    }

    public final Object c(Object obj, a71.c cVar) {
        String str;
        Object value;
        h01.o oVar = (h01.o) obj;
        g8 g8Var = this.r;
        LinkedHashMap linkedHashMap = g8Var.w;
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = keySet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = this.s;
            if (!hasNext) {
                break;
            }
            T next = it.next();
            if (!k71.k.b((String) next, str)) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            String str2 = (String) obj2;
            v71.d1 d1Var = (v71.d1) linkedHashMap.get(str2);
            if (d1Var != null) {
                d1Var.m((CancellationException) null);
            }
            linkedHashMap.remove(str2);
        }
        y71.y1 y1Var = g8Var.x;
        do {
            value = y1Var.getValue();
            com.github.rudroid.utilities.ui.g1.Companion.getClass();
        } while (!y1Var.i(value, y7.a((y7) value, new com.github.rudroid.utilities.ui.t1(oVar), false, sy.f0.r(str), null, 10)));
        return w61.a0.a;
    }
}
