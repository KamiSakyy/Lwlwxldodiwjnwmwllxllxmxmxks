package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class t extends u {

    /* renamed from: a, reason: collision with root package name */
    public float f247a;

    /* renamed from: b, reason: collision with root package name */
    public float f248b;

    /* renamed from: c, reason: collision with root package name */
    public float f249c;

    /* renamed from: d, reason: collision with root package name */
    public float f250d;

    public t(float f6, float f10, float f11, float f12) {
        this.f247a = f6;
        this.f248b = f10;
        this.f249c = f11;
        this.f250d = f12;
    }

    @Override // a0.u
    public final float a(int i) {
        if (i == 0) {
            return this.f247a;
        }
        if (i == 1) {
            return this.f248b;
        }
        if (i == 2) {
            return this.f249c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f250d;
    }

    @Override // a0.u
    public final int b() {
        return 4;
    }

    @Override // a0.u
    public final u c() {
        return new t(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // a0.u
    public final void d() {
        this.f247a = 0.0f;
        this.f248b = 0.0f;
        this.f249c = 0.0f;
        this.f250d = 0.0f;
    }

    @Override // a0.u
    public final void e(int i, float f6) {
        if (i == 0) {
            this.f247a = f6;
            return;
        }
        if (i == 1) {
            this.f248b = f6;
        } else if (i == 2) {
            this.f249c = f6;
        } else {
            if (i != 3) {
                return;
            }
            this.f250d = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return tVar.f247a == this.f247a && tVar.f248b == this.f248b && tVar.f249c == this.f249c && tVar.f250d == this.f250d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f250d) + x.i.b(x.i.b(Float.hashCode(this.f247a) * 31, this.f248b, 31), this.f249c, 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f247a + ", v2 = " + this.f248b + ", v3 = " + this.f249c + ", v4 = " + this.f250d;
    }
    public static Object B(Object p1) { return null; }
    public Object f() { return null; }
}
