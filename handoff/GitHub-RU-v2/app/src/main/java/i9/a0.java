package i9;

import c30.o0;
import h91.d0;
import h91.e0;
import java.io.File;

/* loaded from: /home/user/work/p/classes.dex */
public final class a0 extends y {

    /* renamed from: r, reason: collision with root package name */
    public aa1.b f26079r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f26080s;

    /* renamed from: t, reason: collision with root package name */
    public h91.j f26081t;

    /* renamed from: u, reason: collision with root package name */
    public j71.a f26082u;

    /* renamed from: v, reason: collision with root package name */
    public h91.a0 f26083v;

    public a0(h91.j jVar, j71.a aVar, aa1.b bVar) {
        this.f26079r = bVar;
        this.f26081t = jVar;
        this.f26082u = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f26080s = true;
            h91.j jVar = this.f26081t;
            if (jVar != null) {
                w9.f.a(jVar);
            }
            h91.a0 a0Var = this.f26083v;
            if (a0Var != null) {
                h91.w wVar = h91.o.r;
                wVar.getClass();
                wVar.A(a0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // i9.y
    public final synchronized h91.a0 f() {
        Throwable th;
        if (this.f26080s) {
            throw new IllegalStateException("closed");
        }
        h91.a0 a0Var = this.f26083v;
        if (a0Var != null) {
            return a0Var;
        }
        j71.a aVar = this.f26082u;
        k71.k.d(aVar);
        File file = (File) aVar.a();
        if (!file.isDirectory()) {
            throw new IllegalStateException("cacheDirectory must be a directory.");
        }
        String str = h91.a0.s;
        h91.a0 e5 = o0.e(File.createTempFile("tmp", null, file));
        d0 b10 = h91.b.b(h91.o.r.b0(e5));
        try {
            h91.j jVar = this.f26081t;
            k71.k.d(jVar);
            b10.G(jVar);
            try {
                b10.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                b10.close();
            } catch (Throwable th4) {
                sy.u.a(th3, th4);
            }
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        this.f26081t = null;
        this.f26083v = e5;
        this.f26082u = null;
        return e5;
    }

    @Override // i9.y
    public final synchronized h91.a0 m() {
        if (this.f26080s) {
            throw new IllegalStateException("closed");
        }
        return this.f26083v;
    }

    @Override // i9.y
    public final aa1.b r() {
        return this.f26079r;
    }

    @Override // i9.y
    public final synchronized h91.j t() {
        if (this.f26080s) {
            throw new IllegalStateException("closed");
        }
        h91.j jVar = this.f26081t;
        if (jVar != null) {
            return jVar;
        }
        h91.w wVar = h91.o.r;
        h91.a0 a0Var = this.f26083v;
        k71.k.d(a0Var);
        e0 c10 = h91.b.c(wVar.e0(a0Var));
        this.f26081t = c10;
        return c10;
    }
}
