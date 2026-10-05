package i50;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public final String a;
    public final String b;
    public final u c;

    public l(String str, String str2, u uVar) {
        this.a = str;
        this.b = str2;
        this.c = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", discussionCommentReplyFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }

    public l(Object... a) {
    }
}
