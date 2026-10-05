package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p2 {
    public static final r1 a;

    static {
        int i = i1.a;
        a = new r1(7);
    }

    public static void a(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m1Var.q0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        m1Var.w0(i3);
        while (i2 < list.size()) {
            m1Var.r0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void b(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!(list instanceof u1)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    m1Var.v0(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            m1Var.u0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += m1.z0((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            m1Var.w0(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                m1Var.w0((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        if (!z) {
            while (i2 < u1Var.t) {
                int b = u1Var.b(i2);
                m1Var.v0(i, (b >> 31) ^ (b + b));
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < u1Var.t; i6++) {
            int b2 = u1Var.b(i6);
            i5 += m1.z0((b2 >> 31) ^ (b2 + b2));
        }
        m1Var.w0(i5);
        while (i2 < u1Var.t) {
            int b3 = u1Var.b(i2);
            m1Var.w0((b3 >> 31) ^ (b3 + b3));
            i2++;
        }
    }

    public static void c(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                m1Var.x0(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += m1.A0((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        m1Var.w0(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            m1Var.y0((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public static void d(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!(list instanceof u1)) {
            if (!z) {
                while (i2 < list.size()) {
                    m1Var.v0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m1Var.u0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += m1.z0(((Integer) list.get(i4)).intValue());
            }
            m1Var.w0(i3);
            while (i2 < list.size()) {
                m1Var.w0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        if (!z) {
            while (i2 < u1Var.t) {
                m1Var.v0(i, u1Var.b(i2));
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < u1Var.t; i6++) {
            i5 += m1.z0(u1Var.b(i6));
        }
        m1Var.w0(i5);
        while (i2 < u1Var.t) {
            m1Var.w0(u1Var.b(i2));
            i2++;
        }
    }

    public static void e(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m1Var.x0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += m1.A0(((Long) list.get(i4)).longValue());
        }
        m1Var.w0(i3);
        while (i2 < list.size()) {
            m1Var.y0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u1)) {
            int i2 = 0;
            while (i < size) {
                i2 += m1.A0(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        u1 u1Var = (u1) list;
        int i3 = 0;
        while (i < size) {
            i3 += m1.A0(u1Var.b(i));
            i++;
        }
        return i3;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m1.z0(i << 3) + 4) * size;
    }

    public static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m1.z0(i << 3) + 8) * size;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u1)) {
            int i2 = 0;
            while (i < size) {
                i2 += m1.A0(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        u1 u1Var = (u1) list;
        int i3 = 0;
        while (i < size) {
            i3 += m1.A0(u1Var.b(i));
            i++;
        }
        return i3;
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += m1.A0(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u1)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += m1.z0((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        u1 u1Var = (u1) list;
        int i3 = 0;
        while (i < size) {
            int b = u1Var.b(i);
            i3 += m1.z0((b >> 31) ^ (b + b));
            i++;
        }
        return i3;
    }

    public static int m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += m1.A0((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u1)) {
            int i2 = 0;
            while (i < size) {
                i2 += m1.z0(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        u1 u1Var = (u1) list;
        int i3 = 0;
        while (i < size) {
            i3 += m1.z0(u1Var.b(i));
            i++;
        }
        return i3;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += m1.A0(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void p(Object obj, Object obj2) {
        t1 t1Var = (t1) obj;
        q2 q2Var = t1Var.zzc;
        q2 q2Var2 = ((t1) obj2).zzc;
        q2 q2Var3 = q2.f;
        if (!q2Var3.equals(q2Var2)) {
            if (q2Var3.equals(q2Var)) {
                int i = q2Var.a + q2Var2.a;
                int[] copyOf = Arrays.copyOf(q2Var.b, i);
                System.arraycopy(q2Var2.b, 0, copyOf, q2Var.a, q2Var2.a);
                Object[] copyOf2 = Arrays.copyOf(q2Var.c, i);
                System.arraycopy(q2Var2.c, 0, copyOf2, q2Var.a, q2Var2.a);
                q2Var = new q2(i, copyOf, copyOf2, true);
            } else {
                q2Var.getClass();
                if (!q2Var2.equals(q2Var3)) {
                    if (!q2Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = q2Var.a + q2Var2.a;
                    q2Var.e(i2);
                    System.arraycopy(q2Var2.b, 0, q2Var.b, q2Var.a, q2Var2.a);
                    System.arraycopy(q2Var2.c, 0, q2Var.c, q2Var.a, q2Var2.a);
                    q2Var.a = i2;
                }
            }
        }
        t1Var.zzc = q2Var;
    }

    public static void q(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                m1Var.w0(i << 3);
                m1Var.m0(booleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        m1Var.w0(i3);
        while (i2 < list.size()) {
            m1Var.m0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void r(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m1Var.q0(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        m1Var.w0(i3);
        while (i2 < list.size()) {
            m1Var.r0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void s(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!(list instanceof u1)) {
            if (!z) {
                while (i2 < list.size()) {
                    m1Var.s0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m1Var.u0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += m1.A0(((Integer) list.get(i4)).intValue());
            }
            m1Var.w0(i3);
            while (i2 < list.size()) {
                m1Var.t0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        if (!z) {
            while (i2 < u1Var.t) {
                m1Var.s0(i, u1Var.b(i2));
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < u1Var.t; i6++) {
            i5 += m1.A0(u1Var.b(i6));
        }
        m1Var.w0(i5);
        while (i2 < u1Var.t) {
            m1Var.t0(u1Var.b(i2));
            i2++;
        }
    }

    public static void t(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!(list instanceof u1)) {
            if (!z) {
                while (i2 < list.size()) {
                    m1Var.o0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m1Var.u0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            m1Var.w0(i3);
            while (i2 < list.size()) {
                m1Var.p0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        if (!z) {
            while (i2 < u1Var.t) {
                m1Var.o0(i, u1Var.b(i2));
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < u1Var.t; i6++) {
            u1Var.b(i6);
            i5 += 4;
        }
        m1Var.w0(i5);
        while (i2 < u1Var.t) {
            m1Var.p0(u1Var.b(i2));
            i2++;
        }
    }

    public static void u(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m1Var.q0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        m1Var.w0(i3);
        while (i2 < list.size()) {
            m1Var.r0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void v(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m1Var.o0(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        m1Var.w0(i3);
        while (i2 < list.size()) {
            m1Var.p0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void w(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!(list instanceof u1)) {
            if (!z) {
                while (i2 < list.size()) {
                    m1Var.s0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m1Var.u0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += m1.A0(((Integer) list.get(i4)).intValue());
            }
            m1Var.w0(i3);
            while (i2 < list.size()) {
                m1Var.t0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        if (!z) {
            while (i2 < u1Var.t) {
                m1Var.s0(i, u1Var.b(i2));
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < u1Var.t; i6++) {
            i5 += m1.A0(u1Var.b(i6));
        }
        m1Var.w0(i5);
        while (i2 < u1Var.t) {
            m1Var.t0(u1Var.b(i2));
            i2++;
        }
    }

    public static void x(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m1Var.x0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += m1.A0(((Long) list.get(i4)).longValue());
        }
        m1Var.w0(i3);
        while (i2 < list.size()) {
            m1Var.y0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void y(int i, List list, c2 c2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) c2Var.a;
        int i2 = 0;
        if (!(list instanceof u1)) {
            if (!z) {
                while (i2 < list.size()) {
                    m1Var.o0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m1Var.u0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            m1Var.w0(i3);
            while (i2 < list.size()) {
                m1Var.p0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        if (!z) {
            while (i2 < u1Var.t) {
                m1Var.o0(i, u1Var.b(i2));
                i2++;
            }
            return;
        }
        m1Var.u0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < u1Var.t; i6++) {
            u1Var.b(i6);
            i5 += 4;
        }
        m1Var.w0(i5);
        while (i2 < u1Var.t) {
            m1Var.p0(u1Var.b(i2));
            i2++;
        }
    }
}
