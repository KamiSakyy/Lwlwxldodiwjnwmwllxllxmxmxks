package da1;

import java.io.IOException;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a implements AutoCloseable {
    public static final b1.m E = new b1.m(new ba1.b(3));
    public static final b1.m F = new b1.m(new ba1.b(4));
    public ArrayList A;
    public int B;
    public String C;
    public int D;
    public String[] r;
    public StringReader s;
    public char[] t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public a(StringReader stringReader) {
        this.w = 0;
        this.y = -1;
        this.A = null;
        this.B = 1;
        this.s = stringReader;
        this.t = (char[]) F.h();
        this.r = (String[]) E.h();
        m();
    }

    public static String r(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 + i;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < i3; i6++) {
            i5 = (i5 * 31) + cArr[i6];
        }
        int i7 = i5 & 511;
        String str = strArr[i7];
        if (str != null && i2 == str.length()) {
            int i8 = i;
            int i9 = i2;
            while (true) {
                int i10 = i9 - 1;
                if (i9 == 0) {
                    return str;
                }
                int i11 = i8 + 1;
                int i12 = i4 + 1;
                if (cArr[i8] != str.charAt(i4)) {
                    break;
                }
                i8 = i11;
                i9 = i10;
                i4 = i12;
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i7] = str2;
        return str2;
    }

    public final String A() {
        m();
        int i = this.u;
        int i2 = this.v;
        char[] cArr = this.t;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (!((c == '&' || c == '<' || c == 0) ? false : true)) {
                break;
            }
            i3++;
        }
        this.u = i3;
        return i3 > i ? r(this.t, this.r, i, i3 - i) : "";
    }

    public final String E() {
        m();
        int i = this.u;
        int i2 = this.v;
        char[] cArr = this.t;
        int i3 = i;
        while (i3 < i2 && Character.isLetter(cArr[i3])) {
            i3++;
        }
        this.u = i3;
        return i3 > i ? r(this.t, this.r, i, i3 - i) : "";
    }

    public final boolean E0() {
        if (b0()) {
            return false;
        }
        return ba1.h.d(this.t[this.u]);
    }

    public final String F(d8.m mVar) {
        m();
        int i = this.u;
        int i2 = this.v;
        char[] cArr = this.t;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            mVar.getClass();
            if (!((c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '>') ? false : true)) {
                break;
            }
            i3++;
        }
        this.u = i3;
        return i3 > i ? r(this.t, this.r, i, i3 - i) : "";
    }

    public final boolean J0(String str) {
        m();
        int length = str.length();
        if (length > this.v - this.u) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            char c = this.t[this.u + i];
            if (charAt != c && Character.toUpperCase(charAt) != Character.toUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    public final String K(char c) {
        int i;
        m();
        int i2 = this.u;
        while (true) {
            if (i2 >= this.v) {
                i = -1;
                break;
            }
            if (c == this.t[i2]) {
                i = i2 - this.u;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return O();
        }
        String r = r(this.t, this.r, this.u, i);
        this.u += i;
        return r;
    }

    public final int K0(String str) {
        m();
        char charAt = str.charAt(0);
        int i = this.u;
        while (i < this.v) {
            if (charAt != this.t[i]) {
                do {
                    i++;
                    if (i >= this.v) {
                        break;
                    }
                } while (charAt != this.t[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.v;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.t[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.u;
                }
            }
            i = i2;
        }
        return -1;
    }

    public final int L0() {
        return this.x + this.u;
    }

    public final String M(char... cArr) {
        m();
        int i = this.u;
        int i2 = this.v;
        char[] cArr2 = this.t;
        int i3 = i;
        loop0: while (i3 < i2) {
            char c = cArr2[i3];
            for (char c2 : cArr) {
                if (c == c2) {
                    break loop0;
                }
            }
            i3++;
        }
        this.u = i3;
        return i3 > i ? r(this.t, this.r, i, i3 - i) : "";
    }

    public final String M0() {
        int e0;
        StringBuilder sb = new StringBuilder();
        int L0 = L0();
        int i = 1;
        if (this.A != null) {
            int e02 = e0(L0);
            i = e02 == -1 ? this.B : 1 + e02 + this.B;
        }
        sb.append(i);
        sb.append(":");
        int L02 = L0();
        if (this.A != null && (e0 = e0(L02)) != -1) {
            L02 -= ((Integer) this.A.get(e0)).intValue();
        }
        sb.append(L02 + 1);
        return sb.toString();
    }

    public final String N(char... cArr) {
        m();
        int i = this.u;
        int i2 = this.v;
        char[] cArr2 = this.t;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.u = i3;
        return i3 > i ? r(this.t, this.r, i, i3 - i) : "";
    }

    public final void N0() {
        int i = this.y;
        if (i == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.u = i;
        this.y = -1;
    }

    public final String O() {
        m();
        char[] cArr = this.t;
        String[] strArr = this.r;
        int i = this.u;
        String r = r(cArr, strArr, i, this.v - i);
        this.u = this.v;
        return r;
    }

    public final void O0() {
        int i = this.u;
        if (i < 1) {
            throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
        }
        this.u = i - 1;
    }

    public final char W() {
        m();
        int i = this.u;
        if (i >= this.v) {
            return (char) 65535;
        }
        return this.t[i];
    }

    public final boolean b0() {
        m();
        return this.u >= this.v;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b1.m mVar = E;
        b1.m mVar2 = F;
        StringReader stringReader = this.s;
        if (stringReader == null) {
            return;
        }
        try {
            stringReader.close();
            this.s = null;
            Arrays.fill(this.t, (char) 0);
            mVar2.C(this.t);
            this.t = null;
            mVar.C(this.r);
        } catch (IOException unused) {
            this.s = null;
            Arrays.fill(this.t, (char) 0);
            mVar2.C(this.t);
            this.t = null;
            mVar.C(this.r);
        } catch (Throwable th) {
            this.s = null;
            Arrays.fill(this.t, (char) 0);
            mVar2.C(this.t);
            this.t = null;
            mVar.C(this.r);
            this.r = null;
            throw th;
        }
        this.r = null;
    }

    public final int e0(int i) {
        ArrayList arrayList = this.A;
        if (arrayList == null) {
            return 0;
        }
        int binarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i));
        return binarySearch < -1 ? Math.abs(binarySearch) - 2 : binarySearch;
    }

    public final void f() {
        this.u++;
    }

    public final boolean i0(String str) {
        m();
        m();
        int length = str.length();
        if (length <= this.v - this.u) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.t[this.u + i]) {
                }
            }
            this.u = str.length() + this.u;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0037, code lost:
    
        r5.z = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        int i;
        if (this.z || (i = this.u) < this.w || this.y != -1) {
            return;
        }
        this.x += i;
        int i2 = this.v - i;
        this.v = i2;
        if (i2 > 0) {
            char[] cArr = this.t;
            System.arraycopy(cArr, i, cArr, 0, i2);
        }
        this.u = 0;
        while (true) {
            int i3 = this.v;
            if (i3 >= 2048) {
                break;
            }
            try {
                StringReader stringReader = this.s;
                char[] cArr2 = this.t;
                int read = stringReader.read(cArr2, i3, cArr2.length - i3);
                if (read == -1) {
                    break;
                } else if (read == 0) {
                    break;
                } else {
                    this.v += read;
                }
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        this.w = Math.min(this.v, 1024);
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                int e0 = e0(this.x);
                if (e0 == -1) {
                    e0 = 0;
                }
                Integer num = (Integer) this.A.get(e0);
                num.getClass();
                this.B += e0;
                this.A.clear();
                this.A.add(num);
            }
            for (int i4 = this.u; i4 < this.v; i4++) {
                if (this.t[i4] == '\n') {
                    this.A.add(Integer.valueOf(this.x + 1 + i4));
                }
            }
        }
        this.C = null;
    }

    public final boolean o0(String str) {
        if (!J0(str)) {
            return false;
        }
        this.u = str.length() + this.u;
        return true;
    }

    public final char t() {
        m();
        int i = this.u;
        char c = i >= this.v ? (char) 65535 : this.t[i];
        this.u = i + 1;
        return c;
    }

    public final String toString() {
        int i = this.v;
        int i2 = this.u;
        return i - i2 < 0 ? "" : new String(this.t, i2, i - i2);
    }

    public final boolean w0(char c) {
        return !b0() && this.t[this.u] == c;
    }

    public final boolean x0(char... cArr) {
        if (!b0()) {
            m();
            char c = this.t[this.u];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public a(String str) {
        this(new StringReader(str));
    }
}
