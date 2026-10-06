package ei;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: /home/user/work/p/classes3.dex */
public class e {
    public SharedPreferences a;

    public e(Context context) {
        this.a = context.getSharedPreferences("SharedPreferenceFlagProvider", 0);
    }
}
