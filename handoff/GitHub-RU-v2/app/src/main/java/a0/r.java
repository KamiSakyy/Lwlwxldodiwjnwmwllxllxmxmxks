package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class r extends u {

    /* renamed from: a, reason: collision with root package name */
    public float f225a;

    /* renamed from: b, reason: collision with root package name */
    public float f226b;

    public r(float f6, float f10) {
        this.f225a = f6;
        this.f226b = f10;
    }

    @Override // a0.u
    public final float a(int i) {
        if (i == 0) {
            return this.f225a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f226b;
    }

    @Override // a0.u
    public final int b() {
        return 2;
    }

    @Override // a0.u
    public final u c() {
        return new r(0.0f, 0.0f);
    }

    @Override // a0.u
    public final void d() {
        this.f225a = 0.0f;
        this.f226b = 0.0f;
    }

    @Override // a0.u
    public final void e(int i, float f6) {
        if (i == 0) {
            this.f225a = f6;
        } else {
            if (i != 1) {
                return;
            }
            this.f226b = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f225a == this.f225a && rVar.f226b == this.f226b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f226b) + (Float.hashCode(this.f225a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f225a + ", v2 = " + this.f226b;
    }
}
