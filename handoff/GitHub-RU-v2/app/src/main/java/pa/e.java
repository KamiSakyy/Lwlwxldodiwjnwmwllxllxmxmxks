package pa;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class e {
    public static final d Companion = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final long f30463d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f30464a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30465b;

    /* renamed from: c, reason: collision with root package name */
    public String f30466c;

    public e(SharedPreferences sharedPreferences) {
        this.f30464a = sharedPreferences;
    }

    public final String a(Object obj, r71.e eVar) {
        k.g(eVar, "property");
        if (!this.f30465b) {
            SharedPreferences sharedPreferences = this.f30464a;
            if (!sharedPreferences.contains("fcm_token_hash")) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                k.c(edit, "editor");
                edit.putString("fcm_token_hash", null);
                edit.apply();
            }
            if (System.currentTimeMillis() - sharedPreferences.getLong("fcm_token_hash_set_timestamp", System.currentTimeMillis()) > f30463d) {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                k.c(edit2, "editor");
                edit2.putString("fcm_token_hash", null);
                edit2.apply();
                this.f30466c = null;
                this.f30465b = true;
            } else {
                this.f30466c = sharedPreferences.getString("fcm_token_hash", null);
                this.f30465b = true;
            }
        }
        return this.f30466c;
    }
}
