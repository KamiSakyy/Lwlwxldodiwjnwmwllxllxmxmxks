package s3;

import a0.s0;
import jo.f4;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b {
    public static final long a(int i, int i10, int i11, int i12) {
        if (!((i11 >= 0) & (i10 >= i) & (i12 >= i11) & (i >= 0))) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i, i10, i11, i12);
    }

    public static /* synthetic */ long b(int i, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i = 0;
        }
        if ((i12 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return a(i, i10, 0, i11);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long d(long j10, long j11) {
        int i = (int) (j11 >> 32);
        int k10 = a.k(j10);
        int i10 = a.i(j10);
        if (i < k10) {
            i = k10;
        }
        if (i <= i10) {
            i10 = i;
        }
        int i11 = (int) (j11 & 4294967295L);
        int j12 = a.j(j10);
        int h10 = a.h(j10);
        if (i11 < j12) {
            i11 = j12;
        }
        if (i11 <= h10) {
            h10 = i11;
        }
        return (i10 << 32) | (h10 & 4294967295L);
    }

    public static final long e(long j10, long j11) {
        int k10 = a.k(j10);
        int i = a.i(j10);
        int j12 = a.j(j10);
        int h10 = a.h(j10);
        int k11 = a.k(j11);
        if (k11 < k10) {
            k11 = k10;
        }
        if (k11 > i) {
            k11 = i;
        }
        int i10 = a.i(j11);
        if (i10 >= k10) {
            k10 = i10;
        }
        if (k10 <= i) {
            i = k10;
        }
        int j13 = a.j(j11);
        if (j13 < j12) {
            j13 = j12;
        }
        if (j13 > h10) {
            j13 = h10;
        }
        int h11 = a.h(j11);
        if (h11 >= j12) {
            j12 = h11;
        }
        if (j12 <= h10) {
            h10 = j12;
        }
        return a(k11, i, j13, h10);
    }

    public static final int f(int i, long j10) {
        int j11 = a.j(j10);
        int h10 = a.h(j10);
        if (i < j11) {
            i = j11;
        }
        return i > h10 ? h10 : i;
    }

    public static final int g(int i, long j10) {
        int k10 = a.k(j10);
        int i10 = a.i(j10);
        if (i < k10) {
            i = k10;
        }
        return i > i10 ? i10 : i;
    }

    public static final long h(int i, int i10, int i11, int i12) {
        int i13 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int c10 = c(i13);
        int i14 = i10 == Integer.MAX_VALUE ? i : i10;
        int c11 = c(i14);
        if (c10 + c11 > 31) {
            k(i14, i13);
        }
        int i15 = i10 + 1;
        int i16 = i12 + 1;
        int i17 = c11 - 13;
        return ((i15 & (~(i15 >> 31))) << 33) | ((i17 >> 1) + (i17 & 1)) | (i << 2) | (i11 << (c11 + 2)) | ((i16 & (~(i16 >> 31))) << (c11 + 33));
    }

    public static final long i(int i, int i10, long j10) {
        int k10 = a.k(j10) + i;
        if (k10 < 0) {
            k10 = 0;
        }
        int i11 = a.i(j10);
        if (i11 != Integer.MAX_VALUE && (i11 = i11 + i) < 0) {
            i11 = 0;
        }
        int j11 = a.j(j10) + i10;
        if (j11 < 0) {
            j11 = 0;
        }
        int h10 = a.h(j10);
        return a(k10, i11, j11, (h10 == Integer.MAX_VALUE || (h10 = h10 + i10) >= 0) ? h10 : 0);
    }

    public static /* synthetic */ long j(int i, int i10, int i11, long j10) {
        if ((i11 & 1) != 0) {
            i = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return i(i, i10, j10);
    }

    public static final void k(int i, int i10) {
        throw new IllegalArgumentException(f4.h(i, i10, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static final Void l(int i) {
        throw new IllegalArgumentException(s0.i("Can't represent a size of ", i, " in Constraints"));
    }
}
