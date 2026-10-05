package t6;

import java.util.LinkedHashMap;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f32100a = new LinkedHashMap();

    public abstract Object a(b bVar);

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return k.b(this.f32100a, ((c) obj).f32100a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32100a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f32100a + ')';
    }
}
