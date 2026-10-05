package androidx.constraintlayout.core.state;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2133a;

    /* renamed from: b, reason: collision with root package name */
    public String f2134b;

    /* renamed from: c, reason: collision with root package name */
    public String f2135c;

    /* renamed from: d, reason: collision with root package name */
    public float f2136d;

    /* renamed from: e, reason: collision with root package name */
    public float f2137e;

    @Override // androidx.constraintlayout.core.state.d
    public final float value() {
        float f6 = this.f2136d;
        if (f6 >= this.f2137e) {
            this.f2133a = true;
        }
        if (!this.f2133a) {
            this.f2136d = f6 + 1.0f;
        }
        return this.f2136d;
    }
}
