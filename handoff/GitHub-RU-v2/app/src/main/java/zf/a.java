package zf;

import yf.c;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public boolean a;
    public c b;

    public a(boolean z, c cVar) {
        this.a = z;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AppLockSettingsUiModel(isAppLockEnabled=" + this.a + ", selectedAutomaticLockOption=" + this.b + ")";
    }
}
