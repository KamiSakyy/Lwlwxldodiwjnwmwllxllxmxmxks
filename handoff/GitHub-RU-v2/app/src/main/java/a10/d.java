package a10;

import androidx.compose.foundation.lazy.layout.t1;
import androidx.lifecycle.l1;
import com.google.android.gms.internal.measurement.b4;
import h91.j0;
import java.util.ArrayList;
import k21.f;
import k71.k;
import l7.x1;
import n0.w;
import q81.a0;
import q81.c0;
import q81.f0;
import q81.m;
import q81.n;
import q81.p;
import q81.v;
import q81.z;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements p {
    public final /* synthetic */ int a;

    public final a0 a(w wVar) {
        a0 a0Var;
        n nVar;
        int i;
        switch (this.a) {
            case 0:
                l1 s = ((androidx.lifecycle.b) wVar.i).s();
                s.g("X-GitHub-Api-Version", "2026-03-10");
                return wVar.f(new androidx.lifecycle.b(s));
            case 1:
                System.currentTimeMillis();
                androidx.lifecycle.b bVar = (androidx.lifecycle.b) wVar.i;
                k.g(bVar, "request");
                Throwable th2 = null;
                x1 x1Var = new x1(bVar, (Object) null);
                if (bVar.i().j) {
                    x1Var = new x1((Object) null, (Object) null);
                }
                androidx.lifecycle.b bVar2 = (androidx.lifecycle.b) x1Var.r;
                a0 a0Var2 = (a0) x1Var.s;
                int i2 = 0;
                if (bVar2 == null && a0Var2 == null) {
                    return new a0(bVar, v.u, "Unsatisfiable Request (only-if-cached)", 504, (m) null, new n((String[]) new ArrayList(20).toArray(new String[0])), c0.r, (j0) null, (a0) null, (a0) null, (a0) null, -1L, System.currentTimeMillis(), (t1) null, f0.a);
                }
                if (bVar2 == null) {
                    k.d(a0Var2);
                    z f = a0Var2.f();
                    a0 h0 = b4.h0(a0Var2);
                    z.b("cacheResponse", h0);
                    f.j = h0;
                    return f.a();
                }
                a0 f2 = wVar.f(bVar2);
                if (a0Var2 == null) {
                    a0Var = null;
                } else {
                    if (f2.u == 304) {
                        z f3 = a0Var2.f();
                        n nVar2 = a0Var2.w;
                        n nVar3 = f2.w;
                        ia.d dVar = new ia.d(4);
                        int size = nVar2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Throwable th3 = th2;
                            String b = nVar2.b(i3);
                            String e = nVar2.e(i3);
                            if ("Warning".equalsIgnoreCase(b)) {
                                nVar = nVar2;
                                i = 0;
                                if (t71.w.F(e, "1", false)) {
                                    i3++;
                                    i2 = i;
                                    th2 = th3;
                                    nVar2 = nVar;
                                }
                            } else {
                                nVar = nVar2;
                                i = 0;
                            }
                            if ("Content-Length".equalsIgnoreCase(b) || "Content-Encoding".equalsIgnoreCase(b) || "Content-Type".equalsIgnoreCase(b) || !f.u(b) || nVar3.a(b) == null) {
                                dVar.b(b, e);
                            }
                            i3++;
                            i2 = i;
                            th2 = th3;
                            nVar2 = nVar;
                        }
                        Throwable th4 = th2;
                        int size2 = nVar3.size();
                        while (i2 < size2) {
                            String b2 = nVar3.b(i2);
                            if (!"Content-Length".equalsIgnoreCase(b2) && !"Content-Encoding".equalsIgnoreCase(b2) && !"Content-Type".equalsIgnoreCase(b2) && f.u(b2)) {
                                dVar.b(b2, nVar3.e(i2));
                            }
                            i2++;
                        }
                        f3.f = dVar.e().d();
                        f3.l = f2.C;
                        f3.m = f2.D;
                        a0 h02 = b4.h0(a0Var2);
                        z.b("cacheResponse", h02);
                        f3.j = h02;
                        a0 h03 = b4.h0(f2);
                        z.b("networkResponse", h03);
                        f3.i = h03;
                        f3.a();
                        f2.x.close();
                        k.d(th4);
                        throw th4;
                    }
                    a0Var = null;
                    r81.e.b(a0Var2.x);
                }
                z f4 = f2.f();
                a0 h04 = a0Var2 != null ? b4.h0(a0Var2) : a0Var;
                z.b("cacheResponse", h04);
                f4.j = h04;
                a0 h05 = b4.h0(f2);
                z.b("networkResponse", h05);
                f4.i = h05;
                return f4.a();
            case 2:
                l1 s2 = ((androidx.lifecycle.b) wVar.i).s();
                s2.g("Accept", "text/html");
                return wVar.f(new androidx.lifecycle.b(s2));
            case 3:
                l1 s3 = ((androidx.lifecycle.b) wVar.i).s();
                s3.g("X-GitHub-Api-Version", "2022-11-28");
                s3.g("Accept", "text/html");
                return wVar.f(new androidx.lifecycle.b(s3));
            case 4:
                l1 s4 = ((androidx.lifecycle.b) wVar.i).s();
                s4.g("Accept", "text/html");
                return wVar.f(new androidx.lifecycle.b(s4));
            default:
                l1 s5 = ((androidx.lifecycle.b) wVar.i).s();
                s5.g("Accept", "text/html");
                return wVar.f(new androidx.lifecycle.b(s5));
        }
    }
}
