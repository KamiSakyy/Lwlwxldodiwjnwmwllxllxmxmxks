package b01;

import a0.s0;
import com.github.service.models.response.discussions.PinnedDiscussionPatternState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n {
    public static final m Companion = new m();
    public final int a;
    public final int b;
    public final PinnedDiscussionPatternState c;

    public n(int i, int i2, PinnedDiscussionPatternState pinnedDiscussionPatternState) {
        k71.k.g(pinnedDiscussionPatternState, "pattern");
        this.a = i;
        this.b = i2;
        this.c = pinnedDiscussionPatternState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && this.b == nVar.b && this.c == nVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + s0.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = x.i.m(this.a, this.b, "DiscussionSpotlightBackground(gradientStartColor=", ", gradientEndColor=", ", pattern=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
