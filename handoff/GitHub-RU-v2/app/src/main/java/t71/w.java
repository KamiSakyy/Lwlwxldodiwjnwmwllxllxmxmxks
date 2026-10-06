package t71;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class w extends v {
    public static boolean A(int i, int i10, int i11, String str, String str2, boolean z10) {
        k71.k.g(str, "<this>");
        k71.k.g(str2, "other");
        return !z10 ? str.regionMatches(i, str2, i10, i11) : str.regionMatches(z10, i, str2, i10, i11);
    }

    public static String B(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(no.a.l("Count 'n' must be non-negative, but was ", i, '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i10 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i11 = 0; i11 < i; i11++) {
                cArr[i11] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i10 == i) {
                    break;
                }
                i10++;
            }
        }
        String sb3 = sb2.toString();
        k71.k.d(sb3);
        return sb3;
    }

    public static String C(String str, String str2, String str3) {
        k71.k.g(str, "<this>");
        k71.k.g(str2, "oldValue");
        k71.k.g(str3, "newValue");
        int O = p.O(str, str2, 0, false);
        if (O < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, O);
            sb2.append(str3);
            i10 = O + length;
            if (O >= str.length()) {
                break;
            }
            O = p.O(str, str2, O + i, false);
        } while (O > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }

    public static String D(String str, String str2, String str3) {
        k71.k.g(str, "<this>");
        int R = p.R(str, str2, 0, false, 2);
        return R < 0 ? str : p.c0(str, R, str2.length() + R, str3).toString();
    }

    public static boolean E(int i, String str, String str2, boolean z10) {
        k71.k.g(str, "<this>");
        return !z10 ? str.startsWith(str2, i) : A(i, 0, str2.length(), str, str2, z10);
    }

    public static boolean F(String str, String str2, boolean z10) {
        k71.k.g(str, "<this>");
        k71.k.g(str2, "prefix");
        return !z10 ? str.startsWith(str2) : A(0, 0, str2.length(), str, str2, z10);
    }

    public static Integer G(String str) {
        boolean z10;
        int i;
        int i10;
        k71.k.g(str, "<this>");
        sy.r.m(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int i12 = -2147483647;
        if (k71.k.h(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z10 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i12 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i = 0;
        }
        int i13 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + digit) {
                return null;
            }
            i11 = i10 - digit;
            i++;
        }
        return z10 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }

    public static Long H(String str) {
        boolean z10;
        k71.k.g(str, "<this>");
        sy.r.m(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (k71.k.h(charAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z10 = false;
                i = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return null;
                }
                j12 = j10 / 10;
                if (j11 < j12) {
                    return null;
                }
            }
            long j13 = j11 * 10;
            long j14 = digit;
            if (j13 < j10 + j14) {
                return null;
            }
            j11 = j13 - j14;
            i++;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }

    public static byte[] w(String str) {
        k71.k.g(str, "<this>");
        byte[] bytes = str.getBytes(a.f32104a);
        k71.k.f(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean x(String str, String str2, boolean z10) {
        k71.k.g(str, "<this>");
        return !z10 ? str.endsWith(str2) : A(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean y(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final void z(String str) {
        throw new NumberFormatException(no.a.i('\'', "Invalid number format: '", str));
    }
    public static Object c(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) { return null; }
    public Object a = null;
}
