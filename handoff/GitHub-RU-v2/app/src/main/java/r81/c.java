package r81;

import h91.h;
import h91.j;
import h91.k0;
import h91.m0;
import k71.k;
import q81.c0;
import q81.q;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c extends c0 implements k0 {
    public final q s;
    public final long t;

    public c(q qVar, long j) {
        this.s = qVar;
        this.t = j;
    }

    @Override // h91.k0
    public final long U(h hVar, long j) {
        k.g(hVar, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // h91.k0
    public final m0 b() {
        return m0.d;
    }

    @Override // q81.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // q81.c0
    public final long f() {
        return this.t;
    }

    @Override // q81.c0
    public final q m() {
        return this.s;
    }

    @Override // q81.c0
    public final j r() {
        return h91.b.c(this);
    }
}
