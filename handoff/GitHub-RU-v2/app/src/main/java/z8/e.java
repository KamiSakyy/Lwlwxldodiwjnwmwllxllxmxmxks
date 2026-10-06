package z8;

import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f34623a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34624b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34625c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34626d;

    public e(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f34623a = z10;
        this.f34624b = z11;
        this.f34625c = z12;
        this.f34626d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f34623a == eVar.f34623a && this.f34624b == eVar.f34624b && this.f34625c == eVar.f34625c && this.f34626d == eVar.f34626d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34626d) + i.e(i.e(Boolean.hashCode(this.f34623a) * 31, 31, this.f34624b), 31, this.f34625c);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f34623a + ", isValidated=" + this.f34624b + ", isMetered=" + this.f34625c + ", isNotRoaming=" + this.f34626d + ')';
    }
}
