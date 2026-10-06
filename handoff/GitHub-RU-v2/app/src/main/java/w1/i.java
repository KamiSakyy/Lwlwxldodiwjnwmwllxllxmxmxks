package w1;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public float f32938a;

    public i(float f6) {
        this.f32938a = f6;
    }

    public final int a(int i, int i10) {
        return Math.round((1 + this.f32938a) * ((i10 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Float.compare(this.f32938a, ((i) obj).f32938a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32938a);
    }

    public final String toString() {
        return x.i.i(new StringBuilder("Vertical(bias="), this.f32938a, ')');
    }
}
