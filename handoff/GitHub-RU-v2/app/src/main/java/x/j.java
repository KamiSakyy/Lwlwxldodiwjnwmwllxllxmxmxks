package x;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public long f33580a;

    public static long a(int i, int i10) {
        return (i10 & 4294967295L) | (i << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f33580a == ((j) obj).f33580a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33580a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        long j10 = this.f33580a;
        sb2.append((int) (j10 >> 32));
        sb2.append(", ");
        return i.j(sb2, (int) (j10 & 4294967295L), ')');
    }
}
