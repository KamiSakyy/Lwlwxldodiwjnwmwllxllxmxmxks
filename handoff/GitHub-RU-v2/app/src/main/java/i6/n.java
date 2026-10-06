package i6;

import com.github.rudroid.copilot.h1;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public float f26046a;

    /* renamed from: b, reason: collision with root package name */
    public List f26047b;

    static {
        new n(3, 0.0f);
    }

    public n(float f6, List list) {
        this.f26046a = f6;
        this.f26047b = list;
    }

    public final n a(n nVar) {
        return new n(this.f26046a + nVar.f26046a, x61.m.l0(this.f26047b, nVar.f26047b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s3.f.b(this.f26046a, nVar.f26046a) && k71.k.b(this.f26047b, nVar.f26047b);
    }

    public final int hashCode() {
        return this.f26047b.hashCode() + (Float.hashCode(this.f26046a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaddingDimension(dp=");
        h1.x(this.f26046a, sb2, ", resourceIds=");
        sb2.append(this.f26047b);
        sb2.append(')');
        return sb2.toString();
    }

    public n(int i, float f6) {
        this((i & 1) != 0 ? 0 : f6, (List) x61.r.r);
    }
}
