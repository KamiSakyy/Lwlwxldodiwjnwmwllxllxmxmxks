package x81;

import androidx.compose.foundation.lazy.layout.o1;
import h91.i0;
import h91.j0;
import h91.k0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import sy.e0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class p implements v81.e {
    public static final List g = r81.g.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = r81.g.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final u81.n a;
    public final n0.w b;
    public final o c;
    public volatile w d;
    public final q81.v e;
    public volatile boolean f;

    public p(q81.u uVar, u81.n nVar, n0.w wVar, o oVar) {
        k71.k.g(oVar, "http2Connection");
        this.a = nVar;
        this.b = wVar;
        this.c = oVar;
        List list = uVar.r;
        q81.v vVar = q81.v.x;
        this.e = list.contains(vVar) ? vVar : q81.v.w;
    }

    @Override // v81.e
    public final void a() {
        w wVar = this.d;
        k71.k.d(wVar);
        wVar.z.close();
    }

    @Override // v81.e
    public final boolean b() {
        boolean z;
        w wVar = this.d;
        if (wVar == null) {
            return false;
        }
        synchronized (wVar) {
            u uVar = wVar.y;
            if (uVar.s) {
                if (uVar.u.L()) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    @Override // v81.e
    public final k0 c(q81.a0 a0Var) {
        w wVar = this.d;
        k71.k.d(wVar);
        return wVar.y;
    }

    @Override // v81.e
    public final void cancel() {
        this.f = true;
        w wVar = this.d;
        if (wVar != null) {
            wVar.g(a.y);
        }
    }

    @Override // v81.e
    public final long d(q81.a0 a0Var) {
        if (v81.f.a(a0Var)) {
            return r81.g.e(a0Var);
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r3 == false) goto L20;
     */
    @Override // v81.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q81.z e(boolean z) {
        int i;
        q81.n nVar;
        boolean z2;
        w wVar = this.d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            while (true) {
                i = 0;
                if (!wVar.w.isEmpty() || wVar.h() != null) {
                    break;
                }
                if (!z) {
                    wVar.s.getClass();
                    t tVar = wVar.z;
                    if (!tVar.t && !tVar.r) {
                        z2 = false;
                    }
                    z2 = true;
                }
                i = 1;
                if (i != 0) {
                    wVar.A.i();
                }
                try {
                    try {
                        wVar.wait();
                        if (i != 0) {
                            wVar.A.m();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (i != 0) {
                        wVar.A.m();
                    }
                    throw th;
                }
            }
            if (wVar.w.isEmpty()) {
                IOException iOException = wVar.D;
                if (iOException != null) {
                    throw iOException;
                }
                a h2 = wVar.h();
                k71.k.d(h2);
                throw new StreamResetException(h2);
            }
            Object removeFirst = wVar.w.removeFirst();
            k71.k.f(removeFirst, "removeFirst(...)");
            nVar = (q81.n) removeFirst;
        }
        q81.v vVar = this.e;
        k71.k.g(vVar, "protocol");
        ia.d dVar = new ia.d(4);
        int size = nVar.size();
        o1 o1Var = null;
        while (i < size) {
            String b = nVar.b(i);
            String e = nVar.e(i);
            if (b.equals(":status")) {
                o1Var = e0.l("HTTP/1.1 ".concat(e));
            } else if (!h.contains(b)) {
                dVar.b(b, e);
            }
            i++;
        }
        if (o1Var == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        q81.z zVar = new q81.z();
        zVar.b = vVar;
        zVar.c = o1Var.b;
        zVar.d = (String) o1Var.d;
        zVar.f = dVar.e().d();
        if (z && zVar.c == 100) {
            return null;
        }
        return zVar;
    }

    @Override // v81.e
    public final void f() {
        this.c.flush();
    }

    @Override // v81.e
    public final j0 g() {
        w wVar = this.d;
        k71.k.d(wVar);
        return wVar;
    }

    @Override // v81.e
    public final v81.d h() {
        return this.a;
    }

    @Override // v81.e
    public final i0 i(androidx.lifecycle.b bVar, long j) {
        k71.k.g(bVar, "request");
        w wVar = this.d;
        k71.k.d(wVar);
        return wVar.z;
    }

    @Override // v81.e
    public final void j(androidx.lifecycle.b bVar) {
        int i;
        w wVar;
        boolean z;
        k71.k.g(bVar, "request");
        if (this.d != null) {
            return;
        }
        boolean z2 = ((q81.y) bVar.e) != null;
        q81.n nVar = (q81.n) bVar.d;
        ArrayList arrayList = new ArrayList(nVar.size() + 4);
        arrayList.add(new c(c.f, (String) bVar.c));
        h91.k kVar = c.g;
        q81.o oVar = (q81.o) bVar.b;
        k71.k.g(oVar, "url");
        String b = oVar.b();
        String d = oVar.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new c(kVar, b));
        String a = ((q81.n) bVar.d).a("Host");
        if (a != null) {
            arrayList.add(new c(c.i, a));
        }
        arrayList.add(new c(c.h, oVar.a));
        int size = nVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = nVar.b(i2);
            Locale locale = Locale.US;
            k71.k.f(locale, "US");
            String lowerCase = b2.toLowerCase(locale);
            k71.k.f(lowerCase, "toLowerCase(...)");
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && nVar.e(i2).equals("trailers"))) {
                arrayList.add(new c(lowerCase, nVar.e(i2)));
            }
        }
        o oVar2 = this.c;
        oVar2.getClass();
        boolean z3 = !z2;
        synchronized (oVar2.O) {
            synchronized (oVar2) {
                try {
                    if (oVar2.v > 1073741823) {
                        oVar2.t(a.x);
                    }
                    if (oVar2.w) {
                        throw new ConnectionShutdownException();
                    }
                    i = oVar2.v;
                    oVar2.v = i + 2;
                    wVar = new w(i, oVar2, z3, false, null);
                    z = !z2 || oVar2.L >= oVar2.M || wVar.u >= wVar.v;
                    if (wVar.j()) {
                        oVar2.s.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar2.O.A(z3, i, arrayList);
        }
        if (z) {
            oVar2.O.flush();
        }
        this.d = wVar;
        if (this.f) {
            w wVar2 = this.d;
            k71.k.d(wVar2);
            wVar2.g(a.y);
            throw new IOException("Canceled");
        }
        w wVar3 = this.d;
        k71.k.d(wVar3);
        v vVar = wVar3.A;
        long j = this.b.d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j, timeUnit);
        w wVar4 = this.d;
        k71.k.d(wVar4);
        wVar4.B.g(this.b.e, timeUnit);
    }
}
