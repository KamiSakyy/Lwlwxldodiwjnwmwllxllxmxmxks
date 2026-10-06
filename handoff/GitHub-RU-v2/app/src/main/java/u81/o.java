package u81;

import androidx.lifecycle.l1;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.measurement.internal.t0;
import h0.q1;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import q81.b0;
import q81.c0;
import q81.d0;
import q81.vShadow;
import q81.y;

/* loaded from: /home/user/work/p/classes5.dex */
public final class o {
    public t81.e a;
    public t0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public q81.a j;
    public s21.a k;
    public m l;
    public boolean m;
    public q1 n;
    public m9.i o;
    public d0 p;
    public x61.k q;

    public o(t81.e eVar, t0 t0Var, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, q81.a aVar, s21.a aVar2, m mVar, androidx.lifecycle.b bVar) {
        k71.k.g(eVar, "taskRunner");
        k71.k.g(t0Var, "connectionPool");
        k71.k.g(aVar2, "routeDatabase");
        this.a = eVar;
        this.b = t0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = z2;
        this.j = aVar;
        this.k = aVar2;
        this.l = mVar;
        this.m = !k71.k.b((String) bVar.c, "GET");
        this.q = new x61.k();
    }

    public final boolean a(n nVar) {
        m9.i iVar;
        d0 d0Var;
        if (this.q.isEmpty() && this.p == null) {
            if (nVar != null) {
                synchronized (nVar) {
                    d0Var = null;
                    if (nVar.m == 0 && nVar.k && r81.g.a(nVar.c.a.h, this.j.h)) {
                        d0Var = nVar.c;
                    }
                }
                if (d0Var != null) {
                    this.p = d0Var;
                    return true;
                }
            }
            q1 q1Var = this.n;
            if ((q1Var == null || q1Var.a >= q1Var.b.size()) && (iVar = this.o) != null) {
                return iVar.b();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0058  */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r b() {
        Socket k;
        p pVar;
        c c;
        String str;
        int i;
        List list;
        boolean contains;
        n nVar = this.l.z;
        if (nVar != null) {
            boolean g = nVar.g(this.m);
            synchronized (nVar) {
                try {
                    if (g) {
                        if (!nVar.k && e(nVar.c.a.h)) {
                            k = null;
                        }
                        k = this.l.k();
                    } else {
                        nVar.k = true;
                        k = this.l.k();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l.z != null) {
                if (k != null) {
                    throw new IllegalStateException("Check failed.");
                }
                pVar = new p(nVar);
                if (pVar == null) {
                    return pVar;
                }
                p d = d(null, null);
                if (d != null) {
                    return d;
                }
                if (!this.q.isEmpty()) {
                    return (r) this.q.removeFirst();
                }
                d0 d0Var = this.p;
                if (d0Var != null) {
                    this.p = null;
                    c = c(d0Var, null);
                } else {
                    q1 q1Var = this.n;
                    if (q1Var == null || q1Var.a >= q1Var.b.size()) {
                        m9.i iVar = this.o;
                        if (iVar == null) {
                            iVar = new m9.i(this.j, this.k, this.l, this.i);
                            this.o = iVar;
                        }
                        if (!iVar.b()) {
                            throw new IOException("exhausted all routes");
                        }
                        if (!iVar.b()) {
                            throw new NoSuchElementException();
                        }
                        ArrayList arrayList = new ArrayList();
                        while (iVar.c < iVar.b.size()) {
                            q81.a aVar = (q81.a) iVar.d;
                            if (iVar.c >= iVar.b.size()) {
                                throw new SocketException("No route to " + aVar.h.d + "; exhausted proxy configurations: " + iVar.b);
                            }
                            List list2 = iVar.b;
                            int i2 = iVar.c;
                            iVar.c = i2 + 1;
                            Proxy proxy = (Proxy) list2.get(i2);
                            ArrayList arrayList2 = new ArrayList();
                            iVar.f = arrayList2;
                            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                q81.o oVar = aVar.h;
                                str = oVar.d;
                                i = oVar.e;
                            } else {
                                SocketAddress address = proxy.address();
                                if (!(address instanceof InetSocketAddress)) {
                                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                }
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                InetAddress address2 = inetSocketAddress.getAddress();
                                if (address2 == null) {
                                    str = inetSocketAddress.getHostName();
                                    k71.k.f(str, "getHostName(...)");
                                } else {
                                    str = address2.getHostAddress();
                                    k71.k.f(str, "getHostAddress(...)");
                                }
                                i = inetSocketAddress.getPort();
                            }
                            if (1 > i || i >= 65536) {
                                throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
                            }
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                arrayList2.add(InetSocketAddress.createUnresolved(str, i));
                            } else {
                                t71.n nVar2 = r81.d.a;
                                k71.k.g(str, "<this>");
                                if (r81.d.a.e(str)) {
                                    list = sy.d0Shadow.n(InetAddress.getByName(str));
                                } else {
                                    aVar.a.getClass();
                                    try {
                                        InetAddress[] allByName = InetAddress.getAllByName(str);
                                        k71.k.f(allByName, "getAllByName(...)");
                                        List g0 = x61.l.g0(allByName);
                                        if (g0.isEmpty()) {
                                            throw new UnknownHostException(aVar.a + " returned no addresses for " + str);
                                        }
                                        list = g0;
                                    } catch (NullPointerException e) {
                                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                        unknownHostException.initCause(e);
                                        throw unknownHostException;
                                    }
                                }
                                if (iVar.a && list.size() >= 2) {
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj : list) {
                                        if (((InetAddress) obj) instanceof Inet6Address) {
                                            arrayList3.add(obj);
                                        } else {
                                            arrayList4.add(obj);
                                        }
                                    }
                                    if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                        byte[] bArr = r81.e.a;
                                        Iterator it = arrayList3.iterator();
                                        Iterator it2 = arrayList4.iterator();
                                        y61.b i3 = sy.d0Shadow.i();
                                        while (true) {
                                            if (!it.hasNext() && !it2.hasNext()) {
                                                break;
                                            }
                                            if (it.hasNext()) {
                                                i3.add(it.next());
                                            }
                                            if (it2.hasNext()) {
                                                i3.add(it2.next());
                                            }
                                        }
                                        list = sy.d0Shadow.h(i3);
                                    }
                                }
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), i));
                                }
                            }
                            Iterator it4 = iVar.f.iterator();
                            while (it4.hasNext()) {
                                d0 d0Var2 = new d0((q81.a) iVar.d, proxy, (InetSocketAddress) it4.next());
                                s21.a aVar2 = (s21.a) iVar.e;
                                synchronized (aVar2) {
                                    contains = ((LinkedHashSet) aVar2.s).contains(d0Var2);
                                }
                                if (contains) {
                                    ((ArrayList) iVar.g).add(d0Var2);
                                } else {
                                    arrayList.add(d0Var2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                break;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            x61.m.J(arrayList, (ArrayList) iVar.g);
                            ((ArrayList) iVar.g).clear();
                        }
                        q1 q1Var2 = new q1();
                        q1Var2.b = arrayList;
                        this.n = q1Var2;
                        if (this.l.H) {
                            throw new IOException("Canceled");
                        }
                        if (q1Var2.a >= arrayList.size()) {
                            throw new NoSuchElementException();
                        }
                        int i4 = q1Var2.a;
                        q1Var2.a = i4 + 1;
                        c = c((d0) arrayList.get(i4), arrayList);
                    } else {
                        int i5 = q1Var.a;
                        ArrayList arrayList5 = q1Var.b;
                        if (i5 >= arrayList5.size()) {
                            throw new NoSuchElementException();
                        }
                        int i6 = q1Var.a;
                        q1Var.a = i6 + 1;
                        c = c((d0) arrayList5.get(i6), null);
                    }
                }
                p d2 = d(c, c.l);
                return d2 != null ? d2 : c;
            }
            if (k != null) {
                r81.g.c(k);
            }
        }
        pVar = null;
        if (pVar == null) {
        }
    }

