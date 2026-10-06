package ea;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import x61.m;
import z70.w;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements f {

    /* renamed from: x, reason: collision with root package name */
    public static final w f22163x = new w(6);

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f22164y;

    /* renamed from: r, reason: collision with root package name */
    public final h91.h f22165r;

    /* renamed from: s, reason: collision with root package name */
    public int f22166s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f22167t = new int[64];

    /* renamed from: u, reason: collision with root package name */
    public String[] f22168u = new String[64];

    /* renamed from: v, reason: collision with root package name */
    public int[] f22169v = new int[64];

    /* renamed from: w, reason: collision with root package name */
    public String f22170w;

    static {
        String[] strArr = new String[128];
        for (int i = 0; i < 32; i++) {
            StringBuilder sb2 = new StringBuilder("\\u00");
            byte b10 = (byte) i;
            f22163x.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("0123456789abcdef".charAt(b10 >>> 4));
            sb3.append("0123456789abcdef".charAt(b10 & 15));
            sb2.append(sb3.toString());
            strArr[i] = sb2.toString();
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        f22164y = strArr;
    }

    public a(h91.h hVar) {
        this.f22165r = hVar;
        A(6);
    }

    public final void A(int i) {
        int i10 = this.f22166s;
        int[] iArr = this.f22167t;
        if (i10 == iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            k71.k.f(copyOf, "copyOf(...)");
            this.f22167t = copyOf;
            String[] strArr = this.f22168u;
            Object[] copyOf2 = Arrays.copyOf(strArr, strArr.length * 2);
            k71.k.f(copyOf2, "copyOf(...)");
            this.f22168u = (String[]) copyOf2;
            int[] iArr2 = this.f22169v;
            int[] copyOf3 = Arrays.copyOf(iArr2, iArr2.length * 2);
            k71.k.f(copyOf3, "copyOf(...)");
            this.f22169v = copyOf3;
        }
        int[] iArr3 = this.f22167t;
        int i11 = this.f22166s;
        this.f22166s = i11 + 1;
        iArr3[i11] = i;
    }

    @Override // ea.f
    public final f C(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            r(String.valueOf(d10));
            return this;
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + d10).toString());
    }

    public final void E() {
        if (this.f22170w != null) {
            int t10 = t();
            h91.h hVar = this.f22165r;
            if (t10 == 5) {
                hVar.J0(44);
            } else if (t10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f22167t[this.f22166s - 1] = 4;
            String str = this.f22170w;
            k71.k.d(str);
            w.a(hVar, str);
            this.f22170w = null;
        }
    }

    @Override // ea.f
    public final f I(String str) {
        k71.k.g(str, "value");
        E();
        f();
        w.a(this.f22165r, str);
        int[] iArr = this.f22169v;
        int i = this.f22166s - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // ea.f
    public final f X(boolean z10) {
        r(z10 ? "true" : "false");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f22166s;
        if (i > 1 || (i == 1 && this.f22167t[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f22166s = 0;
    }

    @Override // ea.f
    public final f e() {
        m(3, "}", 5);
        return this;
    }

    public final void f() {
        int t10 = t();
        if (t10 == 1) {
            this.f22167t[this.f22166s - 1] = 2;
            return;
        }
        h91.h hVar = this.f22165r;
        if (t10 == 2) {
            hVar.J0(44);
            return;
        }
        if (t10 == 4) {
            hVar.P0(":");
            this.f22167t[this.f22166s - 1] = 5;
        } else if (t10 == 6) {
            this.f22167t[this.f22166s - 1] = 7;
        } else {
            if (t10 == 7) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            throw new IllegalStateException("Nesting problem.");
        }
    }

    @Override // ea.f
    public final String h() {
        String str;
        int i = this.f22166s;
        int[] iArr = this.f22167t;
        String[] strArr = this.f22168u;
        int[] iArr2 = this.f22169v;
        k71.k.g(iArr, "stack");
        k71.k.g(strArr, "pathNames");
        k71.k.g(iArr2, "pathIndices");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = iArr[i10];
            if (i11 == 1 || i11 == 2) {
                arrayList.add(Integer.valueOf(iArr2[i10]));
            } else if ((i11 == 3 || i11 == 4 || i11 == 5) && (str = strArr[i10]) != null) {
                arrayList.add(str);
            }
        }
        return m.c0(arrayList, ".", (String) null, (String) null, 0, (j71.c) null, 62);
    }

    @Override // ea.f
    public final f j() {
        E();
        f();
        A(3);
        this.f22169v[this.f22166s - 1] = 0;
        this.f22165r.P0("{");
        return this;
    }

    @Override // ea.f
    public final f k() {
        m(1, "]", 2);
        return this;
    }

    public final void m(int i, String str, int i10) {
        int t10 = t();
        if (t10 != i10 && t10 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f22170w != null) {
            throw new IllegalStateException(("Dangling name: " + this.f22170w).toString());
        }
        int i11 = this.f22166s;
        int i12 = i11 - 1;
        this.f22166s = i12;
        this.f22168u[i12] = null;
        int[] iArr = this.f22169v;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f22165r.P0(str);
    }

    @Override // ea.f
    public final f n() {
        E();
        f();
        A(1);
        this.f22169v[this.f22166s - 1] = 0;
        this.f22165r.P0("[");
        return this;
    }

    public final void r(String str) {
        k71.k.g(str, "value");
        E();
        f();
        this.f22165r.P0(str);
        int[] iArr = this.f22169v;
        int i = this.f22166s - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final int t() {
        int i = this.f22166s;
        if (i != 0) {
            return this.f22167t[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // ea.f
    public final f v0() {
        r("null");
        return this;
    }

    @Override // ea.f
    public final f value() {
        k71.k.g((Object) null, "value");
        v0();
        return this;
    }

    @Override // ea.f
    public final f y(long j10) {
        r(String.valueOf(j10));
        return this;
    }

    @Override // ea.f
    public final f y0(c cVar) {
        k71.k.g(cVar, "value");
        r(cVar.f22180a);
        return this;
    }

    @Override // ea.f
    public final f z(int i) {
        r(String.valueOf(i));
        return this;
    }

    @Override // ea.f
    public final f z0(String str) {
        int i = this.f22166s;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (this.f22170w != null) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f22170w = str;
        this.f22168u[i - 1] = str;
        return this;
    }

    public static Object y;
}
