package da1;

import java.util.ArrayList;
import java.util.Arrays;
import org.jsoup.helper.ValidationException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u0 {
    public static final char[] u;
    public static final int[] v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public a a;
    public d0 b;
    public p0 h;
    public o0 i;
    public q0 j;
    public r0 n;
    public String o;
    public String p;
    public int q;
    public l3 c = l3.r;
    public s0 d = null;
    public boolean e = false;
    public final b1.m f = new b1.m(28);
    public final k0 k = new k0();
    public final m0 l = new m0();
    public final l0 m = new l0();
    public int r = 0;
    public final int[] s = new int[1];
    public final int[] t = new int[2];
    public final int g = 1;

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        u = cArr;
        Arrays.sort(cArr);
    }

    public u0(bShadow bVar) {
        p0 p0Var = new p0(2, bVar);
        this.h = p0Var;
        this.j = p0Var;
        this.i = new o0(3, bVar);
        r0 r0Var = new r0(6, bVar);
        r0Var.k = true;
        this.n = r0Var;
        this.a = bVar.b;
        this.b = bVar.a.s;
    }

    public final void a(l3 l3Var) {
        o(l3Var);
        this.a.f();
    }

    public final void b(String str, Object... objArr) {
        d0 d0Var = this.b;
        if (d0Var.a()) {
            d0Var.add(new c0(this.a, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01db, code lost:
    
        if (r0.x0('=', '-', '_') == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (java.util.Arrays.binarySearch(da1.u0.u, r0.t[r0.u]) >= 0) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] c(Character ch, boolean z) {
        char c;
        int i;
        a aVar = this.a;
        if (!aVar.b0() && (ch == null || ch.charValue() != aVar.W())) {
            aVar.m();
            if (!aVar.b0()) {
            }
            if (aVar.v - aVar.u < 1024) {
                aVar.w = 0;
            }
            aVar.m();
            aVar.y = aVar.u;
            boolean i0 = aVar.i0("#");
            String str = "";
            int[] iArr = this.s;
            if (i0) {
                boolean o0 = aVar.o0("X");
                if (o0) {
                    aVar.m();
                    int i2 = aVar.u;
                    int i3 = aVar.v;
                    char[] cArr = aVar.t;
                    int i4 = i2;
                    while (i4 < i3 && ba1.h.g(cArr[i4])) {
                        i4++;
                    }
                    aVar.u = i4;
                    if (i4 > i2) {
                        str = a.r(aVar.t, aVar.r, i2, i4 - i2);
                    }
                } else {
                    aVar.m();
                    int i5 = aVar.u;
                    int i6 = aVar.v;
                    char[] cArr2 = aVar.t;
                    int i7 = i5;
                    while (i7 < i6) {
                        char c2 = cArr2[i7];
                        if (c2 < '0' || c2 > '9') {
                            break;
                        }
                        i7++;
                    }
                    aVar.u = i7;
                    if (i7 > i5) {
                        str = a.r(aVar.t, aVar.r, i5, i7 - i5);
                    }
                }
                if (str.isEmpty()) {
                    b("numeric reference with no numerals", new Object[0]);
                    aVar.N0();
                    return null;
                }
                aVar.y = -1;
                if (!aVar.i0(";")) {
                    b("missing semicolon on [&#%s]", str);
                }
                try {
                    i = Integer.valueOf(str, o0 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i = -1;
                }
                if (i == -1 || i > 1114111) {
                    b("character [%s] outside of valid range", Integer.valueOf(i));
                    iArr[0] = 65533;
                } else {
                    if (i >= 128 && i < 160) {
                        b("character [%s] is not a valid unicode code point", Integer.valueOf(i));
                        i = v[i - 128];
                    }
                    iArr[0] = i;
                }
                return iArr;
            }
            aVar.m();
            int i8 = aVar.u;
            while (true) {
                int i9 = aVar.u;
                if (i9 >= aVar.v || !ba1.h.d(aVar.t[i9])) {
                    break;
                }
                aVar.u++;
            }
            while (true) {
                int i10 = aVar.u;
                if (i10 < aVar.v && ba1.h.f(aVar.t[i10])) {
                    aVar.u++;
                }
            }
            String r = a.r(aVar.t, aVar.r, i8, aVar.u - i8);
            boolean w0 = aVar.w0(';');
            char[] cArr3 = ca1.l.a;
            ca1.k kVar = ca1.k.w;
            int binarySearch = Arrays.binarySearch(kVar.r, r);
            if ((binarySearch >= 0 ? kVar.s[binarySearch] : -1) == -1) {
                ca1.k kVar2 = ca1.k.x;
                int binarySearch2 = Arrays.binarySearch(kVar2.r, r);
                if ((binarySearch2 >= 0 ? kVar2.s[binarySearch2] : -1) == -1 || !w0) {
                    aVar.N0();
                    if (w0) {
                        b("invalid named reference [%s]", r);
                    }
                    if (!z) {
                        ArrayList arrayList = ca1.l.c;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                                break;
                            }
                            Object obj = arrayList.get(i11);
                            i11++;
                            String str2 = (String) obj;
                            if (r.startsWith(str2)) {
                                str = str2;
                                break;
                            }
                        }
                        if (!str.isEmpty()) {
                            aVar.i0(str);
                            r = str;
                        }
                    }
                }
            }
            if (z) {
                if (!aVar.E0()) {
                    if (!(aVar.b0() ? false : ba1.h.f(aVar.t[aVar.u]))) {
                    }
                }
                aVar.N0();
                return null;
            }
            aVar.y = -1;
            if (!aVar.i0(";")) {
                b("missing semicolon on [&%s]", r);
            }
            String str3 = (String) ca1.l.b.get(r);
            int[] iArr2 = this.t;
            if (str3 != null) {
                iArr2[0] = str3.codePointAt(0);
                iArr2[1] = str3.codePointAt(1);
                c = 2;
            } else {
                ca1.k kVar3 = ca1.k.x;
                int binarySearch3 = Arrays.binarySearch(kVar3.r, r);
                int i12 = binarySearch3 >= 0 ? kVar3.s[binarySearch3] : -1;
                if (i12 != -1) {
                    iArr2[0] = i12;
                    c = 1;
                } else {
                    c = 0;
                }
            }
            if (c == 1) {
                iArr[0] = iArr2[0];
                return iArr;
            }
            if (c == 2) {
                return iArr2;
            }
            throw new ValidationException("Unexpected characters returned for ".concat(r));
        }
        return null;
    }

    public final q0 d(boolean z) {
        q0 q0Var;
        if (z) {
            q0Var = this.h;
            q0Var.f();
        } else {
            q0Var = this.i;
            q0Var.f();
        }
        this.j = q0Var;
        return q0Var;
    }

    public final void e() {
        this.f.D();
    }

    public final void f(char c) {
        k0 k0Var = this.k;
        k0Var.d.e(c);
        k0Var.b = this.r;
        k0Var.c = this.a.L0();
    }

    public final void g(s0 s0Var) {
        if (this.e) {
            throw new ValidationException("Must be false");
        }
        this.d = s0Var;
        this.e = true;
        s0Var.b = this.q;
        a aVar = this.a;
        s0Var.c = aVar.L0();
        this.r = aVar.L0();
        int i = s0Var.a;
        if (i == 2) {
            this.o = ((p0) s0Var).d.G();
            this.p = null;
        } else if (i == 3) {
            o0 o0Var = (o0) s0Var;
            if (o0Var.g != null) {
                Object[] objArr = {o0Var.l()};
                d0 d0Var = this.b;
                if (d0Var.a()) {
                    d0Var.add(new c0(aVar, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    public final void h(String str) {
        k0 k0Var = this.k;
        k0Var.d.g(str);
        k0Var.b = this.r;
        k0Var.c = this.a.L0();
    }

    public final void i() {
        g(this.m);
    }

    public final void j() {
        g(this.l);
    }

    public final void k() {
        q0 q0Var = this.j;
        if (q0Var.h.A()) {
            q0Var.k();
        }
        g(this.j);
    }

    public final void l(l3 l3Var) {
        d0 d0Var = this.b;
        if (d0Var.a()) {
            d0Var.add(new c0(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{l3Var}));
        }
    }

    public final void m(l3 l3Var) {
        d0 d0Var = this.b;
        if (d0Var.a()) {
            a aVar = this.a;
            d0Var.add(new c0(aVar, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.W()), l3Var}));
        }
    }

    public final boolean n() {
        return this.o != null && this.j.d.G().equalsIgnoreCase(this.o);
    }

    public final void o(l3 l3Var) {
        if (l3Var == l3.y) {
            this.q = this.a.L0();
        }
        this.c = l3Var;
    }
}
