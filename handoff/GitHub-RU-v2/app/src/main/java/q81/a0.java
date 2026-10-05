package q81;

import androidx.compose.foundation.lazy.layout.t1;
import h91.j0;
import java.io.Closeable;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a0 implements Closeable {
    public final a0 A;
    public final a0 B;
    public final long C;
    public final long D;
    public final t1 E;
    public final f0 F;
    public c G;
    public final boolean H;
    public final androidx.lifecycle.b r;
    public final v s;
    public final String t;
    public final int u;
    public final m v;
    public final n w;
    public final c0 x;
    public final j0 y;
    public final a0 z;

    public a0(androidx.lifecycle.b bVar, v vVar, String str, int i, m mVar, n nVar, c0 c0Var, j0 j0Var, a0 a0Var, a0 a0Var2, a0 a0Var3, long j, long j2, t1 t1Var, f0 f0Var) {
        k71.k.g(bVar, "request");
        k71.k.g(vVar, "protocol");
        k71.k.g(str, "message");
        k71.k.g(c0Var, "body");
        k71.k.g(f0Var, "trailersSource");
        this.r = bVar;
        this.s = vVar;
        this.t = str;
        this.u = i;
        this.v = mVar;
        this.w = nVar;
        this.x = c0Var;
        this.y = j0Var;
        this.z = a0Var;
        this.A = a0Var2;
        this.B = a0Var3;
        this.C = j;
        this.D = j2;
        this.E = t1Var;
        this.F = f0Var;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.H = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.x.close();
    }

    public final z f() {
        z zVar = new z();
        zVar.c = -1;
        zVar.g = c0.r;
        zVar.o = f0.a;
        zVar.a = this.r;
        zVar.b = this.s;
        zVar.c = this.u;
        zVar.d = this.t;
        zVar.e = this.v;
        zVar.f = this.w.d();
        zVar.g = this.x;
        zVar.h = this.y;
        zVar.i = this.z;
        zVar.j = this.A;
        zVar.k = this.B;
        zVar.l = this.C;
        zVar.m = this.D;
        zVar.n = this.E;
        zVar.o = this.F;
        return zVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.s + ", code=" + this.u + ", message=" + this.t + ", url=" + ((o) this.r.b) + '}';
    }

}
