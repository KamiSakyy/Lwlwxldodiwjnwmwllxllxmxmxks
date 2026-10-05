package u10;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vf implements aa.v0 {
    public final ArrayList a;

    public vf(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf) && this.a.equals(((vf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.g("Data(programmingLanguages=", ")", this.a);
    }
}
