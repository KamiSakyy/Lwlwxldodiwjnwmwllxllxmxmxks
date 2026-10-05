package pa;

import android.content.SharedPreferences;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30467a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f30468b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30469c;

    /* renamed from: d, reason: collision with root package name */
    public long f30470d = -1;

    public /* synthetic */ f(SharedPreferences sharedPreferences, int i) {
        this.f30467a = i;
        this.f30468b = sharedPreferences;
    }

    public final Long a(Object obj, r71.e eVar) {
        switch (this.f30467a) {
            case k5.f.J /* 0 */:
                k.g(eVar, "property");
                if (!this.f30469c) {
                    this.f30470d = this.f30468b.getLong("local_notification_timestamp", -1L);
                    this.f30469c = true;
                }
                break;
            case 1:
                k.g(eVar, "property");
                if (!this.f30469c) {
                    this.f30470d = this.f30468b.getLong("recovery_expiration_timestamp", -1L);
                    this.f30469c = true;
                }
                break;
            default:
                k.g(eVar, "property");
                if (!this.f30469c) {
                    this.f30470d = this.f30468b.getLong("two_factor_auth_expiration_timestamp", -1L);
                    this.f30469c = true;
                }
                break;
        }
        return Long.valueOf(this.f30470d);
    }
}
