package z;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f34319a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34320b;

    public a(float f6, float f10) {
        this.f34319a = f6;
        this.f34320b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f34319a, aVar.f34319a) == 0 && Float.compare(this.f34320b, aVar.f34320b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34320b) + (Float.hashCode(this.f34319a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f34319a);
        sb2.append(", velocityCoefficient=");
        return x.i.i(sb2, this.f34320b, ')');
    }
}
