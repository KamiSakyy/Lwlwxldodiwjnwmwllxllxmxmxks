package b91;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h implements n {
    public static final f a = new f();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, g.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }

    @Override // b91.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // b91.n
    public final boolean b() {
        return b;
    }

    @Override // b91.n
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // b91.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        k71.k.g(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            a91.e eVar = a91.e.a;
            parameters.setApplicationProtocols((String[]) d9.e.a(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
