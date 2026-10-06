package u81;

import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.measurement.internal.t0;
import h91.e0;
import h91.m0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import q81.a0;
import q81.d0;
import q81.v;
import q81.z;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c implements r, v81.d {
    public t81.e a;
    public t0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public m i;
    public o j;
    public d0 k;
    public List l;
    public androidx.lifecycle.b m;
    public int n;
    public boolean o;
    public volatile boolean p;
    public Socket q;
    public Socket r;
    public q81.m s;
    public v t;
    public l51.h u;
    public n v;

    public c(t81.e eVar, t0 t0Var, int i, int i2, int i3, int i4, int i5, boolean z, m mVar, o oVar, d0 d0Var, List list, androidx.lifecycle.b bVar, int i6, boolean z2) {
        k71.k.g(eVar, "taskRunner");
        k71.k.g(t0Var, "connectionPool");
        k71.k.g(d0Var, "route");
        this.a = eVar;
        this.b = t0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = mVar;
        this.j = oVar;
        this.k = d0Var;
        this.l = list;
        this.m = bVar;
        this.n = i6;
        this.o = z2;
    }

    @Override // u81.r
    public final boolean a() {
        return this.t != null;
    }

    @Override // u81.r
    public final r b() {
        return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    @Override // u81.r
    public final n c() {
        s21.a aVar = this.i.r.B;
        d0 d0Var = this.k;
        synchronized (aVar) {
            k71.k.g(d0Var, "route");
            ((LinkedHashSet) aVar.s).remove(d0Var);
        }
        n nVar = this.v;
        k71.k.d(nVar);
        k71.k.g(this.k, "route");
        p d = this.j.d(this, this.l);
        if (d != null) {
            return d.a;
        }
        synchronized (nVar) {
            t0 t0Var = this.b;
            t0Var.getClass();
            TimeZone timeZone = r81.g.a;
            ((ConcurrentLinkedQueue) t0Var.e).add(nVar);
            ((t81.c) t0Var.c).c((g91.e) t0Var.d, 0L);
            this.i.b(nVar);
        }
        return nVar;
    }

    @Override // u81.r, v81.d
    public final void cancel() {
        this.p = true;
        Socket socket = this.q;
        if (socket != null) {
            r81.g.c(socket);
        }
    }

    @Override // v81.d
    public final void d(m mVar, IOException iOException) {
    }

    @Override // u81.r
    public final q e() {
        Socket socket;
        Socket socket2;
        t0 t0Var = this.b;
        d0 d0Var = this.k;
        CopyOnWriteArrayList copyOnWriteArrayList = this.i.J;
        if (this.q != null) {
            throw new IllegalStateException("TCP already connected");
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                k71.k.g(d0Var.c, "inetSocketAddress");
                t0Var.getClass();
                i();
                z = true;
                q qVar = new q(this, (Throwable) null, 6);
                copyOnWriteArrayList.remove(this);
                return qVar;
            } catch (IOException e) {
                q81.a aVar = d0Var.a;
                if (d0Var.b.type() != Proxy.Type.DIRECT) {
                    q81.a aVar2 = d0Var.a;
                    aVar2.g.connectFailed(aVar2.h.h(), d0Var.b.address(), e);
                }
                k71.k.g(d0Var.c, "inetSocketAddress");
                t0Var.getClass();
                q qVar2 = new q(this, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z && (socket = this.q) != null) {
                    r81.g.c(socket);
                }
                return qVar2;
            }
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(this);
            if (!z && (socket2 = this.q) != null) {
                r81.g.c(socket2);
            }
            throw th;
        }
    }

    @Override // v81.d
    public final void f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0141 A[Catch: all -> 0x003e, TryCatch #9 {all -> 0x003e, blocks: (B:7:0x0024, B:9:0x0028, B:17:0x0047, B:20:0x004e, B:22:0x0052, B:24:0x005e, B:26:0x0062, B:28:0x006e, B:30:0x0091, B:33:0x00c6, B:36:0x00c9, B:39:0x00cc, B:42:0x00d8, B:45:0x00e2, B:48:0x00e6, B:50:0x00f1, B:58:0x0137, B:60:0x0141, B:63:0x0146, B:66:0x014b, B:68:0x014f, B:71:0x0158, B:74:0x015d, B:77:0x0163, B:97:0x011f, B:98:0x0122, B:118:0x00a3, B:119:0x00a6, B:120:0x00a7, B:121:0x00ae, B:122:0x00af, B:123:0x00b2, B:124:0x00b3, B:127:0x00c2, B:129:0x00c0), top: B:6:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016d  */
    @Override // u81.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q g() {
        c cVar;
        c cVar2;
        t0 t0Var;
        d0 d0Var;
        Socket socket;
        q81.m mVar;
        v vVar;
        l51.h hVar;
        c cVar3 = this.b;
        CopyOnWriteArrayList copyOnWriteArrayList = this.i.J;
        Socket socket2 = this.q;
        if (socket2 == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (a()) {
            throw new IllegalStateException("already connected");
        }
        d0 d0Var2 = this.k;
        q81.a aVar = d0Var2.a;
        InetSocketAddress inetSocketAddress = d0Var2.c;
        q81.a aVar2 = d0Var2.a;
        List list = aVar.j;
        copyOnWriteArrayList.add(this);
        boolean z = false;
        c cVar4 = null;
        try {
            try {
                if (this.m != null) {
                    q k = k();
                    if (k.c != null) {
                        copyOnWriteArrayList.remove(this);
                        Socket socket3 = this.r;
                        if (socket3 != null) {
                            r81.g.c(socket3);
                        }
                        r81.g.c(socket2);
                        return k;
                    }
                }
                if (aVar2.c != null) {
                    l51.h hVar2 = this.u;
                    if (hVar2 == null) {
                        k71.k.m("socket");
                        throw null;
                    }
                    if (((e0) hVar2.t).s.L()) {
                        l51.h hVar3 = this.u;
                        if (hVar3 == null) {
                            k71.k.m("socket");
                            throw null;
                        }
                        if (((h91.d0) hVar3.u).s.L()) {
                            SSLSocketFactory sSLSocketFactory = aVar2.c;
                            q81.o oVar = aVar2.h;
                            Socket createSocket = sSLSocketFactory.createSocket(socket2, oVar.d, oVar.e, true);
                            k71.k.e(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                            c m = m(list, sSLSocket);
                            q81.i iVar = (q81.i) list.get(m.n);
                            c l = m.l(list, sSLSocket);
                            try {
                                iVar.a(sSLSocket, m.o);
                                j(sSLSocket, iVar);
                                cVar2 = l;
                            } catch (IOException e) {
                                e = e;
                                cVar = cVar3;
                                cVar3 = null;
                                cVar4 = l;
                                k71.k.g(inetSocketAddress, "inetSocketAddress");
                                cVar.getClass();
                                if (this.h) {
                                    q qVar = new q(this, cVar4, e);
                                    copyOnWriteArrayList.remove(this);
                                    if (!z) {
                                    }
                                    return qVar;
                                }
                                cVar4 = cVar3;
                                q qVar2 = new q(this, cVar4, e);
                                copyOnWriteArrayList.remove(this);
                                if (!z) {
                                }
                                return qVar2;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.r = socket2;
                List list2 = aVar2.i;
                v vVar2 = v.x;
                if (!list2.contains(vVar2)) {
                    vVar2 = v.u;
                }
                this.t = vVar2;
                cVar2 = null;
                try {
                    try {
                        t81.e eVar = this.a;
                        try {
                            t0Var = this.b;
                            d0Var = this.k;
                            socket = this.r;
                            k71.k.d(socket);
                            try {
                                mVar = this.s;
                                vVar = this.t;
                                k71.k.d(vVar);
                                try {
                                    hVar = this.u;
                                } catch (IOException e2) {
                                    e = e2;
                                    cVar = cVar3;
                                    cVar3 = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                cVar = cVar3;
                                cVar3 = null;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            cVar = cVar3;
                            cVar3 = null;
                        }
                        try {
                            if (hVar == null) {
                                k71.k.m("socket");
                                throw null;
                            }
                            int i = this.g;
                            cVar3.getClass();
                            cVar = cVar3;
                            cVar3 = null;
                            n nVar = new n(eVar, t0Var, d0Var, socket2, socket, mVar, vVar, hVar, i);
                            this.v = nVar;
                            nVar.i();
                            k71.k.g(inetSocketAddress, "inetSocketAddress");
                            try {
                                q qVar3 = new q(this, (Throwable) null, 6);
                                copyOnWriteArrayList.remove(this);
                                return qVar3;
                            } catch (IOException e5) {
                                e = e5;
                                cVar4 = cVar2;
                                z = true;
                                k71.k.g(inetSocketAddress, "inetSocketAddress");
                                cVar.getClass();
                                if (this.h) {
                                }
                                cVar4 = cVar3;
                                q qVar22 = new q(this, cVar4, e);
                                copyOnWriteArrayList.remove(this);
                                if (!z) {
                                }
                                return qVar22;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                copyOnWriteArrayList.remove(this);
                                if (!z) {
                                    Socket socket4 = this.r;
                                    if (socket4 != null) {
                                        r81.g.c(socket4);
                                    }
                                    r81.g.c(socket2);
                                }
                                throw th;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            cVar4 = cVar2;
                            k71.k.g(inetSocketAddress, "inetSocketAddress");
                            cVar.getClass();
                            if (this.h && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                q qVar222 = new q(this, cVar4, e);
                                copyOnWriteArrayList.remove(this);
                                if (!z) {
                                    Socket socket5 = this.r;
                                    if (socket5 != null) {
                                        r81.g.c(socket5);
                                    }
                                    r81.g.c(socket2);
                                }
                                return qVar222;
                            }
                            cVar4 = cVar3;
                            q qVar2222 = new q(this, cVar4, e);
                            copyOnWriteArrayList.remove(this);
                            if (!z) {
                            }
                            return qVar2222;
                        }
                    } catch (IOException e7) {
                        e = e7;
                        cVar = cVar3;
                        cVar3 = null;
                    }
                } catch (IOException e8) {
                    e = e8;
                    cVar = cVar3;
                    cVar3 = null;
                }
            } catch (IOException e9) {
                e = e9;
                cVar = cVar3;
                cVar3 = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // v81.d
    public final d0 h() {
        return this.k;
    }

    public final void i() {
        Socket createSocket;
        Proxy.Type type = this.k.b.type();
        int i = type == null ? -1 : b.a[type.ordinal()];
        if (i == 1 || i == 2) {
            createSocket = this.k.a.b.createSocket();
            k71.k.d(createSocket);
        } else {
            createSocket = new Socket(this.k.b);
        }
        this.q = createSocket;
        if (this.p) {
            throw new IOException("canceled");
        }
        createSocket.setSoTimeout(this.f);
        try {
            a91.e eVar = a91.e.a;
            a91.e.a.f(createSocket, this.k.c, this.e);
            try {
                this.u = new l51.h(new w51.r(createSocket));
            } catch (NullPointerException e) {
                if (k71.k.b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.k.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, q81.i iVar) {
        String str;
        v vVar;
        q81.a aVar = this.k.a;
        try {
            if (iVar.b) {
                a91.e eVar = a91.e.a;
                a91.e.a.e(sSLSocket, aVar.h.d, aVar.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            k71.k.d(session);
            q81.m q = z3.q(session);
            HostnameVerifier hostnameVerifier = aVar.d;
            k71.k.d(hostnameVerifier);
            if (hostnameVerifier.verify(aVar.h.d, session)) {
                q81.f fVar = aVar.e;
                k71.k.d(fVar);
                this.s = new q81.m(q.a, q.b, q.c, new com.github.rudroid.actions.workflowruns.ui.e(fVar, q, aVar, 24));
                k71.k.g(aVar.h.d, "hostname");
                Iterator it = fVar.a.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (iVar.b) {
                    a91.e eVar2 = a91.e.a;
                    str = a91.e.a.g(sSLSocket);
                } else {
                    str = null;
                }
                this.r = sSLSocket;
                this.u = new l51.h(new w51.r(sSLSocket));
                if (str != null) {
                    v.s.getClass();
                    vVar = q81.b.e(str);
                } else {
                    vVar = v.u;
                }
                this.t = vVar;
                a91.e eVar3 = a91.e.a;
                a91.e.a.getClass();
                return;
            }
            List a = q.a();
            if (a.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + aVar.h.d + " not verified (no certificates)");
            }
            Object obj = a.get(0);
            k71.k.e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(aVar.h.d);
            sb.append(" not verified:\n            |    certificate: ");
            q81.f fVar2 = q81.f.c;
            StringBuilder sb2 = new StringBuilder("sha256/");
            h91.k kVar = h91.k.u;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            k71.k.f(encoded, "getEncoded(...)");
            sb2.append(c30.d.f(encoded).c("SHA-256").a());
            sb.append(sb2.toString());
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(x61.m.l0(e91.c.a(x509Certificate, 7), e91.c.a(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(t71.q.s(sb.toString()));
        } catch (Throwable th) {
            a91.e eVar4 = a91.e.a;
            a91.e.a.getClass();
            r81.g.c(sSLSocket);
            throw th;
        }
    }

    public final q k() {
        androidx.lifecycle.b bVar = this.m;
        k71.k.d(bVar);
        d0 d0Var = this.k;
        String str = "CONNECT " + r81.g.i(d0Var.a.h, true) + " HTTP/1.1";
        l51.h hVar = this.u;
        if (hVar == null) {
            k71.k.m("socket");
            throw null;
        }
        w81.f fVar = new w81.f(null, this, hVar);
        l51.h hVar2 = this.u;
        if (hVar2 == null) {
            k71.k.m("socket");
            throw null;
        }
        m0 b = ((e0) hVar2.t).r.b();
        long j = this.c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b.g(j, timeUnit);
        l51.h hVar3 = this.u;
        if (hVar3 == null) {
            k71.k.m("socket");
            throw null;
        }
        ((h91.d0) hVar3.u).r.b().g(this.d, timeUnit);
        fVar.l((q81.n) bVar.d, str);
        fVar.a();
        z e = fVar.e(false);
        k71.k.d(e);
        e.a = bVar;
        a0 a = e.a();
        int i = a.u;
        long e2 = r81.g.e(a);
        if (e2 != -1) {
            w81.d k = fVar.k((q81.o) a.r.b, e2);
            r81.g.g(k, Integer.MAX_VALUE);
            k.close();
        }
        if (i == 200) {
            return new q(this, (Throwable) null, 6);
        }
        if (i != 407) {
            throw new IOException(no.a.k("Unexpected response code for CONNECT: ", i));
        }
        d0Var.a.f.getClass();
        throw new IOException("Failed to authenticate with proxy");
    }

    public final c l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        k71.k.g(list, "connectionSpecs");
        int i = this.n;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            q81.i iVar = (q81.i) list.get(i2);
            iVar.getClass();
            if (iVar.a && (((strArr = iVar.d) == null || r81.e.f(strArr, sSLSocket.getEnabledProtocols(), z61.a.b)) && ((strArr2 = iVar.c) == null || r81.e.f(strArr2, sSLSocket.getEnabledCipherSuites(), q81.h.c)))) {
                return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, i2, i != -1);
            }
        }
        return null;
    }

    public final c m(List list, SSLSocket sSLSocket) {
        k71.k.g(list, "connectionSpecs");
        if (this.n != -1) {
            return this;
        }
        c l = l(list, sSLSocket);
        if (l != null) {
            return l;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.o);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        k71.k.d(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        k71.k.f(arrays, "toString(...)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }
}