    public final c c(d0 d0Var, ArrayList arrayList) {
        k71.k.g(d0Var, "route");
        q81.a aVar = d0Var.a;
        if (aVar.c == null) {
            if (!aVar.j.contains(q81.i.f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = d0Var.a.h.d;
            a91.e eVar = a91.e.a;
            if (!a91.e.a.i(str)) {
                throw new UnknownServiceException(f1.e.z("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(vShadow.x)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        androidx.lifecycle.b bVar = null;
        if (d0Var.b.type() == Proxy.Type.HTTP) {
            q81.a aVar2 = d0Var.a;
            if (aVar2.c != null || aVar2.i.contains(vShadow.x)) {
                l1 l1Var = new l1(11);
                q81.o oVar = d0Var.a.h;
                k71.k.g(oVar, "url");
                l1Var.r = oVar;
                l1Var.z("CONNECT", (y) null);
                q81.a aVar3 = d0Var.a;
                l1Var.w("Host", r81.g.i(aVar3.h, true));
                l1Var.w("Proxy-Connection", "Keep-Alive");
                l1Var.w("User-Agent", "okhttp/5.3.2");
                bVar = new androidx.lifecycle.b(l1Var);
                b0 b0Var = c0.r;
                ia.d dVar = new ia.d(4);
                q81.b bVar2 = vShadow.s;
                i4.a0("Proxy-Authenticate");
                i4.b0("OkHttp-Preemptive", "Proxy-Authenticate");
                dVar.l("Proxy-Authenticate");
                i4.T(dVar, "Proxy-Authenticate", "OkHttp-Preemptive");
                dVar.e();
                k71.k.g(b0Var, "body");
                aVar3.f.getClass();
            }
        }
        return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this, d0Var, arrayList, bVar, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003f, code lost:
    
        if ((r7.j != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p d(c cVar, List list) {
        n nVar;
        boolean z;
        Socket k;
        t0 t0Var = this.b;
        boolean z2 = this.m;
        q81.a aVar = this.j;
        m mVar = this.l;
        boolean z3 = cVar != null && cVar.a();
        t0Var.getClass();
        Iterator it = ((ConcurrentLinkedQueue) t0Var.e).iterator();
        k71.k.f(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                nVar = null;
                break;
            }
            nVar = (n) it.next();
            k71.k.d(nVar);
            synchronized (nVar) {
                if (z3) {
                    try {
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (nVar.e(aVar, list)) {
                    mVar.b(nVar);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                if (nVar.g(z2)) {
                    break;
                }
                synchronized (nVar) {
                    nVar.k = true;
                    k = mVar.k();
                }
                if (k != null) {
                    r81.g.c(k);
                }
            }
        }
        if (nVar == null) {
            return null;
        }
        if (cVar != null) {
            this.p = cVar.k;
            Socket socket = cVar.r;
            if (socket != null) {
                r81.g.c(socket);
            }
        }
        return new p(nVar);
    }

    public final boolean e(q81.o oVar) {
        k71.k.g(oVar, "url");
        q81.o oVar2 = this.j.h;
        return oVar.e == oVar2.e && k71.k.b(oVar.d, oVar2.d);
    }
}
