package i91;

import com.github.rudroid.copilot.h1;
import h91.f0;
import h91.g0;
import h91.k0;
import h91.m0;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import w51.r;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e implements k0 {
    public final InputStream r;
    public final i s;
    public final /* synthetic */ r t;

    public e(r rVar) {
        this.t = rVar;
        Socket socket = (Socket) rVar.s;
        this.r = socket.getInputStream();
        this.s = new i(socket);
    }

    @Override // h91.k0
    public final long U(h91.h hVar, long j) {
        k71.k.g(hVar, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        i iVar = this.s;
        iVar.f();
        f0 x0 = hVar.x0(1);
        int min = (int) Math.min(j, 8192 - x0.c);
        try {
            iVar.i();
            try {
                int read = this.r.read(x0.a, x0.c, min);
                if (iVar.j()) {
                    throw iVar.k(null);
                }
                if (read != -1) {
                    x0.c += read;
                    long j2 = read;
                    hVar.s += j2;
                    return j2;
                }
                if (x0.b != x0.c) {
                    return -1L;
                }
                hVar.r = x0.a();
                g0.a(x0);
                return -1L;
            } catch (IOException e) {
                if (iVar.j()) {
                    throw iVar.k(e);
                }
                throw e;
            } finally {
                iVar.j();
            }
        } catch (AssertionError e2) {
            if (l.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // h91.k0
    public final m0 b() {
        return this.s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        r rVar = this.t;
        i iVar = this.s;
        iVar.i();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) rVar.t;
            Socket socket = (Socket) rVar.s;
            k71.k.g(atomicInteger, "<this>");
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.r.close();
                    }
                }
                if (iVar.j()) {
                    throw iVar.k(null);
                }
            }
        } catch (IOException e) {
            if (!iVar.j()) {
                throw e;
            }
            throw iVar.k(e);
        } finally {
            iVar.j();
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.t.s) + ')';
    }
}
