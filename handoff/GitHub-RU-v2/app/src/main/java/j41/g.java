package j41;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements d, Serializable {
    public Object r;

    public g(Object obj) {
        this.r = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        Object obj2 = ((g) obj).r;
        Object obj3 = this.r;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    @Override // j41.d
    public final Object get() {
        return this.r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.r});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.r);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
