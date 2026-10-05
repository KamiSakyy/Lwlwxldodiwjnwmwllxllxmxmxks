package i2;

import c2.c;
import com.google.android.gms.measurement.internal.x3;
import d2.a0;
import d2.r;
import k71.k;
import s3.m;
import v2.i0;
import y11.l;
import y41.t1;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b {

    /* renamed from: r, reason: collision with root package name */
    public l f25765r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25766s;

    /* renamed from: t, reason: collision with root package name */
    public d2.l f25767t;

    /* renamed from: u, reason: collision with root package name */
    public float f25768u = 1.0f;

    /* renamed from: v, reason: collision with root package name */
    public m f25769v = m.f31704r;

    public boolean d(float f6) {
        return false;
    }

    public boolean e(d2.l lVar) {
        return false;
    }

    public void f(m mVar) {
    }

    public final void g(i0 i0Var, long j10, float f6, d2.l lVar) {
        f2.b bVar = i0Var.f32526r;
        if (this.f25768u != f6) {
            if (!d(f6)) {
                if (f6 == 1.0f) {
                    l lVar2 = this.f25765r;
                    if (lVar2 != null) {
                        lVar2.c(f6);
                    }
                    this.f25766s = false;
                } else {
                    l lVar3 = this.f25765r;
                    if (lVar3 == null) {
                        lVar3 = a0.g();
                        this.f25765r = lVar3;
                    }
                    lVar3.c(f6);
                    this.f25766s = true;
                }
            }
            this.f25768u = f6;
        }
        if (!k.b(this.f25767t, lVar)) {
            if (!e(lVar)) {
                if (lVar == null) {
                    l lVar4 = this.f25765r;
                    if (lVar4 != null) {
                        lVar4.f((d2.l) null);
                    }
                    this.f25766s = false;
                } else {
                    l lVar5 = this.f25765r;
                    if (lVar5 == null) {
                        lVar5 = a0.g();
                        this.f25765r = lVar5;
                    }
                    lVar5.f(lVar);
                    this.f25766s = true;
                }
            }
            this.f25767t = lVar;
        }
        m layoutDirection = i0Var.getLayoutDirection();
        if (this.f25769v != layoutDirection) {
            f(layoutDirection);
            this.f25769v = layoutDirection;
        }
        int i = (int) (j10 >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (bVar.a() >> 32)) - Float.intBitsToFloat(i);
        int i10 = (int) (j10 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.a() & 4294967295L)) - Float.intBitsToFloat(i10);
        ((x3) bVar.f24208s.f486t).q(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f6 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i10) > 0.0f) {
                    if (this.f25766s) {
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        float intBitsToFloat4 = Float.intBitsToFloat(i10);
                        c c10 = t1.c(0L, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                        r t10 = bVar.f24208s.t();
                        l lVar6 = this.f25765r;
                        if (lVar6 == null) {
                            lVar6 = a0.g();
                            this.f25765r = lVar6;
                        }
                        try {
                            t10.i(c10, lVar6);
                            i(i0Var);
                            t10.q();
                        } catch (Throwable th) {
                            t10.q();
                            throw th;
                        }
                    } else {
                        i(i0Var);
                    }
                }
            } catch (Throwable th2) {
                ((x3) bVar.f24208s.f486t).q(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th2;
            }
        }
        ((x3) bVar.f24208s.f486t).q(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(i0 i0Var);

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class i0<T1,T2,T3,T4> {
        public i0() {
        }
    }
}
