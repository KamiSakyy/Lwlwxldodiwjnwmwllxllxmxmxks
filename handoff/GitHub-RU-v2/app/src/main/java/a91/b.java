package a91;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b implements e91.d {
    public X509TrustManager a;
    public Method b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.a = x509TrustManager;
        this.b = method;
    }

    @Override // e91.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.b.invoke(this.a, x509Certificate);
            k.e(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
    }
}
