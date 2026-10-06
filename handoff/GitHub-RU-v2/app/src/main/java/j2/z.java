package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class z extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f26969c;

    public z(float f6) {
        super(3);
        this.f26969c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f26969c, ((z) obj).f26969c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26969c);
    }

    public final String toString() {
        return x.i.i(new StringBuilder("RelativeVerticalTo(dy="), this.f26969c, ')');
    }
}
