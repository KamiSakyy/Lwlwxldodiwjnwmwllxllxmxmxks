package s3;

/* loaded from: /home/user/work/p/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public long f31703a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f31703a == ((l) obj).f31703a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31703a);
    }

    public final String toString() {
        return b(this.f31703a);
    }
}
