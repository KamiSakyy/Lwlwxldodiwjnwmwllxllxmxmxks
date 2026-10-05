package k71;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public class i extends c implements h, r71.a, w61.e {
    public final int x;
    public final int y;

    public i(int i, Class cls, String str, String str2, int i2) {
        this(i, b.r, cls, str, str2, i2, 0);
    }

    @Override // k71.c
    public final r71.a c() {
        x.a.getClass();
        return this;
    }

    @Override // k71.h
    public final int e() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.u.equals(iVar.u) && this.v.equals(iVar.v) && this.y == iVar.y && this.x == iVar.x && k.b(this.s, iVar.s) && k.b(g(), iVar.g());
        }
        if (!(obj instanceof i)) {
            return false;
        }
        r71.a aVar = this.r;
        if (aVar == null) {
            c();
            this.r = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        return this.v.hashCode() + h1.i(g() == null ? 0 : g().hashCode() * 31, this.u, 31);
    }

    public final String toString() {
        r71.a aVar = this.r;
        if (aVar == null) {
            c();
            this.r = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.u;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : f1.e.z("function ", str, " (Kotlin reflection is not available)");
    }

    public i(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.x = i;
        this.y = 0;
    }
}
