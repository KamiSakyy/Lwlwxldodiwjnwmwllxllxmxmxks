package q10;

import a81.t;
import androidx.compose.foundation.lazy.layout.t1;
import androidx.lifecycle.l1;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.measurement.internal.t0;
import h91.s;
import in.j0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import k71.k;
import n0.w;
import okhttp3.internal.http2.ConnectionShutdownException;
import q81.a0;
import q81.c0;
import q81.d0;
import q81.n;
import q81.o;
import q81.p;
import q81.q;
import q81.u;
import q81.y;
import q81.z;
import sy.f0;
import v00.i;
import x61.l;
import x61.m;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements p {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static int d(a0 a0Var, int i) {
        String a = a0Var.w.a("Retry-After");
        if (a == null) {
            a = null;
        }
        if (a == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        k.f(compile, "compile(...)");
        if (!compile.matcher(a).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a);
        k.f(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0142, code lost:
    
        r6.g(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0154, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a0 a(w wVar) {
        c0 c0Var;
        ArrayList arrayList;
        boolean z;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        q81.f fVar;
        switch (this.a) {
            case 0:
                androidx.lifecycle.b bVar = (androidx.lifecycle.b) wVar.i;
                String a = ((n) bVar.d).a("X-APOLLO-OPERATION-NAME");
                if (a == null) {
                    a = ((o) bVar.b).i;
                }
                ((vz0.e) this.b).a(f0.r(a));
                return wVar.f(bVar);
            case 1:
                t tVar = (t) this.b;
                androidx.lifecycle.b bVar2 = (androidx.lifecycle.b) wVar.i;
                j0 j0Var = (j0) bVar2.C(j0.class);
                l1 s = bVar2.s();
                s.g("User-Agent", tVar.s);
                s.g("GraphQL-Features", m.c0(l.r(new String[]{"merge_queue", "issues_close_state", "copilot_iap_max_sku", "issues_copilot_assignment_api_support", "coding_agent_model_selection", "graphql_pr_comment_positioning"}), ",", (String) null, (String) null, 0, (j71.c) null, 62));
                if (j0Var == null || !j0Var.b) {
                    s.g("Accept", l.R(62, new String[]{"application/vnd.github.merge-info-preview+json", "application/vnd.github.shadow-cat-preview+json", "application/vnd.github.echo-preview+json", "application/vnd.github.vixen-preview+json", "application/vnd.github.antiope-preview+json", "application/vnd.github.comfort-fade-preview+json", "application/vnd.github.starfox-preview+json", "application/vnd.github.doctor-strange-preview+json", "application/json"}));
                }
                return wVar.f(new androidx.lifecycle.b(s));
            case 2:
                i iVar = (i) this.b;
                String a2 = iVar.c.a(iVar.d);
                l1 s2 = ((androidx.lifecycle.b) wVar.i).s();
                s2.g("Copilot-Integration-Id", "copilot-mobile-android");
                s2.g("X-GitHub-Api-Version", "2025-05-01");
                s2.g("Accept", "text/event-stream");
                s2.g("Authorization", "Bearer " + a2);
                return wVar.f(new androidx.lifecycle.b(s2));
            case 3:
                q81.b bVar3 = (q81.b) this.b;
                androidx.lifecycle.b bVar4 = (androidx.lifecycle.b) wVar.i;
                l1 s3 = bVar4.s();
                n nVar = (n) bVar4.d;
                o oVar = (o) bVar4.b;
                y yVar = (y) bVar4.e;
                if (yVar != null) {
                    q b = yVar.b();
                    if (b != null) {
                        s3.w("Content-Type", b.a);
                    }
                    long a3 = yVar.a();
                    if (a3 != -1) {
                        s3.w("Content-Length", String.valueOf(a3));
                        ((ia.d) s3.t).l("Transfer-Encoding");
                    } else {
                        s3.w("Transfer-Encoding", "chunked");
                        ((ia.d) s3.t).l("Content-Length");
                    }
                }
                boolean z2 = false;
                if (nVar.a("Host") == null) {
                    s3.w("Host", r81.g.i(oVar, false));
                }
                if (nVar.a("Connection") == null) {
                    s3.w("Connection", "Keep-Alive");
                }
                if (nVar.a("Accept-Encoding") == null && nVar.a("Range") == null) {
                    s3.w("Accept-Encoding", "gzip");
                    z2 = true;
                }
                bVar3.getClass();
                k.g(oVar, "url");
                if (nVar.a("User-Agent") == null) {
                    s3.w("User-Agent", "okhttp/5.3.2");
                }
                androidx.lifecycle.b bVar5 = new androidx.lifecycle.b(s3);
                a0 f = wVar.f(bVar5);
                n nVar2 = f.w;
                v81.f.b(bVar3, (o) bVar5.b, nVar2);
                z f2 = f.f();
                f2.a = bVar5;
                if (z2) {
                    String a4 = nVar2.a("Content-Encoding");
                    if (a4 == null) {
                        a4 = null;
                    }
                    if ("gzip".equalsIgnoreCase(a4) && v81.f.a(f) && (c0Var = f.x) != null) {
                        s sVar = new s(c0Var.r());
                        ia.d d = nVar2.d();
                        d.l("Content-Encoding");
                        d.l("Content-Length");
                        f2.f = d.e().d();
                        String a5 = nVar2.a("Content-Type");
                        f2.g = new v81.g(a5 == null ? null : a5, -1L, h91.b.c(sVar));
                    }
                }
                return f2.a();
            case 4:
                androidx.lifecycle.b bVar6 = (androidx.lifecycle.b) wVar.i;
                u81.m mVar = (u81.m) wVar.g;
                ArrayList arrayList2 = rShadow.r;
                a0 a0Var = null;
                int i = 0;
                androidx.lifecycle.b bVar7 = bVar6;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        k.g(bVar7, "request");
                        if (mVar.B != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (mVar) {
                            if (mVar.D) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
                            if (mVar.C || mVar.F || mVar.E) {
                            }
                        }
                        if (z3) {
                            u uVar = mVar.r;
                            ArrayList arrayList3 = arrayList2;
                            t81.e eVar = uVar.C;
                            t0 t0Var = mVar.u;
                            int i2 = uVar.w;
                            int i3 = uVar.x;
                            int i4 = wVar.c;
                            int i5 = wVar.d;
                            int i6 = uVar.y;
                            boolean z4 = uVar.e;
                            boolean z5 = uVar.f;
                            o oVar2 = (o) bVar7.b;
                            k.g(oVar2, "url");
                            if (k.b(oVar2.a, "https")) {
                                SSLSocketFactory sSLSocketFactory2 = uVar.o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                HostnameVerifier hostnameVerifier2 = uVar.s;
                                fVar = uVar.t;
                                hostnameVerifier = hostnameVerifier2;
                                sSLSocketFactory = sSLSocketFactory2;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                fVar = null;
                            }
                            arrayList = arrayList3;
                            androidx.lifecycle.b bVar8 = bVar7;
                            u81.o oVar3 = new u81.o(eVar, t0Var, i2, i3, i4, i5, i6, z4, z5, new q81.a(oVar2.d, oVar2.e, uVar.k, uVar.n, sSLSocketFactory, hostnameVerifier, fVar, uVar.m, uVar.r, uVar.q, uVar.l), mVar.rShadow.B, mVar, bVar8);
                            bVar7 = bVar8;
                            u uVar2 = mVar.r;
                            mVar.y = uVar2.f ? new com.google.android.gms.measurement.internal.s(oVar3, uVar2.C) : new s21.a(11, oVar3);
                        } else {
                            arrayList = arrayList2;
                        }
                        try {
                            if (mVar.H) {
                                throw new IOException("Canceled");
                            }
                            try {
                                z f3 = wVar.f(bVar7).f();
                                f3.a = bVar7;
                                f3.k = a0Var != null ? b4.h0(a0Var) : null;
                                a0 a6 = f3.a();
                                bVar7 = b(a6, mVar.B);
                                if (bVar7 != null) {
                                    z = false;
                                    y yVar2 = (y) bVar7.e;
                                    if (yVar2 != null && yVar2.c()) {
                                        break;
                                    } else {
                                        r81.e.b(a6.x);
                                        int i7 = i + 1;
                                        if (i7 > 20) {
                                            throw new ProtocolException("Too many follow-up requests: " + i7);
                                        }
                                        mVar.g(true);
                                        a0Var = a6;
                                        arrayList2 = arrayList;
                                        i = i7;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            } catch (IOException e) {
                                if (!c(e, mVar, bVar7)) {
                                    byte[] bArr = r81.e.a;
                                    k.g(arrayList, "suppressed");
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        sy.u.a(e, (Exception) it.next());
                                    }
                                    throw e;
                                }
                                arrayList2 = m.m0(arrayList, e);
                                mVar.g(true);
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            mVar.g(true);
                            throw th2;
                        }
                    }
                }
                throw new IllegalStateException("Check failed.");
            default:
                l1 s4 = ((androidx.lifecycle.b) wVar.i).s();
                s4.g("Authorization", "token " + ((String) this.b));
                s4.G(j0.class, new j0());
                s4.r();
                return wVar.f(new androidx.lifecycle.b(s4));
        }
    }

    public androidx.lifecycle.b b(a0 a0Var, t1 t1Var) {
        y yVar;
        a0 a0Var2;
        d0 d0Var = t1Var != null ? t1Var.e().c : null;
        int i = a0Var.u;
        androidx.lifecycle.b bVar = a0Var.r;
        String str = (String) bVar.c;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((u) this.b).g.getClass();
                return null;
            }
            if (i == 421) {
                y yVar2 = (y) bVar.e;
                if ((yVar2 == null || !yVar2.c()) && t1Var != null && !k.b(((u81.g) t1Var.c).b().j.h.d, ((v81.e) t1Var.d).h().h().a.h.d)) {
                    u81.n e = t1Var.e();
                    synchronized (e) {
                        e.l = true;
                    }
                    return a0Var.r;
                }
            } else if (i == 503) {
                a0 a0Var3 = a0Var.B;
                if ((a0Var3 == null || a0Var3.u != 503) && d(a0Var, Integer.MAX_VALUE) == 0) {
                    return a0Var.r;
                }
            } else {
                if (i == 407) {
                    k.d(d0Var);
                    if (d0Var.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((u) this.b).m.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                    }
                } else if (((u) this.b).e && (((yVar = (y) bVar.e) == null || !yVar.c()) && (((a0Var2 = a0Var.B) == null || a0Var2.u != 408) && d(a0Var, 0) <= 0))) {
                    return a0Var.r;
                }
            }
            return null;
        }
        u uVar = (u) this.b;
        if (uVar.h) {
            String a = a0Var.w.a("Location");
            if (a == null) {
                a = null;
            }
            androidx.lifecycle.b bVar2 = a0Var.r;
            if (a != null) {
                o oVar = (o) bVar2.b;
                oVar.getClass();
                l7.e f = oVar.f(a);
                o c = f != null ? f.c() : null;
                if (c != null && (k.b(c.a, ((o) bVar2.b).a) || uVar.i)) {
                    l1 s = bVar2.s();
                    if (sy.d0Shadow.u(str)) {
                        int i2 = a0Var.u;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            s.z(str, z ? (y) bVar2.e : null);
                        } else {
                            s.z("GET", (y) null);
                        }
                        if (!z) {
                            ((ia.d) s.t).l("Transfer-Encoding");
                            ((ia.d) s.t).l("Content-Length");
                            ((ia.d) s.t).l("Content-Type");
                        }
                    }
                    if (!r81.g.a((o) bVar2.b, c)) {
                        ((ia.d) s.t).l("Authorization");
                    }
                    s.r = c;
                    return new androidx.lifecycle.b(s);
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, u81.m mVar, androidx.lifecycle.b bVar) {
        y yVar;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!((u) this.b).e) {
            return false;
        }
        if ((!z && (((yVar = (y) bVar.e) != null && yVar.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        t1 t1Var = mVar.I;
        if (t1Var == null || !t1Var.a) {
            return false;
        }
        u81.g gVar = mVar.y;
        k.d(gVar);
        u81.o b = gVar.b();
        t1 t1Var2 = mVar.I;
        return b.a(t1Var2 != null ? t1Var2.e() : null);
    }

    public d(q81.b bVar) {
        this.a = 3;
        k.g(bVar, "cookieJar");
        this.b = bVar;
    }

    public d(vz0.c cVar) {
        this.a = 0;
        k.g(cVar, "loopAction");
        this.b = new vz0.e("LoopWatcher_Network", TimeUnit.SECONDS.toMillis(20L), cVar);
    }
    public Object l(Object p1) { return null; }
}
