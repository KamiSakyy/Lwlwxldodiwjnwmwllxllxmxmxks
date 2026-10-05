package com.apollographql.apollo.internal;

import com.github.rudroid.copilot.h1;
import h91.h;
import h91.k0;
import h91.m0;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements k0 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f4305r;

    public f(g gVar) {
        this.f4305r = gVar;
    }

    public final long U(h hVar, long j10) {
        k.g(hVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j10).toString());
        }
        g gVar = this.f4305r;
        if (!k.b(gVar.f4312x, this)) {
            throw new IllegalStateException("closed");
        }
        long f6 = gVar.f(j10);
        if (f6 == 0) {
            return -1L;
        }
        return gVar.f4306r.U(hVar, f6);
    }

    public final m0 b() {
        return this.f4305r.f4306r.b();
    }

    public final void close() {
        g gVar = this.f4305r;
        if (k.b(gVar.f4312x, this)) {
            gVar.f4312x = null;
        }
    }
}
