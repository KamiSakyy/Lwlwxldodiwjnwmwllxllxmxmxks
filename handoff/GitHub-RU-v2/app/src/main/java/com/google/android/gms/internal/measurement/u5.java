package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u5 {
    public t a;

    public u5(r6 r6Var, r6 r6Var2) {
        this.a = new t(r6Var, r6Var2);
    }

    public static void a(y4 y4Var, t tVar, Object obj, Object obj2) {
        b5.b(y4Var, (r6) tVar.a, 1, obj);
        b5.b(y4Var, (r6) tVar.b, 2, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(t tVar, Object obj, Object obj2) {
        int b0;
        int d;
        int s0;
        int d2;
        int s02;
        r6 r6Var = (r6) tVar.a;
        r6 r6Var2 = (r6) tVar.b;
        int i = b5.c;
        int i2 = 8;
        int s03 = y4.s0(8);
        r6 r6Var3 = r6.u;
        if (r6Var == r6Var3) {
            Charset charset = n5.a;
            s03 += s03;
        }
        s6 s6Var = s6.r;
        switch (r6Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                b0 = 8;
                int i3 = b0 + s03;
                int s04 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                    Charset charset2 = n5.a;
                    s04 += s04;
                }
                switch (r6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return i2 + s04 + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        i2 = 4;
                        return i2 + s04 + i3;
                    case 2:
                        i2 = y4.b0(((Long) obj2).longValue());
                        return i2 + s04 + i3;
                    case 3:
                        i2 = y4.b0(((Long) obj2).longValue());
                        return i2 + s04 + i3;
                    case 4:
                        i2 = y4.b0(((Integer) obj2).intValue());
                        return i2 + s04 + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        return i2 + s04 + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + s04 + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        i2 = 1;
                        return i2 + s04 + i3;
                    case 8:
                        if (!(obj2 instanceof x4)) {
                            i2 = y4.c0((String) obj2);
                            return i2 + s04 + i3;
                        }
                        d2 = ((x4) obj2).d();
                        s02 = y4.s0(d2);
                        i2 = s02 + d2;
                        return i2 + s04 + i3;
                    case 9:
                        i2 = ((g5) ((s4) obj2)).k();
                        return i2 + s04 + i3;
                    case 10:
                        d2 = ((g5) ((s4) obj2)).k();
                        s02 = y4.s0(d2);
                        i2 = s02 + d2;
                        return i2 + s04 + i3;
                    case 11:
                        if (obj2 instanceof x4) {
                            d2 = ((x4) obj2).d();
                            s02 = y4.s0(d2);
                        } else {
                            d2 = ((byte[]) obj2).length;
                            s02 = y4.s0(d2);
                        }
                        i2 = s02 + d2;
                        return i2 + s04 + i3;
                    case 12:
                        i2 = y4.s0(((Integer) obj2).intValue());
                        return i2 + s04 + i3;
                    case 13:
                        i2 = obj2 instanceof i5 ? y4.b0(((i5) obj2).c()) : y4.b0(((Integer) obj2).intValue());
                        return i2 + s04 + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + s04 + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        return i2 + s04 + i3;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i2 = y4.s0((intValue >> 31) ^ (intValue + intValue));
                        return i2 + s04 + i3;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i2 = y4.b0((longValue >> 63) ^ (longValue + longValue));
                        return i2 + s04 + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                b0 = 4;
                int i32 = b0 + s03;
                int s042 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 2:
                b0 = y4.b0(((Long) obj).longValue());
                int i322 = b0 + s03;
                int s0422 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 3:
                b0 = y4.b0(((Long) obj).longValue());
                int i3222 = b0 + s03;
                int s04222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 4:
                b0 = y4.b0(((Integer) obj).intValue());
                int i32222 = b0 + s03;
                int s042222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                b0 = 8;
                int i322222 = b0 + s03;
                int s0422222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                b0 = 4;
                int i3222222 = b0 + s03;
                int s04222222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                b0 = 1;
                int i32222222 = b0 + s03;
                int s042222222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 8:
                if (obj instanceof x4) {
                    d = ((x4) obj).d();
                    s0 = y4.s0(d);
                    b0 = d + s0;
                    int i322222222 = b0 + s03;
                    int s0422222222 = y4.s0(16);
                    if (r6Var2 == r6Var3) {
                    }
                    switch (r6Var2.ordinal()) {
                    }
                } else {
                    b0 = y4.c0((String) obj);
                    int i3222222222 = b0 + s03;
                    int s04222222222 = y4.s0(16);
                    if (r6Var2 == r6Var3) {
                    }
                    switch (r6Var2.ordinal()) {
                    }
                }
            case 9:
                b0 = ((g5) ((s4) obj)).k();
                int i32222222222 = b0 + s03;
                int s042222222222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 10:
                d = ((g5) ((s4) obj)).k();
                s0 = y4.s0(d);
                b0 = d + s0;
                int i322222222222 = b0 + s03;
                int s0422222222222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 11:
                if (obj instanceof x4) {
                    d = ((x4) obj).d();
                    s0 = y4.s0(d);
                } else {
                    d = ((byte[]) obj).length;
                    s0 = y4.s0(d);
                }
                b0 = d + s0;
                int i3222222222222 = b0 + s03;
                int s04222222222222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 12:
                b0 = y4.s0(((Integer) obj).intValue());
                int i32222222222222 = b0 + s03;
                int s042222222222222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 13:
                b0 = obj instanceof i5 ? y4.b0(((i5) obj).c()) : y4.b0(((Integer) obj).intValue());
                int i322222222222222 = b0 + s03;
                int s0422222222222222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                b0 = 4;
                int i3222222222222222 = b0 + s03;
                int s04222222222222222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                b0 = 8;
                int i32222222222222222 = b0 + s03;
                int s042222222222222222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                b0 = y4.s0((intValue2 >> 31) ^ (intValue2 + intValue2));
                int i322222222222222222 = b0 + s03;
                int s0422222222222222222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                b0 = y4.b0((longValue2 >> 63) ^ (longValue2 + longValue2));
                int i3222222222222222222 = b0 + s03;
                int s04222222222222222222 = y4.s0(16);
                if (r6Var2 == r6Var3) {
                }
                switch (r6Var2.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
