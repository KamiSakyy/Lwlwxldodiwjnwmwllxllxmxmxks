package h0;

/* loaded from: /home/user/work/p/classes.dex */
public class s implements q {
    @Override // h0.q
    public final float a(float f6, float f10, float f11) {
        float abs = Math.abs((f10 + f6) - f6);
        float f12 = (0.3f * f11) - (0.0f * abs);
        float f13 = f11 - f12;
        if ((abs <= f11) && f13 < abs) {
            f12 = f11 - abs;
        }
        return f6 - f12;
    }
}
