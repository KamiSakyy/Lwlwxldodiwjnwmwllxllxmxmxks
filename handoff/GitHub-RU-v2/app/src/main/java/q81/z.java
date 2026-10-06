package q81;

import androidx.compose.foundation.lazy.layout.t1;
import h91.j0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class z {
    public androidx.lifecycle.b a;
    public v b;
    public String d;
    public m e;
    public j0 h;
    public a0 i;
    public a0 j;
    public a0 k;
    public long l;
    public long m;
    public t1 n;
    public int c = -1;
    public c0 g = c0.r;
    public f0 o = f0.a;
    public ia.d f = new ia.d(4);

    public static void b(String str, a0 a0Var) {
        if (a0Var != null) {
            if (a0Var.z != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (a0Var.A != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (a0Var.B != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final a0 a() {
        int i = this.c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }
        androidx.lifecycle.b bVar = this.a;
        if (bVar == null) {
            throw new IllegalStateException("request == null");
        }
        v vVar = this.b;
        if (vVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new a0(bVar, vVar, str, i, this.e, this.f.e(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
        throw new IllegalStateException("message == null");
    }

    public Object d = null;
}
