package da1;

import org.jsoup.helper.ValidationException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class t0 implements AutoCloseable {
    public static final char[] s = {'*', '|', '_', '-'};
    public a r;

    public t0(String str) {
        this.r = new a(str);
    }

    public static boolean A(char c) {
        return c == '-' || ba1.h.f(c) || c == '_' || ba1.h.d(c) || c >= 128;
    }

    public static String F(String str) {
        if (str.indexOf(92) == -1) {
            return str;
        }
        StringBuilder a = ba1.h.a();
        char c = 0;
        for (char c2 : str.toCharArray()) {
            if (c2 != '\\') {
                a.append(c2);
            } else if (c == '\\') {
                a.append(c2);
                c = 0;
            }
            c = c2;
        }
        return ba1.h.k(a);
    }

    public final boolean E(char c) {
        a aVar = this.r;
        if (!aVar.w0(c)) {
            return false;
        }
        aVar.t();
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.r.close();
    }

    public final void f() {
        a aVar = this.r;
        if (aVar.b0()) {
            return;
        }
        aVar.f();
    }

    public final String m(char c, char c2) {
        StringBuilder a = ba1.h.a();
        a aVar = this.r;
        if (aVar.v - aVar.u < 1024) {
            aVar.w = 0;
        }
        aVar.m();
        aVar.y = aVar.u;
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        while (!aVar.b0()) {
            char t = aVar.t();
            if (c3 == '\\') {
                if (t == 'Q') {
                    z3 = true;
                } else if (t == 'E') {
                    z3 = false;
                }
                a.append(t);
            } else {
                if (t == '\'' && t != c && !z) {
                    z2 = !z2;
                } else if (t == '\"' && t != c && !z2) {
                    z = !z;
                }
                if (z2 || z || z3) {
                    a.append(t);
                } else if (t == c) {
                    i++;
                    if (i > 1) {
                        a.append(t);
                    }
                } else if (t == c2) {
                    i--;
                    if (i > 0) {
                        a.append(t);
                    }
                } else {
                    a.append(t);
                }
            }
            if (i <= 0) {
                break;
            }
            c3 = t;
        }
        String k = ba1.h.k(a);
        if (i <= 0) {
            return k;
        }
        aVar.N0();
        throw new ValidationException("Did not find balanced marker at '" + k + "'");
    }

    public final String r() {
        char W;
        a aVar = this.r;
        if (aVar.b0()) {
            throw new IllegalArgumentException("CSS identifier expected, but end of input found");
        }
        aVar.m();
        int i = aVar.u;
        int i2 = aVar.v;
        char[] cArr = aVar.t;
        int i3 = i;
        while (i3 < i2 && A(cArr[i3])) {
            i3++;
        }
        aVar.u = i3;
        String r = i3 > i ? a.r(aVar.t, aVar.r, i, i3 - i) : "";
        char W2 = aVar.W();
        if (W2 != '\\' && W2 != 0) {
            return r;
        }
        StringBuilder a = ba1.h.a();
        if (!r.isEmpty()) {
            a.append(r);
        }
        while (!aVar.b0()) {
            char W3 = aVar.W();
            if (!A(W3)) {
                if (W3 != 0) {
                    if (W3 != '\\') {
                        break;
                    }
                    f();
                    if (!aVar.b0() && ((W = aVar.W()) == '\n' || W == '\r' || W == '\f')) {
                        aVar.O0();
                        break;
                    }
                    if (aVar.b0()) {
                        a.append((char) 65533);
                    } else {
                        char t = aVar.t();
                        if (ba1.h.g(t)) {
                            aVar.O0();
                            aVar.m();
                            int i4 = aVar.u;
                            int i5 = aVar.v;
                            char[] cArr2 = aVar.t;
                            int i6 = i4;
                            while (i6 < i5 && i6 - i4 < 6 && ba1.h.g(cArr2[i6])) {
                                i6++;
                            }
                            aVar.u = i6;
                            String r2 = i6 > i4 ? a.r(aVar.t, aVar.r, i4, i6 - i4) : "";
                            try {
                                int parseInt = Integer.parseInt(r2, 16);
                                if (parseInt == 0 || !Character.isValidCodePoint(parseInt) || Character.isSurrogate((char) parseInt)) {
                                    a.append((char) 65533);
                                } else {
                                    a.appendCodePoint(parseInt);
                                }
                                if (!aVar.b0()) {
                                    char W4 = aVar.W();
                                    if (W4 == '\r') {
                                        f();
                                        if (!aVar.b0() && aVar.W() == '\n') {
                                            f();
                                        }
                                    } else if (W4 == ' ' || W4 == '\t' || W4 == '\n' || W4 == '\r' || W4 == '\f') {
                                        f();
                                    }
                                }
                            } catch (NumberFormatException e) {
                                throw new IllegalArgumentException("Invalid escape sequence: ".concat(r2), e);
                            }
                        } else {
                            a.append(t);
                        }
                    }
                } else {
                    f();
                    a.append((char) 65533);
                }
            } else {
                a.append(aVar.t());
            }
        }
        return ba1.h.k(a);
    }

    public final boolean t() {
        boolean z = false;
        while (ba1.h.h(this.r.W())) {
            f();
            z = true;
        }
        return z;
    }

    public final String toString() {
        return this.r.toString();
    }
}
