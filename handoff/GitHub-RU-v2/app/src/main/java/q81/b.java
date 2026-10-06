package q81;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b implements f0 {
    public static final b b = new b();
    public static final b c = new b();
    public static final b d = new b();

    public static final h a(b bVar, String str) {
        h hVar = new h(str);
        h.d.put(str, hVar);
        return hVar;
    }

    public static final void b(List list, StringBuilder sb) {
        q71.e N = aa1.b.N(aa1.b.b0(0, list.size()), 2);
        int i = N.r;
        int i2 = N.s;
        int i3 = N.t;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static e0 d(String str) {
        k71.k.g(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return e0.v;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return e0.u;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return e0.t;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return e0.w;
            }
        } else if (str.equals("SSLv3")) {
            return e0.x;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static v e(String str) {
        vShadow vVar = v.t;
        if (str.equals("http/1.0")) {
            return vVar;
        }
        vShadow vVar2 = v.u;
        if (str.equals("http/1.1")) {
            return vVar2;
        }
        vShadow vVar3 = v.x;
        if (str.equals("h2_prior_knowledge")) {
            return vVar3;
        }
        vShadow vVar4 = v.w;
        if (str.equals("h2")) {
            return vVar4;
        }
        vShadow vVar5 = v.v;
        if (str.equals("spdy/3.1")) {
            return vVar5;
        }
        vShadow vVar6 = v.y;
        if (str.equals("quic")) {
            return vVar6;
        }
        vShadow vVar7 = v.z;
        if (t71.w.F(str, "h3", false)) {
            return vVar7;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public synchronized h c(String str) {
        h hVar;
        String str2;
        try {
            k71.k.g(str, "javaName");
            LinkedHashMap linkedHashMap = h.d;
            hVar = (h) linkedHashMap.get(str);
            if (hVar == null) {
                if (t71.w.F(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    k71.k.f(substring, "substring(...)");
                    str2 = "SSL_".concat(substring);
                } else if (t71.w.F(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    k71.k.f(substring2, "substring(...)");
                    str2 = "TLS_".concat(substring2);
                } else {
                    str2 = str;
                }
                hVar = (h) linkedHashMap.get(str2);
                if (hVar == null) {
                    hVar = new h(str);
                }
                linkedHashMap.put(str, hVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return hVar;
    }
    public Object s() { return null; }
}
