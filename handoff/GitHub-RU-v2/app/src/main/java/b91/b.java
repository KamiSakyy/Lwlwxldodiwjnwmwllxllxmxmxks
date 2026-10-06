package b91;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import m7.y;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b extends y {
    public X509TrustManager a;
    public X509TrustManagerExtensions b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.a = x509TrustManager;
        this.b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).a == this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final List r(String str, List list) {
        k71.k.g(list, "chain");
        k71.k.g(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            k71.k.f(checkServerTrusted, "checkServerTrusted(...)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
    public static final Object r = null;
}
