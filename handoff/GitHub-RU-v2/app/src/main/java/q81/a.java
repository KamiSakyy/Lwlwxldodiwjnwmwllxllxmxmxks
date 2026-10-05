package q81;

import com.github.rudroid.copilot.h1;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a {
    public final b a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final f e;
    public final b f;
    public final ProxySelector g;
    public final o h;
    public final List i;
    public final List j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        k71.k.g(str, "uriHost");
        k71.k.g(bVar, "dns");
        k71.k.g(socketFactory, "socketFactory");
        k71.k.g(bVar2, "proxyAuthenticator");
        k71.k.g(list, "protocols");
        k71.k.g(list2, "connectionSpecs");
        k71.k.g(proxySelector, "proxySelector");
        this.a = bVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = fVar;
        this.f = bVar2;
        this.g = proxySelector;
        l7.e eVar = new l7.e(1);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            eVar.e = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            eVar.e = "https";
        }
        String b = r81.d.b(f91.a.d(0, 0, 7, str));
        if (b == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        eVar.h = b;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(no.a.k("unexpected port: ", i).toString());
        }
        eVar.b = i;
        this.h = eVar.c();
        this.i = r81.g.j(list);
        this.j = r81.g.j(list2);
    }

    public final boolean a(a aVar) {
        k71.k.g(aVar, "that");
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.f, aVar.f) && k71.k.b(this.i, aVar.i) && k71.k.b(this.j, aVar.j) && k71.k.b(this.g, aVar.g) && k71.k.b(this.c, aVar.c) && k71.k.b(this.d, aVar.d) && k71.k.b(this.e, aVar.e) && this.h.e == aVar.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.h, aVar.h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + f1.e.c(this.j, f1.e.c(this.i, (this.f.hashCode() + ((this.a.hashCode() + h1.i(527, this.h.i, 31)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        o oVar = this.h;
        sb.append(oVar.d);
        sb.append(':');
        sb.append(oVar.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
