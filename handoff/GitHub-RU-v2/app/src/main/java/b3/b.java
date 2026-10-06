package b3;

import android.content.res.Resources;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f3382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3383b;

    public b(Resources.Theme theme, int i) {
        this.f3382a = theme;
        this.f3383b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.f3382a, bVar.f3382a) && this.f3383b == bVar.f3383b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3383b) + (this.f3382a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f3382a);
        sb2.append(", id=");
        return i.j(sb2, this.f3383b, ')');
    }
}
