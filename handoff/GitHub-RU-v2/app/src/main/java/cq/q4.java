package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q4 {
    public List a;

    public q4(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4) && k71.k.b(this.a, ((q4) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("OnTextFileType(textFieldFileLines=", ")", this.a);
    }
}
