package net.openid.appauth;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f extends k {
    public static final Set j = Collections.unmodifiableSet(new HashSet(Arrays.asList("token_type", "state", "code", "access_token", "expires_in", "id_token", "scope")));
    public final e a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final String g;
    public final String h;
    public final Map i;

    public f(e eVar, String str, String str2, String str3, String str4, Long l, String str5, String str6, Map map) {
        this.a = eVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = l;
        this.g = str5;
        this.h = str6;
        this.i = map;
    }

    public static f t(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has("request")) {
            throw new IllegalArgumentException("authorization request not provided and not found in JSON");
        }
        e b = e.b(jSONObject.getJSONObject("request"));
        String g = k.g(jSONObject, "state");
        String g2 = k.g(jSONObject, "token_type");
        String g3 = k.g(jSONObject, "code");
        String g4 = k.g(jSONObject, "access_token");
        Long l = null;
        if (jSONObject.has("expires_at") && !jSONObject.isNull("expires_at")) {
            try {
                l = Long.valueOf(jSONObject.getLong("expires_at"));
            } catch (JSONException unused) {
            }
        }
        return new f(b, g, g2, g3, g4, l, k.g(jSONObject, "id_token"), k.g(jSONObject, "scope"), k.h(jSONObject, "additional_parameters"));
    }

    @Override // net.openid.appauth.k
    public final String e() {
        return this.b;
    }

    @Override // net.openid.appauth.k
    public final Intent s() {
        Intent intent = new Intent();
        JSONObject jSONObject = new JSONObject();
        k.o(jSONObject, "request", this.a.c());
        k.q(jSONObject, "state", this.b);
        k.q(jSONObject, "token_type", this.c);
        k.q(jSONObject, "code", this.d);
        k.q(jSONObject, "access_token", this.e);
        Long l = this.f;
        if (l != null) {
            try {
                jSONObject.put("expires_at", l);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
        k.q(jSONObject, "id_token", this.g);
        k.q(jSONObject, "scope", this.h);
        k.o(jSONObject, "additional_parameters", k.m(this.i));
        intent.putExtra("net.openid.appauth.AuthorizationResponse", jSONObject.toString());
        return intent;
    }
}
