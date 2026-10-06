package com.apollographql.apollo.internal;

import h91.h;
import h91.j;
import h91.k;
import h91.y;
import java.io.Closeable;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements Closeable {

    /* renamed from: r, reason: collision with root package name */
    public j f4306r;

    /* renamed from: s, reason: collision with root package name */
    public k f4307s;

    /* renamed from: t, reason: collision with root package name */
    public k f4308t;

    /* renamed from: u, reason: collision with root package name */
    public int f4309u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4310v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4311w;

    /* renamed from: x, reason: collision with root package name */
    public f f4312x;

    /* renamed from: y, reason: collision with root package name */
    public y f4313y;

    public g(j jVar, String str) {
        this.f4306r = jVar;
        h hVar = new h();
        hVar.P0("--");
        hVar.P0(str);
        this.f4307s = hVar.v(hVar.s);
        h hVar2 = new h();
        hVar2.P0("\r\n--");
        hVar2.P0(str);
        this.f4308t = hVar2.v(hVar2.s);
        k kVar = k.u;
        this.f4313y = h91.b.f(new k[]{c30.d.b("\r\n--" + str + "--"), c30.d.b("\r\n"), c30.d.b("--"), c30.d.b(" "), c30.d.b("\t")});
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4310v) {
            return;
        }
        this.f4310v = true;
        this.f4312x = null;
        this.f4306r.close();
    }

    public final long f(long j10) {
        k kVar = this.f4308t;
        long d10 = kVar.d();
        j jVar = this.f4306r;
        jVar.C0(d10);
        h a10 = jVar.a();
        a10.getClass();
        byte[] bArr = i91.a.a;
        long a11 = i91.a.a(a10, kVar, 0L, Long.MAX_VALUE, kVar.d());
        return a11 == -1 ? Math.min(j10, (jVar.a().s - kVar.d()) + 1) : Math.min(j10, a11);
    }
}
