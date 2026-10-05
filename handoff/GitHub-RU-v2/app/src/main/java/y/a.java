package y;

import java.util.NoSuchElementException;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f34139a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f34140b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f34141c = new Object[0];

    public static final int a(int i, int i10, int[] iArr) {
        k.g(iArr, "array");
        int i11 = i - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final int b(long[] jArr, int i, long j10) {
        k.g(jArr, "array");
        int i10 = i - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j11 = jArr[i12];
            if (j11 < j10) {
                i11 = i12 + 1;
            } else {
                if (j11 <= j10) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final void c(String str) {
        k.g(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        k.g(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        k.g(str, "message");
        throw new NoSuchElementException(str);
    }
}
