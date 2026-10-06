package d1;

/* loaded from: /home/user/work/p/classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final r3.j f21253a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21254b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21255c;

    public w(r3.j jVar, int i, long j10) {
        this.f21253a = jVar;
        this.f21254b = i;
        this.f21255c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f21253a == wVar.f21253a && this.f21254b == wVar.f21254b && this.f21255c == wVar.f21255c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21255c) + a0.s0.b(this.f21254b, this.f21253a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f21253a + ", offset=" + this.f21254b + ", selectableId=" + this.f21255c + ')';
    }
}
