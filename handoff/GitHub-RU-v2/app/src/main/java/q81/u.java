package q81;

import androidx.lifecycle.l1;
import java.net.ProtocolException;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u implements d, g0 {
    public static final List E = r81.g.k(new vShadow[]{v.w, v.u});
    public static final List F = r81.g.k(new i[]{i.e, i.f});
    public long A;
    public s21.a B;
    public t81.e C;
    public kk.a D;
    public w51.r a;
    public List b;
    public List c;
    public m11.r d;
    public boolean e;
    public boolean f;
    public b g;
    public boolean h;
    public boolean i;
    public b j;
    public b k;
    public ProxySelector l;
    public b m;
    public SocketFactory n;
    public SSLSocketFactory o;
    public X509TrustManager p;
    public List q;
    public List r;
    public e91.c s;
    public f t;
    public m7.y u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(t tVar) {
        List list;
        this.a = tVar.a;
        this.b = r81.g.j(tVar.c);
        this.c = r81.g.j(tVar.d);
        this.d = tVar.e;
        this.e = tVar.f;
        this.f = tVar.g;
        this.g = tVar.h;
        this.h = tVar.i;
        this.i = tVar.j;
        this.j = tVar.k;
        this.k = tVar.l;
        ProxySelector proxySelector = tVar.m;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = c91.a.a;
        }
        this.l = proxySelector;
        this.m = tVar.n;
        this.n = tVar.o;
        List list2 = tVar.r;
        this.q = list2;
        this.r = tVar.s;
        this.s = tVar.t;
        this.v = tVar.w;
        this.w = tVar.x;
        this.x = tVar.y;
        this.y = tVar.z;
        this.z = tVar.A;
        this.A = tVar.B;
        s21.a aVar = tVar.C;
        this.B = aVar == null ? new s21.a(10) : aVar;
        t81.e eVar = tVar.D;
        this.C = eVar == null ? t81.e.l : eVar;
        kk.a aVar2 = tVar.b;
        if (aVar2 == null) {
            aVar2 = new kk.a(25);
            tVar.b = aVar2;
        }
        this.D = aVar2;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = tVar.p;
                    if (sSLSocketFactory == null) {
                        a91.e eVar2 = a91.e.a;
                        a91.e.a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        k71.k.d(trustManagers);
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.p = x509TrustManager;
                                a91.e eVar3 = a91.e.a;
                                eVar3.getClass();
                                try {
                                    SSLContext l = eVar3.l();
                                    l.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = l.getSocketFactory();
                                    k71.k.f(socketFactory, "getSocketFactory(...)");
                                    this.o = socketFactory;
                                    m7.y c = a91.e.a.c(x509TrustManager);
                                    this.u = c;
                                    f fVar = tVar.u;
                                    fVar.getClass();
                                    this.t = k71.k.b(fVar.b, c) ? fVar : new f(fVar.a, c);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String arrays = Arrays.toString(trustManagers);
                        k71.k.f(arrays, "toString(...)");
                        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
                    }
                    this.o = sSLSocketFactory;
                    m7.y yVar = tVar.v;
                    k71.k.d(yVar);
                    this.u = yVar;
                    X509TrustManager x509TrustManager2 = tVar.q;
                    k71.k.d(x509TrustManager2);
                    this.p = x509TrustManager2;
                    f fVar2 = tVar.u;
                    fVar2.getClass();
                    this.t = k71.k.b(fVar2.b, yVar) ? fVar2 : new f(fVar2.a, yVar);
                    X509TrustManager x509TrustManager3 = this.p;
                    m7.y yVar2 = this.u;
                    SSLSocketFactory sSLSocketFactory2 = this.o;
                    List list3 = this.c;
                    list = this.b;
                    k71.k.e(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    k71.k.e(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    List list4 = this.q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((i) it2.next()).a) {
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (yVar2 == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null");
                                }
                                if (x509TrustManager3 == null) {
                                    throw new IllegalStateException("x509TrustManager == null");
                                }
                                return;
                            }
                        }
                    }
                    if (sSLSocketFactory2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (yVar2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager3 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!k71.k.b(this.t, f.c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.o = null;
        this.u = null;
        this.p = null;
        this.t = f.c;
        X509TrustManager x509TrustManager32 = this.p;
        m7.y yVar22 = this.u;
        SSLSocketFactory sSLSocketFactory22 = this.o;
        List list32 = this.c;
        list = this.b;
        k71.k.e(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final t a() {
        t tVar = new t();
        tVar.a = this.a;
        tVar.b = this.D;
        x61.m.J(tVar.c, this.b);
        x61.m.J(tVar.d, this.c);
        tVar.e = this.d;
        tVar.f = this.e;
        tVar.g = this.f;
        tVar.h = this.g;
        tVar.i = this.h;
        tVar.j = this.i;
        tVar.k = this.j;
        tVar.l = this.k;
        tVar.m = this.l;
        tVar.n = this.m;
        tVar.o = this.n;
        tVar.p = this.o;
        tVar.q = this.p;
        tVar.r = this.q;
        tVar.s = this.r;
        tVar.t = this.s;
        tVar.u = this.t;
        tVar.v = this.u;
        tVar.w = this.v;
        tVar.x = this.w;
        tVar.y = this.x;
        tVar.z = this.y;
        tVar.A = this.z;
        tVar.B = this.A;
        tVar.C = this.B;
        tVar.D = this.C;
        return tVar;
    }

    public final u81.m b(androidx.lifecycle.b bVar) {
        k71.k.g(bVar, "request");
        return new u81.m(this, bVar, false);
    }

    public final g91.f c(androidx.lifecycle.b bVar, com.google.common.util.concurrent.a aVar) {
        k71.k.g(aVar, "listener");
        g91.f fVar = new g91.f(this.C, bVar, aVar, new Random(), this.y, this.A, this.z);
        if (((n) bVar.d).a("Sec-WebSocket-Extensions") != null) {
            g91.f.c(fVar, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return fVar;
        }
        t a = a();
        a.e = new m11.r(12);
        List list = g91.f.x;
        k71.k.g(list, "protocols");
        ArrayList H0 = x61.m.H0(list);
        vShadow vVar = v.x;
        if (!H0.contains(vVar) && !H0.contains(v.u)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + H0).toString());
        }
        if (H0.contains(vVar) && H0.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + H0).toString());
        }
        if (H0.contains(v.t)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + H0).toString());
        }
        if (H0.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        H0.remove(v.v);
        if (!H0.equals(a.s)) {
            a.C = null;
        }
        List unmodifiableList = Collections.unmodifiableList(H0);
        k71.k.f(unmodifiableList, "unmodifiableList(...)");
        a.s = unmodifiableList;
        u uVar = new u(a);
        l1 s = bVar.s();
        s.w("Upgrade", "websocket");
        s.w("Connection", "Upgrade");
        s.w("Sec-WebSocket-Key", fVar.g);
        s.w("Sec-WebSocket-Version", "13");
        s.w("Sec-WebSocket-Extensions", "permessage-deflate");
        androidx.lifecycle.b bVar2 = new androidx.lifecycle.b(sShadow);
        u81.m mVar = new u81.m(uVar, bVar2, true);
        fVar.h = mVar;
        mVar.d(new e51.a(fVar, bVar2, false, 8));
        return fVar;
    }

    public u() {
        this(new t());
    }
}
