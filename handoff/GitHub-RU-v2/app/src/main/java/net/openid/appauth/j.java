package net.openid.appauth;

import android.content.Intent;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes5.dex */
public final class j extends k {
    public i a;
    public String b;

    public j(i iVar, String str) {
        this.a = iVar;
        this.b = str;
    }

    @Override // net.openid.appauth.k
    public final String e() {
        return this.b;
    }

    @Override // net.openid.appauth.k
    public final Intent s() {
        Intent intent = new Intent();
        JSONObject jSONObject = new JSONObject();
        k.o(jSONObject, "request", this.a.b());
        k.q(jSONObject, "state", this.b);
        intent.putExtra("net.openid.appauth.EndSessionResponse", jSONObject.toString());
        return intent;
    }
}
