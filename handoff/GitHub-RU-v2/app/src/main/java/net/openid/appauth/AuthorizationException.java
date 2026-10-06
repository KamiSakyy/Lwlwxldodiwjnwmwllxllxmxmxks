package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes5.dex */
public final class AuthorizationException extends Exception {
    public static final /* synthetic */ int w = 0;
    public int r;
    public int s;
    public String t;
    public String u;
    public Uri v;

    public AuthorizationException(int i, int i2, String str, String str2, Uri uri) {
        super(str2, null);
        this.r = i;
        this.s = i2;
        this.t = str;
        this.u = str2;
        this.v = uri;
    }

    public static AuthorizationException a(String str, int i) {
        return new AuthorizationException(0, i, null, str, null);
    }

    public static AuthorizationException b(String str, int i) {
        return new AuthorizationException(1, i, str, null, null);
    }

    public static AuthorizationException c(String str) {
        k.c(str, "jsonStr cannot be null or empty");
        JSONObject jSONObject = new JSONObject(str);
        return new AuthorizationException(jSONObject.getInt("type"), jSONObject.getInt("code"), k.g(jSONObject, "error"), k.g(jSONObject, "errorDescription"), k.j(jSONObject, "errorUri"));
    }

    public final Intent d() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", e());
        return intent;
    }

    public final String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.r);
            try {
                jSONObject.put("code", this.s);
                k.q(jSONObject, "error", this.t);
                k.q(jSONObject, "errorDescription", this.u);
                k.p(jSONObject, "errorUri", this.v);
                return jSONObject.toString();
            } catch (JSONException unused) {
                throw new IllegalStateException("JSONException thrown in violation of contract, ex");
            }
        } catch (JSONException unused2) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof AuthorizationException)) {
            AuthorizationException authorizationException = (AuthorizationException) obj;
            if (this.r == authorizationException.r && this.s == authorizationException.s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.r + 31) * 31) + this.s;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AuthorizationException: " + e();
    }
}
