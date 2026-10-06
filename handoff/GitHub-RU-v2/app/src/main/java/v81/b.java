package v81;

import androidx.compose.foundation.lazy.layout.t1;
import java.io.IOException;
import java.net.ProtocolException;
import k71.k;
import n0.w;
import okhttp3.internal.http2.ConnectionShutdownException;
import q81.a0;
import q81.c0;
import q81.n;
import q81.p;
import q81.y;
import q81.z;
import sy.d0Shadow;
import sy.u;
import u81.m;

/* loaded from: /home/user/work/p/classes5.dex */
public class b implements p {
    public static final b a = new b();

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e3, code lost:
    
        if ("close".equalsIgnoreCase(r3) != false) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0145 A[Catch: IOException -> 0x00f0, TryCatch #6 {IOException -> 0x00f0, blocks: (B:89:0x00e6, B:17:0x00f3, B:29:0x0145, B:34:0x0153, B:35:0x015a, B:39:0x015d, B:42:0x0165, B:47:0x0170, B:49:0x01c5, B:51:0x01d5, B:54:0x01df, B:61:0x01f4, B:63:0x0201, B:64:0x0225, B:65:0x01e5, B:71:0x01b4, B:75:0x0227, B:76:0x022a, B:85:0x011c, B:67:0x018f, B:70:0x019b), top: B:88:0x00e6, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015d A[Catch: IOException -> 0x00f0, TryCatch #6 {IOException -> 0x00f0, blocks: (B:89:0x00e6, B:17:0x00f3, B:29:0x0145, B:34:0x0153, B:35:0x015a, B:39:0x015d, B:42:0x0165, B:47:0x0170, B:49:0x01c5, B:51:0x01d5, B:54:0x01df, B:61:0x01f4, B:63:0x0201, B:64:0x0225, B:65:0x01e5, B:71:0x01b4, B:75:0x0227, B:76:0x022a, B:85:0x011c, B:67:0x018f, B:70:0x019b), top: B:88:0x00e6, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d5 A[Catch: IOException -> 0x00f0, TryCatch #6 {IOException -> 0x00f0, blocks: (B:89:0x00e6, B:17:0x00f3, B:29:0x0145, B:34:0x0153, B:35:0x015a, B:39:0x015d, B:42:0x0165, B:47:0x0170, B:49:0x01c5, B:51:0x01d5, B:54:0x01df, B:61:0x01f4, B:63:0x0201, B:64:0x0225, B:65:0x01e5, B:71:0x01b4, B:75:0x0227, B:76:0x022a, B:85:0x011c, B:67:0x018f, B:70:0x019b), top: B:88:0x00e6, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00df  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // q81.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a0 a(w wVar) {
        z zVar;
        IOException iOException;
        String str;
        a0 a2;
        int i;
        n nVar;
        c0 c0Var;
        boolean z;
        int i2;
        a0 a3;
        t1 t1Var = (t1) wVar.h;
        k.d(t1Var);
        m mVar = (m) t1Var.b;
        e eVar = (e) t1Var.d;
        androidx.lifecycle.b bVar = (androidx.lifecycle.b) wVar.i;
        y yVar = (y) bVar.e;
        n nVar2 = (n) bVar.d;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = false;
        Object r14 = 1;
        boolean z3 = d0Shadow.u((String) bVar.c) && yVar != null;
        boolean equalsIgnoreCase = "upgrade".equalsIgnoreCase(nVar2.a("Connection"));
        try {
            try {
                eVar.j(bVar);
                if (z3) {
                    try {
                        if ("100-continue".equalsIgnoreCase(nVar2.a("Expect"))) {
                            try {
                                eVar.f();
                                zVar = t1Var.j(true);
                            } catch (IOException e) {
                                t1Var.m(e);
                                throw e;
                            }
                        } else {
                            zVar = null;
                        }
                        if (zVar == null) {
                            try {
                                yVar.getClass();
                                y yVar2 = (y) bVar.e;
                                k.d(yVar2);
                                long a4 = yVar2.a();
                                h91.d0Shadow b = h91.b.b(new u81.e(t1Var, eVar.i(bVar, a4), a4, false));
                                yVar.d(b);
                                b.close();
                                r14 = "upgrade";
                            } catch (IOException e2) {
                                e = e2;
                                r14 = "upgrade";
                                if (e instanceof ConnectionShutdownException) {
                                    throw e;
                                }
                                if (!t1Var.a) {
                                    throw e;
                                }
                                iOException = e;
                                str = r14;
                                if (zVar == null) {
                                }
                                z zVar2 = zVar;
                                zVar2.a = bVar;
                                zVar2.e = t1Var.e().f;
                                zVar2.l = currentTimeMillis;
                                zVar2.m = System.currentTimeMillis();
                                a2 = zVar2.a();
                                i = a2.u;
                                while (true) {
                                    nVar = a2.w;
                                    c0Var = a2.x;
                                    if (i != 100) {
                                        break;
                                    }
                                    z j = t1Var.j(false);
                                    k.d(j);
                                    j.a = bVar;
                                    j.e = t1Var.e().f;
                                    j.l = currentTimeMillis;
                                    j.m = System.currentTimeMillis();
                                    a2 = j.a();
                                    i = a2.u;
                                }
                                if (i != 101) {
                                }
                                if (z) {
                                }
                                if (z) {
                                }
                                if (equalsIgnoreCase) {
                                }
                                try {
                                    String a5 = nVar.a("Content-Type");
                                    if (a5 != null) {
                                    }
                                    long d = eVar.d(a2);
                                    i2 = i;
                                    g gVar = new g(r10, d, h91.b.c(new u81.f(t1Var, eVar.c(a2), d, false)));
                                    z f = a2.f();
                                    f.g = gVar;
                                    f.o = new a();
                                    a3 = f.a();
                                    if (!"close".equalsIgnoreCase(((n) a3.r.d).a("Connection"))) {
                                    }
                                    eVar.h().f();
                                    if (i2 == 204) {
                                    }
                                    throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a3.x.f());
                                } catch (IOException e3) {
                                    t1Var.m(e3);
                                    throw e3;
                                }
                            }
                        } else {
                            r14 = "upgrade";
                            try {
                                mVar.i(t1Var, true, false, false, false, null);
                                if (!(t1Var.e().j != null)) {
                                    eVar.h().f();
                                }
                            } catch (IOException e4) {
                                e = e4;
                                if (e instanceof ConnectionShutdownException) {
                                }
                            }
                        }
                    } catch (IOException e5) {
                        e = e5;
                        r14 = "upgrade";
                        zVar = null;
                        if (e instanceof ConnectionShutdownException) {
                        }
                    }
                } else {
                    r14 = "upgrade";
                    mVar.i(t1Var, true, false, false, false, null);
                    zVar = null;
                }
            } catch (IOException e6) {
                t1Var.m(e6);
                throw e6;
            }
        } catch (IOException e7) {
            e = e7;
        }
        try {
            eVar.a();
            iOException = null;
            str = r14;
            if (zVar == null) {
                try {
                    zVar = t1Var.j(false);
                    k.d(zVar);
                } catch (IOException e8) {
                    if (iOException == null) {
                        throw e8;
                    }
                    u.a(iOException, e8);
                    throw iOException;
                }
            }
            z zVar22 = zVar;
            zVar22.a = bVar;
            zVar22.e = t1Var.e().f;
            zVar22.l = currentTimeMillis;
            zVar22.m = System.currentTimeMillis();
            a2 = zVar22.a();
            i = a2.u;
            while (true) {
                nVar = a2.w;
                c0Var = a2.x;
                if (i != 100 && (102 > i || i >= 200)) {
                    break;
                }
                z j2 = t1Var.j(false);
                k.d(j2);
                j2.a = bVar;
                j2.e = t1Var.e().f;
                j2.l = currentTimeMillis;
                j2.m = System.currentTimeMillis();
                a2 = j2.a();
                i = a2.u;
            }
            z = i != 101;
            if (z) {
                if (t1Var.e().j != null) {
                    throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                }
            }
            if (z) {
                String a6 = nVar.a("Connection");
                if (a6 == null) {
                    a6 = null;
                }
                if (str.equalsIgnoreCase(a6)) {
                    z2 = true;
                }
            }
            if (equalsIgnoreCase || !z2) {
                String a52 = nVar.a("Content-Type");
                String str2 = a52 != null ? null : a52;
                long d2 = eVar.d(a2);
                i2 = i;
                g gVar2 = new g(str2, d2, h91.b.c(new u81.f(t1Var, eVar.c(a2), d2, false)));
                z f2 = a2.f();
                f2.g = gVar2;
                f2.o = new a();
                a3 = f2.a();
            } else {
                z f3 = a2.f();
                f3.g = new r81.c(c0Var.m(), c0Var.f());
                f3.h = t1Var.n();
                a3 = f3.a();
                i2 = i;
            }
            if (!"close".equalsIgnoreCase(((n) a3.r.d).a("Connection"))) {
                String a7 = a3.w.a("Connection");
                if (a7 == null) {
                    a7 = null;
                }
            }
            eVar.h().f();
            if ((i2 == 204 && i2 != 205) || a3.x.f() <= 0) {
                return a3;
            }
            throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a3.x.f());
        } catch (IOException e9) {
            t1Var.m(e9);
            throw e9;
        }
    }
    public Object c = null;
    public Object d = null;
    public Object e = null;
}
