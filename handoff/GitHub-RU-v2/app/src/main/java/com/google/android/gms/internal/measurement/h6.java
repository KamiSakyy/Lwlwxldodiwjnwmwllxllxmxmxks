package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h6 {
    public static final e5 a;

    static {
        d6 d6Var = d6.c;
        a = new e5(6);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        g5 g5Var = (g5) obj;
        k6 k6Var = g5Var.zzc;
        k6 k6Var2 = ((g5) obj2).zzc;
        k6 k6Var3 = k6.f;
        if (!k6Var3.equals(k6Var2)) {
            if (k6Var3.equals(k6Var)) {
                int i = k6Var.a + k6Var2.a;
                int[] copyOf = Arrays.copyOf(k6Var.b, i);
                System.arraycopy(k6Var2.b, 0, copyOf, k6Var.a, k6Var2.a);
                Object[] copyOf2 = Arrays.copyOf(k6Var.c, i);
                System.arraycopy(k6Var2.c, 0, copyOf2, k6Var.a, k6Var2.a);
                k6Var = new k6(i, copyOf, copyOf2, true);
            } else {
                k6Var.getClass();
                if (!k6Var2.equals(k6Var3)) {
                    if (!k6Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = k6Var.a + k6Var2.a;
                    k6Var.e(i2);
                    System.arraycopy(k6Var2.b, 0, k6Var.b, k6Var.a, k6Var2.a);
                    System.arraycopy(k6Var2.c, 0, k6Var.c, k6Var.a, k6Var2.a);
                    k6Var.a = i2;
                }
            }
        }
        g5Var.zzc = k6Var;
    }

    public static void c(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                y4Var.i0(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        y4Var.m0(i3);
        while (i2 < list.size()) {
            y4Var.p0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void d(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                y4Var.g0(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        y4Var.m0(i3);
        while (i2 < list.size()) {
            y4Var.n0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void e(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!(list instanceof s5)) {
            if (!z) {
                while (i2 < list.size()) {
                    y4Var.h0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            y4Var.d0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += y4.b0(((Long) list.get(i4)).longValue());
            }
            y4Var.m0(i3);
            while (i2 < list.size()) {
                y4Var.o0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        s5 s5Var = (s5) list;
        if (!z) {
            while (i2 < s5Var.t) {
                y4Var.h0(i, s5Var.b(i2));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < s5Var.t; i6++) {
            i5 += y4.b0(s5Var.b(i6));
        }
        y4Var.m0(i5);
        while (i2 < s5Var.t) {
            y4Var.o0(s5Var.b(i2));
            i2++;
        }
    }

    public static void f(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!(list instanceof s5)) {
            if (!z) {
                while (i2 < list.size()) {
                    y4Var.h0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            y4Var.d0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += y4.b0(((Long) list.get(i4)).longValue());
            }
            y4Var.m0(i3);
            while (i2 < list.size()) {
                y4Var.o0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        s5 s5Var = (s5) list;
        if (!z) {
            while (i2 < s5Var.t) {
                y4Var.h0(i, s5Var.b(i2));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < s5Var.t; i6++) {
            i5 += y4.b0(s5Var.b(i6));
        }
        y4Var.m0(i5);
        while (i2 < s5Var.t) {
            y4Var.o0(s5Var.b(i2));
            i2++;
        }
    }

    public static void g(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!(list instanceof s5)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    y4Var.h0(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            y4Var.d0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += y4.b0((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            y4Var.m0(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                y4Var.o0((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        s5 s5Var = (s5) list;
        if (!z) {
            while (i2 < s5Var.t) {
                long b = s5Var.b(i2);
                y4Var.h0(i, (b >> 63) ^ (b + b));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < s5Var.t; i6++) {
            long b2 = s5Var.b(i6);
            i5 += y4.b0((b2 >> 63) ^ (b2 + b2));
        }
        y4Var.m0(i5);
        while (i2 < s5Var.t) {
            long b3 = s5Var.b(i2);
            y4Var.o0((b3 >> 63) ^ (b3 + b3));
            i2++;
        }
    }

    public static void h(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!(list instanceof s5)) {
            if (!z) {
                while (i2 < list.size()) {
                    y4Var.i0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            y4Var.d0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            y4Var.m0(i3);
            while (i2 < list.size()) {
                y4Var.p0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        s5 s5Var = (s5) list;
        if (!z) {
            while (i2 < s5Var.t) {
                y4Var.i0(i, s5Var.b(i2));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < s5Var.t; i6++) {
            s5Var.b(i6);
            i5 += 8;
        }
        y4Var.m0(i5);
        while (i2 < s5Var.t) {
            y4Var.p0(s5Var.b(i2));
            i2++;
        }
    }

    public static void i(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!(list instanceof s5)) {
            if (!z) {
                while (i2 < list.size()) {
                    y4Var.i0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            y4Var.d0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            y4Var.m0(i3);
            while (i2 < list.size()) {
                y4Var.p0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        s5 s5Var = (s5) list;
        if (!z) {
            while (i2 < s5Var.t) {
                y4Var.i0(i, s5Var.b(i2));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < s5Var.t; i6++) {
            s5Var.b(i6);
            i5 += 8;
        }
        y4Var.m0(i5);
        while (i2 < s5Var.t) {
            y4Var.p0(s5Var.b(i2));
            i2++;
        }
    }

    public static void j(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!(list instanceof h5)) {
            if (!z) {
                while (i2 < list.size()) {
                    y4Var.e0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            y4Var.d0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += y4.b0(((Integer) list.get(i4)).intValue());
            }
            y4Var.m0(i3);
            while (i2 < list.size()) {
                y4Var.l0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z) {
            while (i2 < h5Var.t) {
                y4Var.e0(i, h5Var.d(i2));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h5Var.t; i6++) {
            i5 += y4.b0(h5Var.d(i6));
        }
        y4Var.m0(i5);
        while (i2 < h5Var.t) {
            y4Var.l0(h5Var.d(i2));
            i2++;
        }
    }

    public static void k(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!(list instanceof h5)) {
            if (!z) {
                while (i2 < list.size()) {
                    y4Var.f0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            y4Var.d0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += y4.s0(((Integer) list.get(i4)).intValue());
            }
            y4Var.m0(i3);
            while (i2 < list.size()) {
                y4Var.m0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z) {
            while (i2 < h5Var.t) {
                y4Var.f0(i, h5Var.d(i2));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h5Var.t; i6++) {
            i5 += y4.s0(h5Var.d(i6));
        }
        y4Var.m0(i5);
        while (i2 < h5Var.t) {
            y4Var.m0(h5Var.d(i2));
            i2++;
        }
    }

    public static void l(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!(list instanceof h5)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    y4Var.f0(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            y4Var.d0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += y4.s0((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            y4Var.m0(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                y4Var.m0((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z) {
            while (i2 < h5Var.t) {
                int d = h5Var.d(i2);
                y4Var.f0(i, (d >> 31) ^ (d + d));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h5Var.t; i6++) {
            int d2 = h5Var.d(i6);
            i5 += y4.s0((d2 >> 31) ^ (d2 + d2));
        }
        y4Var.m0(i5);
        while (i2 < h5Var.t) {
            int d3 = h5Var.d(i2);
            y4Var.m0((d3 >> 31) ^ (d3 + d3));
            i2++;
        }
    }

    public static void m(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!(list instanceof h5)) {
            if (!z) {
                while (i2 < list.size()) {
                    y4Var.g0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            y4Var.d0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            y4Var.m0(i3);
            while (i2 < list.size()) {
                y4Var.n0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z) {
            while (i2 < h5Var.t) {
                y4Var.g0(i, h5Var.d(i2));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h5Var.t; i6++) {
            h5Var.d(i6);
            i5 += 4;
        }
        y4Var.m0(i5);
        while (i2 < h5Var.t) {
            y4Var.n0(h5Var.d(i2));
            i2++;
        }
    }

    public static void n(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!(list instanceof h5)) {
            if (!z) {
                while (i2 < list.size()) {
                    y4Var.g0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            y4Var.d0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            y4Var.m0(i3);
            while (i2 < list.size()) {
                y4Var.n0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z) {
            while (i2 < h5Var.t) {
                y4Var.g0(i, h5Var.d(i2));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h5Var.t; i6++) {
            h5Var.d(i6);
            i5 += 4;
        }
        y4Var.m0(i5);
        while (i2 < h5Var.t) {
            y4Var.n0(h5Var.d(i2));
            i2++;
        }
    }

    public static void o(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!(list instanceof h5)) {
            if (!z) {
                while (i2 < list.size()) {
                    y4Var.e0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            y4Var.d0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += y4.b0(((Integer) list.get(i4)).intValue());
            }
            y4Var.m0(i3);
            while (i2 < list.size()) {
                y4Var.l0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z) {
            while (i2 < h5Var.t) {
                y4Var.e0(i, h5Var.d(i2));
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h5Var.t; i6++) {
            i5 += y4.b0(h5Var.d(i6));
        }
        y4Var.m0(i5);
        while (i2 < h5Var.t) {
            y4Var.l0(h5Var.d(i2));
            i2++;
        }
    }

    public static void p(int i, List list, t5 t5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) t5Var.r;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                y4Var.m0(i << 3);
                y4Var.k0(booleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        y4Var.d0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        y4Var.m0(i3);
        while (i2 < list.size()) {
            y4Var.k0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s5)) {
            int i2 = 0;
            while (i < size) {
                i2 += y4.b0(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        s5 s5Var = (s5) list;
        int i3 = 0;
        while (i < size) {
            i3 += y4.b0(s5Var.b(i));
            i++;
        }
        return i3;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s5)) {
            int i2 = 0;
            while (i < size) {
                i2 += y4.b0(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        s5 s5Var = (s5) list;
        int i3 = 0;
        while (i < size) {
            i3 += y4.b0(s5Var.b(i));
            i++;
        }
        return i3;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s5)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += y4.b0((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        s5 s5Var = (s5) list;
        int i3 = 0;
        while (i < size) {
            long b = s5Var.b(i);
            i3 += y4.b0((b >> 63) ^ (b + b));
            i++;
        }
        return i3;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int i2 = 0;
            while (i < size) {
                i2 += y4.b0(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        h5 h5Var = (h5) list;
        int i3 = 0;
        while (i < size) {
            i3 += y4.b0(h5Var.d(i));
            i++;
        }
        return i3;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int i2 = 0;
            while (i < size) {
                i2 += y4.b0(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        h5 h5Var = (h5) list;
        int i3 = 0;
        while (i < size) {
            i3 += y4.b0(h5Var.d(i));
            i++;
        }
        return i3;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int i2 = 0;
            while (i < size) {
                i2 += y4.s0(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        h5 h5Var = (h5) list;
        int i3 = 0;
        while (i < size) {
            i3 += y4.s0(h5Var.d(i));
            i++;
        }
        return i3;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += y4.s0((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        h5 h5Var = (h5) list;
        int i3 = 0;
        while (i < size) {
            int d = h5Var.d(i);
            i3 += y4.s0((d >> 31) ^ (d + d));
            i++;
        }
        return i3;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.s0(i << 3) + 4) * size;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.s0(i << 3) + 8) * size;
    }
}
