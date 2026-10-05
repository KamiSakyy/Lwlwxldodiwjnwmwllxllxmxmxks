package d3;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f21428d = new j(0.0f, new q71.d(0.0f, 0.0f), 0);

    /* renamed from: a, reason: collision with root package name */
    public final float f21429a;

    /* renamed from: b, reason: collision with root package name */
    public final q71.d f21430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21431c;

    public j(float f6, q71.d dVar, int i) {
        this.f21429a = f6;
        this.f21430b = dVar;
        this.f21431c = i;
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f21429a == jVar.f21429a && k71.k.b(this.f21430b, jVar.f21430b) && this.f21431c == jVar.f21431c;
    }

    public final int hashCode() {
        return ((this.f21430b.hashCode() + (Float.hashCode(this.f21429a) * 31)) * 31) + this.f21431c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.f21429a);
        sb2.append(", range=");
        sb2.append(this.f21430b);
        sb2.append(", steps=");
        return x.i.j(sb2, this.f21431c, ')');
    }
}
