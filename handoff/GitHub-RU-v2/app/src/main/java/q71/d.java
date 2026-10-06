package q71;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f30994a;

    /* renamed from: b, reason: collision with root package name */
    public final float f30995b;

    public d(float f6, float f10) {
        this.f30994a = f6;
        this.f30995b = f10;
    }

    public static boolean a(Float f6, Float f10) {
        return f6.floatValue() <= f10.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        float f6 = this.f30994a;
        float f10 = this.f30995b;
        if (f6 > f10) {
            d dVar = (d) obj;
            if (dVar.f30994a > dVar.f30995b) {
                return true;
            }
        }
        d dVar2 = (d) obj;
        return f6 == dVar2.f30994a && f10 == dVar2.f30995b;
    }

    public final int hashCode() {
        float f6 = this.f30994a;
        float f10 = this.f30995b;
        if (f6 > f10) {
            return -1;
        }
        return Float.hashCode(f10) + (Float.hashCode(f6) * 31);
    }

    public final String toString() {
        return this.f30994a + ".." + this.f30995b;
    }
}
