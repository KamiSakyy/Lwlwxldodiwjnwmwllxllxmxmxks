package com.github.rudroid.copilot;

import com.github.rudroid.copilot.c;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[xn.wShadow.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                xn.wShadow wVar = xn.wShadow.r;
                iArr[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                xn.wShadow wVar2 = xn.wShadow.r;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                xn.wShadow wVar3 = xn.wShadow.r;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                xn.wShadow wVar4 = xn.wShadow.r;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                xn.wShadow wVar5 = xn.wShadow.r;
                iArr[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                xn.wShadow wVar6 = xn.wShadow.r;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final c a(xn.y yVar, s91.e eVar, boolean z10, boolean z11) {
        k91.a aVar;
        List list;
        String str;
        String str2;
        xn.wShadow wVar;
        String str3;
        xn.wShadow wVar2;
        bh.a aVar2;
        k71.k.g(yVar, "<this>");
        k71.k.g(eVar, "markdownParser");
        if (yVar instanceof xn.t0) {
            xn.t0 t0Var = (xn.t0) yVar;
            k91.a a10 = eVar.a(t0Var.c);
            String str4 = t0Var.a;
            String str5 = t0Var.c;
            ZonedDateTime zonedDateTime = t0Var.d;
            List list2 = t0Var.g;
            k71.k.g(list2, "<this>");
            ArrayList arrayList = new ArrayList(x61.n.F(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new c.g(((xn.b0) it.next()).a));
            }
            return new c.h(str4, str5, a10, zonedDateTime, arrayList);
        }
        if (!(yVar instanceof xn.xShadow)) {
            if (!(yVar instanceof xn.s2)) {
                throw new NoWhenBranchMatchedException();
            }
            xn.s2 s2Var = (xn.s2) yVar;
            return new c.C0021c(s2Var.f, s2Var.g);
        }
        xn.xShadow xVar = (xn.xShadow) yVar;
        xn.wShadow wVar3 = xVar.j;
        List list3 = xVar.e;
        String str6 = xVar.c;
        int ordinal = wVar3.ordinal();
        ArrayList arrayList2 = x61.rShadow.r;
        switch (ordinal) {
            case k5.f.J:
                return c.j.f9511a;
            case 1:
                return c.d.f9490a;
            case 2:
            case 4:
                k91.a a11 = eVar.a(str6);
                String str7 = xVar.a;
                String str8 = xVar.c;
                xn.wShadow wVar4 = xVar.j;
                ZonedDateTime zonedDateTime2 = xVar.d;
                boolean z12 = xVar.o;
                xn.a0Shadow a0Var = xVar.f;
                k71.k.g(a0Var, "<this>");
                k71.k.g(a11, "rootNode");
                List<xn.d0> list4 = a0Var.a;
                if (list4.isEmpty()) {
                    aVar = a11;
                    list = list3;
                    str = str7;
                    str2 = str8;
                    wVar = wVar4;
                } else {
                    List a12 = a11.a();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : a12) {
                        k91.a aVar3 = (k91.a) obj;
                        k91.a aVar4 = a11;
                        if (k71.k.b(aVar3.a, j91.a.f) || k71.k.b(aVar3.a, j91.a.g)) {
                            arrayList3.add(obj);
                        }
                        a11 = aVar4;
                    }
                    aVar = a11;
                    ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList3.get(i);
                        i++;
                        k91.a aVar5 = (k91.a) obj2;
                        ArrayList arrayList5 = new ArrayList();
                        for (xn.d0 d0Var : list4) {
                            int i10 = size;
                            List list5 = list3;
                            int i11 = d0Var.b;
                            String str9 = str7;
                            int i12 = aVar5.b;
                            if (i11 >= i12) {
                                int i13 = d0Var.c;
                                str3 = str8;
                                int i14 = aVar5.c;
                                if (i13 <= i14) {
                                    xn.u0 u0Var = d0Var.d;
                                    wVar2 = wVar4;
                                    aVar2 = new bh.a(i12, i14, u0Var.b, u0Var.c);
                                    if (aVar2 == null) {
                                        arrayList5.add(aVar2);
                                    }
                                    list3 = list5;
                                    size = i10;
                                    str7 = str9;
                                    str8 = str3;
                                    wVar4 = wVar2;
                                }
                            } else {
                                str3 = str8;
                            }
                            wVar2 = wVar4;
                            aVar2 = null;
                            if (aVar2 == null) {
                            }
                            list3 = list5;
                            size = i10;
                            str7 = str9;
                            str8 = str3;
                            wVar4 = wVar2;
                        }
                        arrayList4.add(arrayList5);
                    }
                    list = list3;
                    str = str7;
                    str2 = str8;
                    wVar = wVar4;
                    arrayList2 = x61.n.G(arrayList4);
                }
                ArrayList arrayList6 = arrayList2;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof xn.k0) {
                        arrayList7.add(obj3);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList8 = new ArrayList();
                int size2 = arrayList7.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList7.get(i15);
                    i15++;
                    if (hashSet.add(((xn.k0) obj4).r)) {
                        arrayList8.add(obj4);
                    }
                }
                List<xn.z> list6 = xVar.g;
                k71.k.g(list6, "<this>");
                ArrayList arrayList9 = new ArrayList(x61.n.F(list6, 10));
                for (xn.z zVar : list6) {
                    String str10 = zVar.a;
                    String str11 = zVar.b;
                    arrayList9.add(new c.e(str10, new c.a(str11, eVar.a(str11)), zVar.c, z10));
                }
                return new c.f(str, str2, aVar, wVar, zonedDateTime2, z12, z11, arrayList6, arrayList8, arrayList9);
            case 3:
                return new c.f(xVar.a, xVar.c, eVar.a(str6), xVar.j, xVar.d, xVar.o, false, arrayList2, arrayList2, arrayList2);
            case 5:
                return new c.b(xVar.k, xVar.l);
            case 6:
                return c.i.f9510a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
