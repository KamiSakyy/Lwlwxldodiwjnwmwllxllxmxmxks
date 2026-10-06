package k71;

import java.io.Serializable;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c implements r71.a, Serializable {
    public transient r71.a r;
    public final Object s;
    public final Class t;
    public final String u;
    public final String v;
    public final boolean w;

    public c(Object obj, Class cls, String str, String str2, boolean z) {
        this.s = obj;
        this.t = cls;
        this.u = str;
        this.v = str2;
        this.w = z;
    }

    public abstract r71.a c();

    public final d g() {
        Class cls = this.t;
        if (cls == null) {
            return null;
        }
        if (!this.w) {
            return x.a(cls);
        }
        x.a.getClass();
        return new o(cls);
    }
}
