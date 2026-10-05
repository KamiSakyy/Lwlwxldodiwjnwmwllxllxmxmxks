package ey;

import com.github.rudroid.m0;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public final ArrayList a;

    public s(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.a.equals(((s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return m0.g("StatusRollup(summary=", ")", this.a);
    }
}
