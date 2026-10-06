package h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f25287a;

    /* renamed from: b, reason: collision with root package name */
    public int f25288b;

    /* renamed from: c, reason: collision with root package name */
    public int f25289c;

    /* renamed from: d, reason: collision with root package name */
    public int f25290d;

    /* renamed from: e, reason: collision with root package name */
    public long f25291e;

    public c0(int i, int i10, int i11, int i12, long j10) {
        this.f25287a = i;
        this.f25288b = i10;
        this.f25289c = i11;
        this.f25290d = i12;
        this.f25291e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f25287a == c0Var.f25287a && this.f25288b == c0Var.f25288b && this.f25289c == c0Var.f25289c && this.f25290d == c0Var.f25290d && this.f25291e == c0Var.f25291e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25291e) + a0.s0.b(this.f25290d, a0.s0.b(this.f25289c, a0.s0.b(this.f25288b, Integer.hashCode(this.f25287a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CalendarMonth(year=" + this.f25287a + ", month=" + this.f25288b + ", numberOfDays=" + this.f25289c + ", daysFromStartOfWeekToFirstOfMonth=" + this.f25290d + ", startUtcTimeMillis=" + this.f25291e + ')';
    }
}
