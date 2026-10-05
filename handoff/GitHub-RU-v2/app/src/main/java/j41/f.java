package j41;

import com.google.android.gms.internal.measurement.t5;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements d {
    public volatile t5 r;
    public volatile boolean s;
    public Object t;

    @Override // j41.d
    public final Object get() {
        if (!this.s) {
            synchronized (this) {
                try {
                    if (!this.s) {
                        t5 t5Var = this.r;
                        Objects.requireNonNull(t5Var);
                        Object obj = t5Var.get();
                        this.t = obj;
                        this.s = true;
                        this.r = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.t;
    }

    public final String toString() {
        Object obj = this.r;
        if (obj == null) {
            String valueOf = String.valueOf(this.t);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
