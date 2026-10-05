package a91;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import b91.h;
import b91.k;
import b91.m;
import b91.n;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import m7.y;
import x61.l;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a extends e implements d {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        int i = 0;
        ArrayList K = l.K(new n[]{Build.VERSION.SDK_INT >= 29 ? new b91.a() : null, new m(b91.e.e), new m(k.a), new m(h.a)});
        ArrayList arrayList = new ArrayList();
        int size = K.size();
        while (i < size) {
            Object obj = K.get(i);
            i++;
            if (((n) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // a91.d
    public final void a(Context context) {
        this.c = context;
    }

    @Override // a91.d
    public final Context b() {
        return this.c;
    }

    @Override // a91.e
    public final y c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        b91.b bVar = x509TrustManagerExtensions != null ? new b91.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new e91.a(d(x509TrustManager));
    }

    @Override // a91.e
    public final e91.d d(X509TrustManager x509TrustManager) {
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(x509TrustManager);
    }

    @Override // a91.e
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        k71.k.g(list, "protocols");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((n) obj).a(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // a91.e
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((n) obj).a(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            return nVar.c(sSLSocket);
        }
        return null;
    }

    @Override // a91.e
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // a91.e
    public final boolean i(String str) {
        k71.k.g(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // a91.e
    public final void j(String str, int i, Throwable th) {
        k71.k.g(str, "message");
        if (i == 5) {
            boolean z = c.e;
        } else {
            boolean z2 = c.e;
        }
    }

    @Override // a91.e
    public final void k(Object obj, String str) {
        k71.k.g(str, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, str);
        } else {
            k71.k.e(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            ((CloseGuard) obj).warnIfOpen();
        }
    }

    @Override // a91.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
