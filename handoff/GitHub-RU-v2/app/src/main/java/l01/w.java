package l01;

import com.github.rudroid.copilot.h1;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w {
    public final Object a;

    public w(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.a.equals(((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return h1.l(this.a, "ProjectBoardItemRelatedProjects(projects=", ")");
    }
}
