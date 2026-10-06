package t71;

import sy.a0;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f32118a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f32119b;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = "0123456789abcdef".charAt(i10 & 15) | ("0123456789abcdef".charAt(i10 >> 4) << '\b');
        }
        f32118a = iArr;
        int[] iArr2 = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr2[i11] = "0123456789ABCDEF".charAt(i11 & 15) | ("0123456789ABCDEF".charAt(i11 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr3[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        long[] jArr = new long[256];
        for (int i17 = 0; i17 < 256; i17++) {
            jArr[i17] = -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i18)] = i19;
            i18++;
            i19++;
        }
        int i20 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i20;
            i++;
            i20++;
        }
        f32119b = jArr;
    }

    public static final void a(int i, String str, int i10) {
        int i11 = i10 - i;
        if (i11 < 1) {
            String substring = str.substring(i, i10);
            k71.k.f(substring, "substring(...)");
            StringBuilder n10 = x.i.n(i, "Expected at least 1 hexadecimal digits at index ", ", but was \"", substring, "\" of length ");
            n10.append(i11);
            throw new NumberFormatException(n10.toString());
        }
        if (i11 > 16) {
            int i12 = (i11 + i) - 16;
            while (i < i12) {
                if (str.charAt(i) != '0') {
                    StringBuilder o5 = x.i.o("Expected the hexadecimal digit '0' at index ", i, ", but was '");
                    o5.append(str.charAt(i));
                    o5.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(o5.toString());
                }
                i++;
            }
        }
    }

    public static long b(int i, String str, int i10) {
        h hVar = h.f32123d;
        k71.k.g(hVar, "format");
        a0.f(i, i10, str.length());
        if (hVar.f32126c.f32122a) {
            a(i, str, i10);
            return c(i, str, i10);
        }
        if (i10 - i > 0) {
            a(i, str, i10);
            return c(i, str, i10);
        }
        String substring = str.substring(i, i10);
        k71.k.f(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(substring));
    }

    public static final long c(int i, String str, int i10) {
        long j10 = 0;
        while (i < i10) {
            long j11 = j10 << 4;
            char charAt = str.charAt(i);
            if ((charAt >>> '\b') == 0) {
                long j12 = f32119b[charAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i++;
                }
            }
            StringBuilder o5 = x.i.o("Expected a hexadecimal digit at index ", i, ", but was ");
            o5.append(str.charAt(i));
            throw new NumberFormatException(o5.toString());
        }
        return j10;
    }
    public Object p(Object p1) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
