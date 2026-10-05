package net.openid.appauth;

import android.net.Uri;
import androidx.lifecycle.l1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e implements d {
    public static final Set s = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "ui_locales", "redirect_uri", "response_mode", "response_type", "scope", "state", "claims", "claims_locales")));
    public final l1 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Uri h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final JSONObject p;
    public final String q;
    public final Map r;

    public e(l1 l1Var, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, JSONObject jSONObject, String str14, Map map) {
        this.a = l1Var;
        this.b = str;
        this.g = str2;
        this.h = uri;
        this.r = map;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = str12;
        this.o = str13;
        this.p = jSONObject;
        this.q = str14;
    }

    public static e b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        k.d(jSONObject, "json cannot be null");
        l1 q = l1.q(jSONObject.getJSONObject("configuration"));
        String f = k.f(jSONObject, "clientId");
        String f2 = k.f(jSONObject, "responseType");
        Uri i = k.i(jSONObject, "redirectUri");
        String g = k.g(jSONObject, "display");
        String g2 = k.g(jSONObject, "login_hint");
        String g3 = k.g(jSONObject, "prompt");
        String g4 = k.g(jSONObject, "ui_locales");
        String g5 = k.g(jSONObject, "scope");
        String g6 = k.g(jSONObject, "state");
        String g7 = k.g(jSONObject, "nonce");
        String g8 = k.g(jSONObject, "codeVerifier");
        String g9 = k.g(jSONObject, "codeVerifierChallenge");
        String g10 = k.g(jSONObject, "codeVerifierChallengeMethod");
        String g11 = k.g(jSONObject, "responseMode");
        if (jSONObject.has("claims")) {
            optJSONObject = jSONObject.optJSONObject("claims");
            if (optJSONObject == null) {
                throw new JSONException("field \"claims\" is mapped to a null value");
            }
        } else {
            optJSONObject = null;
        }
        return new e(q, f, f2, i, g, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, optJSONObject, k.g(jSONObject, "claimsLocales"), k.h(jSONObject, "additionalParameters"));
    }

    @Override // net.openid.appauth.d
    public final String a() {
        return c().toString();
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        k.o(jSONObject, "configuration", this.a.H());
        k.n(jSONObject, "clientId", this.b);
        k.n(jSONObject, "responseType", this.g);
        k.n(jSONObject, "redirectUri", this.h.toString());
        k.q(jSONObject, "display", this.c);
        k.q(jSONObject, "login_hint", this.d);
        k.q(jSONObject, "scope", this.i);
        k.q(jSONObject, "prompt", this.e);
        k.q(jSONObject, "ui_locales", this.f);
        k.q(jSONObject, "state", this.j);
        k.q(jSONObject, "nonce", this.k);
        k.q(jSONObject, "codeVerifier", this.l);
        k.q(jSONObject, "codeVerifierChallenge", this.m);
        k.q(jSONObject, "codeVerifierChallengeMethod", this.n);
        k.q(jSONObject, "responseMode", this.o);
        JSONObject jSONObject2 = this.p;
        if (jSONObject2 != null) {
            try {
                jSONObject.put("claims", jSONObject2);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
        k.q(jSONObject, "claimsLocales", this.q);
        k.o(jSONObject, "additionalParameters", k.m(this.r));
        return jSONObject;
    }

    @Override // net.openid.appauth.d
    public final String getState() {
        return this.j;
    }
}
