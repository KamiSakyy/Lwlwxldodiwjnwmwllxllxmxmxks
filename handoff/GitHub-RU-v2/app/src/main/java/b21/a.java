package b21;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final int a;
    public final b1.m b;
    public final c21.m c;
    public final String d;

    public a(b1.m mVar, c21.m mVar2, String str) {
        this.b = mVar;
        this.c = mVar2;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{mVar, mVar2, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return c21.u.j(this.b, aVar.b) && c21.u.j(this.c, aVar.c) && c21.u.j(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
