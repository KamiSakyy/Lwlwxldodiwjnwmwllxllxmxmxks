package bu;

import m10.py;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public py a;

    public k(py pyVar) {
        this.a = pyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.a == ((k) obj).a;
    }

    public final int hashCode() {
        py pyVar = this.a;
        if (pyVar == null) {
            return 0;
        }
        return pyVar.hashCode();
    }

    public final String toString() {
        return "Configuration(mergeMethod=" + this.a + ")";
    }
}
