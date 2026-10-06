package j41;

import com.google.android.gms.internal.measurement.t5;
import java.io.Serializable;

/* loaded from: /home/user/work/p/classes4.dex */
public class e implements d, Serializable {
    public t5 r;
    public volatile transient boolean s;
    public transient Object t;

    public e(t5 t5Var) {
        this.r = t5Var;
    }

    @Override // j41.d
    public final Object get() {
        if (!this.s) {
            synchronized (this) {
                try {
                    if (!this.s) {
                        Object obj = this.r.get();
                        this.t = obj;
                        this.s = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.t;
    }

    public final String toString() {
        Object obj;
        if (this.s) {
            String valueOf = String.valueOf(this.t);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.r;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
