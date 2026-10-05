package in;

import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public final String a;
    public final String b;

    public c0(s sVar, JSONObject jSONObject) {
        k71.k.g(sVar, "fileCreationResult");
        this.a = jSONObject.optString("href");
        this.b = sVar.a.optString("asset_upload_url");
    }
}
