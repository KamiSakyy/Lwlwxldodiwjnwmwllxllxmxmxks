package f91;

import h91.h;
import k71.k;
import r81.e;
import t71.p;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class a {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        int i5 = i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        k.g(str, "<this>");
        return b(str, i4, i5, str2, z, z2, z3, z4, 128);
    }

    public static String b(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) == 0 ? z4 : false;
        k.g(str, "<this>");
        int i5 = i4;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z7) || p.J(str2, (char) codePointAt) || ((codePointAt == 37 && (!z5 || (z6 && !c(i5, str, length)))) || (codePointAt == 43 && z3)))) {
                h hVar = new h();
                hVar.O0(i4, str, i5);
                h hVar2 = null;
                while (i5 < length) {
                    int codePointAt2 = str.codePointAt(i5);
                    if (!z5 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            hVar.P0("+");
                        } else if (codePointAt2 == 43 && z3) {
                            hVar.P0(z5 ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= i6 && !z7) || p.J(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z5 || (z6 && !c(i5, str, length)))))) {
                            if (hVar2 == null) {
                                hVar2 = new h();
                            }
                            hVar2.Q0(codePointAt2);
                            while (!hVar2.L()) {
                                byte readByte = hVar2.readByte();
                                hVar.J0(37);
                                char[] cArr = a;
                                hVar.J0(cArr[((readByte & 255) >> 4) & 15]);
                                hVar.J0(cArr[readByte & 15]);
                            }
                        } else {
                            hVar.Q0(codePointAt2);
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = 128;
                }
                return hVar.o0();
            }
            i5 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i4, length);
        k.f(substring, "substring(...)");
        return substring;
    }

    public static final boolean c(int i, String str, int i2) {
        k.g(str, "<this>");
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && e.l(str.charAt(i + 1)) != -1 && e.l(str.charAt(i3)) != -1;
    }

    public static String d(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        k.g(str, "<this>");
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                h hVar = new h();
                hVar.O0(i, str, i5);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i2) {
                        if (codePointAt == 43 && z) {
                            hVar.J0(32);
                            i5++;
                        }
                        hVar.Q0(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        int l = e.l(str.charAt(i5 + 1));
                        int l2 = e.l(str.charAt(i4));
                        if (l != -1 && l2 != -1) {
                            hVar.J0((l << 4) + l2);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        hVar.Q0(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return hVar.o0();
            }
            i5++;
        }
        String substring = str.substring(i, i2);
        k.f(substring, "substring(...)");
        return substring;
    }
}
