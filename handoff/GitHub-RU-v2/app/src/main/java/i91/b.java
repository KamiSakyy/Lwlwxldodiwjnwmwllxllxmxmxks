package i91;

import c30.o0;
import f1.z2;
import h91.a0;
import h91.e0;
import h91.h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import k71.s;
import k71.v;
import k71.w;
import sy.rShadow;
import t71.p;
import x61.m;
import x61.x;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class b {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final byte[] b = new byte[0];

    public static final int a(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = a0.s;
        a0 b2 = o0.b("/", false);
        LinkedHashMap v = x.v(new w61.k[]{new w61.k(b2, new j(b2, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))});
        for (j jVar : m.v0(arrayList, new androidx.viewpager.widget.b(8))) {
            if (((j) v.put(jVar.a, jVar)) == null) {
                while (true) {
                    a0 a0Var = jVar.a;
                    a0 c = a0Var.c();
                    if (c != null) {
                        j jVar2 = (j) v.get(c);
                        if (jVar2 != null) {
                            jVar2.q.add(a0Var);
                            break;
                        }
                        j jVar3 = new j(c, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        v.put(c, jVar3);
                        jVar3.q.add(a0Var);
                        jVar = jVar3;
                    }
                }
            }
        }
        return v;
    }

    public static final byte[] c(String str) {
        int i;
        char charAt;
        k71.k.g(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt2 = str.charAt(i2);
            if (k71.k.h(charAt2, 128) >= 0) {
                int length2 = str.length();
                int i3 = i2;
                while (i2 < length2) {
                    char charAt3 = str.charAt(i2);
                    if (k71.k.h(charAt3, 128) < 0) {
                        int i4 = i3 + 1;
                        bArr[i3] = (byte) charAt3;
                        i2++;
                        while (true) {
                            i3 = i4;
                            if (i2 < length2 && k71.k.h(str.charAt(i2), 128) < 0) {
                                i4 = i3 + 1;
                                bArr[i3] = (byte) str.charAt(i2);
                                i2++;
                            }
                        }
                    } else {
                        if (k71.k.h(charAt3, 2048) < 0) {
                            bArr[i3] = (byte) ((charAt3 >> 6) | 192);
                            i3 += 2;
                            bArr[i3 + 1] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || charAt3 >= 57344) {
                            bArr[i3] = (byte) ((charAt3 >> '\f') | 224);
                            bArr[i3 + 1] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i3 + 2] = (byte) ((charAt3 & '?') | 128);
                        } else if (k71.k.h(charAt3, 56319) > 0 || length2 <= (i = i2 + 1) || 56320 > (charAt = str.charAt(i)) || charAt >= 57344) {
                            bArr[i3] = 63;
                            i2++;
                            i3++;
                        } else {
                            int charAt4 = (str.charAt(i) + (charAt3 << '\n')) - 56613888;
                            bArr[i3] = (byte) ((charAt4 >> 18) | 240);
                            bArr[i3 + 1] = (byte) (((charAt4 >> 12) & 63) | 128);
                            bArr[i3 + 2] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i3 += 4;
                            bArr[i3 + 3] = (byte) ((charAt4 & 63) | 128);
                            i2 += 2;
                        }
                        i2++;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i3);
                k71.k.f(copyOf, "copyOf(...)");
                return copyOf;
            }
            bArr[i2] = (byte) charAt2;
            i2++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        k71.k.f(copyOf2, "copyOf(...)");
        return copyOf2;
    }

    public static final String d(int i) {
        rShadow.m(16);
        String num = Integer.toString(i, 16);
        k71.k.f(num, "toString(...)");
        return "0x".concat(num);
    }

    public static final j e(e0 e0Var) {
        int m = e0Var.m();
        if (m != 33639248) {
            throw new IOException("bad zip: expected " + d(33639248) + " but was " + d(m));
        }
        e0Var.skip(4L);
        short t = e0Var.t();
        int i = t & 65535;
        if ((t & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + d(i));
        }
        int t2 = e0Var.t() & 65535;
        int t3 = e0Var.t() & 65535;
        int t4 = e0Var.t() & 65535;
        long m2 = e0Var.m() & 4294967295L;
        v vVar = new v();
        vVar.r = e0Var.m() & 4294967295L;
        v vVar2 = new v();
        vVar2.r = e0Var.m() & 4294967295L;
        int t5 = e0Var.t() & 65535;
        int t6 = e0Var.t() & 65535;
        int t7 = 65535 & e0Var.t();
        e0Var.skip(8L);
        v vVar3 = new v();
        vVar3.r = e0Var.m() & 4294967295L;
        String A = e0Var.A(t5);
        if (p.J(A, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = vVar2.r == 4294967295L ? 8 : 0L;
        if (vVar.r == 4294967295L) {
            j += 8;
        }
        if (vVar3.r == 4294967295L) {
            j += 8;
        }
        w wVar = new w();
        w wVar2 = new w();
        w wVar3 = new w();
        s sVar = new s();
        f(e0Var, t6, new z2(sVar, j, vVar2, e0Var, vVar, vVar3, wVar, wVar2, wVar3));
        if (j > 0 && !sVar.r) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String A2 = e0Var.A(t7);
        String str = a0.s;
        return new j(o0.b("/", false).e(A), t71.w.x(A, "/", false), A2, m2, vVar.r, vVar2.r, t2, vVar3.r, t4, t3, (Long) wVar.r, (Long) wVar2.r, (Long) wVar3.r, 57344);
    }

    public static final void f(e0 e0Var, int i, j71.e eVar) {
        h91.h hVar = e0Var.s;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int t = e0Var.t() & 65535;
            long t2 = e0Var.t() & 65535;
            long j2 = j - 4;
            if (j2 < t2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            e0Var.C0(t2);
            long j3 = hVar.s;
            eVar.s(Integer.valueOf(t), Long.valueOf(t2));
            long j4 = (hVar.s + t2) - j3;
            if (j4 < 0) {
                throw new IOException(no.a.k("unsupported zip: too many bytes processed for ", t));
            }
            if (j4 > 0) {
                hVar.skip(j4);
            }
            j = j2 - t2;
        }
    }

    public static final j g(e0 e0Var, j jVar) {
        int m = e0Var.m();
        if (m != 67324752) {
            throw new IOException("bad zip: expected " + d(67324752) + " but was " + d(m));
        }
        e0Var.skip(2L);
        short t = e0Var.t();
        int i = t & 65535;
        if ((t & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + d(i));
        }
        e0Var.skip(18L);
        int t2 = e0Var.t() & 65535;
        e0Var.skip(e0Var.t() & 65535);
        if (jVar == null) {
            e0Var.skip(t2);
            return null;
        }
        w wVar = new w();
        w wVar2 = new w();
        w wVar3 = new w();
        f(e0Var, t2, new k(e0Var, wVar, wVar2, wVar3));
        return new j(jVar.a, jVar.b, jVar.c, jVar.d, jVar.e, jVar.f, jVar.g, jVar.h, jVar.i, jVar.j, jVar.k, jVar.l, jVar.m, (Integer) wVar.r, (Integer) wVar2.r, (Integer) wVar3.r);
    }

    public static final int h(h0 h0Var, int i) {
        int i2;
        int[] iArr = h0Var.w;
        int i3 = i + 1;
        int length = h0Var.v.length;
        k71.k.g(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }
}
