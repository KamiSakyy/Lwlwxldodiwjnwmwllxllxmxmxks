package bi;

import androidx.lifecycle.l1;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.google.android.gms.internal.measurement.i4;
import in.j0;
import java.util.ArrayList;
import java.util.Map;
import k71.k;
import org.json.JSONObject;
import q81.a0;
import q81.q;
import q81.w;
import q81.xShadow;
import q81.y;
import sy.c0;
import t71.n;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends c0 {
    public static final b Companion = new b();
    public String r;
    public String s;
    public String t;

    public c(String str, String str2, String str3) {
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    @Override // sy.c0
    public final androidx.lifecycle.b k() {
        xShadow xVar = y.Companion;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eventType", "usage");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("guid", this.r);
        jSONObject2.put("appVersion", this.s);
        jSONObject2.put("ghesVersion", this.t);
        jSONObject2.put("osName", "Android");
        jSONObject.put("dimensions", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        k.f(jSONObject3, "toString(...)");
        n nVar = q.d;
        q g0 = i4.g0("application/json; charset=utf-8");
        xVar.getClass();
        w a = xShadow.a(jSONObject3, g0);
        l1 l1Var = new l1(11);
        l1Var.I("https://central.github.com/api/usage/mobile");
        l1Var.G(j0.class, new j0());
        l1Var.A(a);
        return new androidx.lifecycle.b(l1Var);
    }

    @Override // sy.c0
    public final xz0.c n(a0 a0Var) {
        if (a0Var.H) {
            xz0.b bVar = xz0.c.Companion;
            Boolean bool = Boolean.TRUE;
            bVar.getClass();
            return xz0.b.b(bool);
        }
        xz0.b bVar2 = xz0.c.Companion;
        ApiFailure apiFailure = new ApiFailure(ApiFailureType.HTTP_ERROR, (String) null, (String) null, Integer.valueOf(a0Var.u), (ArrayList) null, (Map) null, (Throwable) null, 112);
        bVar2.getClass();
        return xz0.b.a(apiFailure, (Object) null);
    }
}
