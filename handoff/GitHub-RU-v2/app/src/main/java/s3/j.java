package s3;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f31697a;

    public static long a(int i, int i10, int i11, long j10) {
        if ((i11 & 1) != 0) {
            i = (int) (j10 >> 32);
        }
        if ((i11 & 2) != 0) {
            i10 = (int) (j10 & 4294967295L);
        }
        return (i10 & 4294967295L) | (i << 32);
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final long c(long j10, long j11) {
        return ((((int) (j10 >> 32)) - ((int) (j11 >> 32))) << 32) | ((((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L))) & 4294967295L);
    }

    public static final long d(long j10, long j11) {
        return ((((int) (j10 >> 32)) + ((int) (j11 >> 32))) << 32) | ((((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))) & 4294967295L);
    }

    public static String e(long j10) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j10 >> 32));
        sb2.append(", ");
        return x.i.j(sb2, (int) (j10 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f31697a == ((j) obj).f31697a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31697a);
    }

    public final String toString() {
        return e(this.f31697a);
    }
}
