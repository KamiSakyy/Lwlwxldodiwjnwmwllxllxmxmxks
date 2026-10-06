package u81;

import com.google.android.gms.measurement.internal.t0;
import h91.e0;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import q81.d0;
import q81.u;
import q81.vShadow;
import x81.a0;
import x81.w;
import x81.x;

/* loaded from: /home/user/work/p/classes5.dex */
public final class n extends x81.l implements v81.d {
    public t81.e b;
    public d0 c;
    public Socket d;
    public Socket e;
    public q81.m f;
    public vShadow g;
    public l51.h h;
    public int i;
    public x81.o j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public ArrayList q;
    public long r;

    public n(t81.e eVar, t0 t0Var, d0 d0Var, Socket socket, Socket socket2, q81.m mVar, vShadow vVar, l51.h hVar, int i) {
        k71.k.g(eVar, "taskRunner");
        k71.k.g(t0Var, "connectionPool");
        k71.k.g(d0Var, "route");
        k71.k.g(socket, "rawSocket");
        k71.k.g(socket2, "javaNetSocket");
        k71.k.g(vVar, "protocol");
        k71.k.g(hVar, "socket");
        this.b = eVar;
        this.c = d0Var;
        this.d = socket;
        this.e = socket2;
        this.f = mVar;
        this.g = vVar;
        this.h = hVar;
        this.i = i;
        this.p = 1;
        this.q = new ArrayList();
        this.r = Long.MAX_VALUE;
    }

    public static void c(u uVar, d0 d0Var, IOException iOException) {
        k71.k.g(d0Var, "failedRoute");
        k71.k.g(iOException, "failure");
        if (d0Var.b.type() != Proxy.Type.DIRECT) {
            q81.a aVar = d0Var.a;
            aVar.g.connectFailed(aVar.h.h(), d0Var.b.address(), iOException);
        }
        s21.a aVar2 = uVar.B;
        synchronized (aVar2) {
            ((LinkedHashSet) aVar2.s).add(d0Var);
        }
    }

