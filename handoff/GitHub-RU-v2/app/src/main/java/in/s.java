package in;

import com.google.android.gms.measurement.internal.x3;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public JSONObject a;
    public x3 b;
    public x3 c;

    public s(JSONObject jSONObject) {
        this.a = jSONObject;
        this.b = new x3(22, jSONObject.getJSONObject("form"));
        this.c = new x3(22, jSONObject.getJSONObject("header"));
    }
}
