package com.github.rudroid.feed.ui.reaction;

import com.github.rudroid.uitoolkit.q1;
import com.github.rudroid.uitoolkit.s2;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import x61.m;
import x61.n;
import yz0.r3;
import yz0.s3;
import yz0.t3;
import yz0.u3;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {
    public static final r3 a(s2 s2Var) {
        k.g(s2Var, "<this>");
        s3 s3Var = u3.Companion;
        String str = s2Var.d;
        s3Var.getClass();
        k.g(str, "contentType");
        t3 t3Var = t3.j;
        if (!str.equals("THUMBS_UP")) {
            t3Var = t3.i;
            if (!str.equals("THUMBS_DOWN")) {
                t3Var = t3.g;
                if (!str.equals("LAUGH")) {
                    t3Var = t3.f;
                    if (!str.equals("HOORAY")) {
                        t3Var = t3.c;
                        if (!str.equals("CONFUSED")) {
                            t3Var = t3.e;
                            if (!str.equals("HEART")) {
                                t3Var = t3.h;
                                if (!str.equals("ROCKET")) {
                                    t3Var = t3.d;
                                    if (!str.equals("EYES")) {
                                        t3Var = t3.k;
                                        str.equals("UNKNOWN__");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return new r3(t3Var, s2Var.c, s2Var.b, s2Var.e);
    }

    public static final q1 b(List list) {
        yz0.b bVar = (yz0.b) m.W(m.R(list, yz0.b.class));
        ArrayList R = bVar != null ? bVar.a : m.R(list, r3.class);
        ArrayList R2 = m.R(list, r3.class);
        ArrayList arrayList = new ArrayList();
        int size = R2.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = R2.get(i10);
            i10++;
            if (((r3) obj).c > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.F(R, 10));
        int size2 = R.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = R.get(i11);
            i11++;
            r3 r3Var = (r3) obj2;
            k.g(r3Var, "<this>");
            u3 u3Var = r3Var.a;
            arrayList2.add(new s2(r3Var.c, u3Var.b, r3Var.b, u3Var.a, r3Var.d));
        }
        ArrayList arrayList3 = new ArrayList(n.F(arrayList, 10));
        int size3 = arrayList.size();
        while (i < size3) {
            Object obj3 = arrayList.get(i);
            i++;
            r3 r3Var2 = (r3) obj3;
            k.g(r3Var2, "<this>");
            u3 u3Var2 = r3Var2.a;
            arrayList3.add(new s2(r3Var2.c, u3Var2.b, r3Var2.b, u3Var2.a, r3Var2.d));
        }
        return new q1(arrayList2, arrayList3);
    }
}
