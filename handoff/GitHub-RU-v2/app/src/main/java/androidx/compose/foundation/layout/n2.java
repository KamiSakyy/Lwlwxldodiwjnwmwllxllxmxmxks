package androidx.compose.foundation.layout;

/* loaded from: /home/user/work/p/classes.dex */
public final class n2 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final n2 f1204a = new n2();

    @Override // androidx.compose.foundation.layout.m2
    public final w1.r a(w1.r rVar, float f6, boolean z10) {
        if (f6 <= 0.0d) {
            l0.a.a("invalid weight; must be greater than zero");
        }
        if (f6 > Float.MAX_VALUE) {
            f6 = Float.MAX_VALUE;
        }
        return rVar.f(new w1(f6, z10));
    }

    public static androidx.compose.foundation.layout.n2 a;
}
