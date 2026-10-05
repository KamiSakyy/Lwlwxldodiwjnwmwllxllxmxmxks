package ei;

import android.content.Context;
import android.content.SharedPreferences;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public final SharedPreferences a;

    public f(Context context) {
        this.a = context.getSharedPreferences("SharedPreferenceTestingFlagProvider", 0);
    }

    public final boolean a(a aVar) {
        g gVar = (g) aVar;
        k.g(gVar, "feature");
        String str = gVar.r;
        d dVar = d.s;
        return this.a.getBoolean(str, false);
    }

    public final void b(g gVar, boolean z) {
        k.g(gVar, "feature");
        SharedPreferences sharedPreferences = this.a;
        k.f(sharedPreferences, "testingPreferences");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(gVar.r, z);
        edit.apply();
    }
}
