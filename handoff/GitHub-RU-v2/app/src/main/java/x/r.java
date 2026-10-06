package x;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes.dex */
public final class r implements Cloneable {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f33611r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ long[] f33612s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object[] f33613t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ int f33614u;

    public r(int i) {
        if (i == 0) {
            this.f33612s = y.a.f34140b;
            this.f33613t = y.a.f34141c;
            return;
        }
        int i10 = i * 8;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f33612s = new long[i13];
        this.f33613t = new Object[i13];
    }

    public final void a() {
        int i = this.f33614u;
        Object[] objArr = this.f33613t;
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = null;
        }
        this.f33614u = 0;
        this.f33611r = false;
    }

    public final Object b(long j10) {
        Object obj;
        int b10 = y.a.b(this.f33612s, this.f33614u, j10);
        if (b10 < 0 || (obj = this.f33613t[b10]) == s.f33619a) {
            return null;
        }
        return obj;
    }

    public final int c(long j10) {
        if (this.f33611r) {
            int i = this.f33614u;
            long[] jArr = this.f33612s;
            Object[] objArr = this.f33613t;
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                Object obj = objArr[i11];
                if (obj != s.f33619a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f33611r = false;
            this.f33614u = i10;
        }
        return y.a.b(this.f33612s, this.f33614u, j10);
    }

    public final Object clone() {
        Object clone = super.clone();
        k71.k.e(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        r rVar = (r) clone;
        rVar.f33612s = (long[]) this.f33612s.clone();
        rVar.f33613t = (Object[]) this.f33613t.clone();
        return rVar;
    }

    public final boolean d() {
        return i() == 0;
    }

    public final long e(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f33614u)) {
            y.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f33611r) {
            long[] jArr = this.f33612s;
            Object[] objArr = this.f33613t;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != s.f33619a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f33611r = false;
            this.f33614u = i11;
        }
        return this.f33612s[i];
    }

    public final void g(long j10, Object obj) {
        Object obj2 = s.f33619a;
        int b10 = y.a.b(this.f33612s, this.f33614u, j10);
        if (b10 >= 0) {
            this.f33613t[b10] = obj;
            return;
        }
        int i = ~b10;
        int i10 = this.f33614u;
        if (i < i10) {
            Object[] objArr = this.f33613t;
            if (objArr[i] == obj2) {
                this.f33612s[i] = j10;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f33611r) {
            long[] jArr = this.f33612s;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f33613t;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f33611r = false;
                this.f33614u = i11;
                i = ~y.a.b(this.f33612s, i11, j10);
            }
        }
        int i13 = this.f33614u;
        if (i13 >= this.f33612s.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            long[] copyOf = Arrays.copyOf(this.f33612s, i17);
            k71.k.f(copyOf, "copyOf(...)");
            this.f33612s = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f33613t, i17);
            k71.k.f(copyOf2, "copyOf(...)");
            this.f33613t = copyOf2;
        }
        int i18 = this.f33614u;
        if (i18 - i != 0) {
            long[] jArr2 = this.f33612s;
            int i19 = i + 1;
            x61.l.z(jArr2, jArr2, i19, i, i18);
            Object[] objArr3 = this.f33613t;
            x61.l.x(i19, i, this.f33614u, objArr3, objArr3);
        }
        this.f33612s[i] = j10;
        this.f33613t[i] = obj;
        this.f33614u++;
    }

    public final void h(long j10) {
        int b10 = y.a.b(this.f33612s, this.f33614u, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f33613t;
            Object obj = objArr[b10];
            Object obj2 = s.f33619a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f33611r = true;
            }
        }
    }

    public final int i() {
        if (this.f33611r) {
            int i = this.f33614u;
            long[] jArr = this.f33612s;
            Object[] objArr = this.f33613t;
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                Object obj = objArr[i11];
                if (obj != s.f33619a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f33611r = false;
            this.f33614u = i10;
        }
        return this.f33614u;
    }

    public final Object j(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f33614u)) {
            y.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f33611r) {
            long[] jArr = this.f33612s;
            Object[] objArr = this.f33613t;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != s.f33619a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f33611r = false;
            this.f33614u = i11;
        }
        return this.f33613t[i];
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f33614u * 28);
        sb2.append('{');
        int i = this.f33614u;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(e(i10));
            sb2.append('=');
            Object j10 = j(i10);
            if (j10 != sb2) {
                sb2.append(j10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ r(Object obj) {
        this(10);
    }
    public Object h = null;
    public Object i = null;
}
