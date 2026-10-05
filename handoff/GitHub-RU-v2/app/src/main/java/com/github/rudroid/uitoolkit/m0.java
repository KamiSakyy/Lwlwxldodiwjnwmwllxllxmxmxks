package com.github.rudroid.uitoolkit;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 extends i2.b {
    public final float A;
    public final long B;
    public final float w;
    public final long x;
    public final long y;
    public final long z;

    public m0(float f, long j, long j2, long j3, float f2, int i) {
        f2 = (i & 16) != 0 ? 2 : f2;
        this.w = f;
        this.x = j;
        this.y = j2;
        this.z = j3;
        this.A = f2;
        this.B = 9205357640488583168L;
    }

    public final long h() {
        return this.B;
    }

    public final void i(v2.i0 i0Var) {
        float f = this.w;
        float f2 = f * 360.0f;
        f2.b bVar = i0Var.r;
        long a = bVar.a();
        float f3 = this.A;
        f2.d.o0(i0Var, this.x, 270.0f, 360.0f, false, 0L, a, 0.0f, new f2.h(i0Var.W(f3), 0.0f, 0, 0, 30), 848);
        if (f > 0.0f) {
            f2.d.o0(i0Var, this.z, 270.0f, f2, true, 0L, bVar.a(), 0.0f, (f2.h) null, 976);
            f2.d.o0(i0Var, this.y, i0Var.W(f3) + 270.0f, f2 - (i0Var.W(f3) * 2), false, 0L, bVar.a(), 0.0f, new f2.h(i0Var.W(f3), 0.0f, 1, 0, 26), 848);
        }
    }
}
