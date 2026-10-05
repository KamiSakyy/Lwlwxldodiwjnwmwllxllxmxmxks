package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class q extends u {

    /* renamed from: a, reason: collision with root package name */
    public float f209a;

    public q(float f6) {
        this.f209a = f6;
    }

    @Override // a0.u
    public final float a(int i) {
        if (i == 0) {
            return this.f209a;
        }
        return 0.0f;
    }

    @Override // a0.u
    public final int b() {
        return 1;
    }

    @Override // a0.u
    public final u c() {
        return new q(0.0f);
    }

    @Override // a0.u
    public final void d() {
        this.f209a = 0.0f;
    }

    @Override // a0.u
    public final void e(int i, float f6) {
        if (i == 0) {
            this.f209a = f6;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && ((q) obj).f209a == this.f209a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f209a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f209a;
    }
}
