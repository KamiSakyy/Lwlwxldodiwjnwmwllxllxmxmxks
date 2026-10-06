package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k6 {
    public static final k6 f = new k6(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public k6(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static k6 a() {
        return new k6(0, new int[8], new Object[8], true);
    }

    public final void b(t5 t5Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((y4) t5Var.r).h0(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((y4) t5Var.r).i0(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    y4 y4Var = (y4) t5Var.r;
                    y4Var.m0((i4 << 3) | 2);
                    y4Var.j0((x4) obj);
                } else if (i3 == 3) {
                    ((y4) t5Var.r).d0(i4, 3);
                    ((k6) obj).b(t5Var);
                    ((y4) t5Var.r).d0(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzmq());
                    }
                    ((y4) t5Var.r).g0(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int s0;
        int b0;
        int s02;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    s02 = y4.s0(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    x4 x4Var = (x4) this.c[i3];
                    int s03 = y4.s0(i7);
                    int d = x4Var.d();
                    i2 = com.github.rudroid.copilot.h1.f(d, d, s03, i2);
                } else if (i6 == 3) {
                    int s04 = y4.s0(i5 << 3);
                    s0 = s04 + s04;
                    b0 = ((k6) this.c[i3]).c();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new zzmq());
                    }
                    ((Integer) this.c[i3]).getClass();
                    s02 = y4.s0(i5 << 3) + 4;
                }
                i2 = s02 + i2;
            } else {
                int i8 = i5 << 3;
                long longValue = ((Long) this.c[i3]).longValue();
                s0 = y4.s0(i8);
                b0 = y4.b0(longValue);
            }
            i2 = b0 + s0 + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        int i = this.a;
        if (i == k6Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = k6Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = k6Var.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }











































    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class d {
        public d() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p {
        public p() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q {
        public q() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s {
        public s() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class u {
        public u() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class v {
        public v() {
        }
    }
}
