package n11;

import a0.s0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final int a;
    public final long b;

    public a(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return y3.a.a(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        int b = (y3.a.b(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return b ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return s0.f(this.b, "}", sb);
    }
}
