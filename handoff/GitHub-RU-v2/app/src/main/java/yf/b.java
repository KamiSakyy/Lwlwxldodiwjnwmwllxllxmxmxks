package yf;

import a0.s0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public boolean a;
    public int b;
    public boolean c;
    public Long d;

    public b(boolean z, int i, boolean z2, Long l) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && k.b(this.d, bVar.d);
    }

    public final int hashCode() {
        int e = i.e(s0.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
        Long l = this.d;
        return e + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "AppLockPreferencesData(isAppLockSettingOn=" + this.a + ", autoLockDurationInMinutes=" + this.b + ", isAppUnlockRequired=" + this.c + ", lastActiveTimeMillis=" + this.d + ")";
    }
}