    @Override // x81.l
    public final void a(x81.o oVar, a0 a0Var) {
        k71.k.g(a0Var, "settings");
        synchronized (this) {
            this.p = (a0Var.a & 8) != 0 ? a0Var.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // x81.l
    public final void b(w wVar) {
        wVar.e(x81.a.x, null);
    }

    @Override // v81.d
    public final void cancel() {
        r81.g.c(this.d);
    }

    @Override // v81.d
    public final void d(m mVar, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.j != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.k = true;
                        if (this.n == 0) {
                            if (iOException != null) {
                                c(mVar.r, this.c, iOException);
                            }
                            this.m++;
                        }
                    }
                } else if (((StreamResetException) iOException).r == x81.a.x) {
                    int i = this.o + 1;
                    this.o = i;
                    if (i > 1) {
                        this.k = true;
                        this.m++;
                    }
                } else if (((StreamResetException) iOException).r != x81.a.y || !mVar.H) {
                    this.k = true;
                    this.m++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        if (e91.c.c(r6, (java.security.cert.X509Certificate) r12) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(q81.a aVar, List list) {
        q81.o oVar = aVar.h;
        TimeZone timeZone = r81.g.a;
        if (this.q.size() < this.p && !this.k) {
            d0 d0Var = this.c;
            q81.a aVar2 = d0Var.a;
            q81.a aVar3 = d0Var.a;
            if (aVar2.a(aVar)) {
                String str = oVar.d;
                String str2 = oVar.d;
                if (k71.k.b(str, aVar3.h.d)) {
                    return true;
                }
                if (this.j != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        d0 d0Var2 = (d0) it.next();
                        Proxy.Type type = d0Var2.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && d0Var.b.type() == type2 && k71.k.b(d0Var.c, d0Var2.c)) {
                            if (aVar.d == e91.c.a) {
                                TimeZone timeZone2 = r81.g.a;
                                q81.o oVar2 = aVar3.h;
                                if (oVar.e == oVar2.e) {
                                    boolean b = k71.k.b(str2, oVar2.d);
                                    q81.m mVar = this.f;
                                    if (!b) {
                                        if (!this.l && mVar != null) {
                                            List a = mVar.a();
                                            if (!a.isEmpty()) {
                                                Object obj = a.get(0);
                                                k71.k.e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            }
                                        }
                                    }
                                    try {
                                        q81.f fVar = aVar.e;
                                        k71.k.d(fVar);
                                        k71.k.d(mVar);
                                        List a2 = mVar.a();
                                        k71.k.g(str2, "hostname");
                                        k71.k.g(a2, "peerCertificates");
                                        Iterator it2 = fVar.a.iterator();
                                        if (!it2.hasNext()) {
                                            return true;
                                        }
                                        it2.next().getClass();
                                        throw new ClassCastException();
                                    } catch (SSLPeerUnverifiedException unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // v81.d
    public final void f() {
        synchronized (this) {
            this.k = true;
        }
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = r81.g.a;
        long nanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        x81.o oVar = this.j;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.w) {
                    return false;
                }
                if (oVar.F < oVar.E) {
                    if (nanoTime >= oVar.G) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.r;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        e0 e0Var = (e0) this.h.t;
        k71.k.g(socket, "<this>");
        k71.k.g(e0Var, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !e0Var.L();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // v81.d
    public final d0 h() {
        return this.c;
    }

    public final void i() {
        this.r = System.nanoTime();
        vShadow vVar = this.g;
        if (vVar == vShadow.w || vVar == vShadow.x) {
            this.e.setSoTimeout(0);
            x81.b bVar = x81.b.a;
            t81.e eVar = this.b;
            k71.k.g(eVar, "taskRunner");
            l7.b bVar2 = new l7.b();
            bVar2.b = eVar;
            bVar2.e = x81.l.a;
            bVar2.f = x81.b.a;
            l51.h hVar = this.h;
            String str = this.c.a.h.d;
            k71.k.g(hVar, "socket");
            k71.k.g(str, "peerName");
            bVar2.c = hVar;
            String str2 = r81.g.b + ' ' + str;
            k71.k.g(str2, "<set-?>");
            bVar2.d = str2;
            bVar2.e = this;
            bVar2.a = this.i;
            bVar2.f = bVar;
            x81.o oVar = new x81.o(bVar2);
            this.j = oVar;
            a0 a0Var = x81.o.R;
            this.p = (a0Var.a & 8) != 0 ? a0Var.b[3] : Integer.MAX_VALUE;
            x xVar = oVar.O;
            synchronized (xVar) {
                try {
                    if (xVar.u) {
                        throw new IOException("closed");
                    }
                    Logger logger = x.w;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(r81.g.d(">> CONNECTION " + x81.g.a.e(), new Object[0]));
                    }
                    xVar.r.p(x81.g.a);
                    xVar.r.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            x xVar2 = oVar.O;
            a0 a0Var2 = oVar.I;
            xVar2.getClass();
            k71.k.g(a0Var2, "settings");
            synchronized (xVar2) {
                try {
                    if (xVar2.u) {
                        throw new IOException("closed");
                    }
                    xVar2.r(0, Integer.bitCount(a0Var2.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & a0Var2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            xVar2.r.writeShort(i);
                            xVar2.r.writeInt(a0Var2.b[i]);
                        }
                    }
                    xVar2.r.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (oVar.I.a() != 65535) {
                oVar.O.K(0, r2 - 65535);
            }
            t81.c.b(oVar.x.d(), oVar.t, 0L, oVar.P, 6);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        d0 d0Var = this.c;
        sb.append(d0Var.a.h.d);
        sb.append(':');
        sb.append(d0Var.a.h.e);
        sb.append(", proxy=");
        sb.append(d0Var.b);
        sb.append(" hostAddress=");
        sb.append(d0Var.c);
        sb.append(" cipherSuite=");
        q81.m mVar = this.f;
        if (mVar == null || (obj = mVar.b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
    public Object s = null;
    public Object y = null;
}
