package x01;

import android.net.Uri;
import androidx.lifecycle.l1;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import in.j0;
import org.json.JSONException;
import org.json.JSONObject;
import q81.a0;
import sy.c0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends c0 implements g {
    public static final e Companion = new e();
    public final String r;
    public final q81.l s;

    public f(String str, String str2, String str3, String str4, String str5, String str6) {
        k71.k.g(str, "clientId");
        k71.k.g(str2, "clientSecret");
        k71.k.g(str4, "code");
        k71.k.g(str5, "state");
        this.r = str6;
        q81.k kVar = new q81.k(0);
        kVar.a("client_id", str);
        kVar.a("client_secret", str2);
        kVar.a("code", str4);
        kVar.a("state", str5);
        if (str3 != null) {
            kVar.a("code_verifier", str3);
        }
        this.s = new q81.l(kVar.a, kVar.b);
    }

    @Override // x01.g
    public final String a() {
        return "OAuthRequest";
    }

    public final androidx.lifecycle.b k() {
        String str;
        l1 l1Var = new l1(11);
        String str2 = this.r;
        if (str2 == null || str2.length() == 0 || xb.c.a(str2)) {
            str = "https://github.com/login/oauth/access_token";
        } else {
            str = new Uri.Builder().scheme("https").authority(str2).path("login/oauth/access_token").build().toString();
            k71.k.d(str);
        }
        l1Var.I(str);
        l1Var.g("Accept", "application/json");
        l1Var.A(this.s);
        l1Var.G(j0.class, new j0(true, true));
        return new androidx.lifecycle.b(l1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: JSONException -> 0x0016, TryCatch #0 {JSONException -> 0x0016, blocks: (B:7:0x0007, B:10:0x000f, B:13:0x001b, B:15:0x002d, B:17:0x0048), top: B:6:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[Catch: JSONException -> 0x0016, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0016, blocks: (B:7:0x0007, B:10:0x000f, B:13:0x001b, B:15:0x002d, B:17:0x0048), top: B:6:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xz0.c n(a0 a0Var) {
        String str;
        String optString;
        int i = a0Var.u;
        if (!a0Var.H) {
            xz0.b bVar = xz0.c.Companion;
            ApiFailure apiFailure = new ApiFailure(ApiFailureType.HTTP_ERROR, null, null, Integer.valueOf(i), null, null, null, 112);
            bVar.getClass();
            return xz0.b.a(apiFailure, null);
        }
        try {
            q81.c0 c0Var = a0Var.x;
            if (c0Var != null) {
                str = c0Var.t();
                if (str == null) {
                }
                JSONObject jSONObject = new JSONObject(str);
                optString = jSONObject.optString("error", "");
                k71.k.d(optString);
                if (optString.length() > 0) {
                    String string = jSONObject.getString("access_token");
                    xz0.c.Companion.getClass();
                    return xz0.b.b(string);
                }
                xz0.b bVar2 = xz0.c.Companion;
                ApiFailure apiFailure2 = new ApiFailure(ApiFailureType.OAUTH_ERROR, optString, null, Integer.valueOf(i), null, null, null, 52);
                bVar2.getClass();
                return xz0.b.a(apiFailure2, null);
            }
            str = "";
            JSONObject jSONObject2 = new JSONObject(str);
            optString = jSONObject2.optString("error", "");
            k71.k.d(optString);
            if (optString.length() > 0) {
            }
        } catch (JSONException e) {
            xz0.b bVar3 = xz0.c.Companion;
            ApiFailure apiFailure3 = new ApiFailure(ApiFailureType.PARSE_ERROR, "json parsing error", null, Integer.valueOf(i), null, null, e, 52);
            bVar3.getClass();
            return xz0.b.a(apiFailure3, null);
        }
    }
}
