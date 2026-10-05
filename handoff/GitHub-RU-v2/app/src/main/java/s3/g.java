package s3;

/* loaded from: /home/user/work/p/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f31695a;

    public static String a(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.c(Float.intBitsToFloat((int) (j10 >> 32)))) + ", " + ((Object) f.c(Float.intBitsToFloat((int) (j10 & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f31695a == ((g) obj).f31695a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31695a);
    }

    public final String toString() {
        return a(this.f31695a);
    }
}
