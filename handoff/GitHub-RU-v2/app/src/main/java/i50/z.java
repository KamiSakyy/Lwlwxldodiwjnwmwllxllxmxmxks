package i50;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    public final String a;
    public final String b;
    public final u c;

    public z(String str, String str2, u uVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = uVar;
    }

    public static z a(z zVar, u uVar) {
        String str = zVar.a;
        String str2 = zVar.b;
        k71.k.g(str, "__typename");
        return new z(str, str2, uVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k71.k.b(this.a, zVar.a) && k71.k.b(this.b, zVar.b) && k71.k.b(this.c, zVar.c);
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
}
