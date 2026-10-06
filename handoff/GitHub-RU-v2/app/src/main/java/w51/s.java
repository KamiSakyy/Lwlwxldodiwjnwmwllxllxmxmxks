package w51;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final String b;
    public final long c;

    public s(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static s a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new s(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new s(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e2) {
            e2.toString();
            return null;
        }
    }
    public static final Object b = null;
}
