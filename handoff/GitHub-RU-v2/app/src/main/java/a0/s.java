package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class s extends u {

    /* renamed from: a, reason: collision with root package name */
    public float f239a;

    /* renamed from: b, reason: collision with root package name */
    public float f240b;

    /* renamed from: c, reason: collision with root package name */
    public float f241c;

    public s(float f6, float f10, float f11) {
        this.f239a = f6;
        this.f240b = f10;
        this.f241c = f11;
    }

    @Override // a0.u
    public final float a(int i) {
        if (i == 0) {
            return this.f239a;
        }
        if (i == 1) {
            return this.f240b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f241c;
    }

    @Override // a0.u
    public final int b() {
        return 3;
    }

    @Override // a0.u
    public final u c() {
        return new s(0.0f, 0.0f, 0.0f);
    }

    @Override // a0.u
    public final void d() {
        this.f239a = 0.0f;
        this.f240b = 0.0f;
        this.f241c = 0.0f;
    }

    @Override // a0.u
    public final void e(int i, float f6) {
        if (i == 0) {
            this.f239a = f6;
        } else if (i == 1) {
            this.f240b = f6;
        } else {
            if (i != 2) {
                return;
            }
            this.f241c = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return sVar.f239a == this.f239a && sVar.f240b == this.f240b && sVar.f241c == this.f241c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f241c) + x.i.b(Float.hashCode(this.f239a) * 31, this.f240b, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f239a + ", v2 = " + this.f240b + ", v3 = " + this.f241c;
    }
}
