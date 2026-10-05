package d2;

import android.graphics.Paint;
import android.graphics.Shader;
import com.google.android.gms.measurement.internal.x3;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class n0 extends p {

    /* renamed from: a, reason: collision with root package name */
    public x3 f21371a;

    /* renamed from: b, reason: collision with root package name */
    public long f21372b = 9205357640488583168L;

    @Override // d2.p
    public final void a(float f6, long j10, y11.l lVar) {
        x3 x3Var = this.f21371a;
        if (x3Var == null || !c2.e.b(this.f21372b, j10)) {
            if (c2.e.f(j10)) {
                this.f21371a = null;
                this.f21372b = 9205357640488583168L;
                x3Var = null;
            } else {
                x3Var = this.f21371a;
                if (x3Var == null) {
                    x3Var = new x3(2, false);
                    this.f21371a = x3Var;
                }
                x3Var.s = b(j10);
                this.f21371a = x3Var;
                this.f21372b = j10;
            }
        }
        long c10 = a0.c(((Paint) lVar.b).getColor());
        long j11 = t.f21381b;
        if (!t.c(c10, j11)) {
            lVar.e(j11);
        }
        if (!k71.k.b((Shader) lVar.c, x3Var != null ? (Shader) x3Var.s : null)) {
            lVar.h(x3Var != null ? (Shader) x3Var.s : null);
        }
        if (r8.getAlpha() / 255.0f == f6) {
            return;
        }
        lVar.c(f6);
    }

    public abstract Shader b(long j10);
}
