package q81;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: /home/user/work/p/classes5.dex */
public final class t {
    public int A;
    public long B;
    public s21.a C;
    public t81.e D;
    public kk.a b;
    public m11.r e;
    public boolean f;
    public boolean g;
    public b h;
    public boolean i;
    public boolean j;
    public b k;
    public b l;
    public ProxySelector m;
    public b n;
    public SocketFactory o;
    public SSLSocketFactory p;
    public X509TrustManager q;
    public List r;
    public List s;
    public e91.c t;
    public f u;
    public m7.y v;
    public int w;
    public int x;
    public int y;
    public int z;
    public w51.r a = new w51.r(23);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public t() {
        TimeZone timeZone = r81.g.a;
        this.e = new m11.r(12);
        this.f = true;
        this.g = true;
        b bVar = b.b;
        this.h = bVar;
        this.i = true;
        this.j = true;
        this.k = b.c;
        this.l = b.d;
        this.n = bVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        k71.k.f(socketFactory, "getDefault(...)");
        this.o = socketFactory;
        this.r = u.F;
        this.s = u.E;
        this.t = e91.c.a;
        this.u = f.c;
        this.w = 10000;
        this.x = 10000;
        this.y = 10000;
        this.A = 60000;
        this.B = 1024L;
    }

    public final void a(long j, TimeUnit timeUnit) {
        k71.k.g(timeUnit, "unit");
        this.w = r81.g.b("timeout", j, timeUnit);
    }

    public final void b(long j, TimeUnit timeUnit) {
        k71.k.g(timeUnit, "unit");
        this.x = r81.g.b("timeout", j, timeUnit);
    }
}
