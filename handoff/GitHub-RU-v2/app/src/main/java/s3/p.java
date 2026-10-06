package s3;

/* loaded from: /home/user/work/p/classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f31711a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        return a(j10, 0L) ? "Unspecified" : a(j10, 4294967296L) ? "Sp" : a(j10, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f31711a == ((p) obj).f31711a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31711a);
    }

    public final String toString() {
        return b(this.f31711a);
    }
}
