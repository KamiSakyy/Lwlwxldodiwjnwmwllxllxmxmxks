package i9;

import h91.e0;
import java.io.Closeable;

/* loaded from: /home/user/work/p/classes.dex */
public final class o extends y {

    /* renamed from: r, reason: collision with root package name */
    public h91.a0 f26112r;

    /* renamed from: s, reason: collision with root package name */
    public h91.o f26113s;

    /* renamed from: t, reason: collision with root package name */
    public String f26114t;

    /* renamed from: u, reason: collision with root package name */
    public Closeable f26115u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f26116v;

    /* renamed from: w, reason: collision with root package name */
    public e0 f26117w;

    public o(h91.a0 a0Var, h91.o oVar, String str, Closeable closeable) {
        this.f26112r = a0Var;
        this.f26113s = oVar;
        this.f26114t = str;
        this.f26115u = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f26116v = true;
            e0 e0Var = this.f26117w;
            if (e0Var != null) {
                w9.f.a(e0Var);
            }
            Closeable closeable = this.f26115u;
            if (closeable != null) {
                w9.f.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // i9.y
    public final synchronized h91.a0 f() {
        if (this.f26116v) {
            throw new IllegalStateException("closed");
        }
        return this.f26112r;
    }

    @Override // i9.y
    public final h91.a0 m() {
        return f();
    }

    @Override // i9.y
    public final aa1.b r() {
        return null;
    }

    @Override // i9.y
    public final synchronized h91.j t() {
        if (this.f26116v) {
            throw new IllegalStateException("closed");
        }
        e0 e0Var = this.f26117w;
        if (e0Var != null) {
            return e0Var;
        }
        e0 c10 = h91.b.c(this.f26113s.e0(this.f26112r));
        this.f26117w = c10;
        return c10;
    }
}
