package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class q extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f26923c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26924d;

    public q(float f6, float f10) {
        super(1);
        this.f26923c = f6;
        this.f26924d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f26923c, qVar.f26923c) == 0 && Float.compare(this.f26924d, qVar.f26924d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26924d) + (Float.hashCode(this.f26923c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f26923c);
        sb2.append(", y=");
        return x.i.i(sb2, this.f26924d, ')');
    }
}
