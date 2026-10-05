package com.github.rudroid.issueorpullrequest.timeline;

import java.util.List;
import java.util.ListIterator;
import yz0.i2;
import yz0.s7;
import yz0.w5;
import yz0.x5;
import yz0.y5;

/* loaded from: /home/user/work/p/classes.dex */
public final class y0 {
    public static final boolean a(i2 i2Var, s7 s7Var) {
        Object obj;
        k71.k.g(i2Var, "<this>");
        List list = i2Var.v.c;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            s7 s7Var2 = (s7) obj;
            if ((s7Var2 instanceof w5) || (s7Var2 instanceof y5) || (s7Var2 instanceof x5)) {
                break;
            }
        }
        return s7Var.equals(obj);
    }
}
