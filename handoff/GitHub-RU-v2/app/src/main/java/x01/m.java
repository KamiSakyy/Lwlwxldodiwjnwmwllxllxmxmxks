package x01;

import androidx.lifecycle.l1;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import in.j0;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import q81.a0;
import q81.o;
import sy.c0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m extends c0 implements g {
    public static final l Companion = new l();
    public final String r;
    public final String s;

    public m(String str, String str2) {
        k71.k.g(str, "token");
        this.r = str;
        this.s = str2;
    }

    @Override // x01.g
    public final String a() {
        return "VerifyUserRequest";
    }

    public final androidx.lifecycle.b k() {
        l1 l1Var = new l1(11);
        String str = this.s;
        l1Var.I(((str == null || str.length() == 0) ? "https://api.github.com" : xb.a.a(str) ? String.format("https://api.%s", Arrays.copyOf(new Object[]{str}, 1)) : String.format("https://%s/api/v3", Arrays.copyOf(new Object[]{str}, 1))).concat("/user"));
        l1Var.g("Authorization", "token " + this.r);
        l1Var.G(j0.class, new j0());
        l1Var.r();
        return new androidx.lifecycle.b(l1Var);
    }

    public final xz0.c n(a0 a0Var) {
        String str;
        if (!a0Var.H) {
            xz0.b bVar = xz0.c.Companion;
            ApiFailure apiFailure = new ApiFailure(ApiFailureType.HTTP_ERROR, null, "VerifyUserRequest", Integer.valueOf(a0Var.u), null, null, null, 112);
            bVar.getClass();
            return xz0.b.a(apiFailure, null);
        }
        try {
            ((o) a0Var.r.b).getClass();
            q81.c0 c0Var = a0Var.x;
            if (c0Var != null) {
                str = c0Var.t();
                if (str == null) {
                }
                String string = new JSONObject(str).getString("login");
                xz0.c.Companion.getClass();
                return xz0.b.b(string);
            }
            str = "";
            String string2 = new JSONObject(str).getString("login");
            xz0.c.Companion.getClass();
            return xz0.b.b(string2);
        } catch (JSONException e) {
            xz0.b bVar2 = xz0.c.Companion;
            ApiFailure apiFailure2 = new ApiFailure(ApiFailureType.PARSE_ERROR, "json parsing error", "VerifyUserRequest", null, null, null, e, 56);
            bVar2.getClass();
            return xz0.b.a(apiFailure2, null);
        }
    }
}
