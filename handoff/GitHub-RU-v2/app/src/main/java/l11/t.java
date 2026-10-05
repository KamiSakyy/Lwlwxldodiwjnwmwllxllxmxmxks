package l11;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t extends f0 {
    public final long a;
    public final long b;
    public final n c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public t(long j, long j2, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.r;
        this.a = j;
        this.b = j2;
        this.c = nVar;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        t tVar = (t) ((f0) obj);
        Object obj2 = j0.r;
        ArrayList arrayList = tVar.f;
        String str = tVar.e;
        Integer num = tVar.d;
        n nVar = tVar.c;
        if (this.a != tVar.a || this.b != tVar.b || !this.c.equals(nVar)) {
            return false;
        }
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ j0.r.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + j0.r + "}";
    }
}
