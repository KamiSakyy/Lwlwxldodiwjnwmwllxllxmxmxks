package kc0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o10 implements aaShadow.v0 {
    public ArrayList a;

    public o10(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o10) && this.a.equals(((o10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.g("Data(spokenLanguages=", ")", this.a);
    }
}
