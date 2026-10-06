package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class t extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f26948c;

    public t(float f6) {
        super(3);
        this.f26948c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f26948c, ((t) obj).f26948c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26948c);
    }

    public final String toString() {
        return x.i.i(new StringBuilder("RelativeHorizontalTo(dx="), this.f26948c, ')');
    }
}
