package x01;

import android.util.Base64;
import androidx.lifecycle.l1;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.google.android.gms.internal.measurement.i4;
import in.j0;
import q81.a0;
import q81.q;
import q81.xShadow;
import q81.y;
import sy.c0;
import t71.n;

/* loaded from: /home/user/work/p/classes4.dex */
public class b extends c0 implements g {
    public static final a Companion = new a();
    public String r;
    public oa.j s;
    public String t;
    public String u;

    public b(String str, String str2, oa.j jVar, String str3) {
        k71.k.g(jVar, "user");
        this.r = str;
        this.s = jVar;
        this.t = str3;
        byte[] bytes = f1.e.h(str, ":", str2).getBytes(t71.a.a);
        k71.k.f(bytes, "getBytes(...)");
        this.u = Base64.encodeToString(bytes, 2);
    }

    @Override // x01.g
    public final String a() {
        return "DeleteOAuthRequest";
    }

    public final androidx.lifecycle.b k() {
        l1 l1Var = new l1(11);
        l1Var.I(this.s.a() + "/applications/" + this.r + "/token");
        StringBuilder sb = new StringBuilder("Basic ");
        sb.append(this.u);
        l1Var.g("Authorization", sb.toString());
        l1Var.G(j0.class, new j0());
        xShadow xVar = y.Companion;
        String z = f1.e.z("{ \"access_token\": \"", this.t, "\" }");
        n nVar = q.d;
        q g0 = i4.g0("application/json; charset=utf-8");
        xVar.getClass();
        l1Var.z("DELETE", xShadow.a(z, g0));
        return new androidx.lifecycle.b(l1Var);
    }

    public final xz0.c n(a0 a0Var) {
        if (a0Var.H) {
            xz0.b bVar = xz0.c.Companion;
            Boolean bool = Boolean.TRUE;
            bVar.getClass();
            return xz0.b.b(bool);
        }
        xz0.b bVar2 = xz0.c.Companion;
        ApiFailure apiFailure = new ApiFailure(ApiFailureType.HTTP_ERROR, null, null, Integer.valueOf(a0Var.u), null, null, null, 112);
        bVar2.getClass();
        return xz0.b.a(apiFailure, null);
    }
}
