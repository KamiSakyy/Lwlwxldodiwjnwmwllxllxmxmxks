package s3;

/* loaded from: /home/user/work/p/classes.dex */
public final class d implements c {

    /* renamed from: r, reason: collision with root package name */
    public final float f31689r;

    /* renamed from: s, reason: collision with root package name */
    public final float f31690s;

    public d(float f6, float f10) {
        this.f31689r = f6;
        this.f31690s = f10;
    }

    @Override // s3.c
    public final float Q() {
        return this.f31690s;
    }

    @Override // s3.c
    public final float b() {
        return this.f31689r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f31689r, dVar.f31689r) == 0 && Float.compare(this.f31690s, dVar.f31690s) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31690s) + (Float.hashCode(this.f31689r) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f31689r);
        sb2.append(", fontScale=");
        return x.i.i(sb2, this.f31690s, ')');
    }
}
