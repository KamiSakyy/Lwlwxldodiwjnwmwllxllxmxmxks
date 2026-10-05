package c4;

import a0.s0;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c implements Cloneable {

    /* renamed from: r, reason: collision with root package name */
    public final char[] f4105r;

    /* renamed from: s, reason: collision with root package name */
    public long f4106s = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f4107t = Long.MAX_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public b f4108u;

    public c(char[] cArr) {
        this.f4105r = cArr;
    }

    @Override // 
    /* renamed from: a */
    public c clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String b() {
        String str = new String(this.f4105r);
        if (str.length() < 1) {
            return "";
        }
        long j10 = this.f4107t;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.f4106s;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.f4106s;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public float d() {
        if (this instanceof e) {
            return ((e) this).d();
        }
        return Float.NaN;
    }

    public int e() {
        if (this instanceof e) {
            return ((e) this).e();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4106s == cVar.f4106s && this.f4107t == cVar.f4107t && Arrays.equals(this.f4105r, cVar.f4105r)) {
            return Objects.equals(this.f4108u, cVar.f4108u);
        }
        return false;
    }

    public final String g() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.f4105r) * 31;
        long j10 = this.f4106s;
        int i = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f4107t;
        int i10 = (i + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        b bVar = this.f4108u;
        return (i10 + (bVar != null ? bVar.hashCode() : 0)) * 31;
    }

    public final void i(long j10) {
        if (this.f4107t != Long.MAX_VALUE) {
            return;
        }
        this.f4107t = j10;
        b bVar = this.f4108u;
        if (bVar != null) {
            bVar.j(this);
        }
    }

    public String toString() {
        long j10 = this.f4106s;
        long j11 = this.f4107t;
        if (j10 > j11 || j11 == Long.MAX_VALUE) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass());
            sb2.append(" (INVALID, ");
            sb2.append(this.f4106s);
            sb2.append("-");
            return s0.f(this.f4107t, ")", sb2);
        }
        return g() + " (" + this.f4106s + " : " + this.f4107t + ") <<" + new String(this.f4105r).substring((int) this.f4106s, ((int) this.f4107t) + 1) + ">>";
    }
}
