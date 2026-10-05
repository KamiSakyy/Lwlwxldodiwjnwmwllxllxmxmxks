package x81;

import com.github.rudroid.copilot.h1;
import h91.k0;
import h91.m0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import k.h0;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u implements k0 {
    public final long r;
    public boolean s;
    public final h91.h t = new h91.h();
    public final h91.h u = new h91.h();
    public boolean v;
    public final /* synthetic */ w w;

    public u(w wVar, long j, boolean z) {
        this.w = wVar;
        this.r = j;
        this.s = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0014, B:8:0x0021, B:13:0x002b, B:33:0x00be, B:63:0x00e4, B:64:0x00e9, B:15:0x0034, B:17:0x003a, B:19:0x003e, B:21:0x0042, B:22:0x0053, B:24:0x0057, B:26:0x0061, B:28:0x007c, B:30:0x008b, B:46:0x00a1, B:50:0x00a7, B:53:0x00ad, B:54:0x00b9, B:57:0x00da, B:58:0x00e1), top: B:5:0x0014, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[Catch: all -> 0x004f, TryCatch #2 {all -> 0x004f, blocks: (B:15:0x0034, B:17:0x003a, B:19:0x003e, B:21:0x0042, B:22:0x0053, B:24:0x0057, B:26:0x0061, B:28:0x007c, B:30:0x008b, B:46:0x00a1, B:50:0x00a7, B:53:0x00ad, B:54:0x00b9, B:57:0x00da, B:58:0x00e1), top: B:14:0x0034, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da A[SYNTHETIC] */
    @Override // h91.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long U(h91.h hVar, long j) {
        boolean z;
        boolean z2;
        Throwable th;
        long j2;
        k71.k.g(hVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        do {
            w wVar = this.w;
            synchronized (wVar) {
                wVar.s.getClass();
                t tVar = wVar.z;
                z = true;
                try {
                    if (!tVar.t && !tVar.r) {
                        z2 = false;
                        if (z2) {
                            wVar.A.i();
                        }
                        if (wVar.h() != null || this.s) {
                            th = null;
                        } else {
                            th = wVar.D;
                            if (th == null) {
                                a h = wVar.h();
                                k71.k.d(h);
                                th = new StreamResetException(h);
                            }
                        }
                        if (!this.v) {
                            throw new IOException("stream closed");
                        }
                        h91.h hVar2 = this.u;
                        long j3 = hVar2.s;
                        if (j3 > 0) {
                            j2 = hVar2.U(hVar, Math.min(j, j3));
                            h0.c(wVar.t, j2, 0L, 2);
                            long b = wVar.t.b();
                            if (th == null && b >= wVar.s.I.a() / 2) {
                                wVar.s.K(wVar.r, b);
                                h0.c(wVar.t, 0L, b, 1);
                            }
                            z = false;
                        } else {
                            if (this.s || th != null) {
                                z = false;
                            } else {
                                try {
                                    wVar.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                            j2 = -1;
                        }
                    }
                    if (wVar.h() != null) {
                    }
                    th = null;
                    if (!this.v) {
                    }
                } finally {
                    if (z2) {
                        wVar.A.m();
                    }
                }
                z2 = true;
                if (z2) {
                }
            }
            this.w.s.H.getClass();
        } while (z);
        if (j2 != -1) {
            return j2;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    @Override // h91.k0
    public final m0 b() {
        return this.w.A;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        w wVar = this.w;
        synchronized (wVar) {
            this.v = true;
            h91.h hVar = this.u;
            j = hVar.s;
            hVar.r();
            wVar.notifyAll();
        }
        if (j > 0) {
            w wVar2 = this.w;
            TimeZone timeZone = r81.g.a;
            wVar2.s.A(j);
        }
        this.w.b();
    }
}
