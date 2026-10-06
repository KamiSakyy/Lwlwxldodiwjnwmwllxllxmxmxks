package h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class y implements Comparable {

    /* renamed from: r, reason: collision with root package name */
    public int f25446r;

    /* renamed from: s, reason: collision with root package name */
    public int f25447s;

    /* renamed from: t, reason: collision with root package name */
    public int f25448t;

    /* renamed from: u, reason: collision with root package name */
    public long f25449u;

    public y(int i, int i10, int i11, long j10) {
        this.f25446r = i;
        this.f25447s = i10;
        this.f25448t = i11;
        this.f25449u = j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return k71.k.i(this.f25449u, ((y) obj).f25449u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f25446r == yVar.f25446r && this.f25447s == yVar.f25447s && this.f25448t == yVar.f25448t && this.f25449u == yVar.f25449u;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25449u) + a0.s0.b(this.f25448t, a0.s0.b(this.f25447s, Integer.hashCode(this.f25446r) * 31, 31), 31);
    }

    public final String toString() {
        return "CalendarDate(year=" + this.f25446r + ", month=" + this.f25447s + ", dayOfMonth=" + this.f25448t + ", utcTimeMillis=" + this.f25449u + ')';
    }
    public Object u = null;
}
