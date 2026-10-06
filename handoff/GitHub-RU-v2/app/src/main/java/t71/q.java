package t71;

import f1.p3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class q extends sy.u {
    public static String p(String str, String str2) {
        k71.k.g(str, "<this>");
        return s71.j.i0(new s71.l(new kotlin.io.k(3, str), new p3(str2, 29), 1), "\n");
    }

    public static final String q(String str) {
        Comparable comparable;
        k71.k.g(str, "<this>");
        List X = p.X(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : X) {
            if (!p.T((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            String str2 = (String) obj2;
            int length = str2.length();
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                if (!sy.rShadow.s(str2.charAt(i11))) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                i11 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i11));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        X.size();
        int m = d0Shadow.m(X);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : X) {
            int i12 = i + 1;
            if (i < 0) {
                d0Shadow.x();
                throw null;
            }
            String str3 = (String) obj3;
            String K = ((i == 0 || i == m) && p.T(str3)) ? null : p.K(str3, intValue);
            if (K != null) {
                arrayList3.add(K);
            }
            i = i12;
        }
        StringBuilder sb2 = new StringBuilder(length2);
        x61.m.b0(arrayList3, sb2, (h1.r) null, 124);
        return sb2.toString();
    }

    public static String r(String str) {
        k71.k.g(str, "<this>");
        return q(str);
    }

    public static String s(String str) {
        k71.k.g(str, "<this>");
        if (p.T("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List X = p.X(str);
        int length = str.length();
        X.size();
        int m = d0Shadow.m(X);
        ArrayList arrayList = new ArrayList();
        Iterator it = X.iterator();
        int i = 0;
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length);
                x61.m.b0(arrayList, sb2, (h1.r) null, 124);
                return sb2.toString();
            }
            Object next = it.next();
            int i10 = i + 1;
            if (i < 0) {
                d0Shadow.x();
                throw null;
            }
            String str3 = (String) next;
            if ((i != 0 && i != m) || !p.T(str3)) {
                int length2 = str3.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!sy.rShadow.s(str3.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && w.E(i11, str3, "|", false)) {
                    str2 = str3.substring("|".length() + i11);
                    k71.k.f(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i10;
        }
    }

    public static Object pShadow(Object... a) {
        return null;
    }
}
