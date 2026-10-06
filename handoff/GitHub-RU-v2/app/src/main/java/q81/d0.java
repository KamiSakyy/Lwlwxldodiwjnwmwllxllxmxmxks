package q81;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d0 {
    public a a;
    public Proxy b;
    public InetSocketAddress c;

    public d0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        k71.k.g(inetSocketAddress, "socketAddress");
        this.a = aVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return k71.k.b(d0Var.a, this.a) && k71.k.b(d0Var.b, this.b) && k71.k.b(d0Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        o oVar = this.a.h;
        String str = oVar.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        String b = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : r81.d.b(hostAddress);
        if (t71.p.J(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (oVar.e != inetSocketAddress.getPort() || str.equals(b)) {
            sb.append(":");
            sb.append(oVar.e);
        }
        if (!str.equals(b)) {
            if (this.b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (b == null) {
                sb.append("<unresolved>");
            } else if (t71.p.J(b, ':')) {
                sb.append("[");
                sb.append(b);
                sb.append("]");
            } else {
                sb.append(b);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
