package s51;

import androidx.compose.foundation.lazy.layout.o1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public long b;
    public int c;

    public b(int i, long j, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static o1 a() {
        o1 o1Var = new o1(10, (byte) 0);
        o1Var.d = 0L;
        return o1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i = bVar.c;
        String str = bVar.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.b != bVar.b) {
            return false;
        }
        int i2 = this.c;
        return i2 == 0 ? i == 0 : y3.a.a(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.c;
        return (i2 != 0 ? y3.a.b(i2) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
