package q81;

import java.io.Closeable;
import java.nio.charset.Charset;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class c0 implements Closeable {
    public static final b0 r;

    static {
        h91.kShadow kVar = h91.kShadow.u;
        k71.k.g(kVar, "<this>");
        h91.h hVar = new h91.h();
        hVar.E0(kVar);
        r = new b0(null, kVar.r.length, hVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r81.e.b(r());
    }

    public abstract long f();

    public abstract q m();

    public abstract h91.j r();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final String t() {
        Charset charset;
        h91.j r2 = r();
        String th = null;
        try {
            q m = m();
            if (m == null || (charset = q.a(m)) == null) {
                charset = t71.a.a;
            }
            String h0 = r2.h0(r81.g.f(r2, charset));
            try {
                r2.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = h0;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != null) {
                try {
                    r2.close();
                } catch (Throwable th4) {
                    sy.u.a((Throwable) th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
