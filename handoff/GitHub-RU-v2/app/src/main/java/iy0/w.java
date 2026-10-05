package iy0;

import pz0.ko;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w implements aa.h0 {
    public final ko a;
    public final String b;

    public w(ko koVar, String str) {
        this.a = koVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a == wVar.a && k71.k.b(this.b, wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProjectV2FieldCommonFragment(dataType=" + this.a + ", id=" + this.b + ")";
    }
}
