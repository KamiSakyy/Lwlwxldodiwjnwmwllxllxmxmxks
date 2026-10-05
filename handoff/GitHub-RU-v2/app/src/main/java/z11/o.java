package z11;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c21.s;
import c21.t;
import c21.u;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import m7.y;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o {
    public static final j a;
    public static final j b;
    public static volatile t c;
    public static final Object d;
    public static Context e;

    static {
        new j(0, k.N("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new j(1, k.N("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new j(2, k.N("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new j(3, k.N("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new j(4, k.N("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new j(5, k.N("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    public static void a() {
        t rVar;
        if (c != null) {
            return;
        }
        u.g(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder b2 = k21.e.c(e, k21.e.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = s.g;
                    if (b2 == null) {
                        rVar = null;
                    } else {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        rVar = queryLocalInterface instanceof t ? (t) queryLocalInterface : new c21.r(b2, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);
                    }
                    c = rVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static r b(String str, l lVar, boolean z, boolean z2) {
        try {
            a();
            u.g(e);
            try {
                t tVar = c;
                j21.b bVar = new j21.b(e.getPackageManager());
                c21.r rVar = (c21.r) tVar;
                Parcel g = rVar.g();
                int i = o21.g.a;
                boolean z3 = true;
                g.writeInt(1);
                int Z = y.Z(g, 20293);
                y.V(g, 1, str);
                y.T(g, 2, lVar);
                y.Y(g, 3, 4);
                g.writeInt(z ? 1 : 0);
                y.Y(g, 4, 4);
                g.writeInt(z2 ? 1 : 0);
                y.a0(g, Z);
                o21.g.b(g, bVar);
                Parcel e2 = rVar.e(g, 5);
                if (e2.readInt() == 0) {
                    z3 = false;
                }
                e2.recycle();
                return z3 ? r.c : new q(new m(z, str, lVar));
            } catch (RemoteException e3) {
                return r.c("module call", e3);
            }
        } catch (DynamiteModule$LoadingException e4) {
            return r.c("module init: ".concat(String.valueOf(e4.getMessage())), e4);
        }
    }
}
