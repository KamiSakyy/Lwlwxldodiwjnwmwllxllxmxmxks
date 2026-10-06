package b91;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: /home/user/work/p/classes5.dex */
public final class m implements n {
    public l a;
    public n b;

    public m(l lVar) {
        this.a = lVar;
    }

    @Override // b91.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // b91.n
    public final boolean b() {
        return true;
    }

    @Override // b91.n
    public final String c(SSLSocket sSLSocket) {
        n e = e(sSLSocket);
        if (e != null) {
            return e.c(sSLSocket);
        }
        return null;
    }

    @Override // b91.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        k71.k.g(list, "protocols");
        n e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
