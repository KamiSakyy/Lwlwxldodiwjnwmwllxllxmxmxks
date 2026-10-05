package b91;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: /home/user/work/p/classes5.dex */
public final class k implements n {
    public static final i a = new i();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, j.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (j.a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // b91.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // b91.n
    public final boolean b() {
        return b;
    }

    @Override // b91.n
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // b91.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        k71.k.g(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            a91.e eVar = a91.e.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) d9.e.a(list).toArray(new String[0]));
        }
    }
}
