package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class xShadow extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f26961c;

    /* renamed from: d, reason: collision with root package name */
    public float f26962d;

    /* renamed from: e, reason: collision with root package name */
    public float f26963e;

    /* renamed from: f, reason: collision with root package name */
    public float f26964f;

    public x(float f6, float f10, float f11, float f12) {
        super(2);
        this.f26961c = f6;
        this.f26962d = f10;
        this.f26963e = f11;
        this.f26964f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xShadow)) {
            return false;
        }
        xShadow xVar = (xShadow) obj;
        return Float.compare(this.f26961c, xVar.f26961c) == 0 && Float.compare(this.f26962d, xVar.f26962d) == 0 && Float.compare(this.f26963e, xVar.f26963e) == 0 && Float.compare(this.f26964f, xVar.f26964f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26964f) + x.i.b(x.i.b(Float.hashCode(this.f26961c) * 31, this.f26962d, 31), this.f26963e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f26961c);
        sb2.append(", dy1=");
        sb2.append(this.f26962d);
        sb2.append(", dx2=");
        sb2.append(this.f26963e);
        sb2.append(", dy2=");
        return x.i.i(sb2, this.f26964f, ')');
    }
}
