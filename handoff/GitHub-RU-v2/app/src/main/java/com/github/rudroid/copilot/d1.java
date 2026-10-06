package com.github.rudroid.copilot;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final class d1 {
    public static final a Companion = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final DateTimeFormatter f9523b = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

    /* renamed from: a, reason: collision with root package name */
    public final s91.e f9524a = new s91.e(new c21.j(8));

    public static final class a {
    }

    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9525a;

        static {
            int[] iArr = new int[xn.wShadow.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                xn.wShadow wVar = xn.wShadow.r;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[xn.e1.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f9525a = iArr2;
        }
    }

    public static boolean a(com.github.rudroid.copilot.a aVar, k71.e eVar) {
        Set set;
        Object obj = null;
        if (aVar != null && (set = aVar.f9404c) != null) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (k71.xShadow.a(((b5) next).getClass()).equals(eVar)) {
                    obj = next;
                    break;
                }
            }
            obj = (b5) obj;
        }
        return obj != null;
    }

    public static boolean b(xn.g4 g4Var) {
        List list;
        return (g4Var == null || (list = g4Var.f) == null || !(list.isEmpty() ^ true)) ? false : true;
    }
    public Object k(Object p1) { return null; }
}
