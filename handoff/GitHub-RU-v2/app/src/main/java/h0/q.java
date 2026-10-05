package h0;

/* loaded from: /home/user/work/p/classes.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name */
    public static final p f25151a = p.f25121a;

    default float a(float f6, float f10, float f11) {
        f25151a.getClass();
        float f12 = f10 + f6;
        if ((f6 >= 0.0f && f12 <= f11) || (f6 < 0.0f && f12 > f11)) {
            return 0.0f;
        }
        float f13 = f12 - f11;
        return Math.abs(f6) < Math.abs(f13) ? f6 : f13;
    }





}
