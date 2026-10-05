package e1;

import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b);
    }

    public final int hashCode() {
        return Float.hashCode(0.1f) + i.b(i.b(Float.hashCode(0.16f) * 31, 0.1f, 31), 0.08f, 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=0.16, focusedAlpha=0.1, hoveredAlpha=0.08, pressedAlpha=0.1)";
    }
}
