package mn;

import a0.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public static final l Companion = new l();
    public static final m g = new m(0, 0, 0, 0, 0, 0);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public m(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b && this.c == mVar.c && this.d == mVar.d && this.e == mVar.e && this.f == mVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + s0.b(this.e, s0.b(this.d, s0.b(this.c, s0.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder m = x.i.m(this.a, this.b, "JobStatusCount(successCount=", ", failureCount=", ", neutralCount=");
        s0.z(m, this.c, ", skippedCount=", this.d, ", runningCount=");
        m.append(this.e);
        m.append(", otherCount=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
