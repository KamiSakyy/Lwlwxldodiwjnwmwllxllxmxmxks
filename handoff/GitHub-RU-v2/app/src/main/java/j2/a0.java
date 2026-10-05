package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class a0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f26761c;

    public a0(float f6) {
        super(3);
        this.f26761c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Float.compare(this.f26761c, ((a0) obj).f26761c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26761c);
    }

    public final String toString() {
        return x.i.i(new StringBuilder("VerticalTo(y="), this.f26761c, ')');
    }
}
