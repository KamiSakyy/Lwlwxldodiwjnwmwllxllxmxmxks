package d0;

import a0.a0;
import com.github.rudroid.copilot.h1;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public final String f20960a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20961b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20962c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f20963d;

    public o(String str, String str2, List list, a0 a0Var) {
        this.f20960a = str;
        this.f20961b = str2;
        this.f20962c = list;
        this.f20963d = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f20960a.equals(oVar.f20960a) && this.f20961b.equals(oVar.f20961b) && this.f20962c.equals(oVar.f20962c) && k71.k.b(this.f20963d, oVar.f20963d);
    }

    public final int hashCode() {
        return this.f20963d.hashCode() + h1.h(h1.i(this.f20960a.hashCode() * 31, this.f20961b, 31), this.f20962c, 31);
    }

    public final String toString() {
        return "PropertyValuesHolder2D(xPropertyName=" + this.f20960a + ", yPropertyName=" + this.f20961b + ", pathData=" + this.f20962c + ", interpolator=" + this.f20963d + ')';
    }
}
