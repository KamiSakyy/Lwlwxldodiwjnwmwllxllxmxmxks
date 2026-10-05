package a0;

/* loaded from: /home/user/work/p/classes.dex */
public interface e0 extends o {
    @Override // a0.o
    default i2 a(h2 h2Var) {
        return new m2(this);
    }

    long b(float f6, float f10, float f11);

    float c(float f6, float f10, float f11, long j10);

    default float d(float f6, float f10, float f11) {
        return c(f6, f10, f11, b(f6, f10, f11));
    }

    float e(float f6, float f10, float f11, long j10);
}
