package w81;

import androidx.compose.foundation.lazy.layout.o1;
import com.google.android.gms.internal.measurement.b4;
import h91.d0;
import h91.e0;
import h91.i0Shadow;
import h91.j;
import h91.j0;
import h91.k0;
import h91.l;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import k71.k;
import l51.h;
import q81.a0;
import q81.n;
import q81.o;
import q81.u;
import q81.v;
import q81.z;
import r81.g;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f implements v81.e {
    public static final n f;
    public final u a;
    public final v81.d b;
    public final h c;
    public int d;
    public final ba.c e;

    static {
        n nVar = n.s;
        f = b4.Z(new String[]{"OkHttp-Response-Body", "Truncated"});
    }

    public f(u uVar, v81.d dVar, h hVar) {
        k.g(hVar, "socket");
        this.a = uVar;
        this.b = dVar;
        this.c = hVar;
        this.e = new ba.c((e0) hVar.t);
    }

    @Override // v81.e
    public final void a() {
        ((d0) this.c.u).flush();
    }

    @Override // v81.e
    public final boolean b() {
        return this.d == 6;
    }

    @Override // v81.e
    public final k0 c(a0 a0Var) {
        androidx.lifecycle.b bVar = a0Var.r;
        if (!v81.f.a(a0Var)) {
            return k((o) bVar.b, 0L);
        }
        String a = a0Var.w.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        if ("chunked".equalsIgnoreCase(a)) {
            o oVar = (o) bVar.b;
            if (this.d == 4) {
                this.d = 5;
                return new c(this, oVar);
            }
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        long e = g.e(a0Var);
        if (e != -1) {
            return k((o) bVar.b, e);
        }
        o oVar2 = (o) bVar.b;
        if (this.d != 4) {
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        this.d = 5;
        this.b.f();
        k.g(oVar2, "url");
        return new e(this, oVar2);
    }

    @Override // v81.e
    public final void cancel() {
        this.b.cancel();
    }

    @Override // v81.e
    public final long d(a0 a0Var) {
        if (!v81.f.a(a0Var)) {
            return 0L;
        }
        String a = a0Var.w.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        if ("chunked".equalsIgnoreCase(a)) {
            return -1L;
        }
        return g.e(a0Var);
    }

    @Override // v81.e
    public final z e(boolean z) {
        ba.c cVar = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        try {
            String P = ((j) cVar.t).P(cVar.s);
            cVar.s -= P.length();
            o1 l = sy.e0.l(P);
            int i2 = l.b;
            z zVar = new z();
            zVar.b = (v) l.c;
            zVar.c = i2;
            zVar.d = (String) l.d;
            zVar.f = cVar.l().d();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return zVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return zVar;
            }
            this.d = 3;
            return zVar;
        } catch (EOFException e) {
            throw new IOException(f1.e.g("unexpected end of stream on ", this.b.h().a.h.g()), e);
        }
    }

    @Override // v81.e
    public final void f() {
        ((d0) this.c.u).flush();
    }

    @Override // v81.e
    public final j0 g() {
        return this.c;
    }

    @Override // v81.e
    public final v81.d h() {
        return this.b;
    }

    @Override // v81.e
    public final i0 i(androidx.lifecycle.b bVar, long j) {
        k.g(bVar, "request");
        if ("chunked".equalsIgnoreCase(((n) bVar.d).a("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new b(this);
            }
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.d == 1) {
            this.d = 2;
            return new l(this);
        }
        throw new IllegalStateException(("state: " + this.d).toString());
    }

    @Override // v81.e
    public final void j(androidx.lifecycle.b bVar) {
        k.g(bVar, "request");
        Proxy.Type type = this.b.h().b.type();
        k.f(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append((String) bVar.c);
        sb.append(' ');
        o oVar = (o) bVar.b;
        if (k.b(oVar.a, "https") || type != Proxy.Type.HTTP) {
            String b = oVar.b();
            String d = oVar.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        } else {
            sb.append(oVar);
        }
        sb.append(" HTTP/1.1");
        l((n) bVar.d, sb.toString());
    }

    public final d k(o oVar, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new d(this, oVar, j);
        }
        throw new IllegalStateException(("state: " + this.d).toString());
    }

    public final void l(n nVar, String str) {
        k.g(nVar, "headers");
        k.g(str, "requestLine");
        if (this.d != 0) {
            throw new IllegalStateException(("state: " + this.d).toString());
        }
        h hVar = this.c;
        d0 d0Var = (d0) hVar.u;
        d0 d0Var2 = (d0) hVar.u;
        d0Var.d0(str);
        d0Var.d0("\r\n");
        int size = nVar.size();
        for (int i = 0; i < size; i++) {
            d0Var2.d0(nVar.b(i));
            d0Var2.d0(": ");
            d0Var2.d0(nVar.e(i));
            d0Var2.d0("\r\n");
        }
        d0Var2.d0("\r\n");
        this.d = 1;
    }
}
