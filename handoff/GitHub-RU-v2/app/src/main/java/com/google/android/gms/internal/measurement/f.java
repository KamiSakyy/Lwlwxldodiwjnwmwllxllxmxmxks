package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements n {
    public final n r;
    public final String s;

    public f(String str) {
        this.r = n.b;
        this.s = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.s.equals(fVar.s) && this.r.equals(fVar.r);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, w51.r rVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final int hashCode() {
        return this.r.hashCode() + (this.s.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String k() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        return new f(this.s, this.r.l());
    }

    public f(String str, n nVar) {
        this.r = nVar;
        this.s = str;
    }

    public f(Object... a) {
    }
    public Object b(Object p1) { return null; }
}
