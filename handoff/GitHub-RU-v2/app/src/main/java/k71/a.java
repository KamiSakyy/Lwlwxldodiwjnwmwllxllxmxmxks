package k71;

import com.github.rudroid.copilot.h1;
import java.io.Serializable;

/* loaded from: /home/user/work/p/classes4.dex */
public class a implements h, Serializable {
    public Object r;
    public Class s;
    public String t;
    public String u;
    public boolean v;
    public int w;
    public int x;

    public a() {
        this(4, 4, w61.q.class, b.r, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V");
    }

    @Override // k71.h
    public final int e() {
        return this.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.v == aVar.v && this.w == aVar.w && this.x == aVar.x && k.b(this.r, aVar.r) && k.b(this.s, aVar.s) && this.t.equals(aVar.t) && this.u.equals(aVar.u);
    }

    public final int hashCode() {
        Object obj = this.r;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.s;
        return ((((h1.i(h1.i((hashCode + (cls != null ? cls.hashCode() : 0)) * 31, this.t, 31), this.u, 31) + (this.v ? 1231 : 1237)) * 31) + this.w) * 31) + this.x;
    }

    public final String toString() {
        x.a.getClass();
        return y.a(this);
    }

    public a(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.r = obj;
        this.s = cls;
        this.t = str;
        this.u = str2;
        this.v = false;
        this.w = i;
        this.x = i2 >> 1;
    }
}
