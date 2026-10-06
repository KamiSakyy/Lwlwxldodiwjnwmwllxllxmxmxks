package jn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public final x01.i a;
    public final Object b;
    public final int c;

    public i(int i, List list, x01.i iVar) {
        this.a = iVar;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b) && this.c == iVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + h1.h(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAchievements(page=");
        sb.append(this.a);
        sb.append(", achievementItems=");
        sb.append(this.b);
        sb.append(", totalCount=");
        return s0.l(sb, this.c, ")");
    }
}
