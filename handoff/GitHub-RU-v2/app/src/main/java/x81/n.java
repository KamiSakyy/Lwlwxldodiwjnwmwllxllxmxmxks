package x81;

import java.io.IOException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class n implements j71.a {
    public final s r;
    public final /* synthetic */ o s;

    public n(o oVar, s sVar) {
        this.s = oVar;
        this.r = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x81.o] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [x81.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final Object a() {
        Throwable th;
        a aVar;
        o r0 = this.s;
        s sVar = this.r;
        a aVar2 = a.v;
        x81.a r3 = (x81.a) (1);
        IOException e = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    r0.f(r3, aVar2, e);
                    r81.e.b(sVar);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                aVar = aVar2;
            }
            if (!sVar.f(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    r3 = aVar2;
                    r0.f(r3, aVar2, e);
                    r81.e.b(sVar);
                    throw th;
                }
            } while (sVar.f(false, this));
            aVar = a.t;
            try {
                aVar2 = a.y;
                r0.f(aVar, aVar2, null);
                r3 = aVar;
            } catch (IOException e3) {
                e = e3;
                aVar2 = a.u;
                r0.f(aVar2, aVar2, e);
                r3 = aVar;
                r81.e.b(sVar);
                return w61.a0.a;
            }
            r81.e.b(sVar);
            return w61.a0.a;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
