package x81;

import a0.s0;
import com.github.rudroid.copilot.h1;
import h91.e0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /home/user/work/p/classes5.dex */
public final class s implements Closeable {
    public static final Logger u;
    public h91.j r;
    public r s;
    public d t;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        k71.k.f(logger, "getLogger(...)");
        u = logger;
    }

    public s(e0 e0Var) {
        k71.k.g(e0Var, "source");
        this.r = e0Var;
        r rVar = new r(e0Var);
        this.s = rVar;
        this.t = new d(rVar);
    }

    public final void A(n nVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.r.readByte();
            byte[] bArr = r81.e.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int readInt = this.r.readInt() & Integer.MAX_VALUE;
        List r = r(q.a(i - 4, i2, i4), i4, i2, i3);
        o oVar = nVar.s;
        synchronized (oVar) {
            if (oVar.Q.contains(Integer.valueOf(readInt))) {
                oVar.F(readInt, a.u);
                return;
            }
            oVar.Q.add(Integer.valueOf(readInt));
            t81.c.b(oVar.z, oVar.t + '[' + readInt + "] onRequest", 0L, new j(oVar, readInt, r, i5), 6);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.r.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0257, code lost:
    
        throw new java.io.IOException(no.a.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(boolean z, n nVar) {
        Object[] array;
        try {
            this.r.C0(9L);
            int m = r81.e.m(this.r);
            if (m > 16384) {
                throw new IOException(no.a.k("FRAME_SIZE_ERROR: ", m));
            }
            int readByte = this.r.readByte() & 255;
            byte readByte2 = this.r.readByte();
            int i = readByte2 & 255;
            int readInt = this.r.readInt();
            int i2 = Integer.MAX_VALUE & readInt;
            int i3 = 1;
            if (readByte != 8) {
                Logger logger = u;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(g.b(true, i2, m, readByte, i));
                }
            }
            if (z && readByte != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + g.a(readByte));
            }
            a aVar = null;
            switch (readByte) {
                case 0:
                    m(nVar, m, i, i2);
                    return true;
                case 1:
                    t(nVar, m, i, i2);
                    return true;
                case 2:
                    if (m != 5) {
                        throw new IOException(s0.i("TYPE_PRIORITY length: ", m, " != 5"));
                    }
                    if (i2 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    h91.j jVar = this.r;
                    jVar.readInt();
                    jVar.readByte();
                    return true;
                case 3:
                    if (m != 4) {
                        throw new IOException(s0.i("TYPE_RST_STREAM length: ", m, " != 4"));
                    }
                    if (i2 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int readInt2 = this.r.readInt();
                    a.s.getClass();
                    a[] values = a.values();
                    int length = values.length;
                    while (true) {
                        if (r2 < length) {
                            a aVar2 = values[r2];
                            if (aVar2.r == readInt2) {
                                aVar = aVar2;
                            } else {
                                r2++;
                            }
                        }
                    }
                    if (aVar == null) {
                        throw new IOException(no.a.k("TYPE_RST_STREAM unexpected error code: ", readInt2));
                    }
                    o oVar = nVar.s;
                    if (i2 == 0 || (readInt & 1) != 0) {
                        w r = oVar.r(i2);
                        if (r != null) {
                            synchronized (r) {
                                if (r.h() == null) {
                                    r.C = aVar;
                                    r.notifyAll();
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                    t81.c.b(oVar.z, oVar.t + '[' + i2 + "] onReset", 0L, new j(oVar, i2, aVar, i3), 6);
                    return true;
                case 4:
                    h91.j jVar2 = this.r;
                    if (i2 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) != 0) {
                        if (m != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (m % 6 != 0) {
                        throw new IOException(no.a.k("TYPE_SETTINGS length % 6 != 0: ", m));
                    }
                    a0 a0Var = new a0();
                    q71.e N = aa1.b.N(aa1.b.b0(0, m), 6);
                    int i4 = N.r;
                    int i5 = N.s;
                    int i6 = N.t;
                    if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                        while (true) {
                            short readShort = jVar2.readShort();
                            byte[] bArr = r81.e.a;
                            int i7 = readShort & 65535;
                            int readInt3 = jVar2.readInt();
                            if (i7 != 2) {
                                if (i7 != 4) {
                                    if (i7 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                    }
                                } else if (readInt3 < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (readInt3 != 0 && readInt3 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            a0Var.c(i7, readInt3);
                            if (i4 != i5) {
                                i4 += i6;
                            }
                        }
                    }
                    o oVar2 = nVar.s;
                    t81.c.b(oVar2.y, h1.p(new StringBuilder(), oVar2.t, " applyAndAckSettings"), 0L, new nf.j(25, nVar, a0Var), 6);
                    return true;
                case 5:
                    A(nVar, m, i, i2);
                    return true;
                case 6:
                    if (m != 8) {
                        throw new IOException(no.a.k("TYPE_PING length != 8: ", m));
                    }
                    if (i2 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    final int readInt4 = this.r.readInt();
                    final int readInt5 = this.r.readInt();
                    if (((readByte2 & 1) != 0 ? 1 : 0) == 0) {
                        t81.c cVar = nVar.s.y;
                        String p = h1.p(new StringBuilder(), nVar.s.t, " ping");
                        final o oVar3 = nVar.s;
                        t81.c.b(cVar, p, 0L, new j71.a() { // from class: x81.m
                            public final Object a() {
                                o oVar4 = o.this;
                                try {
                                    oVar4.O.E(readInt4, readInt5, true);
                                } catch (IOException e) {
                                    a aVar3 = a.u;
                                    oVar4.f(aVar3, aVar3, e);
                                }
                                return w61.a0.a;
                            }
                        }, 6);
                        return true;
                    }
                    o oVar4 = nVar.s;
                    synchronized (oVar4) {
                        try {
                            if (readInt4 == 1) {
                                oVar4.D++;
                            } else if (readInt4 == 2) {
                                oVar4.F++;
                            } else if (readInt4 == 3) {
                                oVar4.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (m < 8) {
                        throw new IOException(no.a.k("TYPE_GOAWAY length < 8: ", m));
                    }
                    if (i2 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int readInt6 = this.r.readInt();
                    int readInt7 = this.r.readInt();
                    int i8 = m - 8;
                    a.s.getClass();
                    a[] values2 = a.values();
                    int length2 = values2.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            a aVar3 = values2[i9];
                            if (aVar3.r == readInt7) {
                                aVar = aVar3;
                            } else {
                                i9++;
                            }
                        }
                    }
                    if (aVar == null) {
                        throw new IOException(no.a.k("TYPE_GOAWAY unexpected error code: ", readInt7));
                    }
                    h91.k kVar = h91.k.u;
                    if (i8 > 0) {
                        kVar = this.r.v(i8);
                    }
                    k71.k.g(kVar, "debugData");
                    kVar.d();
                    o oVar5 = nVar.s;
                    synchronized (oVar5) {
                        array = oVar5.s.values().toArray(new w[0]);
                        oVar5.w = true;
                    }
                    w[] wVarArr = (w[]) array;
                    int length3 = wVarArr.length;
                    while (r2 < length3) {
                        w wVar = wVarArr[r2];
                        if (wVar.r > readInt6 && wVar.i()) {
                            a aVar4 = a.x;
                            synchronized (wVar) {
                                if (wVar.h() == null) {
                                    wVar.C = aVar4;
                                    wVar.notifyAll();
                                }
                            }
                            nVar.s.r(wVar.r);
                        }
                        r2++;
                    }
                    return true;
                case 8:
                    try {
                        if (m != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + m);
                        }
                        long readInt8 = 2147483647L & this.r.readInt();
                        if (readInt8 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = u;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(g.c(true, i2, m, readInt8));
                        }
                        if (i2 == 0) {
                            o oVar6 = nVar.s;
                            synchronized (oVar6) {
                                oVar6.M += readInt8;
                                oVar6.notifyAll();
                            }
                            return true;
                        }
                        w m2 = nVar.s.m(i2);
                        if (m2 != null) {
                            synchronized (m2) {
                                m2.v += readInt8;
                                if (readInt8 > 0) {
                                    m2.notifyAll();
                                }
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        u.fine(g.b(true, i2, m, 8, i));
                        throw e;
                    }
                default:
                    this.r.skip(m);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void m(n nVar, int i, int i2, final int i3) {
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final boolean z4 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.r.readByte();
            byte[] bArr = r81.e.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        final int a = q.a(i, i2, i4);
        h91.j jVar = this.r;
        k71.k.g(jVar, "source");
        final o oVar = nVar.s;
        if (i3 == 0 || (i3 & 1) != 0) {
            w m = oVar.m(i3);
            if (m == null) {
                nVar.s.F(i3, a.u);
                long j = a;
                nVar.s.A(j);
                jVar.skip(j);
            } else {
                TimeZone timeZone = r81.g.a;
                u uVar = m.y;
                long j2 = a;
                uVar.getClass();
                long j3 = j2;
                while (true) {
                    if (j3 <= 0) {
                        z = z4;
                        w wVar = uVar.w;
                        TimeZone timeZone2 = r81.g.a;
                        wVar.s.A(j2);
                        uVar.w.s.H.getClass();
                        break;
                    }
                    synchronized (uVar.w) {
                        z2 = uVar.s;
                        z = z4;
                        z3 = uVar.u.s + j3 > uVar.r;
                    }
                    if (z3) {
                        jVar.skip(j3);
                        uVar.w.g(a.w);
                        break;
                    }
                    if (z2) {
                        jVar.skip(j3);
                        break;
                    }
                    long U = jVar.U(uVar.t, j3);
                    if (U == -1) {
                        throw new EOFException();
                    }
                    j3 -= U;
                    w wVar2 = uVar.w;
                    synchronized (wVar2) {
                        try {
                            if (uVar.v) {
                                uVar.t.r();
                            } else {
                                h91.h hVar = uVar.u;
                                boolean z5 = hVar.s == 0;
                                hVar.G(uVar.t);
                                if (z5) {
                                    wVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    z4 = z;
                }
                if (z) {
                    m.k(q81.n.s, true);
                }
            }
        } else {
            final h91.h hVar2 = new h91.h();
            long j4 = a;
            jVar.C0(j4);
            jVar.U(hVar2, j4);
            t81.c.b(oVar.z, oVar.t + '[' + i3 + "] onData", 0L, new j71.a(i3, hVar2, a, z4) { // from class: x81.i
                public final /* synthetic */ int s;
                public final /* synthetic */ h91.h t;
                public final /* synthetic */ int u;

                public final Object a() {
                    o oVar2 = o.this;
                    int i5 = this.s;
                    h91.h hVar3 = this.t;
                    int i6 = this.u;
                    try {
                        oVar2.B.getClass();
                        hVar3.skip(i6);
                        oVar2.O.F(i5, a.y);
                        synchronized (oVar2) {
                            oVar2.Q.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return w61.a0.a;
                }
            }, 6);
        }
        this.r.skip(i4);
    }

    public final List r(int i, int i2, int i3, int i4) {
        r rVar = this.s;
        rVar.v = i;
        rVar.s = i;
        rVar.w = i2;
        rVar.t = i3;
        rVar.u = i4;
        d dVar = this.t;
        e0 e0Var = dVar.c;
        ArrayList arrayList = dVar.b;
        while (!e0Var.L()) {
            byte readByte = e0Var.readByte();
            byte[] bArr = r81.e.a;
            int i5 = readByte & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int e = dVar.e(i5, 127);
                int i6 = e - 1;
                if (i6 >= 0) {
                    c[] cVarArr = f.a;
                    if (i6 <= cVarArr.length - 1) {
                        arrayList.add(cVarArr[i6]);
                    }
                }
                int length = dVar.e + 1 + (i6 - f.a.length);
                if (length >= 0) {
                    c[] cVarArr2 = dVar.d;
                    if (length < cVarArr2.length) {
                        c cVar = cVarArr2[length];
                        k71.k.d(cVar);
                        arrayList.add(cVar);
                    }
                }
                throw new IOException(no.a.k("Header index too large ", e));
            }
            if (i5 == 64) {
                c[] cVarArr3 = f.a;
                h91.k d = dVar.d();
                f.a(d);
                dVar.c(new c(d, dVar.d()));
            } else if ((readByte & 64) == 64) {
                dVar.c(new c(dVar.b(dVar.e(i5, 63) - 1), dVar.d()));
            } else if ((readByte & 32) == 32) {
                int e2 = dVar.e(i5, 31);
                dVar.a = e2;
                if (e2 < 0 || e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + dVar.a);
                }
                int i7 = dVar.g;
                if (e2 < i7) {
                    if (e2 == 0) {
                        x61.l.J(dVar.d, (a81.t) null);
                        dVar.e = dVar.d.length - 1;
                        dVar.f = 0;
                        dVar.g = 0;
                    } else {
                        dVar.a(i7 - e2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                c[] cVarArr4 = f.a;
                h91.k d2 = dVar.d();
                f.a(d2);
                arrayList.add(new c(d2, dVar.d()));
            } else {
                arrayList.add(new c(dVar.b(dVar.e(i5, 15) - 1), dVar.d()));
            }
        }
        List F0 = x61.m.F0(arrayList);
        arrayList.clear();
        return F0;
    }

    public final void t(n nVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i5 = 0;
        boolean z = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.r.readByte();
            byte[] bArr = r81.e.a;
            i5 = readByte & 255;
        }
        if ((i2 & 32) != 0) {
            h91.j jVar = this.r;
            jVar.readInt();
            jVar.readByte();
            byte[] bArr2 = r81.e.a;
            i4 = i - 5;
        } else {
            i4 = i;
        }
        List r = r(q.a(i4, i2, i5), i5, i2, i3);
        o oVar = nVar.s;
        if (i3 != 0 && (i3 & 1) == 0) {
            t81.c.b(oVar.z, oVar.t + '[' + i3 + "] onHeaders", 0L, new j(oVar, i3, r, z), 6);
            return;
        }
        synchronized (oVar) {
            w m = oVar.m(i3);
            if (m != null) {
                m.k(r81.g.h(r), z);
                return;
            }
            if (oVar.w) {
                return;
            }
            if (i3 <= oVar.u) {
                return;
            }
            if (i3 % 2 == oVar.v % 2) {
                return;
            }
            w wVar = new w(i3, oVar, false, z, r81.g.h(r));
            oVar.u = i3;
            oVar.s.put(Integer.valueOf(i3), wVar);
            t81.c.b(oVar.x.d(), oVar.t + '[' + i3 + "] onStream", 0L, new nf.j(24, oVar, wVar), 6);
        }
    }
}
