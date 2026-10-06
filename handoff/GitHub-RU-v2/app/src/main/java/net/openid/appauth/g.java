package net.openid.appauth;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l7.x1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g {
    public static final x1 b = new x1("authorization_endpoint", (Object) null);
    public static final x1 c = new x1("token_endpoint", (Object) null);
    public static final x1 d = new x1("end_session_endpoint", (Object) null);
    public static final x1 e = new x1("registration_endpoint", (Object) null);
    public static final List f;
    public JSONObject a;

    static {
        Arrays.asList("authorization_code", "implicit");
        Collections.singletonList("client_secret_basic");
        Collections.singletonList("normal");
        f = Arrays.asList("issuer", "authorization_endpoint", "jwks_uri", "response_types_supported", "subject_types_supported", "id_token_signing_alg_values_supported");
    }

    public g(JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject;
        for (String str : f) {
            if (!this.a.has(str) || this.a.get(str) == null) {
                AuthorizationServiceDiscovery$MissingArgumentException authorizationServiceDiscovery$MissingArgumentException = new AuthorizationServiceDiscovery$MissingArgumentException(f1.e.g("Missing mandatory configuration field: ", str));
                authorizationServiceDiscovery$MissingArgumentException.r = str;
                throw authorizationServiceDiscovery$MissingArgumentException;
            }
        }
    }

    public final Object a(x1 x1Var) {
        JSONObject jSONObject = this.a;
        try {
            if (!jSONObject.has((String) x1Var.r)) {
                return x1Var.s;
            }
            String string = jSONObject.getString((String) x1Var.r);
            x1Var.getClass();
            return Uri.parse(string);
        } catch (JSONException e2) {
            throw new IllegalStateException("unexpected JSONException", e2);
        }
    }
}
