package a91;

import android.os.Build;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k71.k;
import m7.y;
import q81.u;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class e {
    public static volatile e a;
    public static final Logger b;

    static {
        try {
            for (Map.Entry entry : b91.c.b.entrySet()) {
                b91.c.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        e aVar = a.e ? new a() : null;
        if (aVar == null) {
            aVar = c.e ? new c() : null;
        }
        if (aVar == null) {
            throw new IllegalStateException(no.a.k("Expected Android API level 21+ but was ", Build.VERSION.SDK_INT));
        }
        a = aVar;
        b = Logger.getLogger(u.class.getName());
    }

    public abstract y c(X509TrustManager x509TrustManager);

    public e91.d d(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new e91.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public abstract void e(SSLSocket sSLSocket, String str, List list);

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        k.g(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public abstract String g(SSLSocket sSLSocket);

    public Object h() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean i(String str);

    public abstract void j(String str, int i, Throwable th);

    public void k(Object obj, String str) {
        k.g(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(str, 5, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        k.f(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

}
