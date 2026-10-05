package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20a;

    @Override // a0.a0
    public final float a(float f6) {
        switch (this.f20a) {
            case k5.f.J /* 0 */:
                return f6;
            case 1:
                return (float) ((Math.cos((f6 + 1) * 3.141592653589793d) / 2.0f) + 0.5f);
            case 2:
                return f6 * f6;
            default:
                float f10 = 1.0f - f6;
                return 1.0f - (f10 * f10);
        }
    }

    public b0(Object... a) {
    }
}
