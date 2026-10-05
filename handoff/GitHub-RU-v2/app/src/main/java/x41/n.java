package x41;

import com.google.android.gms.measurement.internal.x3;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n {
    public static final x3 a;

    static {
        k51.d dVar = new k51.d();
        a aVar = a.a;
        dVar.a(n.class, aVar);
        dVar.a(b.class, aVar);
        a = new x3(29, dVar);
    }

    public static b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new b(string, string2, string3, string4, j);
    }
}
