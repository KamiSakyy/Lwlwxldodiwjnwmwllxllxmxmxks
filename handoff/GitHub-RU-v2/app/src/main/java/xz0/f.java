package xz0;

import com.github.service.models.response.SimpleLegacyProject;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public SimpleLegacyProject a;
    public String b;

    public f(SimpleLegacyProject simpleLegacyProject, String str) {
        this.a = simpleLegacyProject;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.b(this.a, fVar.a) && k.b(this.b, fVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.s.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "LegacyProjectCard(project=" + this.a + ", columnName=" + this.b + ")";
    }
}
