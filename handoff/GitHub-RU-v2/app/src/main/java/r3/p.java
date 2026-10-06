package r3;

/* loaded from: /home/user/work/p/classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f31135c = new p(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public float f31136a;

    /* renamed from: b, reason: collision with root package name */
    public float f31137b;

    public p(float f6, float f10) {
        this.f31136a = f6;
        this.f31137b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f31136a == pVar.f31136a && this.f31137b == pVar.f31137b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31137b) + (Float.hashCode(this.f31136a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f31136a);
        sb2.append(", skewX=");
        return x.i.i(sb2, this.f31137b, ')');
    }
}
