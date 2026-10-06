package com.github.rudroid.uitoolkit;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 extends i2.b {
    public float w;
    public long x;
    public long y;
    public final float z = 2;
    public final long A = 9205357640488583168L;

    public m1(float f, long j, long j2) {
        this.w = f;
        this.x = j;
        this.y = j2;
    }

    public final long h() {
        return this.A;
    }

    public final void i(v2.i0 i0Var) {
        float f = this.w * 360.0f;
        f2.b bVar = i0Var.r;
        long a = bVar.a();
        float f2 = this.z;
        f2.d.o0(i0Var, this.x, f, 360.0f, false, 0L, a, 0.0f, new f2.h(i0Var.W(f2), 0.0f, 0, 0, 30), 848);
        f2.d.o0(i0Var, this.y, 270.0f, f, false, 0L, bVar.a(), 0.0f, new f2.h(i0Var.W(f2), 0.0f, 0, 0, 30), 848);
    }
}
