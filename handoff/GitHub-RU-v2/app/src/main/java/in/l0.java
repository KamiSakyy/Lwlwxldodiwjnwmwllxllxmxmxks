package in;

import androidx.lifecycle.l1;
import com.github.rudroid.common.e;
import com.google.android.gms.internal.measurement.i4;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 extends c71.j implements j71.e {
    public final /* synthetic */ n0 v;
    public final /* synthetic */ String w;
    public final /* synthetic */ t x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(a71.c cVar, t tVar, n0 n0Var, String str) {
        super(2, cVar);
        this.v = n0Var;
        this.w = str;
        this.x = tVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new l0(cVar, this.x, this.v, this.w);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        Object zVar;
        t tVar = this.x;
        String str = tVar.d;
        String str2 = tVar.b;
        n0 n0Var = this.v;
        qe.a aVar = n0Var.d;
        b71.a aVar2 = b71.a.r;
        sy.y.j(obj);
        try {
            com.github.rudroid.common.e.Companion.getClass();
            aVar.f(e.a.c);
            l1 l1Var = new l1(11);
            l1Var.I(this.w);
            l1Var.G(j0.class, new j0(false, true));
            q81.x xVar = q81.y.Companion;
            t71.n nVar = q81.q.d;
            q81.q g0 = i4.g0("application/json; charset=utf-8");
            xVar.getClass();
            l1Var.z("PUT", q81.x.a("", g0));
            q81.a0Shadow e = n0Var.a.b(new androidx.lifecycle.b(l1Var)).e();
            int i = e.u;
            q81.c0 c0Var = e.x;
            try {
                if (e.H) {
                    zVar = new h0(i4.I(new JSONObject(c0Var.t()), "href"), str2, str);
                } else {
                    String t = c0Var.t();
                    aVar.b("MediaFileUpload", new IOException("finishing upload failed: " + i + " / " + t71.w.C(t, str2, "filename_redacted")), true);
                    String str3 = "finishing upload failed: " + i + " / " + t;
                    k71.k.g(str3, "errorMessage");
                    zVar = new z(str3, str2, str);
                }
                e.close();
                return zVar;
            } finally {
            }
        } catch (Throwable th2) {
            throw i4.G(th2, "finishing upload failed", str2, str);
        }
    }
}
