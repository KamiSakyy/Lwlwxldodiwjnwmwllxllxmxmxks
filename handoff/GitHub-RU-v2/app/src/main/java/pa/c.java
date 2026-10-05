package pa;

import android.content.SharedPreferences;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30459a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f30460b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30461c;

    /* renamed from: d, reason: collision with root package name */
    public String f30462d;

    public /* synthetic */ c(SharedPreferences sharedPreferences, int i) {
        this.f30459a = i;
        this.f30460b = sharedPreferences;
    }

    public String a(Object obj, r71.e eVar) {
        switch (this.f30459a) {
            case k5.f.J /* 0 */:
                k.g(eVar, "property");
                if (!this.f30461c) {
                    SharedPreferences sharedPreferences = this.f30460b;
                    if (!sharedPreferences.contains("user_avatar")) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        k.c(edit, "editor");
                        edit.putString("user_avatar", null);
                        edit.apply();
                    }
                    this.f30462d = sharedPreferences.getString("user_avatar", null);
                    this.f30461c = true;
                }
                break;
            case 1:
            default:
                k.g(eVar, "property");
                if (!this.f30461c) {
                    SharedPreferences sharedPreferences2 = this.f30460b;
                    if (!sharedPreferences2.contains("user_name")) {
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        k.c(edit2, "editor");
                        edit2.putString("user_name", null);
                        edit2.apply();
                    }
                    this.f30462d = sharedPreferences2.getString("user_name", null);
                    this.f30461c = true;
                }
                break;
            case 2:
                k.g(eVar, "property");
                if (!this.f30461c) {
                    String string = this.f30460b.getString("approved_oauth_scope", "user repo notifications admin:org read:discussion user:assets");
                    this.f30462d = string != null ? string : "user repo notifications admin:org read:discussion user:assets";
                    this.f30461c = true;
                }
                break;
        }
        return this.f30462d;
    }

    public /* synthetic */ c(SharedPreferences sharedPreferences, int i, boolean z10) {
        this.f30459a = i;
        this.f30460b = sharedPreferences;
        this.f30462d = "";
    }
}
