package e2;

/* loaded from: /home/user/work/p/classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public float f21919a;

    /* renamed from: b, reason: collision with root package name */
    public float f21920b;

    public s(float f6, float f10) {
        this.f21919a = f6;
        this.f21920b = f10;
    }

    public final float[] a() {
        float f6 = this.f21919a;
        float f10 = this.f21920b;
        return new float[]{f6 / f10, 1.0f, ((1.0f - f6) - f10) / f10};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f21919a, sVar.f21919a) == 0 && Float.compare(this.f21920b, sVar.f21920b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21920b) + (Float.hashCode(this.f21919a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f21919a);
        sb2.append(", y=");
        return x.i.i(sb2, this.f21920b, ')');
    }
}
