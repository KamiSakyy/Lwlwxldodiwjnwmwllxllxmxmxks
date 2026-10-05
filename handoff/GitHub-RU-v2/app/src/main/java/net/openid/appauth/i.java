package net.openid.appauth;

import android.net.Uri;
import androidx.lifecycle.l1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i implements d {
    public final l1 a;
    public final String b;
    public final Uri c;
    public final String d;
    public final String e;
    public final LinkedHashMap f;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList("id_token_hint", "post_logout_redirect_uri", "state", "ui_locales")));
    }

    public i(l1 l1Var, String str, Uri uri, String str2, String str3, LinkedHashMap linkedHashMap) {
        this.a = l1Var;
        this.b = str;
        this.c = uri;
        this.d = str2;
        this.e = str3;
        this.f = linkedHashMap;
    }

    @Override // net.openid.appauth.d
    public final String a() {
        return b().toString();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        k.o(jSONObject, "configuration", this.a.H());
        k.q(jSONObject, "id_token_hint", this.b);
        k.p(jSONObject, "post_logout_redirect_uri", this.c);
        k.q(jSONObject, "state", this.d);
        k.q(jSONObject, "ui_locales", this.e);
        k.o(jSONObject, "additionalParameters", k.m(this.f));
        return jSONObject;
    }

    @Override // net.openid.appauth.d
    public final String getState() {
        return this.d;
    }
}
