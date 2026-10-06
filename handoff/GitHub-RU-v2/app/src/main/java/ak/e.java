package ak;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public a a;
    public boolean b;

    public e(a aVar, boolean z) {
        k.g(aVar, "type");
        this.a = aVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MobilePushNotificationsSettingsEntry(type=" + this.a + ", value=" + this.b + ")";
    }
}
