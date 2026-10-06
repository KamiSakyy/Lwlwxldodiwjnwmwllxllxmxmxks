package qn;

import k71.k;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final b Companion = new b();
    public JSONObject a;
    public String b;
    public String c;

    public c(JSONObject jSONObject) {
        this.a = jSONObject;
        String optString = jSONObject.optString("reason");
        k.f(optString, "optString(...)");
        this.b = optString;
        String optString2 = jSONObject.optString("gid");
        k.f(optString2, "optString(...)");
        this.c = optString2;
        jSONObject.optString("timestamp");
    }

    public final String toString() {
        String jSONObject = this.a.toString();
        k.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    public c(Object... a) {
    }
}
