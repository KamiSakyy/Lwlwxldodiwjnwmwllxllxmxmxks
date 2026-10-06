package i91;

import h91.f0;
import h91.g0;
import h91.i0Shadow;
import h91.m0;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import w51.r;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d implements i0 {
    public final OutputStream r;
    public final i s;
    public final /* synthetic */ r t;

    public d(r rVar) {
        this.t = rVar;
        Socket socket = (Socket) rVar.s;
        this.r = socket.getOutputStream();
        this.s = new i(socket);
    }

    @Override // h91.i0Shadow
    public final void I0(h91.h hVar, long j) {
        h91.b.e(hVar.s, 0L, j);
        while (j > 0) {
            i iVar = this.s;
            iVar.f();
            f0 f0Var = hVar.r;
            k71.k.d(f0Var);
            int min = (int) Math.min(j, f0Var.c - f0Var.b);
            iVar.i();
            try {
                try {
                    this.r.write(f0Var.a, f0Var.b, min);
                    if (iVar.j()) {
                        throw iVar.k(null);
                    }
                    int i = f0Var.b + min;
                    f0Var.b = i;
                    long j2 = min;
                    j -= j2;
                    hVar.s -= j2;
                    if (i == f0Var.c) {
                        hVar.r = f0Var.a();
                        g0.a(f0Var);
                    }
                } catch (IOException e) {
                    if (!iVar.j()) {
                        throw e;
                    }
                    throw iVar.k(e);
                }
            } catch (Throwable th) {
                iVar.j();
                throw th;
            }
        }
    }

    @Override // h91.i0Shadow
    public final m0 b() {
        return this.s;
    }

    @Override // h91.i0Shadow, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        int i;
        OutputStream outputStream = this.r;
        r rVar = this.t;
        i iVar = this.s;
        iVar.i();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) rVar.t;
            Socket socket = (Socket) rVar.s;
            k71.k.g(atomicInteger, "<this>");
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
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

    @Override // h91.i0Shadow, java.io.Flushable
    public final void flush() {
        i iVar = this.s;
        iVar.i();
        try {
            this.r.flush();
            if (iVar.j()) {
                throw iVar.k(null);
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
        return "sink(" + ((Socket) this.t.s) + ')';
    }
}
