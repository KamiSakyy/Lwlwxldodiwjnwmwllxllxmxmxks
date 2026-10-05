package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class l extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f26892c;

    public l(float f6) {
        super(3);
        this.f26892c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f26892c, ((l) obj).f26892c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26892c);
    }

    public final String toString() {
        return x.i.i(new StringBuilder("HorizontalTo(x="), this.f26892c, ')');
    }
}
