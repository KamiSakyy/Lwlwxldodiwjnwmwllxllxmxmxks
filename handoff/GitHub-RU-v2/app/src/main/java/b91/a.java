package b91;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a implements n {
    @Override // b91.n
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // b91.n
    public final boolean b() {
        a91.e eVar = a91.e.a;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // b91.n
    public final String c(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // b91.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        k71.k.g(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            a91.e eVar = a91.e.a;
            sSLParameters.setApplicationProtocols((String[]) d9.e.a(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
    public Object Q(Object p1) { return null; }
    public Object e(Object p1) { return null; }
}
