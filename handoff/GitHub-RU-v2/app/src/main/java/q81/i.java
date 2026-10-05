package q81;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import q.y2;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i {
    public static final i e;
    public static final i f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        h hVar = h.r;
        h hVar2 = h.s;
        h hVar3 = h.t;
        h hVar4 = h.l;
        h hVar5 = h.n;
        h hVar6 = h.m;
        h hVar7 = h.o;
        h hVar8 = h.q;
        h hVar9 = h.p;
        List r = x61.l.r(new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9});
        List r2 = x61.l.r(new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.j, h.k, h.h, h.i, h.f, h.g, h.e});
        y2 y2Var = new y2();
        h[] hVarArr = (h[]) r.toArray(new h[0]);
        y2Var.c((h[]) Arrays.copyOf(hVarArr, hVarArr.length));
        e0 e0Var = e0.t;
        e0 e0Var2 = e0.u;
        y2Var.e(new e0[]{e0Var, e0Var2});
        y2Var.b = true;
        y2Var.a();
        y2 y2Var2 = new y2();
        h[] hVarArr2 = (h[]) r2.toArray(new h[0]);
        y2Var2.c((h[]) Arrays.copyOf(hVarArr2, hVarArr2.length));
        y2Var2.e(new e0[]{e0Var, e0Var2});
        y2Var2.b = true;
        e = y2Var2.a();
        y2 y2Var3 = new y2();
        h[] hVarArr3 = (h[]) r2.toArray(new h[0]);
        y2Var3.c((h[]) Arrays.copyOf(hVarArr3, hVarArr3.length));
        y2Var3.e(new e0[]{e0Var, e0Var2, e0.v, e0.w});
        y2Var3.b = true;
        y2Var3.a();
        f = new i(false, false, null, null);
    }

    public i(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, java.lang.String[]] */
    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        k71.k.d(enabledCipherSuites);
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = r81.e.j(strArr, enabledCipherSuites, h.c);
        }
        ?? r2 = this.d;
        if (r2 != 0) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            k71.k.f(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = r81.e.j(enabledProtocols2, r2, z61.a.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        k71.k.d(supportedCipherSuites);
        g gVar = h.c;
        byte[] bArr = r81.e.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (gVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            k71.k.f(str, "get(...)");
            k71.k.g(enabledCipherSuites, "<this>");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            k71.k.f(copyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        y2 y2Var = new y2();
        y2Var.a = this.a;
        y2Var.c = strArr;
        y2Var.d = r2;
        y2Var.b = this.b;
        y2Var.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        y2Var.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        i a = y2Var.a();
        if (a.c() != null) {
            sSLSocket.setEnabledProtocols(a.d);
        }
        if (a.b() != null) {
            sSLSocket.setEnabledCipherSuites(a.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(h.b.c(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            e0.s.getClass();
            arrayList.add(b.d(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z = iVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, iVar.c) && Arrays.equals(this.d, iVar.d) && this.b == iVar.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
