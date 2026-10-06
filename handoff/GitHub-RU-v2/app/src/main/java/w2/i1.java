package w2;

/* loaded from: /home/user/work/p/classes.dex */
public final class i1 {

    /* renamed from: c, reason: collision with root package name */
    public static final i1 f33055c = new i1(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f33056a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33057b;

    public i1(long j10, long j11) {
        this.f33056a = j10;
        this.f33057b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            return s3.l.a(this.f33056a, i1Var.f33056a) && this.f33057b == i1Var.f33057b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33057b) + (Long.hashCode(this.f33056a) * 31);
    }
}
