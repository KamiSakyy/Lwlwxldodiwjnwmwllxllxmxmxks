package g91;

import a0.s0;
import f0.b2;
import h91.j0;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import k71.k;
import k71.w;
import q81.a0;
import q81.h0;
import q81.n;
import q81.v;
import sy.d0;
import u81.m;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f implements h0, h {
    public static final List x = d0.n(v.u);
    public com.google.common.util.concurrent.a a;
    public Random b;
    public long c;
    public g d;
    public long e;
    public long f;
    public String g;
    public m h;
    public e i;
    public i j;
    public j k;
    public t81.c l;
    public String m;
    public l51.h n;
    public ArrayDeque o;
    public ArrayDeque p;
    public long q;
    public boolean r;
    public int s;
    public String t;
    public boolean u;
    public int v;
    public boolean w;

    public f(t81.e eVar, androidx.lifecycle.b bVar, com.google.common.util.concurrent.a aVar, Random random, long j, long j2, long j3) {
        k.g(eVar, "taskRunner");
        k.g(aVar, "listener");
        this.a = aVar;
        this.b = random;
        this.c = j;
        this.d = null;
        this.e = j2;
        this.f = j3;
        this.l = eVar.d();
        this.o = new ArrayDeque();
        this.p = new ArrayDeque();
        this.s = -1;
        String str = (String) bVar.c;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException(f1.e.g("Request must be GET: ", str).toString());
        }
        h91.k kVar = h91.k.u;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.g = c30.d.f(bArr).a();
    }

    public static void c(f fVar, Exception exc, a0 a0Var, int i) {
        j jVar;
        if ((i & 2) != 0) {
            a0Var = null;
        }
        boolean z = (i & 4) == 0;
        fVar.getClass();
        w wVar = new w();
        synchronized (fVar) {
            try {
                if (fVar.u) {
                    return;
                }
                fVar.u = true;
                l51.h hVar = fVar.n;
                j jVar2 = fVar.k;
                wVar.r = jVar2;
                fVar.k = null;
                if (!z && jVar2 != null) {
                    t81.c.b(fVar.l, fVar.m + " writer close", 0L, new b2(8, wVar), 2);
                }
                fVar.l.e();
                try {
                    fVar.a.I(fVar, exc, a0Var);
                    if (hVar != null) {
                        hVar.cancel();
                    }
                    if (!z || (jVar = (j) wVar.r) == null) {
                        return;
                    }
                    r81.e.b(jVar);
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final j0 a(a0 a0Var) {
        n nVar = a0Var.w;
        int i = a0Var.u;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(s0.m(sb, a0Var.t, '\''));
        }
        String a = nVar.a("Connection");
        if (a == null) {
            a = null;
        }
        if (!"Upgrade".equalsIgnoreCase(a)) {
            throw new ProtocolException(no.a.i('\'', "Expected 'Connection' header value 'Upgrade' but was '", a));
        }
        String a2 = nVar.a("Upgrade");
        if (a2 == null) {
            a2 = null;
        }
        if (!"websocket".equalsIgnoreCase(a2)) {
            throw new ProtocolException(no.a.i('\'', "Expected 'Upgrade' header value 'websocket' but was '", a2));
        }
        String a3 = nVar.a("Sec-WebSocket-Accept");
        String str = a3 != null ? a3 : null;
        h91.k kVar = h91.k.u;
        String a4 = c30.d.b(this.g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").c("SHA-1").a();
        if (k.b(a4, str)) {
            j0 j0Var = a0Var.y;
            if (j0Var != null) {
                return j0Var;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a4 + "' but was '" + str + '\'');
    }

    public final boolean b(String str, int i) {
        String str2;
        long j = this.f;
        synchronized (this) {
            h91.k kVar = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    h91.k kVar2 = h91.k.u;
                    kVar = c30.d.b(str);
                    if (kVar.r.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.u && !this.r) {
                    this.r = true;
                    this.p.add(new c(i, j, kVar));
                    e();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void d() {
        int i;
        String str;
        i iVar;
        boolean z;
        synchronized (this) {
            try {
                i = this.s;
                str = this.t;
                iVar = this.j;
                this.j = null;
                if (this.r && this.p.isEmpty()) {
                    j jVar = this.k;
                    if (jVar != null) {
                        this.k = null;
                        t81.c.b(this.l, this.m + " writer close", 0L, new b2(7, jVar), 2);
                    }
                    this.l.e();
                }
                if (!this.u && this.k == null) {
                    z = this.s != -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            com.google.common.util.concurrent.a aVar = this.a;
            k.d(str);
            aVar.G(this, i, str);
        }
        if (iVar != null) {
            r81.e.b(iVar);
        }
    }

    public final void e() {
        TimeZone timeZone = r81.g.a;
        e eVar = this.i;
        if (eVar != null) {
            this.l.c(eVar, 0L);
        }
    }

    public final synchronized boolean f(int i, h91.k kVar) {
        if (!this.u && !this.r) {
            if (this.q + kVar.d() > 16777216) {
                b(null, 1001);
                return false;
            }
            this.q += kVar.d();
            this.p.add(new d(i, kVar));
            e();
            return true;
        }
        return false;
    }

    public final boolean g(String str) {
        h91.k kVar = h91.k.u;
        return f(1, c30.d.b(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e4, code lost:
    
        if (r0 < 3000) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a A[Catch: all -> 0x008e, TryCatch #3 {all -> 0x008e, blocks: (B:25:0x0082, B:29:0x0091, B:31:0x0095, B:32:0x00a5, B:35:0x00b4, B:39:0x00b8, B:40:0x00b9, B:41:0x00ba, B:43:0x00be, B:53:0x00e6, B:55:0x010a, B:57:0x0114, B:58:0x0117, B:62:0x0122, B:64:0x0126, B:67:0x0135, B:68:0x0137, B:69:0x0138, B:70:0x0141, B:75:0x00fa, B:76:0x0142, B:77:0x0147, B:61:0x011f, B:34:0x00a6), top: B:23:0x0080, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138 A[Catch: all -> 0x008e, TryCatch #3 {all -> 0x008e, blocks: (B:25:0x0082, B:29:0x0091, B:31:0x0095, B:32:0x00a5, B:35:0x00b4, B:39:0x00b8, B:40:0x00b9, B:41:0x00ba, B:43:0x00be, B:53:0x00e6, B:55:0x010a, B:57:0x0114, B:58:0x0117, B:62:0x0122, B:64:0x0126, B:67:0x0135, B:68:0x0137, B:69:0x0138, B:70:0x0141, B:75:0x00fa, B:76:0x0142, B:77:0x0147, B:61:0x011f, B:34:0x00a6), top: B:23:0x0080, inners: #1, #2 }] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        j jVar;
        d dVar;
        String str;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.u) {
                    return false;
                }
                j jVar2 = this.k;
                Object poll = this.o.poll();
                String str2 = null;
                int i = -1;
                if (poll == null) {
                    Object poll2 = this.p.poll();
                    if (poll2 instanceof c) {
                        int i2 = this.s;
                        str = this.t;
                        if (i2 != -1) {
                            j jVar3 = this.k;
                            this.k = null;
                            if (jVar3 != null && this.j == null) {
                                z = true;
                            }
                            this.l.e();
                            jVar = jVar3;
                            i = i2;
                            dVar = poll2;
                        } else {
                            long j = ((c) poll2).c;
                            t81.c.b(this.l, this.m + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new b2(9, this), 4);
                            i = i2;
                            dVar = poll2;
                            jVar = null;
                        }
                    } else {
                        if (poll2 == null) {
                            return false;
                        }
                        str = null;
                        dVar = poll2;
                        jVar = null;
                    }
                } else {
                    jVar = null;
                    dVar = 0;
                    str = null;
                }
                try {
                    if (poll != null) {
                        k.d(jVar2);
                        jVar2.f(10, (h91.k) poll);
                    } else if (dVar instanceof d) {
                        k.d(jVar2);
                        jVar2.m(dVar.a, dVar.b);
                        synchronized (this) {
                            this.q -= dVar.b.d();
                        }
                    } else {
                        if (!(dVar instanceof c)) {
                            throw new AssertionError();
                        }
                        k.d(jVar2);
                        int i3 = dVar.a;
                        h91.k kVar = ((c) dVar).b;
                        h91.k kVar2 = h91.k.u;
                        if (i3 >= 1000 && i3 < 5000) {
                            if (1004 <= i3) {
                                if (i3 < 1007) {
                                    str2 = "Code " + i3 + " is reserved and may not be used.";
                                    if (str2 != null) {
                                        throw new IllegalArgumentException(str2.toString());
                                    }
                                    h91.h hVar = new h91.h();
                                    hVar.N0(i3);
                                    if (kVar != null) {
                                        hVar.E0(kVar);
                                    }
                                    try {
                                        jVar2.f(8, hVar.v(hVar.s));
                                        if (z) {
                                            com.google.common.util.concurrent.a aVar = this.a;
                                            k.d(str);
                                            aVar.G(this, i, str);
                                        }
                                    } finally {
                                        jVar2.y = true;
                                    }
                                }
                            }
                            if (1015 <= i3) {
                            }
                            if (str2 != null) {
                            }
                        }
                        str2 = "Code must be in range [1000,5000): " + i3;
                        if (str2 != null) {
                        }
                    }
                    return true;
                } finally {
                    if (jVar != null) {
                        r81.e.b(jVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
