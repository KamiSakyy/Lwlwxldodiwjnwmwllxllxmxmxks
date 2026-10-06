package k71;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r extends c implements r71.e {
    public final boolean x;

    public r(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.x = (i & 2) == 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return g().equals(rVar.g()) && this.u.equals(rVar.u) && this.v.equals(rVar.v) && k.b(this.s, rVar.s);
        }
        if (obj instanceof r71.e) {
            return obj.equals(h());
        }
        return false;
    }

    public final r71.a h() {
        if (this.x) {
            return this;
        }
        r71.a aVar = this.r;
        if (aVar != null) {
            return aVar;
        }
        r71.a c = c();
        this.r = c;
        return c;
    }

    public final int hashCode() {
        return this.v.hashCode() + h1.i(g().hashCode() * 31, this.u, 31);
    }

    public final r71.e i() {
        if (this.x) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        r71.e h = h();
        if (h != this) {
            return h;
        }
        throw new i71.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public final String toString() {
        r71.a h = h();
        return h != this ? h.toString() : h1.p(new StringBuilder("property "), this.u, " (Kotlin reflection is not available)");
    }
}
