package x01;

import androidx.lifecycle.l1;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import q81.a0;
import sy.c0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends c0 implements g {
    public static final c Companion = new c();
    public String r;

    public d(String str) {
        k71.k.g(str, "enterpriseServerUrl");
        this.r = (str.length() == 0 ? "https://api.github.com" : xb.a.a(str) ? String.format("https://api.%s", Arrays.copyOf(new Object[]{str}, 1)) : String.format("https://%s/api/v3", Arrays.copyOf(new Object[]{str}, 1))).concat("/meta");
    }

    @Override // x01.g
    public final String a() {
        return "FetchServerVersion";
    }

    public final androidx.lifecycle.b k() {
        l1 l1Var = new l1(11);
        l1Var.I(this.r);
        l1Var.r();
        return new androidx.lifecycle.b(l1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[Catch: JSONException -> 0x0014, TryCatch #0 {JSONException -> 0x0014, blocks: (B:7:0x0005, B:10:0x000d, B:13:0x0019, B:15:0x002e, B:17:0x0038), top: B:6:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038 A[Catch: JSONException -> 0x0014, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0014, blocks: (B:7:0x0005, B:10:0x000d, B:13:0x0019, B:15:0x002e, B:17:0x0038), top: B:6:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xz0.c n(a0 a0Var) {
        String str;
        String optString;
        if (!a0Var.H) {
            xz0.b bVar = xz0.c.Companion;
            ApiFailure apiFailure = new ApiFailure(ApiFailureType.HTTP_ERROR, null, null, Integer.valueOf(a0Var.u), null, null, null, 112);
            bVar.getClass();
            return xz0.b.a(apiFailure, null);
        }
        try {
            q81.c0 c0Var = a0Var.x;
            if (c0Var != null) {
                str = c0Var.t();
                if (str == null) {
                }
                optString = new JSONObject(str).optString("installed_version", "");
                if (k41.b.i(optString).equals(qa.a.d)) {
                    xz0.c.Companion.getClass();
                    return xz0.b.b(optString);
                }
                xz0.b bVar2 = xz0.c.Companion;
                ApiFailure apiFailure2 = new ApiFailure(ApiFailureType.PARSE_ERROR, "server version not found in response", null, null, null, null, null, 120);
                bVar2.getClass();
                return xz0.b.a(apiFailure2, null);
            }
            str = "";
            optString = new JSONObject(str).optString("installed_version", "");
            if (k41.b.i(optString).equals(qa.a.d)) {
            }
        } catch (JSONException e) {
            xz0.b bVar3 = xz0.c.Companion;
            ApiFailure apiFailure3 = new ApiFailure(ApiFailureType.PARSE_ERROR, "json parsing error", null, null, null, null, e, 56);
            bVar3.getClass();
            return xz0.b.a(apiFailure3, null);
        }
    }

    public d(oa.j jVar) {
        this.r = jVar.a().concat("/meta");
    }
}
