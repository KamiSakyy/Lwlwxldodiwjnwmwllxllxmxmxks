package s3;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f31696a;

    public static final float a(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static String c(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) f.c(b(j10))) + " x " + ((Object) f.c(a(j10)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f31696a == ((h) obj).f31696a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31696a);
    }

    public final String toString() {
        return c(this.f31696a);
    }
}
